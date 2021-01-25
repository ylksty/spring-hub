package c1queue;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * @author joe
 * @create 2021-01-25 08:32
 */
public class JmsProduce {
    public static final String ACTIVEMQ_URL = "tcp://192.168.33.10:61616";
    public static final String QUEUE_NAME = "queue01";

    public static void main(String[] args) throws Exception {
        // 1 按照给定的url创建连接工程，这个构造器采用默认的用户名密码
        ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory(ACTIVEMQ_URL);

        // 设置允许有数据丢失
         activeMQConnectionFactory.setUseAsyncSend(true);

        // 2 通过连接工厂连接 connection  和 启动
        Connection connection = activeMQConnectionFactory.createConnection();
        //  启动
        connection.start();

        // 3 创建回话  session
        // 两个参数，第一个事务， 第二个签收
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

        // 4 创建目的地 （两种 ： 队列/主题   这里用队列）
        Queue queue = session.createQueue(QUEUE_NAME);

        // 5 创建消息的生产者
        MessageProducer messageProducer = session.createProducer(queue);

        // 非持久化消息 和持久化消息演示
//        messageProducer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);   // 非持久
        messageProducer.setDeliveryMode(DeliveryMode.PERSISTENT);   // 持久化 默认持久 会存入文件或数据库中

        // 6 通过messageProducer 生产 3 条 消息发送到消息队列中
        for (int i = 1; i < 4 ; i++) {
            // 7  创建字消息
            TextMessage textMessage = session.createTextMessage("msg--" + i);
            // 8  通过messageProducer发布消息
            messageProducer.send(textMessage);
        }

        // 9 关闭资源
        messageProducer.close();
        session.close();
        connection.close();
        // session.commit();
        System.out.println("  **** 消息发送到MQ完成 ****");

    }
}
