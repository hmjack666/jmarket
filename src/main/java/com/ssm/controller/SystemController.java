package com.ssm.controller;

import com.ssm.entity.Member;
import com.ssm.entity.Notices;
import com.ssm.entity.Order;
import com.ssm.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: jmarket
 * @description: 控制系统的登录和注册功能
 * @author: 黑马Jack
 * @create: 2021-07-18 17:36
 **/
@Controller
@CrossOrigin
public class SystemController {

    @Autowired
    SystemService systemService;

    /**
     * 通过用户id获取消息列表
     * @param userid
     * @return
     */
    @RequestMapping(value = "/messageList",produces={"text/html;charset=UTF-8;"})
    @ResponseBody
    public List<Notices> messageList(
            @RequestParam("userid") int userid//用户id
    ){

        //调用通过用户id获取消息列表方法
        List<Notices> noticesList = systemService.findMessageByUserid(userid);

        return noticesList;

    }

    /**
     * 登录验证功能
     * 传入参数为
     *  username
     *  password
     * @param username
     * @param password
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/login",method= RequestMethod.POST)
    @ResponseBody
    public Map<String, String> login(
            @RequestParam(value="username",required=true) String username,//方法参数为用户名
            @RequestParam(value="password",required=true) String password,//方法参数为密码
            HttpServletRequest request
    ) {
        Map<String, String> ret = new HashMap<String, String>();
        if (StringUtils.isEmpty(username)) {
            ret.put("type", "error");
            ret.put("msg", "用户名不能为空!");
            return ret;
        }
        if (StringUtils.isEmpty(password)) {
            ret.put("type", "error");
            ret.put("msg", "密码不能为空!");
            return ret;
        }

        //通过用户名查找用户
        Member user = systemService.findMemberByUsername(username);

        if (user == null) {
            ret.put("type", "error");
            ret.put("msg", "不存在该用户!");
            return ret;
        }
        if (!password.equals(user.getPassword())) {
            ret.put("type", "error");
            ret.put("msg", "密码错误!");
            return ret;
        }

        ret.put("type", "success");
        ret.put("msg", "登录成功!");
        ret.put("userid",String.valueOf(user.getId()));
        ret.put("username",user.getUsername());
        ret.put("membertype",user.getType());

        return ret;
    }

    /**
     * 注册功能
     * @param member
     * @return
     */
    @RequestMapping(value = "/register",produces={"text/html;charset=UTF-8;"})
    @ResponseBody
    public String register(
            Member member//接收Member类
    ){

        System.out.println(member.toString());

        if(!member.getPassword().equals(member.getPassword2())){
            return "两次输入的密码不一致！";
        }

        //通过名称找到Member
        Member menber = systemService.findMemberByUsername(member.getUsername());

        if(menber != null){
            return "名称已被使用！";
        }

        //注册
        int register = systemService.register(member);

        if(register == 0){
            return "注册失败！";
        }

        return "注册成功！";

    }

}
