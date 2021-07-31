package com.ssm.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @program: jmarket
 * @description: 商城会员实体类
 * @author: 黑马Jack
 * @create: 2021-07-18 17:25
 **/
public class Member {

    //id
    private int id;

    //用户名（店铺名）
    private String username;

    //登录密码
    private String password;

    //确认密码
    private String password2;

    //头像
    private String image;

    //性别
    private String sex;

    //姓名
    private String name;

    //地址
    private String address;

    //状态
    private boolean status;

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", password2='" + password2 + '\'' +
                ", image='" + image + '\'' +
                ", sex='" + sex + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", status=" + status +
                ", createtime=" + createtime +
                ", remark='" + remark + '\'' +
                ", type='" + type + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "GMT+8"
    )
    private Date createtime;

    private String remark;

    private String type;

    private String tel;

    private String email;

    public Member(int id, String username, String password, String password2, String image, String sex, String name, String address, boolean status, Date createtime, String remark, String type, String tel, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.password2 = password2;
        this.image = image;
        this.sex = sex;
        this.name = name;
        this.address = address;
        this.status = status;
        this.createtime = createtime;
        this.remark = remark;
        this.type = type;
        this.tel = tel;
        this.email = email;
    }

    public Member() {
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
