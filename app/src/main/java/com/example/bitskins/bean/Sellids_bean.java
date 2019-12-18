package com.example.bitskins.bean;

import com.example.bitskins.bean.MyInventoryBean.ItemSteam;

import java.io.Serializable;
import java.util.List;

public class Sellids_bean implements Serializable {
    List<ItemSteam> items;

    public List<ItemSteam> getItems() {
        return items;
    }

    public void setItems(List<ItemSteam> items) {
        this.items = items;
    }
}

