package com.example.bitskins.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.bitskins.R;
import com.example.bitskins.bean.Bitdata;
import com.example.bitskins.bean.Item;
import com.example.bitskins.bean.MyInventory;
import com.example.bitskins.bean.MyInventoryBean.ItemSteam;
import com.example.bitskins.bean.PriceDataItemsOnSale;

import java.util.List;

public class InventoryItemAdapter extends BaseAdapter {
    private List<ItemSteam> inventoryData;
    private Context context;

    public InventoryItemAdapter(Context context,List<ItemSteam> inventoryData){
        this.context = context;
        this.inventoryData = inventoryData;
    }

    public int getCount(){
        Log.d("getCount", "getCount" + inventoryData.size());
        return inventoryData.size()/2 + inventoryData.size()%2;
    }

    public Object getItem(int postiton) {
        return inventoryData.get(postiton);
    }

    public long getItemId(int postition) {
        return 0;
    }

    public View getView(int postition, View convertView, ViewGroup viewGroup) {

        Log.d("iia", "run");
        Log.d("iia", "size:" + inventoryData.size()+inventoryData.get(postition).getMarket_hash_name());
        View view = LayoutInflater.from(context).inflate(R.layout.inventory_item, null);

//        ImageView imageView1 = view.findViewById(R.id.image1);
////        ImageView imageView2 = view.findViewById(R.id.image2);
////        TextView imagetext1 = view.findViewById(R.id.imagetext1);
////        TextView imagetext2 = view.findViewById(R.id.imagetext2);
        TextView hashname1 = view.findViewById(R.id.mkhashname1);
        TextView hashname2 = view.findViewById(R.id.mkhashname2);
        TextView price1 = view.findViewById(R.id.price1);
        TextView price2 = view.findViewById(R.id.price2);

        hashname1.setText(inventoryData.get(postition*2).getMarket_hash_name());
        hashname2.setText(inventoryData.get(postition*2+1).getMarket_hash_name());
        price1.setText("$" +inventoryData.get(postition*2).getSuggested_price());
        price2.setText("$" +inventoryData.get(postition*2+1).getSuggested_price());



        return view;
    }

}
