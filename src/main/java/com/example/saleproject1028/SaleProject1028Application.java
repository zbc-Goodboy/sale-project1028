package com.example.saleproject1028;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.example.saleproject1028.mapper")
public class SaleProject1028Application {

    public static void main(String[] args) {
        SpringApplication.run(SaleProject1028Application.class, args);
    }

}
