package com.example.bitskins.bean.MyInventoryBean;

import com.google.gson.annotations.SerializedName;

public class TagsItemSteam {
    public class Tags {

        private String type;
        private String category;
        private String quality;
        @SerializedName(value = "graffiti_color",alternate = {"graffiti_color","graffiti color"})
        private String graffiti_color;
        public void setType(String type) {
            this.type = type;
        }
        public String getType() {
            return type;
        }

        public void setCategory(String category) {
            this.category = category;
        }
        public String getCategory() {
            return category;
        }

        public void setQuality(String quality) {
            this.quality = quality;
        }
        public String getQuality() {
            return quality;
        }

        public String getGraffiti_color() {
            return graffiti_color;
        }

        public void setGraffiti_color(String graffiti_color) {
            this.graffiti_color = graffiti_color;
        }
    }
}
