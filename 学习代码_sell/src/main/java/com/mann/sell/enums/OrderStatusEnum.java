package com.mann.sell.enums;

import lombok.Getter;

/**
 * @Author: Created by 蓝胖子
 * @Date: 2020/2/27 13:24:03
 */
@Getter
public enum OrderStatusEnum implements CodeEnum<Integer> {
    NEW(0,"新订单"),
    FINISHED(1,"完结"),
    CANCEL(2,"已取消")
    ;

    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
