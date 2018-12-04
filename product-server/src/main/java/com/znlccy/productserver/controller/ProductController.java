package com.znlccy.productserver.controller;

import com.znlccy.productserver.enums.ProductStatusEnum;
import com.znlccy.productserver.model.ProductCategory;
import com.znlccy.productserver.model.ProductInfo;
import com.znlccy.productserver.service.CategoryService;
import com.znlccy.productserver.service.ProductService;
import com.znlccy.productserver.utils.ResponseUtil;
import com.znlccy.productserver.vo.ProductInfoVo;
import com.znlccy.productserver.vo.ProductVO;
import com.znlccy.productserver.vo.ResultVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: Administrator
 * @Datetime: 2018/12/4-14:40
 * @Version: v1.0.0
 * @Comment: 产品控制器
 */

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    /* 商品列表接口 */
    @GetMapping("/list")
    public ResultVO<ProductVO> list() {
        List<ProductInfo> productInfoList = productService.findByProductStatus(ProductStatusEnum.UP.getCode());
        List<Integer> categoryTypeList = productInfoList.stream()
                .map(ProductInfo::getCategoryType)
                .collect(Collectors.toList());

        List<ProductCategory> categoryList = categoryService.findByCategoryTypeIn(categoryTypeList);

        List<ProductVO> productVOList = new ArrayList<>();
        for (ProductCategory productCategory: categoryList) {
            ProductVO productVO = new ProductVO();
            productVO.setCategoryName(productCategory.getCategoryName());
            productVO.setCategoryType(productCategory.getCategoryType());

            List<ProductInfoVo> productInfoVoList = new ArrayList<>();
            for (ProductInfo productInfo:productInfoList) {
                if (productInfo.getCategoryType().equals(productCategory.getCategoryType())) {
                    ProductInfoVo productInfoVo = new ProductInfoVo();
                    BeanUtils.copyProperties(productInfo, productInfoVo);
                    productInfoVoList.add(productInfoVo);
                }
            }
            productVO.setProductInfoVos(productInfoVoList);
            productVOList.add(productVO);
        }

        return ResponseUtil.success(productVOList);
    }

    /* 商品详情接口 */
    public void detail() {

    }

    /* 商品更新接口 */
    public void update() {

    }

    /* 商品添加接口 */
    public void save() {

    }

    /* 商品删除接口 */
    public void delete() {

    }
}
