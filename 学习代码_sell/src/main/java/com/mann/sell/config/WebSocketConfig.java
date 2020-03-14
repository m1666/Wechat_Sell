package com.mann.sell.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * @Author: Created by 蓝胖子
 * @Date: 2020/3/14 15:38:19
 */
@Component
public class WebSocketConfig {

    @Profile({"dev","test"})
    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }
}

