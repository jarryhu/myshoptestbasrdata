package com.hukun.uniappshopdata.basedata.controller;

import com.hukun.uniappshopdata.basedata.pojo.CustomerAddress;
import com.hukun.uniappshopdata.basedata.pojo.Order;
import com.hukun.uniappshopdata.basedata.pojo.OrderDetail;
import com.hukun.uniappshopdata.basedata.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;





    @PostMapping("getOrderListBycid")
    public Map<String, Object> getOrderListBycid(@RequestBody HashMap p_map){
        Map<String, Object> map = new HashMap<>();
       List<OrderDetail>  orderList= orderService.getOrderListBycid(p_map);
        if (orderList==null) {
            map.put("code", -1);
            map.put("result", null);
            //  map.put("message", "用户名密码不正确");

        } else {
            map.put("code", 0);
            map.put("result", orderList);
            // String token = JwtUtil.sign(loginUser);
            //  System.out.println(">>>>>>>" + token);
            //  map.put("message", "登录成功");
            //map.put("token", token);

        }
        return map;

    }

    @PostMapping("CreateOrder")
    public Map<String, Object> CreateOrder(@RequestBody Order order){
        Map<String, Object> map = new HashMap<>();
       int i  = orderService.CreateOrder(order);
        if (i<1) {
            map.put("code", -1);
            map.put("result", i);
            //  map.put("message", "用户名密码不正确");

        } else {
            map.put("code", 0);
            map.put("result", i);
            // String token = JwtUtil.sign(loginUser);
            //  System.out.println(">>>>>>>" + token);
            //  map.put("message", "登录成功");
            //map.put("token", token);

        }
        return map;

    }

}
