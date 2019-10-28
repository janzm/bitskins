package com.example.bitskins.bean;

import java.util.List;

public class Get_All_item_Prices {
    private String status;
    private List<Prices> prices;
    public void setStatus(String status) {
        this.status = status;
    }
    public String getStatus() {
        return status;
    }

    public void setPrices(List<Prices> prices) {
        this.prices = prices;
    }
    public List<Prices> getPrices() {
        return prices;
    }
    public class Prices {


        private String app_id;
        private String context_id;
        private String market_hash_name;
        private String price;
        private String pricing_mode;
        private String skewness;
        private long created_at;
        private String icon_url;
        private String name_color;
        private String quality_color;
        private String rarity_color;
        private String instant_sale_price;
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

        public void setMarket_hash_name(String market_hash_name) {
            this.market_hash_name = market_hash_name;
        }
        public String getMarket_hash_name() {
            return market_hash_name;
        }

        public void setPrice(String price) {
            this.price = price;
        }
        public String getPrice() {
            return price;
        }

        public void setPricing_mode(String pricing_mode) {
            this.pricing_mode = pricing_mode;
        }
        public String getPricing_mode() {
            return pricing_mode;
        }

        public void setSkewness(String skewness) {
            this.skewness = skewness;
        }
        public String getSkewness() {
            return skewness;
        }

        public void setCreated_at(long created_at) {
            this.created_at = created_at;
        }
        public long getCreated_at() {
            return created_at;
        }

        public void setIcon_url(String icon_url) {
            this.icon_url = icon_url;
        }
        public String getIcon_url() {
            return icon_url;
        }

        public void setName_color(String name_color) {
            this.name_color = name_color;
        }
        public String getName_color() {
            return name_color;
        }

        public void setQuality_color(String quality_color) {
            this.quality_color = quality_color;
        }
        public String getQuality_color() {
            return quality_color;
        }

        public void setRarity_color(String rarity_color) {
            this.rarity_color = rarity_color;
        }
        public String getRarity_color() {
            return rarity_color;
        }

        public void setInstant_sale_price(String instant_sale_price) {
            this.instant_sale_price = instant_sale_price;
        }
        public String getInstant_sale_price() {
            return instant_sale_price;
        }

    }
}
