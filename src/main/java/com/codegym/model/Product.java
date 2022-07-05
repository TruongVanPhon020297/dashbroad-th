package com.codegym.model;

public class Product {

    private long id;
    private String title;
    private Double price;
    private String color;
    private String description;

    public Product() {
    }

    public Product(long id, String title, Double price, String color, String description) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.color = color;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
