package com.example.bitskins;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.textclassifier.TextLinks;

import com.example.bitskins.activity.CustomTabActivity;
import com.example.bitskins.bean.Account_balance;
import com.example.bitskins.bean.Bitdata;
import com.example.bitskins.bean.Buy_history;
import com.example.bitskins.bean.Get_All_item_Prices;
import com.example.bitskins.bean.Item;
import com.example.bitskins.bean.Money_events;
import com.example.bitskins.bean.MyInventory;
import com.example.bitskins.bean.MyInventoryBean.ItemSteam;
import com.example.bitskins.bean.MyInventoryBean.TagsItemSteam;
import com.example.bitskins.bean.PriceDataItemsOnSale;
import com.example.bitskins.utils.SendRequest;
import com.example.bitskins.utils.Url_string;
import com.example.bitskins.view.CustomTabView;
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
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        String url = new Url_string("get_my_inventory", "api_key=8943b547-0b86-43e8-8b68-0e65e17b2df2").getUrl();
//        SendRequest sr = new SendRequest();
//        sr.Request(url);

        Intent intent = new Intent(MainActivity.this, CustomTabActivity.class);
        startActivity(intent);


    }
//    private void sendRequestWithOkhttp(){
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    AuthTest t = new AuthTest();
//                    Log.d("MainActivity", "code:" + t.verifyTest());
//                    OkHttpClient client = new OkHttpClient();
//                    Request request = new Request.Builder()
////                            .url("https://bitskins.com/api/v1/get_inventory_on_sale/?api_key=8943b547-0b86-43e8-8b68-0e65e17b2df2&show_trade_delayed_items=1&market_hash_name=asiimov&code=" + t.verifyTest())
////                            .url("https://bitskins.com/api/v1/get_buy_history/?api_key=8943b547-0b86-43e8-8b68-0e65e17b2df2&code=" + t.verifyTest())
//                            .url(new Url_string("get_buy_history", "api_key=8943b547-0b86-43e8-8b68-0e65e17b2df2").getUrl())
//                            .build();
//                    Response response = client.newCall(request).execute();
//                    String responseData = response.body().string();
//                    System.out.println(responseData);
//
//
//                    parseJSONWithGSON(responseData);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        }).start();
//    }

//    public static void parseJSONWithGSON(String jsonData) {
//        Gson gson = new Gson();
//        Type balance = new TypeToken<Bitdata<MyInventory>>(){}.getType();
//        Bitdata<MyInventory> ac_balance = gson.fromJson(jsonData,balance);
//
//        Log.d("MainActivity", "available_balance " + ac_balance.getStatus());
//        Map<String, String> t1 = ac_balance.getData().getSteam_inventory().getItems().get(2).getTags();
//
//        for (String key : t1.keySet()) {
//            Log.e("key", key);
//            Log.e("li.get(key).toString()", t1.get(key).toString());
//
//        }
//
//
//    }

    public static void parseJSONWithGSON(String jsonData) {
        Gson gson = new Gson();
//        Type balance = new TypeToken<Bitdata<Get_All_item_Prices>>(){}.getType();
        Get_All_item_Prices ac_balance = gson.fromJson(jsonData,Get_All_item_Prices.class);

        Log.d("MainActivity", "available_balance " + ac_balance.getStatus());


    }

}
