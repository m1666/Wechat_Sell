package com.mann.sell.service;

import com.mann.sell.dto.OrderDTO;

/**
 * 买家
 * @Author: Created by 蓝胖子
 * @Date: 2020/2/27 19:35:37
 */
public interface BuyerService {

    // 查询一个订单
    OrderDTO findOrderOne(String openid,String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid,String orderId);
}
