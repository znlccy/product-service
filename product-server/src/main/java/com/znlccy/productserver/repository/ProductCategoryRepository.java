package com.znlccy.productserver.repository;

import com.znlccy.productserver.model.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/12/4-16:38
 * @Version: v1.0.0
 * @Comment: 
 */
@Repository
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
