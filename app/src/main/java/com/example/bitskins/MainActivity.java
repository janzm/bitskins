package com.example.bitskins;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.textclassifier.TextLinks;

import com.example.bitskins.bean.Account_balance;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.lang.reflect.Type;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendRequestWithOkhttp();
        Log.d("MainActivity", "assssss" );

    }
    private void sendRequestWithOkhttp(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    OkHttpClient client = new OkHttpClient();
                    Request request = new Request.Builder()
                            .url("https://bitskins.com/api/v1/get_account_balance/?api_key=8943b547-0b86-43e8-8b68-0e65e17b2df2&code=236499")
                            .build();
                    Response response = client.newCall(request).execute();
                    String responseData = response.body().string();
                    System.out.print("ssss");
                    parseJSONWithGSON(responseData);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    private void parseJSONWithGSON(String jsonData) {
        Gson gson = new Gson();
        List<Account_balance> ac_balance = gson.fromJson(jsonData, new TypeToken<List<Account_balance>>() {
        }.getType());

        for (Account_balance ab : ac_balance) {
            Log.d("MainActivity", "available_balance" + ab.getAvailable_balance());
            Log.d("MainActivity", "pending_withdrawals" + ab.getPending_withdrawals());
            Log.d("MainActivity", "withdrawable_balance" + ab.getWithdrawable_balance());
            Log.d("MainActivity", "Couponable_balance" + ab.getCouponable_balance());

        }
    }

}
