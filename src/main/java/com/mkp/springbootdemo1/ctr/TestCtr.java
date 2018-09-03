package com.mkp.springbootdemo1.ctr;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.plugins.Page;
import com.mkp.springbootdemo1.config.TestReadConfig;
import com.mkp.springbootdemo1.entity.User;
import com.mkp.springbootdemo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author 缘见
 * @Date 2018/8/30 15:52
 */
@RestController
public class TestCtr {

    @Resource
    private TestReadConfig testReadConfig;

    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    public String getTestStr(){
        return JSONObject.toJSONString(testReadConfig);
    }

    @RequestMapping("/exception1")
    public String testExceptionOneStr(){
        String str = null;
        str.length();
        return JSONObject.toJSONString(str);
    }

    @RequestMapping("/exception2")
    public String testException2Str(){
        List<Integer> list = new ArrayList<>();
        list.get(3);
        return JSONObject.toJSONString(list);
    }

    @PostMapping("/addUser")
    public String testAddUser(String name,Integer age){
        User user = new User();
        user.setName(name);
        user.setAge(age);
        userService.insertUser(user);
        return JSONObject.toJSONString(user);
    }

    @GetMapping("/updateUser")
    public String testUpdateUser(Long id){
        userService.updateUser(id);
        return JSONObject.toJSONString(id);
    }

    @GetMapping("/deleteUser")
    public String testDeleteUser(Long id){
        userService.deleteUser(id);
        return JSONObject.toJSONString(id);
    }

    @GetMapping("/listUser")
    public String testListUser(Integer pageSize,Integer pageNum,String name,Integer age){
        User user = new User();
        user.setAge(age);
        user.setName(name);
        Page<User> page = userService.selectUserList(user,pageSize,pageNum);
        return JSONObject.toJSONString(page);
    }



}
