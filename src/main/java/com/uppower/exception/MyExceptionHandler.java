package com.uppower.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：牟神箭
 * @date ：Created in 2020/5/2 21:03
 * @description：
 * @modified By：
 * @version: $
 */
@ControllerAdvice
public class MyExceptionHandler {

    @ResponseBody
    @ExceptionHandler(MyException.class)
    public Map<String,Object> handleException(Exception e){

        Map<String,Object> map = new HashMap<>();
        map.put("message",e.getMessage());
        return map;
    }
}
