package com.ssm.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @program: jmarket
 * @description: 订单实体类
 * @author: 黑马Jack
 * @create: 2021-07-19 17:27
 **/
public class Order {

    //订单id
    private int id;
    //商品id
    private int commid;
    //商品名称
    private String commname;
    //商品描述
    private String commdesc;
    //购买时间
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "GMT+8"
    )
    private Date soldtime;
    //购买用户id
    private int cmuserid;
    //商家名字
    private String businessname;
    //店铺地址
    private String address;
    //购买数量
    private int buycount;
    //订单价格
    private String price;
    //商品状态：已购买订单，购物车订单
    private boolean status;

    public Order(int id, int commid, String commname, String commdesc, Date soldtime, int cmuserid, String businessname, String address, int buycount, String price, boolean status) {
        this.id = id;
        this.commid = commid;
        this.commname = commname;
        this.commdesc = commdesc;
        this.soldtime = soldtime;
        this.cmuserid = cmuserid;
        this.businessname = businessname;
        this.address = address;
        this.buycount = buycount;
        this.price = price;
        this.status = status;
    }

    public Order() {
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", commid=" + commid +
                ", commname='" + commname + '\'' +
                ", commdesc='" + commdesc + '\'' +
                ", soldtime=" + soldtime +
                ", cmuserid=" + cmuserid +
                ", businessname='" + businessname + '\'' +
                ", address='" + address + '\'' +
                ", buycount=" + buycount +
                ", price='" + price + '\'' +
                ", status=" + status +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getCommdesc() {
        return commdesc;
    }

    public void setCommdesc(String commdesc) {
        this.commdesc = commdesc;
    }

    public Date getSoldtime() {
        return soldtime;
    }

    public void setSoldtime(Date soldtime) {
        this.soldtime = soldtime;
    }

    public int getCmuserid() {
        return cmuserid;
    }

    public void setCmuserid(int cmuserid) {
        this.cmuserid = cmuserid;
    }

    public String getBusinessname() {
        return businessname;
    }

    public void setBusinessname(String businessname) {
        this.businessname = businessname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBuycount() {
        return buycount;
    }

    public void setBuycount(int buycount) {
        this.buycount = buycount;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
