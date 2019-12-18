package com.example.bitskins.fragment;

import android.content.Context;
import android.content.Intent;
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
import com.example.bitskins.activity.CustomTabActivity;
import com.example.bitskins.activity.ShelvesActivity;
import com.example.bitskins.adapter.InventoryItemAdapter;
import com.example.bitskins.adapter.MarketDataAdapter;
import com.example.bitskins.bean.Bitdata;
import com.example.bitskins.bean.MyInventory;
import com.example.bitskins.bean.MyInventoryBean.ItemSteam;
import com.example.bitskins.bean.PriceDataItemsOnSale;
import com.example.bitskins.bean.Sellids_bean;
import com.example.bitskins.utils.Url_string;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.loopj.android.http.TextHttpResponseHandler;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import cz.msebera.android.httpclient.Header;

import static com.example.bitskins.utils.SendRequest.sendHttpRequest;

public class InventoryFragment extends Fragment {
    private String mFrom;
    private int t_quantity;
    private List<ItemSteam> inventoryData;
    private Bitdata<MyInventory> myInventory;
    private View fragment_myinventory;
    private InventoryItemAdapter inventoryItemAdapter;
    private ListView inventory_listView;
    private int cquantify = 0;
    private boolean all_select_flag = false;
    private List<ItemSteam> willsell =new ArrayList();

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
    public View onCreateView(final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragment_myinventory = inflater.inflate(R.layout.fragment_inventory,null);
        String url = new Url_string("get_my_inventory", "api_key=8943b547-0b86-43e8-8b68-0e65e17b2df2").getUrl();



        sendHttpRequest(url, new TextHttpResponseHandler() {
            @Override
            public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
                Log.d("inventory", "connect fail");
            }

            @Override
            public void onSuccess(int statusCode, Header[] headers, String responseString) {
                Log.d("inventory", "connect success");
                Gson gson = new Gson();
                Type ca = new TypeToken<Bitdata<MyInventory>>(){}.getType();
                myInventory = gson.fromJson(responseString, ca);
                Log.d("inventory", "response " + myInventory.getStatus());
                t_quantity = myInventory.getData().getSteam_inventory().getTotal_items();
                inventoryData = myInventory.getData().getSteam_inventory().getItems();
                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        inventoryItemAdapter = new InventoryItemAdapter(getActivity(), inventoryData);
//                        inventoryItemAdapter.notifyDataSetChanged();
                        inventory_listView = fragment_myinventory.findViewById(R.id.inventorydata);
                        inventoryItemAdapter.setOnItemSelectClickListener(new InventoryItemAdapter.onItemSelectListener() {
                            @Override
                            public void onSelectClick(int i,boolean flag,ItemSteam item) {
                                if (!willsell.contains(item)) {
                                    willsell.add(item);
                                } else {
                                    for(int j2 = 0; j2 < willsell.size(); j2++){
                                        ItemSteam is = willsell.get(j2);
                                        if (is == item) {
                                            willsell.remove(j2);
                                        }
                                    }

                                }

                                if (flag) {
                                    cquantify += 1;
                                } else {
                                    cquantify -= 1;
                                }
                                CustomTabActivity activity = (CustomTabActivity)getActivity();
                                activity.dispalyst(cquantify,t_quantity);
                                Log.d("inventory", "select pos " + i);
                                inventoryItemAdapter.notifyDataSetChanged();
                            }
                        });

                        inventory_listView.setAdapter(inventoryItemAdapter);
                        Toast.makeText(getActivity(), "done", Toast.LENGTH_SHORT).show();
                    }
                });

            }
        });

        return fragment_myinventory;
    }

    public void initMyinventory() {

    }
    public int shelves() {
        Intent intent = new Intent(getActivity(), ShelvesActivity.class);
        Sellids_bean ids = new Sellids_bean();
        ids.setItems(willsell);
        intent.putExtra("item_data", ids);
        startActivity(intent);

        return 1;
    }
    public boolean all_select() {

        for (int i = 0;i<=inventoryData.size()-1; i++){
            if (all_select_flag) {
                inventoryData.get(i).setSelect(false);

            } else {
                inventoryData.get(i).setSelect(true);

            }
        }
        if (all_select_flag) {
            cquantify = 0;
            all_select_flag = false;
        } else {
            all_select_flag = true;
        }
        inventoryItemAdapter.notifyDataSetChanged();

        return all_select_flag;
    }
    public int getQuantity() {
        return inventoryData.size()-1;
    }

    public int getCquantify() {
        return cquantify;
    }

    public void setCquantify(int cquantify) {
        this.cquantify = cquantify;
    }
}
