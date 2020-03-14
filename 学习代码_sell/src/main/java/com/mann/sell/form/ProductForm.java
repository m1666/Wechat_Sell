package com.mann.sell.form;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author: Created by 蓝胖子
 * @Date: 2020/3/13 21:27:47
 */
@Data
public class ProductForm {


    private String productId;

    /** 名字. */
    private String productName;

    /** 单价. */
    private BigDecimal productPrice;

    /** 库存. */
    private Integer productStock;

    /** 描述. */
    private String productDescription;

    /** 小图. */
    private String productIcon;

    /** 类目编号. */
    private Integer categoryType;
}
