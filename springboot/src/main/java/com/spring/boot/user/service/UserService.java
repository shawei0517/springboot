package com.spring.boot.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.user.mapper.UserMapper;
import com.spring.boot.user.entity.User;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public void insert(User user) {
        userMapper.insert(user);
    }

    /**
     * 登录验证
     *
     * @param loginName
     * @param password
     * @return
     */
    public String login(String loginName, String password) {
        if (loginName == null || "".equals(loginName) || password == null || "".equals(password)) {
            return "error：loginName and password is not empty";
        }
        User user = new User();
        user.setLoginName(loginName);
        user.setPassword(password);
        User users = userMapper.selectOneByCondition(user);
        if (users != null) {
            return "success...";
        }
        return "error：password is error";
    }
}
