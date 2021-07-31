package com.ssm.controller;

import com.alibaba.fastjson.JSONObject;
import com.ssm.entity.Commodity;
import com.ssm.entity.Member;
import com.ssm.mapper.CommodityMapper;
import com.ssm.mapper.SystemMapper;
import com.ssm.service.CommodityService;
import com.ssm.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @program: jmarket
 * @description: 商品控制器类
 * @author: 黑马Jack
 * @create: 2021-07-18 17:36
 **/
@Controller
@CrossOrigin
public class CommodityController {

    @Autowired
    CommodityService commodityService;

    private String imgPath;
    private String imgName;

    /**
     * 通过SearchText查找商品列表
     * @param searchText
     * @return
     */
    @RequestMapping(value = "/findCommodityListBySearchText")
    @ResponseBody
    public List<Commodity> findCommodityListBySearchText(
            @RequestParam("searchText") String searchText //searchText搜索条件
    ){

        //调用查询商品方法
        List<Commodity> commodityList = commodityService.findCommodityListBySearchText(searchText);

        return commodityList;

    }

    /**
     * 通过商品id删除商品
     * @param commid
     * @return
     */
    @RequestMapping(value = "/deleteCommodityById")
    @ResponseBody
    public String deleteCommodityById(
            @RequestParam("commid") int commid //商品id
    ){

        int i = commodityService.deleteCommodityById(commid);

        if(i == 0){
            return "删除商品失败！";
        }

        return "删除商品成功！";

    }

    /**
     * 更新商品
     * @param commodity
     * @return
     */
    @RequestMapping(value = "/updateCommodity",produces={"text/html;charset=UTF-8;"})
    @ResponseBody
    public String editCommodity(
            @RequestBody Commodity commodity//商品实体类
    ){

        //调用通过店铺id查找店铺方法
        Member member = commodityService.findMemberById(commodity.getBusinessid());

        if(member == null){
            return "账号异常，请重新登录后重试！";
        }

        commodity.setImage("http://localhost:8080/jmarket/"+imgName);

//        System.out.println(commodity);

        //调用更新商品方法
        int i = commodityService.updateCommodity(commodity);

        if(i == 0){
            return "商品无需更新！";
        }

        return "商品更新成功！";

    }

    /**
     * 通过商品类别查找商品列表
     * @param commtype
     * @return
     */
    @RequestMapping(value = "/findCommodityListByCommtype")
    @ResponseBody
    public List<Commodity> findCommodityListByCommtype(
            @RequestParam("commtype") String commtype //商品类别
    ){

        //调用通过店铺id找到已发布商品列表方法
        List<Commodity> commodityList = commodityService.findCommodityListByCommtype(commtype);

        return commodityList;

    }

    /**
     * 通过店铺id查找到店铺信息
     * @param userid
     * @return
     */
    @RequestMapping(value = "/findMemberById")
    @ResponseBody
    public Member findMemberById(
            @RequestParam("userid") int userid //店铺id
    ){

        //调用通过店铺id查找到店铺信息
        Member member = commodityService.findMemberById(userid);

        return member;

    }

    /**
     * 获取商品列表（前九条）
     * @return
     */
    @RequestMapping(value = "/findCommodityList")
    @ResponseBody
    public List<Commodity> findCommodityList(){

        //获取商品列表
        List<Commodity> commodityList = commodityService.findCommodityList();

        return commodityList;

    }

    /**
     * 获取商品列表（第十到第十八条）
     * @return
     */
    @RequestMapping(value = "/findCommodityList2")
    @ResponseBody
    public List<Commodity> findCommodityList2(){

        //调用获取商品列表方法
        List<Commodity> commodityList = commodityService.findCommodityList2();

        return commodityList;

    }

    /**
     * 图片上传功能
     * @param file
     * @param request
     * @return
     */
    @PostMapping(value = "/upload")
    @ResponseBody
    public JSONObject upload(MultipartFile file, HttpServletRequest request){
        String fileName = file.getOriginalFilename();
        String fileType = fileName.substring(fileName.lastIndexOf(".") + 1, fileName.length()).toLowerCase();
//        System.out.println(fileName+"-"+fileType);

        String realPath = request.getSession().getServletContext().getRealPath("/");

//        System.out.println(realPath);

        String filePath = realPath + file.getOriginalFilename();
        File desFile = new File(filePath);
        if(!desFile.getParentFile().exists()){
            desFile.mkdirs();
        }
        try {
            file.transferTo(desFile);
        } catch (IllegalStateException | IOException e) {
            e.printStackTrace();
            System.out.println("处理失败");
        }

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code","0");
        jsonObject.put("message","成功!");
        jsonObject.put("fileName",fileName);

        imgPath = realPath;
        imgName = fileName;

//        String imgPath = realPath + fileName;
//        System.out.println(imgPath);

        return jsonObject;
    }

    /**
     * 通过店铺id找到已发布商品列表
     *   传入参数
     *      businessid店铺id
     * @param businessid
     * @return
     */
    @RequestMapping(value = "/findCommodityListByBusinessid")
    @ResponseBody
    public List<Commodity> findCommodityListByBusinessid(
            @RequestParam("businessid") int businessid//店铺id
    ){

        //调用通过店铺id找到已发布商品列表方法
        List<Commodity> commodityList = commodityService.findCommodityListByBusinessid(businessid);

//        System.out.println(commodityList);

        return commodityList;

    }

    /**
     * 发布商品
     *   传递参数
     *     Commodity商品实体类
     * @param commodity
     * @return
     */
    @RequestMapping(value = "/addCommodity",produces={"text/html;charset=UTF-8;"})
    @ResponseBody
    public String addCommodity(
            @RequestBody Commodity commodity//商品实体类
    ){

        System.out.println(commodity.toString());

        //调用通过店铺id查找店铺方法
        Member member = commodityService.findMemberById(commodity.getBusinessid());

        if(member == null){
            return "账号异常，请重新登录后重试！";
        }

        commodity.setCommdigit("/"+commodity.getCommdigit());

        commodity.setCommaddress(member.getAddress());

        commodity.setCommtel(member.getTel());

        commodity.setBusinessname(member.getUsername());

        commodity.setImage("http://localhost:8080/jmarket/"+imgName);

        //调用发布商品方法
        int i = commodityService.addCommodity(commodity);

        if(i == 0){
            return null;
        }

        return "发布商品成功！";

    }

    /**
     * 通过商品id查找商品
     *   传入参数
     *     commid商品id
     * @param commid
     * @return
     */
    @RequestMapping(value = "/findCommodityById")
    @ResponseBody
    public Commodity findCommodityById(
            @RequestParam("commid") int commid//商品id
    ){

        //调用通过商品id找到商品方法
        Commodity commodity = commodityService.findCommodityById(commid);

//        System.out.println(commodity.toString());

        return commodity;

    }

}
