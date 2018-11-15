package se.cljungblad.springcoretraining.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PreDestroy;
import java.util.Arrays;
import java.util.List;

@Service
public class GameServiceImpl implements GameService {

    @Value("${db.username}")
    private String username;

    public GameServiceImpl() {
        System.out.println("GameServiceImpl is constructed");
    }

    @Override
    public List<String> getGameNames() {
        System.out.println(username);
        return Arrays.asList("game1", "game2");
    }

    @PreDestroy
    private void preDestroy() {
        System.out.println("GameServiceImpl is destroyed");
    }
}
