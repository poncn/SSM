package com.poncn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author pency gui
 * @version version 1.0
 * @date 2019/9/18 0018
 */
@Controller
public class HelloController {
    @RequestMapping("/index")
    public String index() {
        System.out.println("hello word!");
        return "index";
    }

    @RequestMapping("/login")
    public String login() {
        return "redirect:login.jsp";
    }

    @RequestMapping("/delete")
    public String delete() {
        return "redirect:/index";
    }

    @RequestMapping("/update")
    public String update() {
        return "forward:/index";
    }


}
