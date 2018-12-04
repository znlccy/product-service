package com.znlccy.productserver.vo;

import lombok.Data;

/**
 * @Author: Administrator
 * @Datetime: 2018/12/4-17:02
 * @Version: v1.0.0
 * @Comment: 返回的最终数据
 */

@Data
public class ResultVO<T> {

    private Integer code;

    private String msg;

    private T data;
}
