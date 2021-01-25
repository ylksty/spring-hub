package c2topic;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * @author joe
 * @create 2021-01-25 20:35
 */
public class JmsConsummer_persistence {
    public static final String ACTIVEMQ_URL = "tcp://192.168.33.10:61616";
    public static final String TOPIC_NAME = "topic01";

    public static void main(String[] args) throws Exception{
        System.out.println("****   marry    *****");

        // 1 按照给定的url创建连接工程，这个构造器采用默认的用户名密码
        ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory(ACTIVEMQ_URL);
        // 2 通过连接工厂连接 connection
        javax.jms.Connection connection = activeMQConnectionFactory.createConnection();
        connection.setClientID("marrry");

        // 3 创建回话  session
        // 两个参数，第一个事务， 第二个签收
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        // 4 创建目的地 （两种 ： 队列/主题   这里用主题）
        Topic topic = session.createTopic(TOPIC_NAME);
        TopicSubscriber topicSubscriber = session.createDurableSubscriber(topic,"remark...");

        // 5 发布订阅
        connection.start();

        Message message = topicSubscriber.receive(); // 阻塞，等到为止
        while (null != message){
            TextMessage textMessage = (TextMessage)message;
            System.out.println(" 收到的持久化 topic ："+textMessage.getText());
            message = topicSubscriber.receive(3000L);
//            message = topicSubscriber.receive();
        }

        session.close();
        connection.close();
    }
}
