package com.hukun.uniappshopdata.basedata.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class OrderDetail extends Order{
    ProductDetail productDetail;
    Customer customer;
    List<Style> styles;

}
