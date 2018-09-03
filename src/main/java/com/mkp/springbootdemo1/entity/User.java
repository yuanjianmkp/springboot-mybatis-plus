package com.mkp.springbootdemo1.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.mkp.springbootdemo1.common.Description;
import com.mkp.springbootdemo1.common.SuperEntity;

/**
 * @Description
 * @Author 缘见
 * @Date 2018/8/31 11:04
 */
@TableName("user")
public class User extends SuperEntity<User> {

    @Description(value = "姓名")
    private String name;

    @Description(value = "年龄")
    private Integer age;

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
}
