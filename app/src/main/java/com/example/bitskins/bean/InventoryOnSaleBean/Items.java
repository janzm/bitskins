package com.example.bitskins.bean.InventoryOnSaleBean;

import com.example.bitskins.bean.InventoryOnSaleBean.ItemBean.Pattern_info;

import java.util.List;
import java.util.Map;

public class Items {
    private String app_id;
    private String context_id;
    private String item_id;
    private String asset_id;
    private String class_id;
    private String instance_id;
    private String market_hash_name;
    private String item_type;
    private String item_class;
    private String item_rarity;
    private String item_weapon;
    private String item_quality;
    private String image;
    private boolean inspectable;
    private String inspect_link;
    private String price;
    private String suggested_price;
    private boolean is_featured;
    private String float_value;
    private Pattern_info pattern_info;
    private String phase;
    private String type;
    private boolean is_mine;
    private Map<String, String> tags;
    private List<String> fraud_warnings;
    private String stickers;
    private long updated_at;
    private long withdrawable_at;
    private String bot_uid;

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

    public String getItem_weapon() {
        return item_weapon;
    }

    public void setItem_weapon(String item_weapon) {
        this.item_weapon = item_weapon;
    }

    public void setItem_quality(String item_quality) {
        this.item_quality = item_quality;
    }

    public String getItem_quality() {
        return item_quality;
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

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPrice() {
        return price;
    }

    public void setSuggested_price(String suggested_price) {
        this.suggested_price = suggested_price;
    }

    public String getSuggested_price() {
        return suggested_price;
    }

    public void setIs_featured(boolean is_featured) {
        this.is_featured = is_featured;
    }

    public boolean getIs_featured() {
        return is_featured;
    }

    public void setFloat_value(String float_value) {
        this.float_value = float_value;
    }

    public String getFloat_value() {
        return float_value;
    }

    public void setPattern_info(Pattern_info pattern_info) {
        this.pattern_info = pattern_info;
    }

    public Pattern_info getPattern_info() {
        return pattern_info;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public String getPhase() {
        return phase;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setIs_mine(boolean is_mine) {
        this.is_mine = is_mine;
    }

    public boolean getIs_mine() {
        return is_mine;
    }

    public Map<String, String> getTags() {
        return tags;
    }

    public void setTags(Map<String, String> tags) {
        this.tags = tags;
    }

    public void setFraud_warnings(List<String> fraud_warnings) {
        this.fraud_warnings = fraud_warnings;
    }

    public List<String> getFraud_warnings() {
        return fraud_warnings;
    }

    public void setStickers(String stickers) {
        this.stickers = stickers;
    }

    public String getStickers() {
        return stickers;
    }

    public void setUpdated_at(long updated_at) {
        this.updated_at = updated_at;
    }

    public long getUpdated_at() {
        return updated_at;
    }

    public void setWithdrawable_at(long withdrawable_at) {
        this.withdrawable_at = withdrawable_at;
    }

    public long getWithdrawable_at() {
        return withdrawable_at;
    }

    public void setBot_uid(String bot_uid) {
        this.bot_uid = bot_uid;
    }

    public boolean isInspectable() {
        return inspectable;
    }

    public boolean isIs_featured() {
        return is_featured;
    }

    public boolean isIs_mine() {
        return is_mine;
    }

    public String getBot_uid() {
        return bot_uid;
    }

}
