package rabbitmq.consumer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class RabbitmqconsumerApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(RabbitmqconsumerApplication.class, args);
	}

	@Scheduled(fixedDelay = 2000)
	public void executeTask() {
		
	}
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("I am consumer");
		
	}

}
