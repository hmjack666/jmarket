package com.ssm.service;

import com.ssm.entity.Commodity;
import com.ssm.entity.Notices;
import com.ssm.entity.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {

    //购买
    int buy(Order order);
    //将商品加入购物车
    int addToCart(Order order);
    //通过id查找商品
    Commodity findCommodityById(int id);
    //通过id查找购物车订单
    Order findCartOrderById(int id);
    //通过用户id查找购物车订单列表
    List<Order> findCartOrderListByCmuserid(int id);
    //通过id查找已购买的商品订单列表
    List<Order> findBuyOrderListByCmuserid(int id);
    //发送信息给商家
    int sendMessageToBusiness(Notices notices);
    //通过购物车订单id移除购物车订单
    int deleteCartOrderById(int id);

}
