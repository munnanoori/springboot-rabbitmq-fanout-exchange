package rabbitmq.producer;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import rabbitmq.producer.entity.Order;

@SpringBootApplication
@EnableScheduling
public class RabbitmqproducerApplication  implements CommandLineRunner{

	@Autowired
	RabbitMQSender sender;
	
	public static int orderid = 0;
	public static void main(String[] args) {
		SpringApplication.run(RabbitmqproducerApplication.class, args);
	}

    @Scheduled(fixedDelay = 5000)
    public void sendData() {
    	
    	System.out.println("Sendind data");
    	sender.send(new Order(orderid++, LocalDateTime.now().toString()));
    }
    
    @Override
    public void run(String... args) {

    	sendData();
    }
}
