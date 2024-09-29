package com.ashokit.service;

import com.ashokit.entities.ProductCategory;
import com.ashokit.repository.ProductCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCategoryService {

    @Autowired
private ProductCategoryRepository productCategoryRepository;

    public List<ProductCategory> getAllCategory(){

        List<ProductCategory> categories = productCategoryRepository.findAll();

        return categories;
    }

}
