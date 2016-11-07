package me.bayes.vertx.spring.boot;

import io.vertx.core.Vertx;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by kevinbayes on 7/11/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Launcher.class)
public class VertxAutoConfigurationTest {

    @Autowired
    public Vertx vertx;

    @Test
    public void test() {

        assertNotNull(vertx);
    }
}