package com.example.bitskins.bean.MyInventoryBean;

public class ItemPanding {

    public class Items {

        private String app_id;
        private String context_id;
        private String item_id;
        private String asset_id;
        private String class_id;
        private String instance_id;
        private String market_hash_name;
        private String suggested_price;
        private String item_type;
        private String image;
        private boolean inspectable;
        private String inspect_link;
        private boolean attempting_to_send_offer;
        private String trade_token;
        private Error_correction_details error_correction_details;
        private long withdrawable_at;
        private String type;
        private String last_price;
        private String bot_uid;

        public class Error_correction_details {

            private boolean is_error_corrected;
            private String previous_item_id;
            public void setIs_error_corrected(boolean is_error_corrected) {
                this.is_error_corrected = is_error_corrected;
            }
            public boolean getIs_error_corrected() {
                return is_error_corrected;
            }

            public void setPrevious_item_id(String previous_item_id) {
                this.previous_item_id = previous_item_id;
            }
            public String getPrevious_item_id() {
                return previous_item_id;
            }

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

        public void setMarket_hash_name(String market_hash_name) {
            this.market_hash_name = market_hash_name;
        }
        public String getMarket_hash_name() {
            return market_hash_name;
        }

        public void setSuggested_price(String suggested_price) {
            this.suggested_price = suggested_price;
        }
        public String getSuggested_price() {
            return suggested_price;
        }

        public void setItem_type(String item_type) {
            this.item_type = item_type;
        }
        public String getItem_type() {
            return item_type;
        }

        public void setImage(String image) {
            this.image = image;
        }
        public String getImage() {
            return image;
        }

        public void setInspectable(boolean inspectable) {
            this.inspectable = inspectable;
        }
        public boolean getInspectable() {
            return inspectable;
        }

        public void setInspect_link(String inspect_link) {
            this.inspect_link = inspect_link;
        }
        public String getInspect_link() {
            return inspect_link;
        }

        public void setAttempting_to_send_offer(boolean attempting_to_send_offer) {
            this.attempting_to_send_offer = attempting_to_send_offer;
        }
        public boolean getAttempting_to_send_offer() {
            return attempting_to_send_offer;
        }

        public void setTrade_token(String trade_token) {
            this.trade_token = trade_token;
        }
        public String getTrade_token() {
            return trade_token;
        }

        public void setError_correction_details(Error_correction_details error_correction_details) {
            this.error_correction_details = error_correction_details;
        }
        public Error_correction_details getError_correction_details() {
            return error_correction_details;
        }

        public void setWithdrawable_at(long withdrawable_at) {
            this.withdrawable_at = withdrawable_at;
        }
        public long getWithdrawable_at() {
            return withdrawable_at;
        }

        public void setType(String type) {
            this.type = type;
        }
        public String getType() {
            return type;
        }

        public void setLast_price(String last_price) {
            this.last_price = last_price;
        }
        public String getLast_price() {
            return last_price;
        }

        public void setBot_uid(String bot_uid) {
            this.bot_uid = bot_uid;
        }
        public String getBot_uid() {
            return bot_uid;
        }

    }

}
