package com.mann.sell.utils;

/**
 * 判断订单金额是否与传回金额一致
 * @Author: Created by 蓝胖子
 * @Date: 2020/3/12 21:30:19
 */
public class MathUtil {

    private static final Double Money_Range = 0.01;

    /**
     * 比较2个金额是否相等
     * @param d1
     * @param d2
     * @return true 相等，false 不相等
     */
    public static Boolean equals(Double d1,Double d2) {
        Double result = Math.abs(d1 -d2);
        if (result < Money_Range){
            return true;
        } else {
            return false;
        }
    }
}
