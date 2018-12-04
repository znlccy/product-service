package com.znlccy.productserver.service.impl;

import com.znlccy.productserver.model.ProductCategory;
import com.znlccy.productserver.repository.ProductCategoryRepository;
import com.znlccy.productserver.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/12/4-16:55
 * @Version: v1.0.0
 * @Comment: 
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return productCategoryRepository.findByCategoryTypeIn(categoryTypeList);
    }
}
