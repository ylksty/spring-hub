package c2topic;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;
import javax.jms.ConnectionFactory;
import java.util.UUID;

/**
 * @author joe
 * @create 2021-01-27 10:41
 */
public class TopicPublisher {
    public static final String BROKER_URL = "tcp://192.168.33.10:61616";
    //相当于一个数据库
    public static final String DESTINATION = "myTopic";

    public static void main(String[] args) {
        sendMessage();
    }

    public static void sendMessage() {
        //1 .创建一个连接工厂
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(BROKER_URL);
        Connection connection = null;
        Session session = null;
        MessageProducer messageProducer = null;
        try {
            //2. 获取一个连接
            connection = connectionFactory.createConnection();
            //3. 创建一个Session 第一个参数：是否是事务消息 第二个参数：消息确认机制（自动确认还是手动确认）
            session = connection.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE); // 打开事务 必须：session.commit();
//            session = connection.createSession(Boolean.FALSE, Session.AUTO_ACKNOWLEDGE);
            //4. 有了session之后，就可以创建消息，目的地，生产者和消费者
            String topic = "TopicPublisher topic " + UUID.randomUUID().toString().substring(0, 6);
            System.out.println("topic = " + topic);
            Message message = session.createTextMessage(topic);
            //目的地
            Destination destination = session.createTopic(DESTINATION);
            //生产者
            messageProducer = session.createProducer(destination);

            messageProducer.setDeliveryMode(DeliveryMode.PERSISTENT);
//            messageProducer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);

            //发消息 没有返回值，是非阻塞的
            messageProducer.send(message);
            session.commit();
            System.out.println("TopicPublisher.sendMessage success");
        } catch (JMSException e) {
            e.printStackTrace();
        } finally {
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
            } catch (JMSException e) {
                e.printStackTrace();
            }
        }
    }
}
