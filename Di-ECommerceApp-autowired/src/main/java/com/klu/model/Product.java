package com.klu.model;

import org.springframework.stereotype.Component;

@Component
public class Product {
  private int productId;
  private String productName;
  private double price;
  private String category;

  
  public Product() {
    this.productId = 819;
    this.productName = "PS5";
    this.price = 90000.00;
    this.category = "Electronics";
  }
  public int getProductId() {
    return productId;
  }
  public String getProductName() {
    return productName;
  }
  public double getPrice() {
    return price;
  }
  public String getCategory() {
    return category;
  }
}