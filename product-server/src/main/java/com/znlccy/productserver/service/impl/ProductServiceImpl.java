package com.znlccy.productserver.service.impl;

import com.znlccy.productserver.enums.ProductStatusEnum;
import com.znlccy.productserver.model.ProductInfo;
import com.znlccy.productserver.repository.ProductInfoRepository;
import com.znlccy.productserver.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/12/4-16:48
 * @Version: v1.0.0
 * @Comment: 商品服务实现类
 */

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Override
    public List<ProductInfo> findByProductStatus(Integer productStatus) {
        return productInfoRepository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }
}
