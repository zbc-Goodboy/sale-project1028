package com.example.saleproject1028.controller;

import com.example.saleproject1028.pojo.Sale;
import com.example.saleproject1028.service.ProductService;
import com.example.saleproject1028.service.SaleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class SaleController {
    private SaleService saleService;
    private ProductService productService;
    @RequestMapping("/")
    public String show(){
        return "show";
    }
    @RequestMapping("zzx")
    @ResponseBody
    public PageInfo findAllDUser(Integer sdd,Integer pageNo){
        PageHelper.offsetPage((pageNo-1)*4,4);
        List<Sale> duserList=saleService.findAll(sdd);
        PageInfo<Sale> pageInfo=new PageInfo<Sale>(duserList);
        return pageInfo;
    }
}
