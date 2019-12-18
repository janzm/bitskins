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
import com.example.bitskins.bean.Sellids_bean;
import com.example.bitskins.view.CustomTabView;

public class ShelvesActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shelves);

        Sellids_bean items = (Sellids_bean) getIntent().getSerializableExtra("item_data");
        if (items != null) {
            ShelvesItemAdapter shelvesItemAdapter = new ShelvesItemAdapter(ShelvesActivity.this, items.getItems());
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

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
    }


}
