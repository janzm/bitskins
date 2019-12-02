package com.example.bitskins.utils;

import com.example.bitskins.MainActivity;
import com.example.bitskins.activity.CustomTabActivity;
import com.example.bitskins.fragment.MarketFragment;
import com.example.bitskins.view.CustomTabView;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.TextHttpResponseHandler;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class SendRequest {
//    public static void sendHttpRequest(String address, okhttp3.Callback callback) {
//        OkHttpClient client = new OkHttpClient();
//        Request request = new Request.Builder()
//                .url(address)
//                .addHeader("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/78.0.3904.108 Safari/537.36")
//                .addHeader("Referer", address)
//                .get()
//                .build();
//        client.newCall(request).enqueue(callback);
//    }

    public static void sendHttpRequest(String url,TextHttpResponseHandler callback){
        AsyncHttpClient client = new AsyncHttpClient();
        client.get(url, callback);
    }
}
