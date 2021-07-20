package com.pluralsight.conferencedemo.config;


import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfiguration {

    @Bean
    public DataSource dataSource() {
        DataSourceBuilder builder = DataSourceBuilder.create();
        builder.url("jdbc:mysql://127.0.0.1:3306/conference_demo");
        builder.username("root");
        builder.password("Ga86g89N7nr4");
        System.out.println("My custom datasource bean has been  initialized and set");
        return builder.build();

    }
}
