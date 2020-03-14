package com.mann.sell.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 商品详情
 *
 * @Author: Created by 蓝胖子
 * @Date: 2020/2/26 22:45:28
 */
@Data
public class ProductInfoVO implements Serializable {

    private static final long serialVersionUID = -7297360411914319696L;

    @JsonProperty("id")
    private String productId;

    @JsonProperty("name")
    private String productName;

    @JsonProperty("price")
    private BigDecimal productPrice;

    @JsonProperty("description")
    private String productDescription;

    @JsonProperty("icon")
    private String productIcon;
}
