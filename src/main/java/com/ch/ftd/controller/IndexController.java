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

    @RequestMapping(value="/ch/getAllUsers",method= RequestMethod.GET)
    @ResponseBody
    public String getAllUsers(){
        try{
            List<UserVO> userList = usermanager.getAllUsers();
            String userResponse = "";
            for(UserVO user:userList){
                userResponse += "user"+userList.indexOf(user)+":"+user.getName()+","+user.getPassword()+"<br>";
            }
            return userResponse;
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }

    }

    @RequestMapping(value="/ch/addUser",method= RequestMethod.GET)
    @ResponseBody
    public String addUser(String name,String password){
        try{
            boolean response = usermanager.addUser(name,password);
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
}
