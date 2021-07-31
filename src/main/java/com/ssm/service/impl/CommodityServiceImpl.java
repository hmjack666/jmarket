package com.ssm.service.impl;

import com.ssm.entity.Commodity;
import com.ssm.entity.Member;
import com.ssm.mapper.CommodityMapper;
import com.ssm.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @program: jmarket
 * @description: CommodityService实现类
 * @author: 黑马Jack
 * @create: 2021-07-18 23:47
 **/
public class CommodityServiceImpl implements CommodityService {

    @Autowired
    CommodityMapper commodityMapper;

    //发布商品
    @Override
    public int addCommodity(Commodity commodity) {
        return commodityMapper.addCommodity(commodity);
    }
    //通过商品id查找商品
    @Override
    public Commodity findCommodityById(int commid) {
        return commodityMapper.findCommodityById(commid);
    }
    //通过店铺id找到商家
    @Override
    public Member findMemberById(int businessid) {
        return commodityMapper.findMemberById(businessid);
    }
    //通过店铺id找到已发布商品列表
    @Override
    public List<Commodity> findCommodityListByBusinessid(int businessid) {
        return commodityMapper.findCommodityListByBusinessid(businessid);
    }
    //获取商品列表（前九条）
    @Override
    public List<Commodity> findCommodityList() {
        return commodityMapper.findCommodityList();
    }
    //获取商品列表（第十到第十八条）
    @Override
    public List<Commodity> findCommodityList2() {
        return commodityMapper.findCommodityList2();
    }
    //更新商品
    @Override
    public int updateCommodity(Commodity commodity) {
        return commodityMapper.updateCommodity(commodity);
    }
    //通过商品类别查找商品列表
    @Override
    public List<Commodity> findCommodityListByCommtype(String commtype) {
        return commodityMapper.findCommodityListByCommtype(commtype);
    }
    //通过SearchText查找商品列表
    @Override
    public List<Commodity> findCommodityListBySearchText(String searchText) {
        return commodityMapper.findCommodityListBySearchText(searchText);
    }
    //通过商品id删除商品
    @Override
    public int deleteCommodityById(int commid) {
        return commodityMapper.deleteCommodityById(commid);
    }

}
