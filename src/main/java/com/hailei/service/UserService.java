package com.hailei.service;

import com.hailei.pojo.User;

public interface UserService {
    /**
     * 登录方法
     * @param username
     * @param password
     * @return
     */

    User login(String username, String password);

    /**
     * 注册方法
     * @return
     */

    boolean register(User user);
}
