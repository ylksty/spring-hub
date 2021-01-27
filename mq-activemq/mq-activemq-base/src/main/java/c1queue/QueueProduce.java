package c1queue;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @author joe
 * @create 2021-01-25 08:32
 */
public class    QueueProduce {
    public static final String BROKER_URL = "tcp://192.168.33.10:61616";
    public static final String DESTINATION = "myQueue";

    public static void main(String[] args) {
        System.out.println("**** 匿名发送Queue ****");
        Connection connection = null;
        Session session = null;
        MessageProducer messageProducer = null;
        try {
            // 1. 创建一个连接工厂
            ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory(BROKER_URL);

            // 设置允许有数据丢失
//         activeMQConnectionFactory.setUseAsyncSend(true);

            // 2. 获取一个连接
            connection = activeMQConnectionFactory.createConnection();

            //3. 创建一个Session 第一个参数：是否是事务消息 第二个参数：消息确认机制（自动确认还是手动确认）
//            session = connection.createSession(Boolean.FALSE, Session.AUTO_ACKNOWLEDGE); // 关闭事务
            session = connection.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE); // 打开事务 必须：session.commit();

            // 4. session创建DESTINATION （两种 ： 队列/主题   这里用队列）
            Queue queue = session.createQueue(DESTINATION);

            // 5. session创建生产者，以DESTINATION构造
            messageProducer = session.createProducer(queue);

            // 生产者设置
//            messageProducer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);   // 非持久
            messageProducer.setDeliveryMode(DeliveryMode.PERSISTENT);   // 持久化 (queue default PERSISTENT) 会存入文件或数据库中

            // 6.session创建消息
            TextMessage textMessage = session.createTextMessage("QueueProduce 消息 " + UUID.randomUUID().toString().substring(0, 6));

            // 7.生产者发送消息，没有返回值，非阻塞
            messageProducer.send(textMessage);
            session.commit();
        } catch (JMSException e) {
            e.printStackTrace();
        } finally {
            // 9 关闭资源
            try {
                if (messageProducer != null) {
                    messageProducer.close();
                }
                if (session != null) {
                    session.close();
                }
                if (connection != null) {
                    connection.close();
                }
                // session.commit();
                System.out.println("**** 消息发送到MQ完成 ****");
            } catch (JMSException e) {
                e.printStackTrace();
            }
        }

    }
}
