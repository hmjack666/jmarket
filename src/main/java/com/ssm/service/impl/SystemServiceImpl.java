package com.ssm.service.impl;

import com.ssm.entity.Member;
import com.ssm.entity.Notices;
import com.ssm.mapper.SystemMapper;
import com.ssm.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @program: jmarket
 * @description: SystemService层实现类
 * @author: 黑马Jack
 * @create: 2021-07-18 18:49
 **/
public class SystemServiceImpl implements SystemService {

    @Autowired
    SystemMapper systemMapper;

    //注册
    @Override
    public int register(Member member) {
        return systemMapper.register(member);
    }

    //通过用户名查找Member
    @Override
    public Member findMemberByUsername(String username) {
        return systemMapper.findMemberByUsername(username);
    }

    //通过用户id获取消息列表
    @Override
    public List<Notices> findMessageByUserid(int userid) {
        return systemMapper.findMessageByUserid(userid);
    }
}
