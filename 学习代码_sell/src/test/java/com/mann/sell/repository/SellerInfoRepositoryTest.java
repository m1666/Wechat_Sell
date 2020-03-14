package com.mann.sell.repository;

import com.mann.sell.dataobject.SellerInfo;
import com.mann.sell.utils.KeyUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @Author: Created by 蓝胖子
 * @Date: 2020/3/13 23:44:27
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SellerInfoRepositoryTest {

    @Autowired
    private SellerInfoRepository sellerInfoRepository;

    @Test
    public void save() {
        SellerInfo sellerInfo = new SellerInfo();
        sellerInfo.setSellerId(KeyUtil.genUniqueKey());
        sellerInfo.setUsername("admin");
        sellerInfo.setPassword("admin");
        sellerInfo.setOpenid("abc");
        SellerInfo create = sellerInfoRepository.save(sellerInfo);
        Assert.assertTrue("添加商户", true);
    }

    @Test
    public void findByOpneid() {
        SellerInfo result = sellerInfoRepository.findByOpenid("abc");
        Assert.assertTrue("通过openid查询商户", true);

    }
}