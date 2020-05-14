package com.hukun.uniappshopdata.basedata.controller;
////////////////////////////////////////////////////////////////////
//                          _ooOoo_                               //
//                         o8888888o                              //
//                         88" . "88                              //
//                         (| ^_^ |)                              //
//                         O\  =  /O                              //
//                      ____/`---'\____                           //
//                    .'  \\|     |//  `.                         //
//                   /  \\|||  :  |||//  \                        //
//                  /  _||||| -:- |||||-  \                       //
//                  |   | \\\  -  /// |   |                       //
//                  | \_|  ''\---/''  |   |                       //
//                  \  .-\__  `-`  ___/-. /                       //
//                ___`. .'  /--.--\  `. . ___                     //
//              ."" '<  `.___\_<|>_/___.'  >'"".                  //
//            | | :  `- \`.;`\ _ /`;.`/ - ` : | |                 //
//            \  \ `-.   \_ __\ /__ _/   .-` /  /                 //
//      ========`-.____`-.___\_____/___.-`____.-'========         //
//                           `=---='                              //
//      ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^        //
//         佛祖保佑       永无BUG     永不修改                  //
////////////////////////////////////////////////////////////////////


import com.hukun.uniappshopdata.basedata.pojo.Discuss;
import com.hukun.uniappshopdata.basedata.pojo.ProductDetail;
import com.hukun.uniappshopdata.basedata.pojo.ProductDetailDiscuss;
import com.hukun.uniappshopdata.basedata.pojo.ProductDetailStyleSize;
import com.hukun.uniappshopdata.basedata.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName ProductController
 * @Description TODO
 * @Author My
 * @Date 2020/4/29 16:17
 * @ModifyDate 2020/4/29 16:17
 * @Version 1.0
 */
@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    /**
     * 得到总记录的对象
     *
     * @param productName 查询条件
     * @param currentPage 当前页数
     * @param pageSize    每页的最大记录数
     * @return Map<String, Object>
     */
    @PostMapping("/getProductPage")
    public Map<String, Object> getProductByName(String productName, int currentPage, int pageSize) {
        //  String token = request.getHeader("token");
        // System.out.println(token);
        // boolean verity = JwtUtil.verity(token);
        HashMap map = new HashMap();
        Map<String, Object> remap = new HashMap<>();
        //  if (verity) {
        int pageStart = (currentPage - 1) * pageSize;
        map.put("pageStart", pageStart);
        map.put("pageSize", pageSize);
        map.put("productName", productName);
        List<ProductDetail> productDetails = productService.getProductByName(map);
        if (productDetails != null) {
            remap.put("code", 0);
            remap.put("data", productDetails);
        } else {
            remap.put("code", -1);
            remap.put("message", "请先登录");
        }
        return remap;

    }

    /**
     * 总记录数 分页时要使用
     *
     * @param productName 查询条件
     * @return 页数 整形
     */

    @PostMapping("/getListCount")
    public Map<String, Object> getProductCount(String productName) {
        Integer count = productService.getProductCount(productName);
        Map<String, Object> map = new HashMap<>();
        if (count != null) {
            map.put("code", 0);
            map.put("result", count);
        }
        return map;
    }

    @GetMapping("/getProductDetailDiscuss/{id}")
    public Map<String, Object> getProductDetailDiscuss(@PathVariable("id") Integer id) {
        Map<String, Object> map = new HashMap<>();
        ProductDetailDiscuss productDetailDiscuss = productService.getProductDetailDiscuss(id);
        List<Discuss> discussList = productDetailDiscuss.getDiscussList();
        if (null != productDetailDiscuss) {
            map.put("code", 0);
            List<Discuss> rediscussList=new ArrayList<>();
            for (Discuss discuss:discussList) {
                if( discuss.getId()!=null)
                {
                    rediscussList.add(discuss);
                }
            }
            productDetailDiscuss.setDiscussList(rediscussList);
            map.put("result", productDetailDiscuss);
        } else {
            map.put("code", -1);
            map.put("result", null);
        }
        return map;
    }

    @GetMapping("/getProductStyleSize/{id}")
    public Map<String, Object> getProductStyleSize(@PathVariable("id") Integer id) {
        Map<String, Object> map = new HashMap<>();
        ProductDetailStyleSize productDetailStyleSizes = productService.getProductStyleSize(id);
        if (null != productDetailStyleSizes) {
            map.put("code", 0);
            map.put("result", productDetailStyleSizes);
        } else {
            map.put("code", -1);
            map.put("result", null);
        }
        return map;
    }
}
