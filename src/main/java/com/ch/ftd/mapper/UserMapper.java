package com.ch.ftd.mapper;

import com.ch.ftd.vo.UserVO;

import java.util.List;

public interface UserMapper {
    int addUser(UserVO user) throws Exception;

    int delUser(String name) throws Exception;

    List<UserVO> getAllUsers() throws Exception;
}
