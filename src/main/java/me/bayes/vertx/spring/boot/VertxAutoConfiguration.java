package me.bayes.vertx.spring.boot;

import io.vertx.core.Vertx;
import io.vertx.core.VertxOptions;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 * Spring boot starter for vertx
 * </p>
 *
 * @author Kevin Bayes
 * @version 0.0.1
 */
@Configuration
@ConditionalOnClass(Vertx.class)
@ConditionalOnMissingBean(Vertx.class)
@EnableConfigurationProperties(VertxProperties.class)
public class VertxAutoConfiguration {

    private static Logger LOG = LoggerFactory.getLogger(VertxAutoConfiguration.class);

    @Bean
    public Vertx vertx(VertxProperties properties) {

        final String propertyJson = Json.encode(properties);
        LOG.info("Loaded vertx properties '{}'.", propertyJson);

        JsonObject config = new JsonObject(propertyJson);

        VertxOptions options = new VertxOptions(config);

        return Vertx.vertx(options);
    }
}
