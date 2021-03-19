package com.ylkget.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *
 * </p>
 *
 * @author joe 2021/3/18 09:12
 */
@RestController
@RequestMapping("/test")
public class HelloController {

    @GetMapping("hello")
    public String hello() {
        return "hello security";
    }
}
