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

    private static String className = Game.class.getSimpleName();

    public Game() {
        System.out.println(className + " constructor");
    }

    @PostConstruct
    public void init() {
        System.out.println(className + " Post construct");
    }

    public void setName(String name) {
        System.out.println(className + " Setter method");
        this.name = name;
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println(className + " PreDestroy");
    }

    @Override
    public void destroy() {
        System.out.println(className + " Destroy - DisposableBean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(className + " afterPropertiesSet - InitializationBean");
    }

    public List<String> getOrderedList() {
        return orderedList;
    }
}
