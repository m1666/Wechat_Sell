package com.mann.sell.service;

import com.mann.sell.dataobject.SellerInfo;

/**
 * 卖家端
 *
 * @Author: Created by 蓝胖子
 * @Date: 2020/3/13 23:53:51
 */
public interface SellerService {

    /**
     * 通过openid查询卖家信息
     * @param openid
     * @return
     */
    SellerInfo findSellerInfoByOpenid(String openid);
}
