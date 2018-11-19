package se.cljungblad.springcoretraining;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

public class Game implements InitializingBean, DisposableBean {

    private List<String> orderedList = new ArrayList<>();
    private String name;

    public Game() {
        System.out.println("1 - Game constructor");
    }

    @PostConstruct
    public void init() {
        System.out.println("2 - Post construct");
    }

    public void setName(String name) {
        System.out.println("3 - Setter method");
        this.name = name;
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("4 - PreDestroy");
    }

    @Override
    public void destroy() {
        System.out.println("5 - Destroy - DisposableBean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("3 - afterPropertiesSet - InitializationBean");
    }

    public List<String> getOrderedList() {
        return orderedList;
    }
}
