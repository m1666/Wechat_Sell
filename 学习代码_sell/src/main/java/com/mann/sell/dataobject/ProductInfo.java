package com.mann.sell.dataobject;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.mann.sell.enums.ProductInfoStatusEnum;
import com.mann.sell.utils.EnumUtil;
import com.mann.sell.utils.serializer.Date2LongSerializer;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 商品详情
 *
 * @Author: Created by 蓝胖子
 * @Date: 2020/2/26 20:19:47
 */
@Entity
@Data
@DynamicUpdate
public class ProductInfo {

    @Id
    private String productId;

    /**
     * 名字
     */
    private String productName;

    /**
     * 单价
     */
    private BigDecimal productPrice;

    /**
     * 库存
     */
    private Integer productStock;

    /**
     * 描述
     */
    private String productDescription;

    /**
     * 小图
     */
    private String productIcon;

    /**
     * 状态 0正常，1下架
     */
    private Integer productStatus = 0;

    /**
     * 类目编号
     */
    private Integer categoryType;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    public ProductInfo() {
    }

    @JsonIgnore
    public ProductInfoStatusEnum getProductInfoStatusEnum() {
        return EnumUtil.getByCode(productStatus, ProductInfoStatusEnum.class);
    }
}
