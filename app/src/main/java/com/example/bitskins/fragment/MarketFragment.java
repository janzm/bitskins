package com.example.bitskins.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bitskins.R;
import com.example.bitskins.adapter.MarketDataAdapter;
import com.example.bitskins.bean.Bitdata;
import com.example.bitskins.bean.PriceDataItemsOnSale;
import com.example.bitskins.utils.SendRequest;
import com.example.bitskins.utils.Url_string;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;


public class MarketFragment extends Fragment {

    private String mFrom;
    private static List<PriceDataItemsOnSale.Items> marketData;

    public static MarketFragment newInstance(String from) {
        MarketFragment fragment = new MarketFragment();
        Bundle bundle = new Bundle();
        bundle.putString("from", from);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mFrom = getArguments().getString("from");
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_market, null);

        Runtime runtime = Runtime.getRuntime();



        String url = new Url_string("get_price_data_for_items_on_sale", "api_key=8943b547-0b86-43e8-8b68-0e65e17b2df2").getUrl();
        Log.d("market url", "https://www.baidu.com");
        String b = "https://bitskins.com";
        String ba = "https://www.baidu.com";
        SendRequest.sendHttpRequest(ba, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.d("market", "connect fail");
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
//                Log.d("market", "connect success");
//                String responseData = response.body().string();
//                final List<PriceDataItemsOnSale.Items> marketData;
//                Gson gson = new Gson();
//                Type ca = new TypeToken<Bitdata<PriceDataItemsOnSale>>() {
//                }.getType();
//                Bitdata<PriceDataItemsOnSale> t = gson.fromJson(responseData, ca);
//                Log.d("MainActivity", "available_balance " + t.getStatus());
//                marketData = t.getData().getItems();
//
//                getActivity().runOnUiThread(new Runnable() {
//                    @Override
//                    public void run() {
//                        MarketDataAdapter mdAdapter = new MarketDataAdapter(getActivity(), marketData);
//                        ListView listView = view.findViewById(R.id.martetdata);
//                        listView.setAdapter(mdAdapter);
//                        Toast.makeText(getActivity(), "done", Toast.LENGTH_SHORT).show();
//                    }
//                });
                Log.d("market", "connect success");
            }
        });

        return view;
    }

}
