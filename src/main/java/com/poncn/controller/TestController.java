package com.poncn.controller;

import com.poncn.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author pency gui
 * @version version 1.0
 * @date 2019/9/18 0018
 */
@Controller
public class TestController {

    @ResponseBody
    @RequestMapping(value = "/test", produces = "application/json; charset=utf-8")
    public String test() {
        return "你好";
    }

    @RequestMapping("/test2")
    public void test2(HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println("你好!");
    }

    @ResponseBody
    @RequestMapping(value = "/test3/{id}", produces = "application/json; charset=utf-8")
    public Object test3(@PathVariable String id) {
        User user = new User();
        user.setId(id);
        user.setUsername("GPC");
        user.setPassword("111");
        return user;
    }

    @ResponseBody
    @RequestMapping(value = "/test4", produces = "application/json; charset=utf-8")
    public List<User> test4() {
        List<User> list = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            User user = new User();
            user.setId(i + "");
            user.setUsername("GPC" + i);
            user.setPassword("111" + i);
            list.add(user);
        }
        return list;
    }
}
