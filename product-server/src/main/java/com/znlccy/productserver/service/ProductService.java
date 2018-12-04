package com.znlccy.productserver.service;

import com.znlccy.productserver.model.ProductInfo;

import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/12/4-16:49
 * @Version: v1.0.0
 * @Comment: 
 */
public interface ProductService {

    List<ProductInfo> findByProductStatus(Integer productStatus);
}
