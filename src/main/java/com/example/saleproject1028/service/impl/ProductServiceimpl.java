package com.example.saleproject1028.service.impl;

import com.example.saleproject1028.mapper.ProductMapper;
import com.example.saleproject1028.pojo.Product;
import com.example.saleproject1028.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductServiceimpl implements ProductService {
    @Resource
    private ProductMapper productMapper;

    @Override
    public int findQuantityByid(Long id) {
        return productMapper.selectQuantityByid(id);
    }

    @Override
    public int changeQuantityByid(int quantity, Long id) {
        return productMapper.updateQuantityByid(quantity,id);
    }

    @Override
    public List<Product> findAll() {
        return productMapper.selectAll();
    }

    @Override
    public int removeByPrimaryKey(Long id) {
        return productMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int add(Product record) {
        return productMapper.insert(record);
    }

    @Override
    public int addSelective(Product record) {
        return productMapper.insertSelective(record);
    }

    @Override
    public Product findByPrimaryKey(Long id) {
        return productMapper.selectByPrimaryKey(id);
    }

    @Override
    public int changeByPrimaryKeySelective(Product record) {
        return productMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int changeByPrimaryKey(Product record) {
        return productMapper.updateByPrimaryKey(record);
    }
}
