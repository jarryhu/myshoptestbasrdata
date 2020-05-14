package com.hukun.uniappshopdata.basedata.pojo;
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

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName ProductDetail
 * @Description 商品明细
 * @Author My
 * @Date 2020/4/29 15:14
 * @ModifyDate 2020/4/29 15:14
 * @Version 1.0
 */
@Data
@NoArgsConstructor
public class ProductDetail {
    private Integer id;
    private String productName;
    private Float productPrice;
    private Integer sales;
    private String image;
    private String image2;
    private String image3;
    //款式的外键
    private Integer style_id;
    //库存
    private String repositry;
}
