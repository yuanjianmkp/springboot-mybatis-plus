package com.mkp.springbootdemo1.service.impl;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.mapper.Condition;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.mkp.springbootdemo1.entity.User;
import com.mkp.springbootdemo1.mapper.UserMapper;
import com.mkp.springbootdemo1.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;



/**
 * @Description
 * @Author 缘见
 * @Date 2018/8/31 11:37
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
//    @Autowired
//    private UserMapper userMapper;

    @Override
    public int insertUser(User user) {
        return baseMapper.insert(user);
    }

    @Override
    public int updateUser(Long id) {
        User user = new User();
        user.setAge(77);
        user.setId(id);
        return baseMapper.updateById(user);
    }

    @Override
    public int deleteUser(Long id) {
        User user = new User();
        user.setDr(1);
        user.setId(id);
        return baseMapper.updateById(user);
    }

    @Override
    public Page<User> selectUserList(User user, int pageSize, int pageNum) {
        EntityWrapper<User> ew = new EntityWrapper<>();
        ew.where("dr = {0}",0);
        if(user.getAge()!=null){
            ew.and("age = {0}",user.getAge());
        }
        if(user.getName()!=null){
            ew.and("name = {0}",user.getName());
        }
        //logger.info("查询条件:{}", JSON.toJSONString(ew));
        Page<User> page = selectPage(new Page<>(pageNum,pageSize),ew);
        return page;
    }
}
