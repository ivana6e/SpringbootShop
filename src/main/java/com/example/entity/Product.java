package com.example.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "product") // mongoDB
public class Product {
	
	private String id;
    private String name;
    private int price;
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getId() {
        return id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
    
}
