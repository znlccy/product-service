package com.znlccy.productserver.service;

import com.znlccy.productserver.model.ProductCategory;

import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/12/4-16:54
 * @Version: v1.0.0
 * @Comment: 产品服务接口
 */
public interface CategoryService {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
