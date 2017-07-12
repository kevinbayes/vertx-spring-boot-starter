/**
 * Copyright 2016 Kevin Bayes
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package me.bayes.vertx.spring.boot;

import io.vertx.core.Vertx;
import io.vertx.core.VertxOptions;
import io.vertx.core.dns.AddressResolverOptions;
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
 * Spring boot starter for vertx.
 * </p>
 *
 * @author Kevin Bayes
 * @version 0.0.1
 */
@Configuration
@ConditionalOnClass(Vertx.class)
@ConditionalOnMissingBean(Vertx.class)
@EnableConfigurationProperties({VertxProperties.class, VertxAddressResolverProperties.class})
public class VertxAutoConfiguration {

    private static Logger LOG = LoggerFactory.getLogger(VertxAutoConfiguration.class);

    @Bean
    public AddressResolverOptions addressResolverOptions(final VertxAddressResolverProperties properties) {

        final String propertyJson = Json.encode(properties);
        LOG.info("Loaded vertx address resolver properties '{}'.", propertyJson);

        final JsonObject config = new JsonObject(propertyJson);

        final AddressResolverOptions options = new AddressResolverOptions(config);

        return options;
    }

    @Bean
    public VertxOptions vertxOptions(final VertxProperties properties,
                                     final AddressResolverOptions addressResolverOptions) {

        final String propertyJson = Json.encode(properties);
        LOG.info("Loaded vertx properties '{}'.", propertyJson);

        final JsonObject config = new JsonObject(propertyJson);

        final VertxOptions options = new VertxOptions(config);
        options.setAddressResolverOptions(addressResolverOptions);

        return options;
    }

    @Bean
    public Vertx vertx(final VertxOptions vertxOptions) {

        return Vertx.vertx(vertxOptions);
    }
}
