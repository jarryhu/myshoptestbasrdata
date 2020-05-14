package com.hukun.uniappshopdata.basedata.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Order {
    private Integer o_id;
    private String createTime;
    private Integer p_id;
    private String s1_id;
    private String s2_id;
    private Integer state;
    private Integer customer_id;
}
