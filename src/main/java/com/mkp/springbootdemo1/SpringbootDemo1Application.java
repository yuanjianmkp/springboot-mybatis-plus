package com.mkp.springbootdemo1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;


@SpringBootApplication
@EnableAutoConfiguration
@PropertySource(value="classpath:test.properties",encoding="utf-8")
public class SpringbootDemo1Application implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());


    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemo1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("CommandRunner Start ....");
    }
}
