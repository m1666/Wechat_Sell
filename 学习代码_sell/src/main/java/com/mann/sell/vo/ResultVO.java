package com.mann.sell.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * http请求返回的最外层对象
 *
 * @Author: Created by 蓝胖子
 * @Date: 2020/2/26 22:02:36
 */
@Data
public class ResultVO<T> implements Serializable {

    private static final long serialVersionUID = -4198317135136753416L;

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 返回的具体内容
     */
    private T data;


}
