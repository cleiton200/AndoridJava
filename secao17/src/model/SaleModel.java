package model;

import java.util.Date;

public class SaleModel {

    private int id;
    private Date date;
    private String seller;
    private String product;
    private String category;
    private Double price;

    public SaleModel(int id, Date date, String seller, String product, String category, Double price){
        this.id = id;
        this.date = date;
        this.seller = seller;
        this.product = product;
        this.category = category;
        this.price = price;


    }

    public String getSeller() {
        return seller;
    }

    public Double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }
}
