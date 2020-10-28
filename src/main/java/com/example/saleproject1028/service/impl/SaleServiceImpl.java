package com.example.saleproject1028.service.impl;

import com.example.saleproject1028.mapper.ProductMapper;
import com.example.saleproject1028.mapper.SaleMapper;
import com.example.saleproject1028.pojo.Sale;
import com.example.saleproject1028.service.SaleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class SaleServiceImpl implements SaleService {
    @Resource
    private SaleMapper saleMapper;
    @Override
    public List<Sale> findAll(Integer id) {
        return saleMapper.selectAll(id);
    }

    @Override
    public int removeByPrimaryKey(Long id) {
        return saleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int add(Sale record) {
        return saleMapper.insert(record);
    }

    @Override
    public int addSelective(Sale record) {
        return saleMapper.insertSelective(record);
    }

    @Override
    public Sale findByPrimaryKey(Long id) {
        return saleMapper.selectByPrimaryKey(id);
    }

    @Override
    public int changeByPrimaryKeySelective(Sale record) {
        return saleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int changeByPrimaryKey(Sale record) {
        return saleMapper.updateByPrimaryKey(record
        );
    }
}
