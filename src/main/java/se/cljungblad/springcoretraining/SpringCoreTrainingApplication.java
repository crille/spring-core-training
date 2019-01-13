package se.cljungblad.springcoretraining;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import se.cljungblad.springcoretraining.config.SpringConfiguration;
import se.cljungblad.springcoretraining.services.GameService;

@SpringBootApplication
public class SpringCoreTrainingApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SpringCoreTrainingApplication.class, args);

		SpringConfiguration config = ctx.getBean(SpringConfiguration.class);

		//To test different profiles, change profile in application.properties and run to see different outputs

		System.out.println(config.getDbUsername());
		System.out.println(config.getDbPassword());

	}
}
