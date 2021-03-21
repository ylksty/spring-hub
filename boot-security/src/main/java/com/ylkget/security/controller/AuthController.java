package com.ylkget.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * <p>
 * CSRFController
 * </p>
 *
 * @author joe 2021/3/21 17:06
 */
@Controller
public class AuthController {

    @GetMapping("/login")
    public String login(Model model){
        return "login";
    }

    @PostMapping("/login")
    public String loginSuccess(Model model){
        return "success";
    }
}
