package rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import rabbitmq.consumer.entity.Order;

@Component
public class RabbitMQConsumer {

	@RabbitListener(queues = "${queue.name}")
	public void consumeMessage(Order order) {
		System.out.println("Received Order ID: " + order.getOrderID() + " on date: " + order.getDate());
	}
}
