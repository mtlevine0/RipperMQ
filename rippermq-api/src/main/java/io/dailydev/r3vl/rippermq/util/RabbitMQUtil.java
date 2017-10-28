package io.dailydev.r3vl.rippermq.util;

import org.springframework.stereotype.Service;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.MessageProperties;

@Service
public class RabbitMQUtil {
	  private static final String TASK_QUEUE_NAME = "task_queue";

	  public void sendVideoId(String videoId) throws Exception {
	    ConnectionFactory factory = new ConnectionFactory();
	    factory.setHost("192.168.1.13");
	    Connection connection = factory.newConnection();
	    Channel channel = connection.createChannel();

	    channel.queueDeclare(TASK_QUEUE_NAME, true, false, false, null);

	    channel.basicPublish("", TASK_QUEUE_NAME,
	        MessageProperties.PERSISTENT_TEXT_PLAIN,
	        videoId.getBytes("UTF-8"));
	    System.out.println(" [x] Sent '" + videoId + "'");

	    channel.close();
	    connection.close();
	  }
}
