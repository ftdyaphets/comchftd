package com.ch.ftd.manager.impl;

import com.ch.ftd.manager.IUsermanager;
import com.ch.ftd.mapper.UserMapper;
import com.ch.ftd.tools.SqlSessionTools;
import com.ch.ftd.vo.UserVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserManager implements IUsermanager{
    @Override
    public List<UserVO> getAllUsers() {
        SqlSession sqlSession= SqlSessionTools.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        try{
            List<UserVO> userList = userMapper.getAllUsers();
            sqlSession.commit();
            return userList;
        }catch(Exception e){
            e.printStackTrace();
            sqlSession.rollback();
            return null;
        }
    }
    @Override
    public boolean addUser(String name,String password){
        SqlSession sqlSession= SqlSessionTools.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        UserVO user = new UserVO();
        user.setName(name);
        user.setPassword(password);
        try{
            userMapper.addUser(user);
            sqlSession.commit();
            return true;
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
            return false;
        }
    }

    @Override
    public boolean delUser(String name){
        SqlSession sqlSession= SqlSessionTools.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        try{
            userMapper.delUser(name);
            sqlSession.commit();
            return true;
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
            return false;
        }
    }

}
