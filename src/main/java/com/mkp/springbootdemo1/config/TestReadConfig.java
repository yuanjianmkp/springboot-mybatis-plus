package com.mkp.springbootdemo1.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Description
 * @Author 缘见
 * @Date 2018/8/30 15:45
 */
@Component
@ConfigurationProperties(prefix="test")
public class TestReadConfig {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private String name;
    private Integer age;
    private List<String> hobby;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getHobby() {
        return hobby;
    }

    public void setHobby(List<String> hobby) {
        this.hobby = hobby;
    }
}
