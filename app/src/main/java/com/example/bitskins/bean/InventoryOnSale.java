package com.example.bitskins.bean;

import com.example.bitskins.bean.InventoryOnSaleBean.Items;

import java.util.List;

public class InventoryOnSale {

        private List<Items> items;
        private int page;
        private long cache_expires_at;
        private double rendered_in_seconds;
        public void setItems(List<Items> items) {
            this.items = items;
        }
        public List<Items> getItems() {
            return items;
        }

        public void setPage(int page) {
            this.page = page;
        }
        public int getPage() {
            return page;
        }

        public void setCache_expires_at(long cache_expires_at) {
            this.cache_expires_at = cache_expires_at;
        }
        public long getCache_expires_at() {
            return cache_expires_at;
        }

        public void setRendered_in_seconds(double rendered_in_seconds) {
            this.rendered_in_seconds = rendered_in_seconds;
        }
        public double getRendered_in_seconds() {
            return rendered_in_seconds;
        }
}
