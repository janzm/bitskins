package com.example.bitskins.utils;

import com.example.bitskins.MainActivity;
import com.example.bitskins.activity.CustomTabActivity;
import com.example.bitskins.fragment.MarketFragment;
import com.example.bitskins.view.CustomTabView;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class SendRequest {
    public static void sendHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(address)
                .addHeader("User-Agent", "Mozilla/5.0 (Linux; Android 9; LM-G710) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/78.0.3904.108 Mobile Safari/537.36")
                .build();
        client.newCall(request).enqueue(callback);
    }
}
