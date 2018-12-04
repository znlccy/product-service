package com.znlccy.productserver.enums;

/**
 * @Author: Administrator
 * @Datetime: 2018/12/4-14:36
 * @Version: v1.0.0
 * @Comment: 结果状态枚举
 */
public enum  ResultStatusEnum {

    /* 声明枚举类型 */
    SUCCESS(200, "成功"),
    FAILED(404, "失败");

    /* 声明状态码 */
    private Integer code;

    /* 声明状态信息 */
    private String message;

    /* 声明结果状态枚举构造函数 */
    ResultStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
