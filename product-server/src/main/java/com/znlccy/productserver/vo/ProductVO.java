package com.znlccy.productserver.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.znlccy.productserver.model.ProductInfo;
import lombok.Data;

import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/12/4-17:03
 * @Version: v1.0.0
 * @Comment: 
 */
@Data
public class ProductVO {

    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVo> productInfoVos;
}
