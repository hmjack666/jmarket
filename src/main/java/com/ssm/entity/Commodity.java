package com.ssm.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @program: jmarket
 * @description: 商品实体类
 * @author: 黑马Jack
 * @create: 2021-07-18 22:17
 **/
public class Commodity {

    //商品id
    private int commid;
    //商品名称
    private String commname;
    //商品类别
    private String commtype;
    //参考价
    private String orimoney;
    //现价
    private String thinkmoney;
    //常用选项：限时促销、无等
    private String common;
    //商品库存
    private int commcount;
    //商品介绍
    private String commdesc;
    //计数单位选项：例如一斤、一米
    private String commdigit;
    //商品编号
    private String commnumber;
    //商品图片
    private String image;
    //店铺地址
    private String commaddress;
    //商品发布时间
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "GMT+8"
    )
    private Date createtime;
    //商品更新时间
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "GMT+8"
    )
    private Date updatetime;
    //商品状态
    private int commstatus;
    //商家id
    private int businessid;
    //商家电话
    private String commtel;
    //商品浏览量
    private int readnumber;
    //商家名称
    private String businessname;

    public Commodity(int commid, String commname, String commtype, String orimoney, String thinkmoney, String common, int commcount, String commdesc, String commdigit, String commnumber, String image, String commaddress, Date createtime, Date updatetime, int commstatus, int businessid, String commtel, int readnumber, String businessname) {
        this.commid = commid;
        this.commname = commname;
        this.commtype = commtype;
        this.orimoney = orimoney;
        this.thinkmoney = thinkmoney;
        this.common = common;
        this.commcount = commcount;
        this.commdesc = commdesc;
        this.commdigit = commdigit;
        this.commnumber = commnumber;
        this.image = image;
        this.commaddress = commaddress;
        this.createtime = createtime;
        this.updatetime = updatetime;
        this.commstatus = commstatus;
        this.businessid = businessid;
        this.commtel = commtel;
        this.readnumber = readnumber;
        this.businessname = businessname;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "commid=" + commid +
                ", commname='" + commname + '\'' +
                ", commtype='" + commtype + '\'' +
                ", orimoney='" + orimoney + '\'' +
                ", thinkmoney='" + thinkmoney + '\'' +
                ", common='" + common + '\'' +
                ", commcount=" + commcount +
                ", commdesc='" + commdesc + '\'' +
                ", commdigit='" + commdigit + '\'' +
                ", commnumber='" + commnumber + '\'' +
                ", image='" + image + '\'' +
                ", commaddress='" + commaddress + '\'' +
                ", createtime=" + createtime +
                ", updatetime=" + updatetime +
                ", commstatus=" + commstatus +
                ", businessid=" + businessid +
                ", commtel='" + commtel + '\'' +
                ", readnumber=" + readnumber +
                ", businessname='" + businessname + '\'' +
                '}';
    }

    public String getBusinessname() {
        return businessname;
    }

    public void setBusinessname(String businessname) {
        this.businessname = businessname;
    }

    public Commodity() {
    }

    public int getCommid() {
        return commid;
    }

    public void setCommid(int commid) {
        this.commid = commid;
    }

    public String getCommname() {
        return commname;
    }

    public void setCommname(String commname) {
        this.commname = commname;
    }

    public String getCommtype() {
        return commtype;
    }

    public void setCommtype(String commtype) {
        this.commtype = commtype;
    }

    public String getOrimoney() {
        return orimoney;
    }

    public void setOrimoney(String orimoney) {
        this.orimoney = orimoney;
    }

    public String getThinkmoney() {
        return thinkmoney;
    }

    public void setThinkmoney(String thinkmoney) {
        this.thinkmoney = thinkmoney;
    }

    public String getCommon() {
        return common;
    }

    public void setCommon(String common) {
        this.common = common;
    }

    public int getCommcount() {
        return commcount;
    }

    public void setCommcount(int commcount) {
        this.commcount = commcount;
    }

    public String getCommdesc() {
        return commdesc;
    }

    public void setCommdesc(String commdesc) {
        this.commdesc = commdesc;
    }

    public String getCommdigit() {
        return commdigit;
    }

    public void setCommdigit(String commdigit) {
        this.commdigit = commdigit;
    }

    public String getCommnumber() {
        return commnumber;
    }

    public void setCommnumber(String commnumber) {
        this.commnumber = commnumber;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCommaddress() {
        return commaddress;
    }

    public void setCommaddress(String commaddress) {
        this.commaddress = commaddress;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public int getCommstatus() {
        return commstatus;
    }

    public void setCommstatus(int commstatus) {
        this.commstatus = commstatus;
    }

    public int getBusinessid() {
        return businessid;
    }

    public void setBusinessid(int businessid) {
        this.businessid = businessid;
    }

    public String getCommtel() {
        return commtel;
    }

    public void setCommtel(String commtel) {
        this.commtel = commtel;
    }

    public int getReadnumber() {
        return readnumber;
    }

    public void setReadnumber(int readnumber) {
        this.readnumber = readnumber;
    }
}
