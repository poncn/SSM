package com.poncn.controller;

import com.poncn.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author pency gui
 * @version version 1.0
 * @date 2019/9/18 0018
 */
@Controller
public class DemoCOntroller {

    @RequestMapping("/getUser")
    public String getUser(HttpServletRequest request) {
        User user = new User();
        user.setId("1");
        user.setUsername("123");
        user.setPassword("321");
        request.setAttribute("user", user);
        return "index";
    }

    @RequestMapping("/getUser2")
    public String getUser2(Map<String, Object> map) {
        User user = new User();
        user.setId("1");
        user.setUsername("123");
        user.setPassword("321");
        map.put("user", user);
        return "index";
    }

    @RequestMapping("/getUser3")
    public String getUser3(Model model) {
        User user = new User();
        user.setId("1");
        user.setUsername("123");
        user.setPassword("321");
        model.addAttribute("user", user);
        return "index";
    }
}
