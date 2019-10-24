package com.example.bitskins.bean.MyInventoryBean;

import java.util.List;

public class Bitskins_inventory {

    private String status;
    private int total_items;
    private String total_price;
    private List<String> items;
    private int page;
    private int items_per_page;
    public void setStatus(String status) {
        this.status = status;
    }
    public String getStatus() {
        return status;
    }

    public void setTotal_items(int total_items) {
        this.total_items = total_items;
    }
    public int getTotal_items() {
        return total_items;
    }

    public void setTotal_price(String total_price) {
        this.total_price = total_price;
    }
    public String getTotal_price() {
        return total_price;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }
    public List<String> getItems() {
        return items;
    }

    public void setPage(int page) {
        this.page = page;
    }
    public int getPage() {
        return page;
    }

    public void setItems_per_page(int items_per_page) {
        this.items_per_page = items_per_page;
    }
    public int getItems_per_page() {
        return items_per_page;
    }

}
