package com.znlccy.productserver.utils;

import com.znlccy.productserver.enums.ResultStatusEnum;
import com.znlccy.productserver.vo.ResultVO;

/**
 * @Author: Administrator
 * @Datetime: 2018/12/4-17:27
 * @Version: v1.0.0
 * @Comment: 响应工具
 */
public class ResponseUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(ResultStatusEnum.SUCCESS.getCode());
        resultVO.setMsg(ResultStatusEnum.SUCCESS.getMessage());
        resultVO.setData(object);
        return resultVO;
    };
}
