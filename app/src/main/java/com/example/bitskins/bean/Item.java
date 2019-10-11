package com.example.bitskins.bean;

import java.util.List;

public class Item {
    String app_id;
    String context_id;
    String item_id;
    String asset_id;
    String class_id;
    String instance_id;
    String market_hash_name;
    String item_type;
    String item_class;
    String rarity;
    String item_weapon;
    String item_quality;
    String image;
    String inspectable;
    String Inspect_link;
    String price;
    String suggested_price;
    String is_featured;
    String float_value;
    public class Pattern_info{
        int paintindex;
        int paintseed;
        int rarity;
        int quality;
        int paintwear;
        long patternname;

        public int getPaintindex() {
            return paintindex;
        }

        public void setPaintindex(int paintindex) {
            this.paintindex = paintindex;
        }

        public int getPaintseed() {
            return paintseed;
        }

        public void setPaintseed(int paintseed) {
            this.paintseed = paintseed;
        }

        public int getRarity() {
            return rarity;
        }

        public void setRarity(int rarity) {
            this.rarity = rarity;
        }

        public int getQuality() {
            return quality;
        }

        public void setQuality(int quality) {
            this.quality = quality;
        }

        public int getPaintwear() {
            return paintwear;
        }

        public void setPaintwear(int paintwear) {
            this.paintwear = paintwear;
        }

        public long getPatternname() {
            return patternname;
        }

        public void setPatternname(long patternname) {
            this.patternname = patternname;
        }
    }
    String phase;
    String type;
    String is_mine;
    public class Tags{
        String type;
        String weapon;
        String itemset;
        String quality;
        String rarity;
        String exterior;
        String tournament;
        String tournamentteam;
        String proplayer;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getWeapon() {
            return weapon;
        }

        public void setWeapon(String weapon) {
            this.weapon = weapon;
        }

        public String getItemset() {
            return itemset;
        }

        public void setItemset(String itemset) {
            this.itemset = itemset;
        }

        public String getQuality() {
            return quality;
        }

        public void setQuality(String quality) {
            this.quality = quality;
        }

        public String getRarity() {
            return rarity;
        }

        public void setRarity(String rarity) {
            this.rarity = rarity;
        }

        public String getExterior() {
            return exterior;
        }

        public void setExterior(String exterior) {
            this.exterior = exterior;
        }

        public String getTournament() {
            return tournament;
        }

        public void setTournament(String tournament) {
            this.tournament = tournament;
        }

        public String getTournamentteam() {
            return tournamentteam;
        }

        public void setTournamentteam(String tournamentteam) {
            this.tournamentteam = tournamentteam;
        }

        public String getProplayer() {
            return proplayer;
        }

        public void setProplayer(String proplayer) {
            this.proplayer = proplayer;
        }
    }
    String fraud_warnings[];

    public class Sticker{
        String name;
        String url;
        String wear_value;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getWear_value() {
            return wear_value;
        }

        public void setWear_value(String wear_value) {
            this.wear_value = wear_value;
        }
    }

    List stickers;

    long updated_at;
    long withdrawable_at;
    String bot_uid;

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

    public String getItem_type() {
        return item_type;
    }

    public void setItem_type(String item_type) {
        this.item_type = item_type;
    }

    public String getItem_class() {
        return item_class;
    }

    public void setItem_class(String item_class) {
        this.item_class = item_class;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String getItem_weapon() {
        return item_weapon;
    }

    public void setItem_weapon(String item_weapon) {
        this.item_weapon = item_weapon;
    }

    public String getItem_quality() {
        return item_quality;
    }

    public void setItem_quality(String item_quality) {
        this.item_quality = item_quality;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getInspectable() {
        return inspectable;
    }

    public void setInspectable(String inspectable) {
        this.inspectable = inspectable;
    }

    public String getInspect_link() {
        return Inspect_link;
    }

    public void setInspect_link(String inspect_link) {
        Inspect_link = inspect_link;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSuggested_price() {
        return suggested_price;
    }

    public void setSuggested_price(String suggested_price) {
        this.suggested_price = suggested_price;
    }

    public String getIs_featured() {
        return is_featured;
    }

    public void setIs_featured(String is_featured) {
        this.is_featured = is_featured;
    }

    public String getFloat_value() {
        return float_value;
    }

    public void setFloat_value(String float_value) {
        this.float_value = float_value;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIs_mine() {
        return is_mine;
    }

    public void setIs_mine(String is_mine) {
        this.is_mine = is_mine;
    }

    public String[] getFraud_warnings() {
        return fraud_warnings;
    }

    public void setFraud_warnings(String[] fraud_warnings) {
        this.fraud_warnings = fraud_warnings;
    }

    public List getStickers() {
        return stickers;
    }

    public void setStickers(List stickers) {
        this.stickers = stickers;
    }

    public long getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(long updated_at) {
        this.updated_at = updated_at;
    }

    public long getWithdrawable_at() {
        return withdrawable_at;
    }

    public void setWithdrawable_at(long withdrawable_at) {
        this.withdrawable_at = withdrawable_at;
    }

    public String getBot_uid() {
        return bot_uid;
    }

    public void setBot_uid(String bot_uid) {
        this.bot_uid = bot_uid;
    }
}
