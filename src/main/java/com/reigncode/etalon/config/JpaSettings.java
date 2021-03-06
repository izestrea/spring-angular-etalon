package com.reigncode.etalon.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by Denis on 4/7/15.
 * JPA settings class, scanns for model and repository classes
 */
@Configuration
@ComponentScan("com.reigncode")
@EnableJpaRepositories("com.reigncode")
public class JpaSettings {
}
