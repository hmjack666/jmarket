package com.ssm.service;

import com.ssm.entity.Commodity;
import com.ssm.entity.Member;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CommodityService {

    //发布商品
    int addCommodity(Commodity commodity);
    //通过商品id查找商品
    Commodity findCommodityById(int commid);
    //通过店铺id找到商家
    Member findMemberById(int businessid);
    //通过店铺id找到已发布商品列表
    List<Commodity> findCommodityListByBusinessid(int businessid);
    //获取商品列表（前九条）
    List<Commodity> findCommodityList();
    //获取商品列表（第十到第十八条）
    List<Commodity> findCommodityList2();
    //更新商品
    int updateCommodity(Commodity commodity);
    //通过商品类别查找商品列表
    List<Commodity> findCommodityListByCommtype(String commtype);
    //通过SearchText查找商品列表
    List<Commodity> findCommodityListBySearchText(String searchText);
    //通过商品id删除商品
    int deleteCommodityById(int commid);
}
