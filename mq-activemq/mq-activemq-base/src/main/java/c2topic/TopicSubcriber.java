package c2topic;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;
import javax.jms.ConnectionFactory;

/**
 * @author joe
 * @create 2021-01-27 10:41
 */
public class TopicSubcriber {
    public static final String BROKER_URL = "tcp://192.168.33.10:61616";
    //相当于一个数据库（其实是一个队列）
    public static final String DESTINATION = "myTopic";

    public static void main(String[] args) {
        receiveMessage();
    }

    public static void receiveMessage() {
        System.out.println("----------------TopicSubcriber 开始工作--------------------");
        //1 .创建一个连接工厂
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(BROKER_URL);
        Connection connection = null;
        Session session = null;
        MessageConsumer messageConsumer = null;
        try {
            //2. 获取一个连接
            connection = connectionFactory.createConnection();
            connection.setClientID("joe");
            //接收消息，需要将连接启动一下，才可以接收到消息
            connection.start();
            //3. 创建一个Session 第一个参数：是否是事务消息 第二个参数：消息确认机制（自动确认还是手动确认）
//            session = connection.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE); // 打开事务 必须：session.commit();
            session = connection.createSession(Boolean.FALSE, Session.AUTO_ACKNOWLEDGE); // 关闭事务，手动确认 必须：message.acknowledge();

            //4. 有了session之后，就可以创建消息，目的地，生产者和消费者
            //目的地
//            Destination destination = session.createTopic(DESTINATION);
            Topic topic = session.createTopic(DESTINATION);
            //消费者
//            messageConsumer = session.createConsumer(destination);
            messageConsumer = session.createDurableSubscriber(topic, "remark..."); // 持久消费者
            //循环接收消息
            while (true) {
                //接收消息 有返回值，是阻塞的
                Message message = messageConsumer.receive();
                //判断消息类型
                if (message instanceof TextMessage) {
                    String text = ((TextMessage) message).getText();
                    System.out.println(text);
//                    session.commit();
                    message.acknowledge();
                }
            }
        } catch (JMSException e) {
            e.printStackTrace();
        } finally {
            try {
                if (messageConsumer != null) {
                    messageConsumer.close();
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
            System.out.println("----------------TopicSubcriber 结束--------------------");
        }
    }
}
