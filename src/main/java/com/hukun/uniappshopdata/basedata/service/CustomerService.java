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


import com.hukun.uniappshopdata.basedata.pojo.Address;
import com.hukun.uniappshopdata.basedata.pojo.Customer;
import com.hukun.uniappshopdata.basedata.pojo.CustomerAddress;

/**
 * @ClassName CustomerService
 * @Description TODO
 * @Author My
 * @Date 2020/4/29 15:32
 * @ModifyDate 2020/4/29 15:32
 * @Version 1.0
 */
public interface CustomerService {
    public Customer login(Customer customer);
    public CustomerAddress getCustomerAddressInfo(Integer id);
    public int setDefaultAddress(Address address);
    public Address getDefaultCustomerAddress(Integer id);
    public int updateAddress(Address address);
    public int insertAddress(Address address);
}
