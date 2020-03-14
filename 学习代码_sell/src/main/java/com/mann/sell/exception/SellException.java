package com.mann.sell.exception;

import com.mann.sell.enums.ResultEnum;
import lombok.Getter;

/**
 * @Author: Created by 蓝胖子
 * @Date: 2020/2/27 14:53:14
 */
@Getter
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
