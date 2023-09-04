package elibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class Elibrary {

	public static void main(String[] args) {
		SpringApplication.run(Elibrary.class, args);
	}

}
