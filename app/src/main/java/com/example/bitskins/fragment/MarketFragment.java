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

import com.example.bitskins.R;
import com.example.bitskins.adapter.MarketDataAdapter;
import com.example.bitskins.bean.Bitdata;
import com.example.bitskins.bean.PriceDataItemsOnSale;
import com.example.bitskins.utils.SendRequest;
import com.example.bitskins.utils.Url_string;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;


public class MarketFragment extends Fragment {

    private String mFrom;
    private static List<PriceDataItemsOnSale.Items> marketData;

    public static MarketFragment newInstance(String from){
        MarketFragment fragment = new MarketFragment();
        Bundle bundle = new Bundle();
        bundle.putString("from",from);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getArguments()!=null){
            mFrom = getArguments().getString("from");
        }


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_market,null);
        List<PriceDataItemsOnSale.Items> marketData;
        ListView listView = view.findViewById(R.id.martetdata);

        String url = new Url_string("get_price_data_for_items_on_sale", "api_key=8943b547-0b86-43e8-8b68-0e65e17b2df2").getUrl();
        SendRequest sr = new SendRequest();
        sr.Request(url);

        MarketDataAdapter mdAdapter = MarketDataAdapter(getActivity(), marketData);
        listView.setAdapter(mdAdapter);

        return view;
    }
    public static void parseJSONWithGSON(String jsonData) {
        Gson gson = new Gson();
        Type ca = new TypeToken<Bitdata<PriceDataItemsOnSale>>(){}.getType();
        Bitdata<PriceDataItemsOnSale> t = gson.fromJson(jsonData, ca);
        Log.d("MainActivity", "available_balance " + t.getStatus());


    }
}
