package se.cljungblad.springcoretraining;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCoreTrainingApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringCoreTrainingApplication.class, args);

	}
}
