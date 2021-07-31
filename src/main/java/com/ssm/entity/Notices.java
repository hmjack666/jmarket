package com.ssm.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @program: jmarket
 * @description: 消息实体类
 * @author: 黑马Jack
 * @create: 2021-07-21 20:08
 **/
public class Notices {

    //通知id
    private int id;
    //用户id
    private int userid;
    //消息内容
    private String message;
    //消息类型
    private String ntype;
    //消息发送时间
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "GMT+8"
    )
    private Date createtime;

    public Notices(int id, int userid, String message, String ntype, Date createtime) {
        this.id = id;
        this.userid = userid;
        this.message = message;
        this.ntype = ntype;
        this.createtime = createtime;
    }

    public Notices() {
    }

    @Override
    public String toString() {
        return "notices{" +
                "id=" + id +
                ", userid=" + userid +
                ", message='" + message + '\'' +
                ", ntype='" + ntype + '\'' +
                ", createtime=" + createtime +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getNtype() {
        return ntype;
    }

    public void setNtype(String ntype) {
        this.ntype = ntype;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}
