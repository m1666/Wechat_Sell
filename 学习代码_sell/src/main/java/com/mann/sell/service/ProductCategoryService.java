package com.mann.sell.service;

import com.mann.sell.dataobject.ProductCategory;

import java.util.List;

/**
 * 商品类目
 *
 * @Author: Created by 蓝胖子
 * @Date: 2020/2/25 22:43:49
 */
public interface ProductCategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);

}
