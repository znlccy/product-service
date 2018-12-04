package com.znlccy.productserver.service.impl;

import com.znlccy.productserver.ProductServerApplicationTests;
import com.znlccy.productserver.enums.ProductStatusEnum;
import com.znlccy.productserver.model.ProductInfo;
import com.znlccy.productserver.service.ProductService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import static org.junit.Assert.*;

@Component
public class ProductServiceImplTest extends ProductServerApplicationTests {

    @Autowired
    private ProductService productService;

    @Test
    public void findByProductStatus() {

        List<ProductInfo> list = productService.findByProductStatus(ProductStatusEnum.UP.getCode());
        Assert.assertTrue(list.size()>0);
    }
}