package com.mann.sell.enums;

import lombok.Getter;

/**
 * @Author: Created by 蓝胖子
 * @Date: 2020/2/27 13:30:22
 */
@Getter
public enum PayStatusEnum implements CodeEnum<Integer> {

    WAIT(0,"等待支付"),
    SUCCESS(1,"支付成功"),
    ;

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
