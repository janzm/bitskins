package com.example.bitskins.activity;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.bitskins.R;
import com.example.bitskins.bean.Get_All_item_Prices;
import com.example.bitskins.utils.DataGenerator;
import com.example.bitskins.utils.SendRequest;
import com.example.bitskins.utils.Url_string;
import com.example.bitskins.view.CustomTabView;
import com.google.gson.Gson;

public class CustomTabActivity extends AppCompatActivity implements CustomTabView.OnTabCheckListener{

    private CustomTabView mCustomTabView;
    private Fragment []mFragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_tab);

        String url = new Url_string("get_my_inventory", "api_key=8943b547-0b86-43e8-8b68-0e65e17b2df2").getUrl();
        SendRequest sr = new SendRequest();
        sr.Request(url);

        mFragments = DataGenerator.getFragments("bii");
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

        mCustomTabView.setOnTabCheckListener(this);

        mCustomTabView.setCurrentItem(0);

    }

    @Override
    public void onTabSelected(View v, int position) {
        Log.e("ac", "p:" + position);
        onTabItemSelected(position);
    }

    private void onTabItemSelected(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = mFragments[0];
                break;
            case 1:
                fragment = mFragments[1];
                break;
            case 2:
                fragment = mFragments[2];
                break;
            case 3:
                fragment = mFragments[3];
                break;
        }
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.home_container,fragment).commit();
        }
    }

    public static void parseJSONWithGSON(String jsonData) {
        Gson gson = new Gson();
//      Type balance = new TypeToken<Bitdata<Get_All_item_Prices>>(){}.getType();
        Get_All_item_Prices ac_balance = gson.fromJson(jsonData,Get_All_item_Prices.class);

        Log.d("MainActivity", "available_balance " + ac_balance.getStatus());


    }
}
