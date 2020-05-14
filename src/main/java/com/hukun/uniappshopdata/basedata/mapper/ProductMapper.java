package com.hukun.uniappshopdata.basedata.mapper;
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


import com.hukun.uniappshopdata.basedata.pojo.ProductDetail;
import com.hukun.uniappshopdata.basedata.pojo.ProductDetailDiscuss;
import com.hukun.uniappshopdata.basedata.pojo.ProductDetailStyleSize;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

/**
 * @ClassName ProductMapper
 * @Description TODO
 * @Author My
 * @Date 2020/4/29 16:18
 * @ModifyDate 2020/4/29 16:18
 * @Version 1.0
 */
@Repository
public interface ProductMapper {
    // @Select("select * from productdetail limit #{pageStart},#{pageSize}")
    public List<ProductDetail> getProductByName(HashMap map);

    // @Select("select count(*) from productdetail")
    public Integer getProductCount(String productName);

    public ProductDetailDiscuss getProductDetailDiscuss(Integer id);

    public ProductDetailStyleSize getProductStyleSize(Integer id);

}
