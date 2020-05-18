package com.uppower.controller;

import com.uppower.domain.Administrators;
import com.uppower.mapper.AdministratorsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author ：牟神箭
 * @date ：Created in 2020/5/15 10:35
 * @description：登录页
 * @modified By：
 * @version: $
 */
@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private AdministratorsMapper administratorsMapper;

    @PostMapping(value = "/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String,Object> map, HttpSession session){
//        System.out.println(username+password);
        Administrators admin = administratorsMapper.findAdmin(username);
        if(admin.getApassword().equals(password)){
            session.setAttribute("loginUser",username);
            return "console.html";
        }else{
            //登陆失败
            map.put("msg","用户名密码错误");
            return  "login";
        }

    }
}
