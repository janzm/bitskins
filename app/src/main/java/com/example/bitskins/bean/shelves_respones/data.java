package com.example.bitskins.bean.shelves_respones;

import java.util.Date;
import java.util.List;

public class data {
    private List<Item> items;
    private List<String> trade_tokens;
    private Bot_info bot_info;

    public void setItems(List<Item> items) {
        this.items = items;
    }
    public List<Item> getItems() {
        return items;
    }

    public void setTrade_tokens(List<String> trade_tokens) {
        this.trade_tokens = trade_tokens;
    }
    public List<String> getTrade_tokens() {
        return trade_tokens;
    }

    public void setBot_info(Bot_info bot_info) {
        this.bot_info = bot_info;
    }
    public Bot_info getBot_info() {
        return bot_info;
    }




}
    class Item {

    private String app_id;
    private String context_id;
    private String item_id;
    private String asset_id;
    private String class_id;
    private String instance_id;
    public void setApp_id(String app_id) {
        this.app_id = app_id;
    }
    public String getApp_id() {
        return app_id;
    }

    public void setContext_id(String context_id) {
        this.context_id = context_id;
    }
    public String getContext_id() {
        return context_id;
    }

    public void setItem_id(String item_id) {
        this.item_id = item_id;
    }
    public String getItem_id() {
        return item_id;
    }

    public void setAsset_id(String asset_id) {
        this.asset_id = asset_id;
    }
    public String getAsset_id() {
        return asset_id;
    }

    public void setClass_id(String class_id) {
        this.class_id = class_id;
    }
    public String getClass_id() {
        return class_id;
    }

    public void setInstance_id(String instance_id) {
        this.instance_id = instance_id;
    }
    public String getInstance_id() {
        return instance_id;
    }

}
    class Bot_info {

    private String uid;
    private Date name_prefix;
    private long joined_steam_at;
    public void setUid(String uid) {
        this.uid = uid;
    }
    public String getUid() {
        return uid;
    }

    public void setName_prefix(Date name_prefix) {
        this.name_prefix = name_prefix;
    }
    public Date getName_prefix() {
        return name_prefix;
    }

    public void setJoined_steam_at(long joined_steam_at) {
        this.joined_steam_at = joined_steam_at;
    }
    public long getJoined_steam_at() {
        return joined_steam_at;
    }

}
