package com.ch.ftd.manager;

import com.ch.ftd.vo.UserVO;

import java.util.List;
public interface IUsermanager {
    UserVO getUserByName(String name);

    List<UserVO> getAllUsers() throws Exception;

    boolean addUser(String name, String password,String sex,int age,int score);

    boolean delUser(String name);

    boolean updateUser(String name,String sex,int age,int score);
}
