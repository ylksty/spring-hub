package c2topic;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * @author joe
 * @create 2021-01-25 15:58
 */
public class JmsProduce_topic {
    public static final String ACTIVEMQ_URL = "tcp://192.168.33.10:61616";
    public static final String TOPIC_NAME = "topic01";


    public static void main(String[] args) throws  Exception{

        // 1 按照给定的url创建连接工程，这个构造器采用默认的用户名密码
        ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory(ACTIVEMQ_URL);
        // 2 通过连接工厂连接 connection  和 启动
        javax.jms.Connection connection = activeMQConnectionFactory.createConnection();
        //  启动
        connection.start();
        // 3 创建回话  session
        // 两个参数，第一个事务， 第二个签收
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        // 4 创建目的地 （两种 ： 队列/主题   这里用主题）
        Topic topic = session.createTopic(TOPIC_NAME);
        // 5 创建消息的生产者
        MessageProducer messageProducer = session.createProducer(topic);

        for (int i = 0; i < 3 ; i++) {
            // 7  创建字消息
            TextMessage textMessage = session.createTextMessage("topic_name--" + i);

            // 调用Message的set*Property()方法，就能设置消息属性。根据value的数据类型的不同，有相应的API。
            textMessage.setStringProperty("From","ZhangSan@qq.com");
            textMessage.setByteProperty("Spec", (byte) 1);
            textMessage.setBooleanProperty("Invalide",true);

            // JMSDestination: 消息目的地
//            textMessage.setJMSDestination(topic);

             /*
             JMSDeliveryMode: 消息持久化模式
             默认非持久
             */
            textMessage.setJMSDeliveryMode(DeliveryMode.NON_PERSISTENT);

            /*
            JMSExpiration: 消息过期时间
             */
//            textMessage.setJMSExpiration(1000);
            /*
            JMSPriority: 消息的优先级
             */
//            textMessage.setJMSPriority(9);

            // JMSMessageID: 消息的唯一标识符
//            textMessage.setJMSMessageID("ABCD");

            // 上面有些属性在send方法里也能设置


            // 8  通过messageProducer发布消息
            messageProducer.send(textMessage);

//            MapMessage mapMessage = session.createMapMessage();
//            mapMessage.setString("k1","v1");
//            messageProducer.send(mapMessage);
        }
        // 9 关闭资源
        messageProducer.close();
        session.close();
        connection.close();

        System.out.println("  **** TOPIC_NAME消息发送到MQ完成 ****");
    }
}
