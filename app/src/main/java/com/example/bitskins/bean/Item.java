package com.example.bitskins.bean;

import java.util.List;

public class Item {
    int app_id;
    int context_id;
    String item_id;
    String asset_id;
    String class_id;
    String instance_id;
    String market_hash_name;
    String sniper_rifle;
    String item_type;
    String item_class;
    String item_weapon;
    String item_quality;
    String image;
    String inspectable;
    String getInspectable_link;
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
        String patternname;
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
    }
    List fraud_warnings;
    public class Sticker{
        String name;
        String url;
        String wear_value;
    }

    List stickers[];

    long updated_at;
    long withdrawable_at;
    long bot_uid;
}
