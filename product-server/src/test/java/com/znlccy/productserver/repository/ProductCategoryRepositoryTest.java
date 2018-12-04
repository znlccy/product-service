package com.znlccy.productserver.repository;

import com.znlccy.productserver.ProductServerApplicationTests;
import com.znlccy.productserver.model.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@Component
public class ProductCategoryRepositoryTest extends ProductServerApplicationTests {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Test
    public void findCategoryByTypeIn() {

        List<ProductCategory> productCategoryList = productCategoryRepository.findByCategoryTypeIn(Arrays.asList(11,12));
        Assert.assertTrue(productCategoryList.size()>0);
    }
}