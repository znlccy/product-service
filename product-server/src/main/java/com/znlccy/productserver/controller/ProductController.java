package com.znlccy.productserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Administrator
 * @Datetime: 2018/12/4-14:40
 * @Version: v1.0.0
 * @Comment: 产品控制器
 */

@RestController
@RequestMapping("/product")
public class ProductController {

    /* 商品列表接口 */
    @GetMapping("/list")
    public void list() {

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
