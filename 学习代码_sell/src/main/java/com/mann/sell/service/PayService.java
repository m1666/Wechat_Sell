package com.mann.sell.service;

import com.lly835.bestpay.model.PayResponse;
import com.lly835.bestpay.model.RefundResponse;
import com.mann.sell.dto.OrderDTO;

/**
 * 支付
 * @Author: Created by 蓝胖子
 * @Date: 2020/3/12 19:32:35
 */
public interface PayService {

    /**
     * 发起支付
     * @param orderDTO 订单DTO
     * @return 支付所需要的内容
     */
    PayResponse create(OrderDTO orderDTO);

    /**
     * 微信支付异步通知
     * @param notifyData
     * @return
     */
    PayResponse notify(String notifyData);

    /**
     * 退款
     * @param orderDTO
     */
    RefundResponse refund(OrderDTO orderDTO);
}
