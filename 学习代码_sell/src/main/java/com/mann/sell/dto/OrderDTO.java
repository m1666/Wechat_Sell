package com.mann.sell.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mann.sell.dataobject.OrderDetail;
import com.mann.sell.enums.OrderStatusEnum;
import com.mann.sell.enums.PayStatusEnum;
import com.mann.sell.utils.EnumUtil;
import com.mann.sell.utils.serializer.Date2LongSerializer;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @Author: Created by 蓝胖子
 * @Date: 2020/2/27 14:42:24
 */
@Data
//@JsonSerialize(JsonInclude.Include.NON_NULL)
public class OrderDTO {
    /** 订单id */
    private String orderId;

    /** 买家名字*/
    private String buyerName;

    /** 买家手机号 */
    private String buyerPhone;

    /** 买家地址*/
    private String buyerAddress;

    /** 买家微信Openid */
    private String buyerOpenid;

    /** 订单总金额 */
    private BigDecimal orderAmount;

    /** 订单状态 默认为0 新下单 */
    private Integer orderStatus;

    /** 支付状态 默认为0 未支付 */
    private Integer payStatus;

    /** 创建时间 */
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date createTime;

    /** 更新时间 */
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date updateTime;

    private List<OrderDetail> orderDetailList;

    @JsonIgnore
    public OrderStatusEnum getOrderStatusEnum() {
        return EnumUtil.getByCode(orderStatus,OrderStatusEnum.class);
    }

    @JsonIgnore
    public PayStatusEnum getPayStatusEnum() {
        return EnumUtil.getByCode(payStatus,PayStatusEnum.class);
    }

}
