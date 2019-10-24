package com.example.bitskins.bean.MyInventoryBean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Steam_inventory {

    private String status;
    private String fresh_or_cached;
    private int total_items;
    private List<ItemSteam> items;
    public void setStatus(String status) {
        this.status = status;
    }
    public String getStatus() {
        return status;
    }

    public void setFresh_or_cached(String fresh_or_cached) {
        this.fresh_or_cached = fresh_or_cached;
    }
    public String getFresh_or_cached() {
        return fresh_or_cached;
    }

    public void setTotal_items(int total_items) {
        this.total_items = total_items;
    }
    public int getTotal_items() {
        return total_items;
    }

    public List<ItemSteam> getItems() {
        return items;
    }

    public void setItems(List<ItemSteam> items) {
        this.items = items;
    }
}
