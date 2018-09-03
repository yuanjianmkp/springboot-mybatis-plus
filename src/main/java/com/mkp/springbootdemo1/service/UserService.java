package com.mkp.springbootdemo1.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.mkp.springbootdemo1.entity.User;


/**
 * @Description
 * @Author 缘见
 * @Date 2018/8/31 11:25
 */
public interface UserService extends IService<User> {

    int insertUser(User user);

    int updateUser(Long id);

    int deleteUser(Long id);

    Page<User> selectUserList(User user, int pageSize, int pageNum);

}
