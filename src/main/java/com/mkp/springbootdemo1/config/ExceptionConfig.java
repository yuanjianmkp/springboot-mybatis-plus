package com.mkp.springbootdemo1.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author 缘见
 * @Date 2018/8/30 20:59
 */
@ControllerAdvice
public class ExceptionConfig {


    @ExceptionHandler(NullPointerException.class)
    @ResponseBody
    public Map<String,String> nullPointExceptionHandler(){
        Map<String,String> exceptionMap = new HashMap<>();
        exceptionMap.put("message","空指针异常！");
        exceptionMap.put("code","2222");
        return exceptionMap;
    }

    @ExceptionHandler(ArrayIndexOutOfBoundsException.class)
    @ResponseBody
    public Map<String,String> arrayIndexOutOfBoundsExceptionHandler(){
        Map<String,String> exceptionMap = new HashMap<>();
        exceptionMap.put("message","数组越界异常！");
        exceptionMap.put("code","1111");
        return exceptionMap;
    }

//    @ExceptionHandler(Exception.class)
//    @ResponseBody
//    public Map<String,String> exceptionHandler(){
//        Map<String,String> exceptionMap = new HashMap<>();
//        exceptionMap.put("message","服务器异常！");
//        exceptionMap.put("code","0000");
//        return exceptionMap;
//    }


}
