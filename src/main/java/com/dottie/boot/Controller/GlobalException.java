package com.dottie.boot.Controller;

import com.dottie.boot.Exception.AppException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalException {

    /**
     * 全局处理所有异常
     */
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Map<String, Object> allErrorHandler(Exception ex) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", -1);
        map.put("msg", ex.getMessage());
        return map;
    }


    /**
     * 项目自定义异常
     */
    @ExceptionHandler(AppException.class)
    @ResponseBody
    public Map<String, Object> errorHandler(AppException ex) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", ex.getCode());
        map.put("msg", ex.getMessage());
        return map;
    }
}
