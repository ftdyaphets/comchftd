package com.ch.ftd.controller;

import com.ch.ftd.mapper.UserMapper;
import com.ch.ftd.vo.UserVO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class IndexController {
    @RequestMapping(value="/ch/getAllUsers",method= RequestMethod.GET)
    @ResponseBody
    public String getAllUsers(){
        SqlSession sqlSession = null;
        try{
            sqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml")).openSession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            List<UserVO> userList = mapper.getAllUsers();
            sqlSession.commit();
            String userResponse = "";
            for(UserVO user:userList){
                userResponse += "user"+userList.indexOf(user)+":"+user.getName()+","+user.getPassword()+"<br>";
            }
            return userResponse;
        }catch (Exception e){
            if(sqlSession!=null){
                sqlSession.rollback();
            }
            e.printStackTrace();
            return e.getMessage();
        }

    }

    @RequestMapping(value="/ch/addUser",method= RequestMethod.GET)
    @ResponseBody
    public String addUser(String name,String password){
        SqlSession sqlSession = null;
        try{
            sqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml")).openSession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            UserVO user = new UserVO();
            user.setName(name);
            user.setPassword(password);
            mapper.addUser(user);
            sqlSession.commit();
            return "add success!";
        }catch (Exception e){
            if(sqlSession!=null){
                sqlSession.rollback();
            }
            e.printStackTrace();
            return e.getMessage();
        }
    }

    @RequestMapping(value="/ch/delUser",method= RequestMethod.GET)
    @ResponseBody
    public String delUser(String name){
        SqlSession sqlSession = null;
        try{
            sqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml")).openSession();
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            mapper.delUser(name);
            sqlSession.commit();
            return "delete user success!";
        }catch (Exception e){
            if(sqlSession!=null){
                sqlSession.rollback();
            }
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
