package com.zj.controller;

import com.zj.model.Userzj;
import com.zj.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "test",method = RequestMethod.GET)
    public ModelAndView testJsp(){
        ModelAndView mv = new ModelAndView();
        Userzj user = userService.selectUser(1);

        System.out.println("测试"+user.getMobile());
        mv.addObject("Userzj",user);
        mv.setViewName("user");
        return mv;
    }
}
