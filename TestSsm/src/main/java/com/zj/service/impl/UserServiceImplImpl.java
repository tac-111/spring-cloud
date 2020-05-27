package com.zj.service.impl;

import com.zj.dao.UserDao;
import com.zj.model.Userzj;
import com.zj.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImplImpl implements UserService {
    @Resource
    private UserDao userDao;
    public Userzj selectUser(long userId) {

        return userDao.selectUser(userId);
    }
}
