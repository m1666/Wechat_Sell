package com.mann.sell;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: Created by 蓝胖子
 * @Date: 2020/2/23 23:01:19
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
//@Data
public class LoggerTest {
    @Test
    public void test1(){
        String name = "mann";
        String password = "123456";
        log.debug("debug...");
        log.info("info...");
        log.info("name: " + name + " password: " + password);
        log.info("name: {}, password:{}",name,password);
        log.error("error...");
        log.warn("warn...");
    }
}
