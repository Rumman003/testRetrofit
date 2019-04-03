package com.ankur.retrofit;

public class ListItem {
    private String serial;
    private String promoCode;
    private String description;

    public ListItem(String serial, String promoCode, String description) {
        this.serial = serial;
        this.promoCode = promoCode;
        this.description = description;
    }

    public String getSerial() {
        return serial;
    }

    public String getPromoCode() {
        return promoCode;
    }

    public String getDescription() {
        return description;
    }
}
