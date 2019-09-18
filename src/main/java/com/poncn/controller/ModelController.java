package com.poncn.controller;

import com.poncn.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @author pency gui
 * @version version 1.0
 * @date 2019/9/18 0018
 */
@Controller
public class ModelController {
    @RequestMapping("/queryById")
    public String queryById(String username, String password) {
        System.out.println(username + " " + password);
        return "index";
    }

    @RequestMapping("/query")
    public String query(User user) {
        System.out.println(user.getId());
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        return "forward:/index";
    }

    @RequestMapping("/queryUsername")
    public String queryUsername(HttpServletRequest request) {
        System.out.println(request.getParameter("username"));
        return "forward:/index";
    }

    @RequestMapping("/queryPassword")
    public String queryPassword(@RequestParam(defaultValue = "", value = "pwd", required = false) String password) {
        System.out.println(password);
        return "forward:/index";
    }

    @RequestMapping("/queryId/{id}.html")
    public String queryId(@PathVariable String id) {
        System.out.println(id);
        return "forward:/index";
    }

    @RequestMapping("/queryNum/{id}")
    public String queryNum(@PathVariable String id) {
        System.out.println(id);
        return "forward:/index";
    }
}
