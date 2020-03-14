package com.mann.sell.repository;

import com.mann.sell.dataobject.SellerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: Created by 蓝胖子
 * @Date: 2020/3/13 23:43:08
 */
public interface SellerInfoRepository extends JpaRepository<SellerInfo, String> {

    SellerInfo findByOpenid(String openid);
}
