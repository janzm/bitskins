package com.example.bitskins.bean;

import java.util.List;


public class Money_events {

    private List<Events> events;
    private int page;

    public void setEvents(List<Events> events) {
        this.events = events;
    }

    public List<Events> getEvents() {
        return events;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPage() {
        return page;
    }


    public class Events {

        private String type;
        private Medium medium;
        private String price;
        private long time;
        private int withdrawn;
        private String description;
        private boolean pending;
        private String amount;

        public void setType(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }

        public void setMedium(Medium medium) {
            this.medium = medium;
        }

        public Medium getMedium() {
            return medium;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getPrice() {
            return price;
        }

        public void setTime(long time) {
            this.time = time;
        }

        public long getTime() {
            return time;
        }

        public void setWithdrawn(int withdrawn) {
            this.withdrawn = withdrawn;
        }

        public int getWithdrawn() {
            return withdrawn;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public boolean isPending() {
            return pending;
        }

        public void setPending(boolean pending) {
            this.pending = pending;
        }

        public String getAmount() {
            return amount;
        }

        public void setAmount(String amount) {
            this.amount = amount;
        }

        public class Medium {

            private String market_hash_name;
            private String app_id;
            private String context_id;
            private String class_id;
            private String instance_id;

            public void setMarket_hash_name(String market_hash_name) {
                this.market_hash_name = market_hash_name;
            }

            public String getMarket_hash_name() {
                return market_hash_name;
            }

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

    }

}
