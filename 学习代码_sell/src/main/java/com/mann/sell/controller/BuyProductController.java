package com.mann.sell.controller;

import com.mann.sell.vo.ProductInfoVO;
import com.mann.sell.vo.ProductVO;
import com.mann.sell.vo.ResultVO;
import com.mann.sell.dataobject.ProductCategory;
import com.mann.sell.dataobject.ProductInfo;
import com.mann.sell.service.ProductCategoryService;
import com.mann.sell.service.ProductInfoService;
import com.mann.sell.utils.ResultVOUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


/**
 * 买家商品
 *
 * @Author: Created by 蓝胖子
 * @Date: 2020/2/26 21:54:59
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyProductController {

    @Autowired
    private ProductInfoService productInfoService;

    @Autowired
    private ProductCategoryService productCategoryService;

    @GetMapping("/list")
    @Cacheable(cacheNames = "product", key = "123")
    public ResultVO list() {
        // 1、查询所有的上架商品
        List<ProductInfo> productInfoList = productInfoService.findUpAll();

        // 2、查询类目（一次性查询）
//        List<Integer> productCategoryTypeList = new ArrayList<>();
        // 传统方法
//        for(ProductInfo productInfo : productInfoList){
//            productCategoryTypeList.add(productInfo.getCategoryType());
//        }
        // Lambda表达式
        List<Integer> productCategoryTypeList = productInfoList.stream().map(e -> e.getCategoryType()).collect(Collectors.toList());
        productCategoryService.findByCategoryTypeIn(productCategoryTypeList);

        List<ProductCategory> productCategoryList = productCategoryService.findByCategoryTypeIn(productCategoryTypeList);

        // 3、数据拼装
        List<ProductVO> productVOList = new ArrayList<>();
        for (ProductCategory productCategory : productCategoryList) {
            ProductVO productVO = new ProductVO();
            productVO.setCategoryType(productCategory.getCategoryType());
            productVO.setCategoryName(productCategory.getCategoryName());

            List<ProductInfoVO> productInfoVOList = new ArrayList<>();
            for (ProductInfo productInfo : productInfoList) {
                if (productInfo.getCategoryType().equals(productCategory.getCategoryType())) {
                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    BeanUtils.copyProperties(productInfo, productInfoVO);
                    productInfoVOList.add(productInfoVO);
                }
            }
            productVO.setProductInfoVOList(productInfoVOList);
            productVOList.add(productVO);
        }

        return ResultVOUtil.success(productVOList);
    }
}
