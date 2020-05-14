package com.hukun.uniappshopdata.basedata.service;

import com.hukun.uniappshopdata.basedata.mapper.OrderMapper;
import com.hukun.uniappshopdata.basedata.pojo.Order;
import com.hukun.uniappshopdata.basedata.pojo.OrderDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderMapper orderMapper;

    @Override
    public int CreateOrder(Order order) {
        return orderMapper.CreateOrder(order);
    }

    @Override
    public List<OrderDetail> getOrderListBycid(HashMap map) {
        return orderMapper.getOrderListBycid(map);
    }

    @Override
    public int getOrderListBycidCount(HashMap map) {
        return orderMapper.getOrderListBycidCount(map);
    }
}
