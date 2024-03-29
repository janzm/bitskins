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
import com.example.bitskins.bean.PriceDataItemsOnSale;

import java.util.List;

public class MarketDataAdapter extends BaseAdapter {
    private List<PriceDataItemsOnSale.Items> marketData;
    private Context context;

    public MarketDataAdapter(Context context,List<PriceDataItemsOnSale.Items> marketData){
        this.context = context;
        this.marketData = marketData;
    }

    public int getCount(){

        int s = marketData.size()/2 + marketData.size()%2;
        Log.d("marketsize","size=" + s);
        return s;
    }

    public Object getItem(int postiton) {
        return marketData.get(postiton);
    }

    public long getItemId(int postition) {
        return 0;
    }

    public View getView(int postition, View convertView, ViewGroup viewGroup) {
//        PriceDataItemsOnSale.Items items = (PriceDataItemsOnSale.Items) getItem(postition);
        Log.d("mka", "run"+marketData.size());
        View view = LayoutInflater.from(context).inflate(R.layout.marketdata, null);

//        ImageView imageView1 = view.findViewById(R.id.image1);
//        ImageView imageView2 = view.findViewById(R.id.image2);
//        TextView imagetext1 = view.findViewById(R.id.imagetext1);
//        TextView imagetext2 = view.findViewById(R.id.imagetext2);
        TextView hashname1 = view.findViewById(R.id.mkhashname1);
        TextView hashname2 = view.findViewById(R.id.mkhashname2);
//        TextView price1 = view.findViewById(R.id.price1);
//        TextView price2 = view.findViewById(R.id.price2);
//        TextView stock1 = view.findViewById(R.id.stock1);
//        TextView stock2 = view.findViewById(R.id.stock2);



        int p1 = postition *2;
        int p2 = postition *2 +1;
        Log.d("p", "run"+p1);
        Log.d("p", "run"+p2);


        hashname1.setText(marketData.get(p1).getMarket_hash_name());
        hashname2.setText(marketData.get(p2).getMarket_hash_name());

        return view;
    }

}
