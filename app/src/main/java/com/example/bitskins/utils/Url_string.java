package com.example.bitskins.utils;

import com.example.bitskins.AuthTest;

public class Url_string {
    private String zone = "https://bitskins.com/api/v1/";
    private String request;
    private long code;
    private String url;

    public Url_string(String request,String... args) {
        this.request = request + "/?";
        url = zone + this.request;

        for (int i = 0; i < args.length; i++) {
            url += args[i] + "&";
        }
        code = new AuthTest().verifyTest();
        url += "code=" + code;
    }

    public String getUrl() {
        System.out.println(url);
        return url;
    }
}
