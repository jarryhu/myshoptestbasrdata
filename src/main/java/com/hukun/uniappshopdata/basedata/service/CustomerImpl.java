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


import com.hukun.uniappshopdata.basedata.mapper.CustomerMapper;
import com.hukun.uniappshopdata.basedata.pojo.Address;
import com.hukun.uniappshopdata.basedata.pojo.Customer;
import com.hukun.uniappshopdata.basedata.pojo.CustomerAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName CustomerImpl
 * @Description TODO
 * @Author My
 * @Date 2020/4/29 15:33
 * @ModifyDate 2020/4/29 15:33
 * @Version 1.0
 */
@Service
public class CustomerImpl implements CustomerService {
    @Autowired
    CustomerMapper customerMapper;

    @Override
    public Customer login(Customer customer) {
        return customerMapper.login(customer);
    }

    @Override
    public CustomerAddress getCustomerAddressInfo(Integer id) {
        return customerMapper.getCustomerAddressInfo(id);
    }

    @Override
    public int setDefaultAddress(Address address) {
        return customerMapper.setDefaultAddress(address);
    }

    @Override
    public int updateAddress(Address address) {
        return customerMapper.updateAddress(address);
    }

    @Override
    public int insertAddress(Address address) {
        return customerMapper.insertAddress(address);
    }

    @Override
    public Address getDefaultCustomerAddress(Integer id) {
        return customerMapper.getDefaultCustomerAddress(id);
    }
}
