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
import com.example.bitskins.adapter.InventoryItemAdapter;
import com.example.bitskins.adapter.MarketDataAdapter;
import com.example.bitskins.bean.Bitdata;
import com.example.bitskins.bean.MyInventory;
import com.example.bitskins.bean.MyInventoryBean.ItemSteam;
import com.example.bitskins.bean.PriceDataItemsOnSale;
import com.example.bitskins.utils.Url_string;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.loopj.android.http.TextHttpResponseHandler;

import java.lang.reflect.Type;
import java.util.List;

import cz.msebera.android.httpclient.Header;

import static com.example.bitskins.utils.SendRequest.sendHttpRequest;

public class InventoryFragment extends Fragment {
    private String mFrom;
    public static InventoryFragment newInstance(String from){
        InventoryFragment fragment = new InventoryFragment();
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
        final View view = inflater.inflate(R.layout.fragment_inventory,null);
        String url = new Url_string("get_my_inventory", "api_key=8943b547-0b86-43e8-8b68-0e65e17b2df2").getUrl();

        sendHttpRequest(url, new TextHttpResponseHandler() {
            @Override
            public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
                Log.d("inventory", "connect fail");
            }

            @Override
            public void onSuccess(int statusCode, Header[] headers, String responseString) {
                Log.d("inventory", "connect success");
//                 String responseData = response.body().string();
                final List<ItemSteam> inventoryData;
                Gson gson = new Gson();
                Type ca = new TypeToken<Bitdata<MyInventory>>(){}.getType();
                Bitdata<MyInventory> t = gson.fromJson(responseString, ca);
                Log.d("MainActivity", "available_balance " + t.getStatus());
                inventoryData = t.getData().getSteam_inventory().getItems();

                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        InventoryItemAdapter mdAdapter = new InventoryItemAdapter(getActivity(), inventoryData);
                        mdAdapter.notifyDataSetChanged();
                        ListView listView = view.findViewById(R.id.inventorydata);
                        listView.setAdapter(mdAdapter);

                        Toast.makeText(getActivity(), "done", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });

        return view;
    }
}
