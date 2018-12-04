package com.znlccy.productserver.enums;

import lombok.Data;
import lombok.Getter;

/**
 * @Author: Administrator
 * @Datetime: 2018/12/4-16:22
 * @Version: v1.0.0
 * @Comment: 商品状态枚举
 */

@Getter
public enum ProductStatusEnum {

    /* 声明产品状态 */
    UP(0,"上架"),
    DOWN(1,"下架");

    /* 声明状态码 */
    private Integer code;

    /* 声明状态信息 */
    private String message;

    /* 声明默认构造函数 */
    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
