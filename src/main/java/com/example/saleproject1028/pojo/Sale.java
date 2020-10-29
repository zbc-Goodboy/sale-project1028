package com.example.saleproject1028.pojo;

import java.util.Date;

public class Sale {
    private Integer id;

    private Double price;

    private Integer quantity;

    private Double totalprice;

    private Date saledate;

    private Long productid;

    private String productname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "id=" + id +
                ", price=" + price +
                ", quantity=" + quantity +
                ", totalprice=" + totalprice +
                ", saledate=" + saledate +
                ", productid=" + productid +
                ", productname='" + productname + '\'' +
                '}';
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Double totalprice) {
        this.totalprice = totalprice;
    }

    public Date getSaledate() {
        return saledate;
    }

    public void setSaledate(Date saledate) {
        this.saledate = saledate;
    }

    public Long getProductid() {
        return productid;
    }

    public void setProductid(Long productid) {
        this.productid = productid;
    }

    public String getProductname() { return productname; }

    public void setProductname(String productname) { this.productname = productname; }
}