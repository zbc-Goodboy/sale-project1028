package com.example.saleproject1028.mapper;

import com.example.saleproject1028.pojo.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductMapper {
    int selectQuantityByid(@Param("id") Long id);

    int updateQuantityByid(@Param("quantity")int quantity,@Param("id") Long id);

    List<Product> selectAll();

    int deleteByPrimaryKey(Long id);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);
}