package com.mann.sell.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 商品（包含类目）
 *
 * @Author: Created by 蓝胖子
 * @Date: 2020/2/26 22:31:12
 */
@Data
public class ProductVO implements Serializable {

    private static final long serialVersionUID = -8051010514828243572L;

    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;
}
