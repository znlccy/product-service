package com.znlccy.productserver.repository;

import com.znlccy.productserver.ProductServerApplicationTests;
import com.znlccy.productserver.enums.ProductStatusEnum;
import com.znlccy.productserver.model.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import static org.junit.Assert.*;

@Component
public class ProductInfoRepositoryTest extends ProductServerApplicationTests {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Test
    public void findByProductStatus() {
        List<ProductInfo> productInfoList  = productInfoRepository.findByProductStatus(ProductStatusEnum.UP.getCode());
        Assert.assertTrue(productInfoList.size()>0);
    }
}