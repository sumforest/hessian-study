package com.sen.hessian.study.service.api.impl;

import com.sen.hessian.study.service.api.UserService;
import com.sen.hessian.sutdy.entity.User;

/**
 * @Auther: Sen
 * @Date: 2019/12/13 21:43
 * @Description:
 */
public class UserServiceImpl implements UserService {
    public User getUser() {
        return new User("Hello World");
    }
}
