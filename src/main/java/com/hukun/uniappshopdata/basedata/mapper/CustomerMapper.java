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


import com.hukun.uniappshopdata.basedata.pojo.Address;
import com.hukun.uniappshopdata.basedata.pojo.Customer;
import com.hukun.uniappshopdata.basedata.pojo.CustomerAddress;
import org.springframework.stereotype.Repository;

/**
 * @ClassName Customer
 * @Description TODO
 * @Author My
 * @Date 2020/4/29 15:29
 * @ModifyDate 2020/4/29 15:29
 * @Version 1.0
 */
@Repository
public interface CustomerMapper {

    public Customer login(Customer customer);

    public CustomerAddress getCustomerAddressInfo(Integer id);

    public int updateAddress(Address address);

    public Address getDefaultCustomerAddress(Integer id);

    public int setDefaultAddress(Address address);
    public int insertAddress(Address address);


}
