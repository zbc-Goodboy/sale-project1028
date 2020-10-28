package com.example.saleproject1028.service;

import com.example.saleproject1028.pojo.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductService {
    int findQuantityByid(@Param("id") int id);

    int changeQuantityByid(@Param("quantity")int quantity,@Param("id") int id);

    List<Product> findAll();

    int removeByPrimaryKey(Long id);

    int add(Product record);

    int addSelective(Product record);

    Product findByPrimaryKey(Long id);

    int changeByPrimaryKeySelective(Product record);

    int changeByPrimaryKey(Product record);
}
