package com.mann.sell.handler;

import com.mann.sell.config.ProjectUrlConfig;
import com.mann.sell.exception.SellException;
import com.mann.sell.exception.SellerAuthorizeException;
import com.mann.sell.utils.ResultVOUtil;
import com.mann.sell.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 * 异常拦截处理(AOP拦截处理)
 *
 * @Author: Created by 蓝胖子
 * @Date: 2020/3/14 14:47:43
 */
@ControllerAdvice
public class SellerExceptionHandler {

    /**
     * 获取项目URL相关配置
     */
    @Autowired
    private ProjectUrlConfig projectUrlConfig;

    /**
     * 拦截登录异常
     *
     * @return
     */
    @ExceptionHandler(value = SellerAuthorizeException.class)
    public ModelAndView handlerSellerAuthorizeException() {
        return new ModelAndView("redirect:"
                // 开放平台授权地址
                .concat(projectUrlConfig.getWechatOpenAuthorize())
                // 项目验证码扫码登录地址
                .concat("/sell/wechat/qrAuthorize")
                // 传递的跳转URL
                .concat("?returnUrl=")
                // 项目地址
                .concat(projectUrlConfig.getSell())
                // 项目登录地址
                .concat("/sell/seller/login"));
    }

    @ExceptionHandler(value = SellException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public ResultVO handlerSellException(SellException e) {
        return ResultVOUtil.error(e.getCode(), e.getMessage());
    }
}
