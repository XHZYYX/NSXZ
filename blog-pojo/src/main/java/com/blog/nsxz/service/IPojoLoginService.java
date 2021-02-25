package com.blog.nsxz.service;


/**
 * @author pengchengwanli
 * @version 1.0
 * @description 数据service接口
 * @date 2021/2/25
 */
public interface IPojoLoginService {

    /**
     * @param userName
     * @param password
     * @return 登录成功/失败
     */
    String login(String userName, String password);
}
