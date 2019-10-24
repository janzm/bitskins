package com.example.bitskins.bean;

import com.example.bitskins.bean.MyInventoryBean.*;

public class MyInventory {
    private String app_id;
    private String context_id;
    private Steam_inventory steam_inventory;
    private Bitskins_inventory bitskins_inventory;
    private Pending_withdrawal_from_bitskins pending_withdrawal_from_bitskins;
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

    public void setSteam_inventory(Steam_inventory steam_inventory) {
        this.steam_inventory = steam_inventory;
    }
    public Steam_inventory getSteam_inventory() {
        return steam_inventory;
    }

    public void setBitskins_inventory(Bitskins_inventory bitskins_inventory) {
        this.bitskins_inventory = bitskins_inventory;
    }
    public Bitskins_inventory getBitskins_inventory() {
        return bitskins_inventory;
    }

    public void setPending_withdrawal_from_bitskins(Pending_withdrawal_from_bitskins pending_withdrawal_from_bitskins) {
        this.pending_withdrawal_from_bitskins = pending_withdrawal_from_bitskins;
    }
    public Pending_withdrawal_from_bitskins getPending_withdrawal_from_bitskins() {
        return pending_withdrawal_from_bitskins;
    }

}
