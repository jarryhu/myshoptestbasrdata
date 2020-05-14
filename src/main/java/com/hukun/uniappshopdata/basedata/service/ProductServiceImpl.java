package com.hukun.uniappshopdata.basedata.service;
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


import com.hukun.uniappshopdata.basedata.mapper.ProductMapper;
import com.hukun.uniappshopdata.basedata.pojo.ProductDetail;
import com.hukun.uniappshopdata.basedata.pojo.ProductDetailDiscuss;
import com.hukun.uniappshopdata.basedata.pojo.ProductDetailStyleSize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * @ClassName ProductServiceImpl
 * @Description TODO
 * @Author My
 * @Date 2020/4/29 16:20
 * @ModifyDate 2020/4/29 16:20
 * @Version 1.0
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductMapper productMapper;

    @Override
    public List<ProductDetail> getProductByName(HashMap map) {
        return productMapper.getProductByName(map);
    }

    @Override
    public Integer getProductCount(String productName) {
        return productMapper.getProductCount(productName);
    }

    @Override
    public ProductDetailDiscuss getProductDetailDiscuss(Integer id) {
        return productMapper.getProductDetailDiscuss(id);
    }

    @Override
    public ProductDetailStyleSize getProductStyleSize(Integer id) {
        return productMapper.getProductStyleSize(id);
    }
}
