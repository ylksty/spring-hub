package com.ylkget.security.controller;

import com.ylkget.security.entity.Users;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PostFilter;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *
 * </p>
 *
 * @author joe 2021/3/18 09:12
 */
@Controller
@RequestMapping("/test")
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("msg", "hello");
        return "success";
    }

    @GetMapping("index")
    public String index(Model model) {
        model.addAttribute("msg", "index");
        return "success";
    }

    @GetMapping("admin")
    public String admin(Model model) {
        model.addAttribute("msg", "admin");
        return "success";
    }
    @GetMapping("log")
    public String log(Model model) {
        model.addAttribute("msg", "log");
        return "success";
    }
    @GetMapping("secret")
    public String secret(Model model) {
        model.addAttribute("msg", "secret");
        return "success";
    }
    @GetMapping("sale")
    public String sale(Model model) {
        model.addAttribute("msg", "sale");
        return "success";
    }

    @Secured({"ROLE_boss"})
    @GetMapping("boss")
    public String boss(Model model) {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        model.addAttribute("msg", username);
        return "success";
    }

    @PreAuthorize("hasAnyAuthority('menu:system')")
    @GetMapping("menu")
    public String menu(Model model) {
        model.addAttribute("msg", "hasAnyAuthority('menu:system')");
        return "success";
    }

    @GetMapping("/token")
    public String token() {
        return "csrf/csrf_token";
    }

}
