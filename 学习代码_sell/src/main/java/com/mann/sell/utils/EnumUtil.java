package com.mann.sell.utils;

import com.mann.sell.enums.CodeEnum;

/**
 * 枚举工具类
 * @Author: Created by 蓝胖子
 * @Date: 2020/3/13 18:05:23
 */
public class EnumUtil {
    public static <T extends CodeEnum<Integer>> T getByCode(Integer code, Class<T> enumClass) {
        for (T each: enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())){
                return each;
            }
        }
        return null;
    }
}
