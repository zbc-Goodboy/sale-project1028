package com.example.saleproject1028.controller;

import com.example.saleproject1028.pojo.Sale;
import com.example.saleproject1028.service.ProductService;
import com.example.saleproject1028.service.SaleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.models.auth.In;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Controller
public class SaleController {
    @Resource
    private SaleService saleService;
    @Resource
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
    @RequestMapping("kl")
    @ResponseBody
    public Object kl(){
        return productService.findAll();
    }
    @RequestMapping("kpl")
    @ResponseBody
    public Object kpl(Long id){
        return productService.findQuantityByid(id);
    }
    @Transactional(propagation = Propagation.REQUIRED)
    @RequestMapping("add")
    @ResponseBody
    public Object add(Long productname, Double price,Integer quantity){
        Sale sale = new Sale();
        sale.setTotalprice(price*quantity);
        sale.setSaledate(new Date());
        sale.setPrice(price);
        sale.setQuantity(quantity);
        sale.setProductid(productname);
        System.out.println(sale);
       int a = saleService.add(sale);
        int b = productService.changeQuantityByid(productService.findQuantityByid(productname)-quantity,productname);
        return "添加成功";
    }
}
