package com.znlccy.productserver.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: Administrator
 * @Datetime: 2018/12/4-14:39
 * @Version: v1.0.0
 * @Comment: 产品信息
 */

@Data
public class ProductInfo {

    /* 主键 */
    private String productId;

    /* 名称 */
    private String productName;

    /* 价格 */
    private BigDecimal productPrice;

    /* 库存 */
    private Integer productStock;

    /* 描述 */
    private String productDescription;

    /* 图片 */
    private String productIcon;

    /* 状态 */
    private Integer productStatus;

    /* 类目 */
    private Integer categoryType;

    /* 创建时间 */
    private Date createTime;

    /* 更新时间 */
    private Date updateTime;


}
