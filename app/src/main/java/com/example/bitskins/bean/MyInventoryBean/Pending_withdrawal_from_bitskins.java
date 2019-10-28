package com.example.bitskins.bean.MyInventoryBean;

import com.example.bitskins.bean.MyInventoryBean.ItemPanding;

import java.util.List;

public class Pending_withdrawal_from_bitskins {

    private String status;
    private int total_items;
    private List<ItemPanding> items;
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

    public List<ItemPanding> getItems() {
        return items;
    }

    public void setItems(List<ItemPanding> items) {
        this.items = items;
    }
}