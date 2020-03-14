package com.mann.sell.enums;

import lombok.Getter;

/**
 * 商品状态
 * @Author: Created by 蓝胖子
 * @Date: 2020/2/26 21:27:59
 */
@Getter
public enum ProductInfoStatusEnum implements CodeEnum<Integer> {
    UP(0, "在架"),
    DOWN(1, "下架")
    ;

    private Integer code;

    private String message;

    ProductInfoStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
