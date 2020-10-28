package com.example.saleproject1028.mapper;

import com.example.saleproject1028.pojo.Sale;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SaleMapper {
    List<Sale> selectAll(@Param("condition") Integer id);

    int deleteByPrimaryKey(Long id);

    int insert(Sale record);

    int insertSelective(Sale record);

    Sale selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Sale record);

    int updateByPrimaryKey(Sale record);
}