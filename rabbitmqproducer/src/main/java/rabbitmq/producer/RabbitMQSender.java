package rabbitmq.producer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import rabbitmq.producer.entity.Order;

@Component
public class RabbitMQSender {

	@Autowired
	private AmqpTemplate rabbitTemplate;
	
	@Value("${exchange.name}")
	private String exchange;
	
	@Value("${queue.name}")
	private String queue;	
	
	public void send(Order person) {
        rabbitTemplate.convertAndSend(exchange, "",person);
	}
}
