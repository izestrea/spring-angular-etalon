package com.reigncode.etalon.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by denchiosa on 4/7/15.
 */
@Configuration
@EnableJpaRepositories(basePackages = {"com.reigncode.etalon.domain","com.reigncode.etalon.repository"})
public class JpaSettings {
}
