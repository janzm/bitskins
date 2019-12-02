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
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.TextHttpResponseHandler;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

import cz.msebera.android.httpclient.Header;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

import static com.example.bitskins.utils.SendRequest.sendHttpRequest;


public class MarketFragment extends Fragment {

    private String mFrom;


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

        String url = new Url_string("get_price_data_for_items_on_sale", "api_key=8943b547-0b86-43e8-8b68-0e65e17b2df2").getUrl();

        sendHttpRequest(url, new TextHttpResponseHandler() {
            @Override
            public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
                Log.d("market", "connect fail");
            }

            @Override
            public void onSuccess(int statusCode, Header[] headers, String responseString) {
                Log.d("market", "connect success");
//                 String responseData = response.body().string();
                final List<PriceDataItemsOnSale.Items> marketData;
                Gson gson = new Gson();
                Type ca = new TypeToken<Bitdata<PriceDataItemsOnSale>>() {
                }.getType();
                Bitdata<PriceDataItemsOnSale> t = gson.fromJson(responseString, ca);
                Log.d("MainActivity", "available_balance " + t.getStatus());
                marketData = t.getData().getItems();

                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        MarketDataAdapter mdAdapter = new MarketDataAdapter(getActivity(), marketData);
                        ListView listView = view.findViewById(R.id.martetdata);
                        listView.setAdapter(mdAdapter);
                        Log.d("tt", "s" + marketData.get(1).getMarket_hash_name());
                        Toast.makeText(getActivity(), "done", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });

        return view;
    }

}
