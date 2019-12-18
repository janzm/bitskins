package com.example.bitskins.activity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Build;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.bitskins.MainActivity;
import com.example.bitskins.R;
import com.example.bitskins.bean.Bitdata;
import com.example.bitskins.bean.Get_All_item_Prices;
import com.example.bitskins.bean.PriceDataItemsOnSale;
import com.example.bitskins.fragment.InventoryFragment;
import com.example.bitskins.utils.DataGenerator;
import com.example.bitskins.utils.SendRequest;
import com.example.bitskins.utils.Url_string;
import com.example.bitskins.view.CustomTabView;
import com.example.bitskins.view.TitleLayout;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

public class CustomTabActivity extends AppCompatActivity implements CustomTabView.OnTabCheckListener{

    private CustomTabView mCustomTabView;
    private Fragment []mFragments;
    private Fragment mContent;
    private FragmentManager manager;
    private InventoryFragment inventoryFragment;

    private FragmentTransaction transaction;


    final String INVENTORY_TAG = "Inventory_fragment";

    TitleLayout mtitle;
    LinearLayout sell_tab;
    CustomTabView select_tab;
    TextView t_quantity;
    TextView c_quantity;

    TextView tone;
    TextView ttwo;
    TextView all_select;
    Button on_sell;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_tab);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }

        mtitle = findViewById(R.id.title);
        tone = mtitle.findViewById(R.id.tt_one);
        ttwo = mtitle.findViewById(R.id.tt_two);
        sell_tab = findViewById(R.id.selected_sell);
        select_tab = findViewById(R.id.custom_tab_container);

        c_quantity = findViewById(R.id.c_quantity);
        t_quantity = findViewById(R.id.t_quantity);

        all_select = findViewById(R.id.all_select);
        on_sell = findViewById(R.id.sell_button);




        tone.setText(" ");
        mFragments = DataGenerator.getFragments("test");
        mContent = mFragments[0];
        initView();
    }

    private void initView() {
        mCustomTabView = (CustomTabView) findViewById(R.id.custom_tab_container);
        CustomTabView.Tab tabHome = new CustomTabView.Tab().setText("市场")
                .setColor(getResources().getColor(android.R.color.darker_gray))
                .setCheckedColor(getResources().getColor(android.R.color.black))
                .setNormalIcon(R.drawable.ic_tab_home)
                .setPressedIcon(R.drawable.ic_tab_home_selected);
        mCustomTabView.addTab(tabHome);
        CustomTabView.Tab tabDis = new CustomTabView.Tab().setText("出售")
                .setColor(getResources().getColor(android.R.color.darker_gray))
                .setCheckedColor(getResources().getColor(android.R.color.black))
                .setNormalIcon(R.drawable.ic_tab_store)
                .setPressedIcon(R.drawable.ic_tab_store_selected);
        mCustomTabView.addTab(tabDis);
        CustomTabView.Tab tabAttention = new CustomTabView.Tab().setText("库存")
                .setColor(getResources().getColor(android.R.color.darker_gray))
                .setCheckedColor(getResources().getColor(android.R.color.black))
                .setNormalIcon(R.drawable.ic_tab_backpack)
                .setPressedIcon(R.drawable.ic_tab_backpack_selected);
        mCustomTabView.addTab(tabAttention);
        CustomTabView.Tab tabProfile = new CustomTabView.Tab().setText("我的")
                .setColor(getResources().getColor(android.R.color.darker_gray))
                .setCheckedColor(getResources().getColor(android.R.color.black))
                .setNormalIcon(R.drawable.ic_tab_user_center)
                .setPressedIcon(R.drawable.ic_tab_user_center_selected);
        mCustomTabView.addTab(tabProfile);
        inventoryFragment = (InventoryFragment) mFragments[2];
        mCustomTabView.setOnTabCheckListener(this);


        mCustomTabView.setCurrentItem(2);

        all_select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                boolean flag = inventoryFragment.all_select();
                int cs = inventoryFragment.getQuantity();
                if (flag) {
                    dispalyst(cs, cs);
                } else {
                    inventoryFragment.setCquantify(0);
                    dispalyst(0, cs);
                }

            }
        });
        on_sell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(CustomTabActivity.this, ShelvesActivity.class);
//                startActivity(intent);
                inventoryFragment.shelves();
            }
        });

    }

    @Override
    public void onTabSelected(View v, int position) {
        Log.e("ac", "p:" + position);
        onTabItemSelected(position);
    }

    private void onTabItemSelected(int position) {
        Fragment tofragment = null;
        String m1Text = "fail";
        String m2Text = "fail";
        int t2_vis = View.VISIBLE;
        switch (position) {
            case 0:
                tofragment = mFragments[0];
                m1Text = "饰品市场";
                t2_vis = View.GONE;
                break;
            case 1:
                tofragment = mFragments[1];
                m1Text = "寄售";
                t2_vis = View.GONE;
                break;
            case 2:
                tofragment = mFragments[2];
                m1Text = "Steam库存";
                m2Text = "Bitskins背包";
                break;
            case 3:
                tofragment = mFragments[3];
                break;
        }
        if (tofragment != mContent) {
//            getSupportFragmentManager().beginTransaction().replace(R.id.home_container,tofragment).commit();
            transaction = getSupportFragmentManager().beginTransaction();

            tone.setText(m1Text);
            ttwo.setText(m2Text);
            ttwo.setVisibility(t2_vis);
            if (!tofragment.isAdded()) {
                transaction.hide(mContent).add(R.id.home_container, tofragment).commit();
            } else {
                transaction.hide(mContent).show(tofragment).commit();
            }
            mContent = tofragment;
        }
    }

    public void dispalyst(int cquantity,int tquantity) {
        c_quantity.setText(""+cquantity);
        t_quantity.setText("/"+tquantity);

        if (cquantity == 0) {

            select_tab.setVisibility(View.VISIBLE);
            sell_tab.setVisibility(View.GONE);
        } else {
            select_tab.setVisibility(View.GONE);
            sell_tab.setVisibility(View.VISIBLE);
        }

    }


}
