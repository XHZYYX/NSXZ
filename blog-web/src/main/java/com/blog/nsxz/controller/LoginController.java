package com.blog.nsxz.controller;

import com.blog.nsxz.service.impl.PojoLoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author pengchengwanli
 * @version 1.0
 * @description 登录控制
 * @date 2021/2/25
 */
@ResponseBody
@Controller
public class LoginController {

    @Autowired
    private PojoLoginServiceImpl loginService ;

    @GetMapping("login")
    public String login(@RequestParam("username")String username,@RequestParam("password")String password ) {

        String r = loginService.login(username, password);

        return r;
    }
    @PostMapping("login")
    public String userLogin(HttpServletRequest request){
        String userName = (String) request.getSession().getAttribute("userName");
        String password = (String) request.getSession().getAttribute("password");
        return "home";
    }
}
