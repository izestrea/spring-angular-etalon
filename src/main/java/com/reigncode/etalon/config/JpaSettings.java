package com.reigncode.etalon.config;

import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by Denis on 4/7/15.
 * JPA settings class, scanns for model and repository classes
 *
 */
@Configuration
@ComponentScan("com.reigncode")
@EnableJpaRepositories("com.reigncode")
public class JpaSettings implements EnvironmentAware {

    private Environment environment;
    private RelaxedPropertyResolver propertyResolver;

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
        this.propertyResolver = new RelaxedPropertyResolver(environment, "spring.datasource.");
        System.out.println(this.propertyResolver);
    }
}
