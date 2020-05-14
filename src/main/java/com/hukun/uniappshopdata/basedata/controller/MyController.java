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

import com.hukun.uniappshopdata.basedata.pojo.Address;
import com.hukun.uniappshopdata.basedata.pojo.Customer;
import com.hukun.uniappshopdata.basedata.pojo.CustomerAddress;
import com.hukun.uniappshopdata.basedata.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName MyController
 * @Description TODO
 * @Author My
 * @Date 2020/4/29 23:42
 * @ModifyDate 2020/4/29 23:42
 * @Version 1.0
 */
@RestController
public class MyController {
    @Autowired
    CustomerService customerService;

    @PostMapping("/login")
    public Map<String, Object> Login(@RequestBody Customer customer) {
        Map<String, Object> map = new HashMap<>();
        Customer loginUser = customerService.login(customer);
        if (loginUser == null) {
            map.put("code", -1);
            map.put("result", loginUser);
            map.put("message", "用户名密码不正确");
            return map;
        } else if (loginUser != null) {
            map.put("code", 0);
            map.put("result", loginUser);
            // String token = JwtUtil.sign(loginUser);
            //  System.out.println(">>>>>>>" + token);
            map.put("message", "登录成功");
            //map.put("token", token);
            return map;
        }
        return map;
    }


    @GetMapping("/getDefaultCustomerAddress/{id}")
    public Map<String, Object> getDefaultCustomerAddress(@PathVariable("id") Integer id) {

        Map<String, Object> map = new HashMap<>();
        Address address = customerService.getDefaultCustomerAddress(id);
        if (address == null) {
            map.put("code", -1);
            map.put("result", null);
            //  map.put("message", "用户名密码不正确");
            return map;
        } else if (address != null) {
            map.put("code", 0);
            map.put("result", address);
            // String token = JwtUtil.sign(loginUser);
            //  System.out.println(">>>>>>>" + token);
            //  map.put("message", "登录成功");
            //map.put("token", token);
            return map;
        }
        return map;
    }

    @GetMapping("/getCustomerAddressInfo/{id}")
    public Map<String, Object> getCustomerAddressInfo(@PathVariable("id") Integer id) {

        Map<String, Object> map = new HashMap<>();
        CustomerAddress customerAddressInfo = customerService.getCustomerAddressInfo(id);
        if (customerAddressInfo == null) {
            map.put("code", -1);
            map.put("result", null);
          //  map.put("message", "用户名密码不正确");
            return map;
        } else if (customerAddressInfo != null) {
            map.put("code", 0);
            map.put("result", customerAddressInfo);
            // String token = JwtUtil.sign(loginUser);
            //  System.out.println(">>>>>>>" + token);
          //  map.put("message", "登录成功");
            //map.put("token", token);
            return map;
        }
        return map;
    }

    @PostMapping("updateAddress")
    public Map<String,Object> updateAddress(@RequestBody  Address address)
    {
        Map<String, Object> map = new HashMap<>();
        if(address.getDefault_())
        {
            customerService.setDefaultAddress(address);
        }
        int i = customerService.updateAddress(address);
        if (i <1) {
            map.put("code", -1);
            map.put("result", i);
            map.put("message", "地址更新失败");
            return map;
        } else if (i >=1) {
            map.put("code", 0);
            map.put("result", i);
            // String token = JwtUtil.sign(loginUser);
            //  System.out.println(">>>>>>>" + token);
              map.put("message", "地址更新成功");
            //map.put("token", token);
            return map;
        }
        return map;
    }


    @PostMapping("insertAddress")
    public Map<String,Object> insertAddress(@RequestBody  Address address)
    {
        Map<String, Object> map = new HashMap<>();
        if(address.getDefault_())
        {
            customerService.setDefaultAddress(address);
        }
        int i = customerService.insertAddress(address);
        if (i <1) {
            map.put("code", -1);
            map.put("result", i);
            map.put("message", "地址添加失败");
            return map;
        } else if (i >=1) {
            map.put("code", 0);
            map.put("result", i);
            // String token = JwtUtil.sign(loginUser);
            //  System.out.println(">>>>>>>" + token);
            map.put("message", "地址添加成功");
            //map.put("token", token);
            return map;
        }
        return map;
    }
}
