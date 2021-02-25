package com.blog.nsxz.service.impl;

import com.blog.nsxz.moble.User;
import com.blog.nsxz.mapper.UserMapper;
import com.blog.nsxz.service.IPojoLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author pengchengwanli
 * @version 1.0
 * @description 数据service
 * @date 2021/2/25
 */
@Service
public class PojoLoginServiceImpl implements IPojoLoginService {

    @Autowired
    UserMapper userMapper;

    @Override
    public String login(String userName, String password) {
        User user = this.userMapper.selectByUserName(userName);
        if (user.getPassword().equals(password)) {
            return "登录成功！";
        }else {
            return "登录失败！";
        }
    }
}
