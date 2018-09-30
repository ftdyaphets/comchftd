package com.ch.ftd.manager;

import com.ch.ftd.vo.UserVO;

import java.util.List;
public interface IUsermanager {
    List<UserVO> getAllUsers() throws Exception;

    boolean addUser(String name, String password);

    boolean delUser(String name);
}
