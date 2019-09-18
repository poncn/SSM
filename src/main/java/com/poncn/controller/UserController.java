package com.poncn.controller;

import com.poncn.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @author pency gui
 * @version version 1.0
 * @date 2019/9/18 0018
 */
@Controller
public class UserController {

    @RequestMapping("/queryById")
    public String queryById(String username, String password) {
        System.out.println(username + " " + password);
        return "index";
    }

    @RequestMapping("/query")
    public String queryById(User user) {
        System.out.println(user.getId());
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        return "forward:/index";
    }

    @RequestMapping("/queryUsername")
    public String queryById(HttpServletRequest request) {
        System.out.println(request.getParameter("username"));
        return "forward:/index";
    }

    @RequestMapping("/queryPassword")
    public String queryById(@RequestParam(defaultValue = "", value = "pwd", required = false) String password) {
        System.out.println(password);
        return "forward:/index";
    }

}
