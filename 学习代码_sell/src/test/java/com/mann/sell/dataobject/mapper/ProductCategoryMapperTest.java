package com.mann.sell.dataobject.mapper;

import com.mann.sell.dataobject.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * @Author: Created by 蓝胖子
 * @Date: 2020/3/14 16:23:54
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryMapperTest {
    @Autowired
    private ProductCategoryMapper mapper;

    @Test
    public void insertByMap() throws Exception {
        Map<String, Object> map = new HashMap<>();
        map.put("categoryName", "小清新");
        map.put("category_type", 200);
        int result = mapper.insertByMap(map);
        assertEquals("增加成功", 1, result);
    }

    @Test
    public void insertByObject() throws Exception {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("小清新");
        productCategory.setCategoryType(20);
        int result = mapper.insertByObject(productCategory);
        assertEquals("增加成功", 1, result);
    }

    @Test
    public void selectByCategoryType() {
        ProductCategory productCategory = mapper.selectByCategoryType(2);
        assertNotNull(productCategory);
    }
}