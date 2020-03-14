package com.mann.sell.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: Created by 蓝胖子
 * @Date: 2020/3/14 00:21:01
 */
@Data
@ConfigurationProperties(prefix = "project-url")
@Component
public class ProjectUrlConfig {

    /**
     * 微信公众平台账号授权url
     */
    public String wechatMpAuthorize;

    /**
     * 微信开放平台账号授权url
     */
    public String wechatOpenAuthorize;

    /**
     * 点餐系统url
     */
    public String sell;
}
