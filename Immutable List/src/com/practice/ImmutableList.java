package com.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ImmutableList {

        private String brand;
        private List<String> product;

        public ImmutableList(String brand){
            this.brand = brand;
            this.product = new ArrayList<>();
        }
        public void addProduct(String product){
            this.product.add(product);
        }
        public List<String> getProduct(){
            // Membuat immutable list menggunakan method 'unmodifiableList' dari class 'Collections'.
            return Collections.unmodifiableList(this.product);
        }

        public String getBrand() {
            return this.brand;
        }
}
