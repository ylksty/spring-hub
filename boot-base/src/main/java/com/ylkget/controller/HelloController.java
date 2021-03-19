package com.ylkget.controller;

import com.ylkget.domain.Car;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *
 * </p>
 *
 * @author joe 2021/3/18 17:19
 */
@Slf4j
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String handle01(@RequestParam("name") String name){


        log.info("请求进来了....");
        return "Hello, Spring Boot 2!"+"你好："+name;
    }

    @Autowired
    Car car;

    /**
     * @author joe 2021/3/18 17:21
     * http://localhost:2500/car
     * @return {@link Car }
     **/
    @RequestMapping("/car")
    public Car car(){
        return car;
    }
}
