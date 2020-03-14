package com.mann.sell.service;

import com.mann.sell.dto.OrderDTO;

/**
 * 消息推送
 *
 * @Author: Created by 蓝胖子
 * @Date: 2020/3/14 15:02:30
 */
public interface PushMessageService {

    /**
     * 订单状态变更消息
     * @param orderDTO
     */
    void orderStatus(OrderDTO orderDTO);
}
