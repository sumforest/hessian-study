package com.sen.hessian.sutdy.entity;

import java.io.Serializable;

/**
 * @Auther: Sen
 * @Date: 2019/12/13 21:34
 * @Description:
 */
public class User implements Serializable {

    private static final long serialVersionUID = 4246375326442139959L;

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
