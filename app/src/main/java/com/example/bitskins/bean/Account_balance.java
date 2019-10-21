
package com.example.bitskins.bean;


public class Account_balance {

    private String couponable_balance;
    private String pending_withdrawals;
    private String available_balance;
    private String withdrawable_balance;

    public void setAvailable_balance(String available_balance) {
        this.available_balance = available_balance;
    }
    public String getAvailable_balance() {
        return available_balance;
    }

    public void setPending_withdrawals(String pending_withdrawals) {
        this.pending_withdrawals = pending_withdrawals;
    }
    public String getPending_withdrawals() {
        return pending_withdrawals;
    }

    public void setWithdrawable_balance(String withdrawable_balance) {
        this.withdrawable_balance = withdrawable_balance;
    }
    public String getWithdrawable_balance() {
        return withdrawable_balance;
    }

    public void setCouponable_balance(String couponable_balance) {
        this.couponable_balance = couponable_balance;
    }
    public String getCouponable_balance() {
        return couponable_balance;
    }

}