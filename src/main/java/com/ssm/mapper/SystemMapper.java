package com.ssm.mapper;

import com.ssm.entity.Member;
import com.ssm.entity.Notices;

import java.util.List;

public interface SystemMapper {

    //注册
    int register(Member member);

    //通过用户名查找Member
    Member findMemberByUsername(String username);

    //通过用户id获取消息列表
    List<Notices> findMessageByUserid(int userid);
    
}
