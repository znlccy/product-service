package com.znlccy.productserver.repository;

import com.znlccy.productserver.model.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/12/4-14:41
 * @Version: v1.0.0
 * @Comment: 产品数据库映射接口
 */

@Repository
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {

    List<ProductInfo> findByProductStatus(Integer productStatus);

    void deleteByProductId(String productId);


}
