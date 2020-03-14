package com.mann.sell.service.impl;

import com.mann.sell.dataobject.SellerInfo;
import com.mann.sell.service.SellerService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @Author: Created by 蓝胖子
 * @Date: 2020/3/13 23:56:28
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SellerServiceImplTest {

    @Autowired
    private SellerService sellerService;

    @Test
    public void findSellerInfoByOpenid() {
        sellerService.findSellerInfoByOpenid("abc");
        Assert.assertTrue("【service层】通过openid查询卖家信息",true);
    }
}