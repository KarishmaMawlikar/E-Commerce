package com.ashokit.controller;

import com.ashokit.entities.ProductCategory;
import com.ashokit.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductCategoryController {

    @Autowired
    private ProductCategoryService productCategoryService;

    @GetMapping("/category")
    public ResponseEntity<List<ProductCategory>> findAllCategory(){

        List<ProductCategory> categoryList = productCategoryService.getAllCategory();
        return new ResponseEntity<>(categoryList, HttpStatus.OK);
    }
}
