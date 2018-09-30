package com.ch.ftd.controller;

import com.ch.ftd.manager.IUsermanager;
import com.ch.ftd.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class IndexController {
    @Autowired
    private IUsermanager usermanager;

    @RequestMapping(value="/ch/getUser",method= RequestMethod.GET)
    @ResponseBody
    public String getUser(String name){
        try{
            UserVO user = usermanager.getUserByName(name);
            String userResponse = "";
            userResponse = "{\"name\":\""+user.getName()+"\",\"sex\":\""+user.getSex()+"\",\"age\":\""+user.getAge()+"\",\"score\":\""+user.getScore()+"\"}";
            return userResponse;
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }

    }

    @RequestMapping(value="/ch/getAllUsers",method= RequestMethod.GET)
    @ResponseBody
    public String getAllUsers(){
        try{
            List<UserVO> userList = usermanager.getAllUsers();
            String userResponse = "";
            for(UserVO user:userList){
                userResponse += "user"+userList.indexOf(user)+":"+user.getName()+","+user.getSex()+","+user.getAge()+","+user.getScore()+"<br>";
            }
            return userResponse;
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }

    }

    @RequestMapping(value="/ch/addUser",method= RequestMethod.GET)
    @ResponseBody
    public String addUser(String name,String password,String sex,int age,int score){
        try{
            boolean response = usermanager.addUser(name,password,sex,age,score);
            return response?"add success!":"add failed!";
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }

    @RequestMapping(value="/ch/delUser",method= RequestMethod.GET)
    @ResponseBody
    public String delUser(String name){
        try{
            boolean response = usermanager.delUser(name);
            return response?"delete user success!":"delete user failed!";
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }

    @RequestMapping(value="/ch/updateUser",method= RequestMethod.GET)
    @ResponseBody
    public String updateUser(String name,String sex,int age,int score){
        try{
            boolean response = usermanager.updateUser(name,sex,age,score);
            return response?"update success!":"update failed!";
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }
}
