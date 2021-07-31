package com.ssm.controller;

import com.ssm.entity.Commodity;
import com.ssm.entity.Member;
import com.ssm.entity.Notices;
import com.ssm.entity.Order;
import com.ssm.service.CommodityService;
import com.ssm.service.OrderService;
import com.ssm.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: jmarket
 * @description: 订单Controller层
 * @author: 黑马Jack
 * @create: 2021-07-19 18:13
 **/
@Controller
@CrossOrigin
public class OrderController {

    @Autowired
    OrderService orderService;

    @Autowired
    CommodityService commodityService;

    /**
     * 通过购物车订单id移除购物车订单
     * @param id
     * @return
     */
    @RequestMapping(value = "/deleteCartOrderById")
    @ResponseBody
    public String deleteCommodityById(
            @RequestParam("id") int id //购物车订单id
    ){

        //调用通过购物车订单id移除购物车订单方法
        int i = orderService.deleteCartOrderById(id);

        if(i == 0){
            return "移除购物车失败！";
        }

        return "删除商品成功！";

    }

    /**
     * 通过顾客id获取购买订单列表
     * @param cmuserid
     * @return
     */
    @RequestMapping(value = "/buyOrderList",produces={"text/html;charset=UTF-8;"})
    @ResponseBody
    public List<Order> buyOrderList(
            @RequestParam("cmuserid") int cmuserid//顾客id
    ){

        //调用通过用户id查找购物车订单列表方法
        List<Order> buyOrderList = orderService.findBuyOrderListByCmuserid(cmuserid);

        return buyOrderList;

    }

    /**
     * 购买操作
     * @param order
     * @return
     */
    @RequestMapping(value = "/buy",produces={"text/html;charset=UTF-8;"})
    @ResponseBody
    public String buy(
            @RequestBody Order order//订单实体类
    ){

        //调用通过商品id查找商品方法
        Commodity commodity = commodityService.findCommodityById(order.getCommid());

        //new一个Notices对象
        Notices notices = new Notices();

        int businessid = commodity.getBusinessid();

        notices.setUserid(businessid);

        notices.setNtype("购买通知");

//        用户：刘云杰；电话号码：15239670412；购买了您的商品 <a href=/product-detail/1622811347376891963 style="color:#08bf91" target="_blank" >西装</a>；租衣天数：1；租衣件数：1；需支付价格：10.00元；下单时间：2021-06-04 20:56:42
        Member member = commodityService.findMemberById(order.getCmuserid());

        if(commodity == null){
            return "宝贝链接已失效，请刷新重试！";
        }

        //扣库存操作
        int new_count = commodity.getCommcount() - order.getBuycount();

        if(new_count < 0){
            return "商品库存不足！";
        }

        //将订单信息置为已购买
        order.setStatus(true);

        //调用购买方法
        int i = orderService.buy(order);

        if(i == 0){
            return "购买失败！";
        }

        commodity.setCommcount(new_count);

        //更新商品（减库存）
        int i1 = commodityService.updateCommodity(commodity);

        if(i1 == 0){
            return "购买失败！";
        }

        //发送信息内容
        String message = "用户：" + member.getUsername() +
                " 电话号码：" + member.getTel() +
                " 购买了您的商品：" + order.getCommname() +
                " 商品类别：" + commodity.getCommtype() +
                " 商品id：" + commodity.getCommid() +
                " 购买数量：" + order.getBuycount() +
                " 支付金额：" + order.getPrice() +
                " 库存还剩：" + commodity.getCommcount() +
                " 用户收获地址为：" + member.getAddress() +
                " 请尽快发货，良好的信誉是客户源的来源!";

        notices.setMessage(message);

//        System.out.println(notices.toString());

        //用户购买成功后给商家发送购买信息
        int i2 = orderService.sendMessageToBusiness(notices);

        return "购买成功！";

    }

    /**
     * 通过顾客id查找购物车订单列表
     *   传入参数
     *     cmuserid顾客id
     * @param cmuserid
     * @return
     */
    @RequestMapping(value = "/cartOrderList",produces={"text/html;charset=UTF-8;"})
    @ResponseBody
    public List<Order> cartOrderList(
        @RequestParam("cmuserid") int cmuserid//顾客id
    ){

        //调用通过用户id查找购物车订单列表方法
        List<Order> cartOrderList = orderService.findCartOrderListByCmuserid(cmuserid);

        return cartOrderList;

    }

    /**
     * 加入购物车
     *   传入参数
     *     order订单实体类
     * @param order
     * @return
     */
    @RequestMapping(value = "/addToCart",produces={"text/html;charset=UTF-8;"})
    @ResponseBody
    public String addToCart(
            @RequestBody Order order//订单实体类
    ){

        //调用通过商品id查找商品方法
        Commodity commodity = orderService.findCommodityById(order.getCommid());

        if(commodity == null){
            return "宝贝链接已失效，请刷新重试！";
        }

        //调用通过商品id查找购物车订单方法
        Order order1 = orderService.findCartOrderById(order.getCommid());

        if(order1 != null){
            return "商品已存在购物车中！";
        }

        String thinkmoney = commodity.getThinkmoney();

        double money = Double.parseDouble(thinkmoney);

        money = money * order.getBuycount();

        order.setPrice(String.valueOf(money));

        order.setStatus(false);

        //调用加入购物车方法
        int i = orderService.addToCart(order);

        if(i == 0){
            return "加入购物车失败！";
        }

        return "加入购物车成功！";

    }

}
