package com.znlccy.productserver.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * @Author: Administrator
 * @Datetime: 2018/12/4-15:33
 * @Version: v1.0.0
 * @Comment: 商品分类实体类
 */

@Data
@Entity
public class ProductCategory {

    /* 主键 */
    @Id
    @GeneratedValue
    private Integer categoryId;

    /* 名称 */
    private String categoryName;

    /* 类型 */
    private Integer categoryType;

    /* 创建时间 */
    private Date createTime;

    /* 更新时间 */
    private Date updateTime;
}
