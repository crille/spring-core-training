package se.cljungblad.springcoretraining;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfiguration {

    @Bean
    public Game game() {
        System.out.println("GameConfiguration game() @Bean creation");
        Game game = new Game();
        game.setName("KindCraft");
        return game;
    }

}
