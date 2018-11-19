package se.cljungblad.springcoretraining;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        if(bean instanceof Game) {
            System.out.println("MyBeanPostProcessor - Doing post process work on Game bean before initialization");
        }
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        if(bean instanceof Game) {
            System.out.println("MyBeanPostProcessor - Doing post process work on Game bean after initialization");
        }
        return bean;
    }



}
