package com.example.saleproject1028.mapper;

import com.example.saleproject1028.pojo.Sale;

public interface SaleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Sale record);

    int insertSelective(Sale record);

    Sale selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Sale record);

    int updateByPrimaryKey(Sale record);
}