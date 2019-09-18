package com.poncn.controller;

import com.poncn.model.User;
import com.poncn.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author pency gui
 * @version version 1.0
 * @date 2019/9/18 0018
 */

@Controller
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/insert")
    public String insert() {
        User user = new User();
        user.setId("6");
        user.setUsername("H_H");
        user.setPassword("123456");
        int flag = userService.insert(user);
        if (flag >= 1) {
            System.out.println("新增成功!");
        } else {
            System.out.println("新增失败!");
        }
        return "forward:/index";
    }

    @RequestMapping(value = "/select")
    public String select() {
        User user = new User();
        user.setId("3");
        System.out.println(userService.select(user));
        return "forward:/index";
    }

    @RequestMapping(value = "/update")
    public String update() {
        User user = new User();
        user.setId("5");
        user.setUsername("V_V");
        user.setPassword("654321");
        int flag = userService.update(user);
        if (flag >= 1) {
            System.out.println("更新成功!");
        } else {
            System.out.println("更新失败!");
        }
        return "forward:/index";
    }

    @RequestMapping(value = "/delete")
    public String delete() {
        int flag = userService.delete("1");
        if (flag >= 1) {
            System.out.println("删除成功!");
        } else {
            System.out.println("删除失败!");
        }
        return "forward:/index";
    }
}
