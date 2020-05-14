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
 * @ClassName
 * @Description 商品评论
 * @Author My
 * @Date 2020/4/29 15:15
 * @ModifyDate 2020/4/29 15:15
 * @Version 1.0
 */
@Data
@NoArgsConstructor
public class Discuss {

    private Integer id;
    private String nickname;
    private String time;
    private String content;
    private String zan;
    //商品的主键
    private String p_id;
    private Integer d_s_id;
    private Style style;
}
