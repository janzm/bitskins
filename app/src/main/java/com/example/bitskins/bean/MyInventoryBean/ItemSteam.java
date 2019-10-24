package com.example.bitskins.bean.MyInventoryBean;

import java.util.List;

public class ItemSteam {

    private String app_id;
    private String context_id;
    private int number_of_items;
    private List<String> item_ids;
    private List<String> asset_ids;
    private String class_id;
    private String instance_id;
    private String market_hash_name;
    private String suggested_price;
    private String item_type;
    private String item_class;
    private String item_rarity;
    private String item_weapon;
    private String item_quality;
    private String item_itemset;
    private String image;
    private boolean inspectable;
    private String inspect_link;
    private String phase;
    private TagsItemSteam.Tags tags;
    private boolean has_buy_orders;
    private String recent_sales_info;
    private String stickers;
    private List<List<String>> fraud_warnings;
    private boolean is_listing_allowed;
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

    public void setNumber_of_items(int number_of_items) {
        this.number_of_items = number_of_items;
    }
    public int getNumber_of_items() {
        return number_of_items;
    }

    public void setItem_ids(List<String> item_ids) {
        this.item_ids = item_ids;
    }
    public List<String> getItem_ids() {
        return item_ids;
    }

    public void setAsset_ids(List<String> asset_ids) {
        this.asset_ids = asset_ids;
    }
    public List<String> getAsset_ids() {
        return asset_ids;
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

    public void setItem_class(String item_class) {
        this.item_class = item_class;
    }
    public String getItem_class() {
        return item_class;
    }

    public void setItem_rarity(String item_rarity) {
        this.item_rarity = item_rarity;
    }
    public String getItem_rarity() {
        return item_rarity;
    }

    public void setItem_weapon(String item_weapon) {
        this.item_weapon = item_weapon;
    }
    public String getItem_weapon() {
        return item_weapon;
    }

    public void setItem_quality(String item_quality) {
        this.item_quality = item_quality;
    }
    public String getItem_quality() {
        return item_quality;
    }

    public void setItem_itemset(String item_itemset) {
        this.item_itemset = item_itemset;
    }
    public String getItem_itemset() {
        return item_itemset;
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

    public void setPhase(String phase) {
        this.phase = phase;
    }
    public String getPhase() {
        return phase;
    }

    public TagsItemSteam.Tags getTags() {
        return tags;
    }

    public void setTags(TagsItemSteam.Tags tags) {
        this.tags = tags;
    }

    public void setHas_buy_orders(boolean has_buy_orders) {
        this.has_buy_orders = has_buy_orders;
    }
    public boolean getHas_buy_orders() {
        return has_buy_orders;
    }

    public void setRecent_sales_info(String recent_sales_info) {
        this.recent_sales_info = recent_sales_info;
    }
    public String getRecent_sales_info() {
        return recent_sales_info;
    }

    public void setStickers(String stickers) {
        this.stickers = stickers;
    }
    public String getStickers() {
        return stickers;
    }

    public void setFraud_warnings(List<List<String>> fraud_warnings) {
        this.fraud_warnings = fraud_warnings;
    }
    public List<List<String>> getFraud_warnings() {
        return fraud_warnings;
    }

    public void setIs_listing_allowed(boolean is_listing_allowed) {
        this.is_listing_allowed = is_listing_allowed;
    }
    public boolean getIs_listing_allowed() {
        return is_listing_allowed;
    }

}
