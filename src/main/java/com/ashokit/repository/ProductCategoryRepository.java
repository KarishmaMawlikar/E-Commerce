package com.ashokit.repository;

import com.ashokit.entities.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

//@RepositoryRestResource(path="product-category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Long> {

    @Query(value ="SELECT * FROM product_category",nativeQuery = true)
    List<ProductCategory> findAll();
}
