package com.dottie.boot.Controller;

import com.dottie.boot.Exception.AppException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WorldController {

    @GetMapping(value = "/")
    public String index() {
        return "index";
    }

    @GetMapping(value = "/hi")
    public String hello() {
        return "welcome";
    }

    @GetMapping(value = "/first")
    public String first() {
        return "data/first";
    }

    @GetMapping(value = "/second")
    public String second() {
        return "data/second";
    }

    @GetMapping(value = "testEx")
    public void test() {
        int a = 1/0;
    }

    @GetMapping(value = "testEx1")
    public void test1() {
        throw new AppException("我是自定义异常，被全局捕获了", 110);
    }

}
