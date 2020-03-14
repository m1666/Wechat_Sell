package com.mann.sell.constant;

/**
 * redis 常量
 * @Author: Created by 蓝胖子
 * @Date: 2020/3/14 00:49:38
 */
public interface RedisConstant {

    String TOKEN_PREFIX = "token_%s";

    /**
     * 设置过期时间 2小时
     */
    Integer EXPIRE = 7200;
}
