package com.mkp.springbootdemo1.config;

import com.baomidou.mybatisplus.mapper.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;


/**
 * @Description
 * @Author 缘见
 * @Date 2018/8/31 14:14
 */
public class MetaObjectHandlerConfig  extends MetaObjectHandler {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 新增添加创建时间以及相关字段
     * @param metaObject
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        Object createTime = getFieldValByName("createTime", metaObject);
        Object updateTime = getFieldValByName("updateTime", metaObject);
        Object tenantId = getFieldValByName("tenantId", metaObject);
        if(null == createTime){
            setFieldValByName("createTime", new Date(), metaObject);
        }
        if(null == updateTime){
            setFieldValByName("updateTime", new Date(), metaObject);
        }
        if(null == tenantId){
            setFieldValByName("tenantId", 0L, metaObject);
        }

    }

    /**
     * 更新
     * @param metaObject
     */
    @Override
    public void updateFill(MetaObject metaObject) {
        setFieldValByName("updateTime", new Date(), metaObject);
    }
}
