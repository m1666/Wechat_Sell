package com.mann.sell.service.impl;

import com.mann.sell.dataobject.ProductCategory;
import com.mann.sell.enums.ResultEnum;
import com.mann.sell.exception.SellException;
import com.mann.sell.repository.ProductCategoryRepository;
import com.mann.sell.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Created by 蓝胖子
 * @Date: 2020/2/25 22:49:18
 */
@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Override
    public ProductCategory findOne(Integer categoryId) {
        /**
         * 查不到返回null
         * .get() 抛异常
         */
        return productCategoryRepository.findById(categoryId).orElse(null);
    }

    @Override
    public List<ProductCategory> findAll() {
        return productCategoryRepository.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return productCategoryRepository.findByCategoryTypeIn(categoryTypeList);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        ProductCategory category = productCategoryRepository.findByCategoryType(productCategory.getCategoryType());
        if (category != null) {
            if (productCategory.getCategoryId() == null) {
                if (category.getCategoryType().equals(productCategory.getCategoryType())) {
                    throw new SellException(ResultEnum.CATEGORY_TYPE_ERROR);
                }
            }
            if (!category.getCategoryId().equals(productCategory.getCategoryId()) && category.getCategoryType().equals(productCategory.getCategoryType())) {
                throw new SellException(ResultEnum.CATEGORY_TYPE_ERROR);
            }
        }
        return productCategoryRepository.save(productCategory);
    }
}
