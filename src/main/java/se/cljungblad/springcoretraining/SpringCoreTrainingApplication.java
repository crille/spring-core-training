package se.cljungblad.springcoretraining;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import se.cljungblad.springcoretraining.services.GameService;

@SpringBootApplication
public class SpringCoreTrainingApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringCoreTrainingApplication.class, args);

		System.out.println("Number of beans in application context: " + applicationContext.getBeanDefinitionCount());
		for(String beanName : applicationContext.getBeanDefinitionNames()) {
			System.out.println("Bean name: " + beanName);
		}

		System.out.println("Is gameService a singleton? " + applicationContext.isSingleton("gameServiceImpl"));
		GameService gameService = applicationContext.getBean(GameService.class);

		System.out.println(gameService.getGameNames());

		GameService gameService2 = applicationContext.getBean(GameService.class);

		System.out.println("Is gameServer1 and gameServer2 the same? " + gameService.equals(gameService2));
		System.out.println(gameService2.getGameNames());
	}
}
