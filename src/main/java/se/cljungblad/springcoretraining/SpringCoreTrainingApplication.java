package se.cljungblad.springcoretraining;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCoreTrainingApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringCoreTrainingApplication.class, args);

		System.out.println("Number of beans in application context: " + applicationContext.getBeanDefinitionCount());
		for(String beanName : applicationContext.getBeanDefinitionNames()) {
			System.out.println("Bean name: " + beanName);
		}
	}
}
