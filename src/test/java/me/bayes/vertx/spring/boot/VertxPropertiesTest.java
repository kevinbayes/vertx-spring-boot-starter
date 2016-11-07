package me.bayes.vertx.spring.boot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by kevinbayes on 7/11/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Launcher.class)
public class VertxPropertiesTest {

    @Value("${spring.boot.ext.vertx.eventLoopPoolSize}")
    public String eventLoopPoolSize;

    @Test
    public void getEventLoopPoolSize() throws Exception {

        assertEquals("123", eventLoopPoolSize);
    }
}