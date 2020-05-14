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
 * @ClassName Address
 * @Description 卖家的收货地址
 * @Author My
 * @Date 2020/4/29 15:15
 * @ModifyDate 2020/4/29 15:15
 * @Version 1.0
 */

@NoArgsConstructor
public class Address {
    private Integer ac_id;
    private String receivername;
    private String mobile;
    private String address;
    private String area;
    private Boolean default_;
    // 是地址表的外键 用户表的主键
    private Integer c_id;

    public Integer getAc_id() {
        return ac_id;
    }

    public void setAc_id(Integer ac_id) {
        this.ac_id = ac_id;
    }

    public String getReceivername() {
        return receivername;
    }

    public void setReceivername(String receivername) {
        this.receivername = receivername;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Boolean getDefault_() {
        return default_;
    }

    public void setDefault_(Boolean default_) {
        this.default_ = default_;
    }

    public Integer getC_id() {
        return c_id;
    }

    public void setC_id(Integer c_id) {
        this.c_id = c_id;
    }
}