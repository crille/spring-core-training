package se.cljungblad.springcoretraining;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes={GameConfiguration.class})
public class SpringBeanLifeCycleTest {

    @Autowired
    private Game game;

    @Test
    public void shouldPrintBeanLifeCycleEvents() {
    }

}
