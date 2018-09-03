package com.mkp.springbootdemo1.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description
 * @Author 缘见
 * @Date 2018/8/31 9:36
 */
@Configuration
public class CommondLineRunConfig {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Bean
    public CommandLineRunner runner() {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                logger.info("commandRunner start");
            }
        };
    }


}
