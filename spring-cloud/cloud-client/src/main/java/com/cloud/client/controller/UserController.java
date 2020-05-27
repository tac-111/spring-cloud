package com.cloud.client.controller;

import com.cloud.client.client.UserFeignClient;
import com.cloud.client.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {
    @Resource
    private UserFeignClient userFeignClient;
    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {
        return this.userFeignClient.findById(id);
    }
    @GetMapping("/getFeign")
    public  String getFeign(){
        String userId = "";
        //调用10次用户微服务
        for (int i = 1; i <= 10; i++) {
            //调用定义Feign客户端方法
            userId = userFeignClient.getFeign();
            System.out.println("测试+++++++"+userId);
        }


        return userId;
    }
    @GetMapping("/getFeignTo")
    public  String getFeignTo(){
        return userFeignClient.getFeignTo();
    }

}
