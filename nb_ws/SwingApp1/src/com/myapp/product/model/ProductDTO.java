/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.product.model;

import java.sql.Timestamp;

/**
 *
 * @author EZEN
 */
public class ProductDTO {
    private int no;
    private String productName;
    private int	price;
    private String description;
    private Timestamp	regDate;

    public ProductDTO() {
    }

    public ProductDTO(int no, String productName, int price, String description, Timestamp regDate) {
        this.no = no;
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.regDate = regDate;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getRegDate() {
        return regDate;
    }

    public void setRegDate(Timestamp regDate) {
        this.regDate = regDate;
    }

    @Override
    public String toString() {
        return "ProductDTO{" + "no=" + no + ", productName=" + productName + ", price=" + price + ", description=" + description + ", regDate=" + regDate + '}';
    }
    
        
        
}
