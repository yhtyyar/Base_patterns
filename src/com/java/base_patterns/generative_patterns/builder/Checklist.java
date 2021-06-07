package com.java.base_patterns.generative_patterns.builder;

public class Checklist {

    private String name;
    private Company company;
    private int price;


    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Checklist | " +
                "name = '" + name + '\'' +
                ", company = " + company +
                ", price = " + price + "$" +
                '|';
    }
}
