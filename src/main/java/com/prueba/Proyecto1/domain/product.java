package com.prueba.Proyecto1.domain;

public class product {
    private int productId;
    private String name;
    private int categoryId; 
    private double price;
    private int stock;
    private boolean active;
    //private category category;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    //public category getCategory() {
    //    return category;
    //}

    //public void setCategory(category category) {
    //    this.category = category;
    //}
}
