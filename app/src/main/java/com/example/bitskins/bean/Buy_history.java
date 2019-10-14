package com.example.bitskins.bean;

import java.util.List;

public class Buy_history {
    private String app_id;
    private String context_id;
    private List<Item> items;
    private int page;

    public String getApp_id() {
        return app_id;
    }

    public void setApp_id(String app_id) {
        this.app_id = app_id;
    }

    public String getContext_id() {
        return context_id;
    }

    public void setContext_id(String context_id) {
        this.context_id = context_id;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public class Item{
        private String app_id;
        private String context_id;
        private String item_id;
        private String asset_id;
        private String class_id;
        private String instance_id;
        private String market_hash_name;
        private String buy_price;
        private boolean withdrawn;
        private long time;

        public String getApp_id() {
            return app_id;
        }

        public void setApp_id(String app_id) {
            this.app_id = app_id;
        }

        public String getContext_id() {
            return context_id;
        }

        public void setContext_id(String context_id) {
            this.context_id = context_id;
        }

        public String getItem_id() {
            return item_id;
        }

        public void setItem_id(String item_id) {
            this.item_id = item_id;
        }

        public String getAsset_id() {
            return asset_id;
        }

        public void setAsset_id(String asset_id) {
            this.asset_id = asset_id;
        }

        public String getClass_id() {
            return class_id;
        }

        public void setClass_id(String class_id) {
            this.class_id = class_id;
        }

        public String getInstance_id() {
            return instance_id;
        }

        public void setInstance_id(String instance_id) {
            this.instance_id = instance_id;
        }

        public String getMarket_hash_name() {
            return market_hash_name;
        }

        public void setMarket_hash_name(String market_hash_name) {
            this.market_hash_name = market_hash_name;
        }

        public String getBuy_price() {
            return buy_price;
        }

        public void setBuy_price(String buy_price) {
            this.buy_price = buy_price;
        }

        public boolean isWithdrawn() {
            return withdrawn;
        }

        public void setWithdrawn(boolean withdrawn) {
            this.withdrawn = withdrawn;
        }

        public long getTime() {
            return time;
        }

        public void setTime(long time) {
            this.time = time;
        }
    }



}
