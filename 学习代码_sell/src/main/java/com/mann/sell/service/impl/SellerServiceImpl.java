package com.mann.sell.service.impl;

import com.mann.sell.dataobject.SellerInfo;
import com.mann.sell.repository.SellerInfoRepository;
import com.mann.sell.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Created by 蓝胖子
 * @Date: 2020/3/13 23:55:17
 */
@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    private SellerInfoRepository sellerInfoRepository;

    @Override
    public SellerInfo findSellerInfoByOpenid(String openid) {
        return sellerInfoRepository.findByOpenid(openid);
    }
}
