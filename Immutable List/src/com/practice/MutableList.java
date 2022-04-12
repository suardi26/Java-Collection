package com.practice;

import java.util.ArrayList;
import java.util.List;

public class MutableList {
    private String brand;
    private List<String> product;

    public MutableList(String brand){
        this.brand = brand;
        this.product = new ArrayList<>();
    }
    public void addProduct(String product){
        this.product.add(product);
    }
    public List<String> getProduct(){
        return this.product;
    }

    public String getBrand() {
        return this.brand;
    }
}
