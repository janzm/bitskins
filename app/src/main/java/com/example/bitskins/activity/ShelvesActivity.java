package com.example.bitskins.activity;

import android.content.DialogInterface;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import com.example.bitskins.R;
import com.example.bitskins.adapter.ShelvesItemAdapter;
import com.example.bitskins.bean.MyInventoryBean.ItemSteam;
import com.example.bitskins.bean.Sellids_bean;
import com.example.bitskins.view.CustomTabView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShelvesActivity extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shelves);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }

        Sellids_bean items = (Sellids_bean) getIntent().getSerializableExtra("item_data");
        if (items != null) {
            List<Map<String,String>> iapl= new ArrayList<Map<String, String>>();
            for (int i = 0; i < items.getItems().size(); i++) {
                Map<String,String> iap = new HashMap<String,String>();
                iap.put(items.getItems().get(i).getItem_ids().get(0),"0");
                iapl.add(iap);
            }

            ShelvesItemAdapter shelvesItemAdapter = new ShelvesItemAdapter(ShelvesActivity.this, items.getItems(),iapl);

            ListView listView = (ListView) findViewById(R.id.shelves);
            listView.setAdapter(shelvesItemAdapter);
        } else {
            Log.d("sell", "fuck");
        }

        ImageButton back = findViewById(R.id.back);
        Button sell = findViewById(R.id.sell_button);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        sell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder dialog = new AlertDialog.Builder(ShelvesActivity.this);
                dialog.setTitle("提示");
                dialog.setMessage("请在Steam确认报价" +"\n\n"+
                        "谨防诈骗");
                dialog.setCancelable(false);
                dialog.setPositiveButton("确认", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
                dialog.show();



            }
        });


    }


}
