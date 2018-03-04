package com.dottie.boot.Controller;

import com.dottie.boot.Entity.GirlEntity;
import com.dottie.boot.Service.ManService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ManController {

    @Autowired
    private ManService manService;

    @GetMapping(value = "girls/{size}")
    public List<GirlEntity> getGirls(@PathVariable("size") String size) {
        System.out.println("hello world...");
        System.out.println("hello");
        return manService.findByCupsize(size);
    }
}
