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
                .build();
        client.newCall(request).enqueue(callback);
    }
    public void Request(String url) {
        sendHttpRequest(url, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                 String responseData = response.body().string();
                 MarketFragment.parseJSONWithGSON(responseData);
            }
        });

    }


}
