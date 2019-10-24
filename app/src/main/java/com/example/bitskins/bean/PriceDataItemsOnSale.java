package com.example.bitskins.bean;

import java.util.List;

public class PriceDataItemsOnSale {
    private String app_id;
    private String context_id;
    private List<Items> items;

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

    public void setItems(List<Items> items) {
        this.items = items;
    }

    public List<Items> getItems() {
        return items;
    }


    public class Items {

        private String market_hash_name;
        private int total_items;
        private String lowest_price;
        private String highest_price;
        private String cumulative_price;
        private Recent_sales_info recent_sales_info;
        private long updated_at;

        public void setMarket_hash_name(String market_hash_name) {
            this.market_hash_name = market_hash_name;
        }

        public String getMarket_hash_name() {
            return market_hash_name;
        }

        public void setTotal_items(int total_items) {
            this.total_items = total_items;
        }

        public int getTotal_items() {
            return total_items;
        }

        public void setLowest_price(String lowest_price) {
            this.lowest_price = lowest_price;
        }

        public String getLowest_price() {
            return lowest_price;
        }

        public void setHighest_price(String highest_price) {
            this.highest_price = highest_price;
        }

        public String getHighest_price() {
            return highest_price;
        }

        public void setCumulative_price(String cumulative_price) {
            this.cumulative_price = cumulative_price;
        }

        public String getCumulative_price() {
            return cumulative_price;
        }

        public void setRecent_sales_info(Recent_sales_info recent_sales_info) {
            this.recent_sales_info = recent_sales_info;
        }

        public Recent_sales_info getRecent_sales_info() {
            return recent_sales_info;
        }

        public void setUpdated_at(long updated_at) {
            this.updated_at = updated_at;
        }

        public long getUpdated_at() {
            return updated_at;
        }

        public class Recent_sales_info {

            private String hours;
            private String average_price;
            public void setHours(String hours) {
                this.hours = hours;
            }
            public String getHours() {
                return hours;
            }

            public void setAverage_price(String average_price) {
                this.average_price = average_price;
            }
            public String getAverage_price() {
                return average_price;
            }

        }

    }
}
