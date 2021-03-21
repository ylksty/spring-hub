package com.ylkget.security.controller;

import com.ylkget.security.entity.Users;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PostFilter;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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

    @GetMapping("index")
    public String index() {
        return "登录成功";
    }

    @GetMapping("admin")
    public String admin() {
        return "admin";
    }
    @GetMapping("log")
    public String log() {
        return "log";
    }
    @GetMapping("secret")
    public String secret() {
        return "secret";
    }
    @GetMapping("sale")
    public String sale() {
        return "sale";
    }

    @Secured({"ROLE_boss"})
    @GetMapping("boss")
    public String boss() {
        return "boss";
    }

    @PreAuthorize("hasAnyAuthority('menu:system')")
    @GetMapping("menu")
    public String menu() {
        return "hasAnyAuthority('menu:system')";
    }



}
