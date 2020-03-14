package com.mann.sell.dto;

import lombok.Data;

/**
 * @Author: Created by 蓝胖子
 * @Date: 2020/2/27 15:29:50
 */
@Data
public class CartDTO {

    /**
     * 商品Id
     */
    private String productId;

    /**
     * 数量
     */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
