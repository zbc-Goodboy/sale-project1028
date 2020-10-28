package com.example.saleproject1028.service;

import com.example.saleproject1028.pojo.Sale;


import java.util.List;

public interface SaleService {
    List<Sale> findAll(Integer id);

    int removeByPrimaryKey(Long id);

    int add(Sale record);

    int addSelective(Sale record);

    Sale findByPrimaryKey(Long id);

    int changeByPrimaryKeySelective(Sale record);

    int changeByPrimaryKey(Sale record);
}
