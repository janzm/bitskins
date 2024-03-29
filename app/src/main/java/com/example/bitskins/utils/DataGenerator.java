package com.example.bitskins.utils;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bitskins.R;
import com.example.bitskins.fragment.*;

public class DataGenerator {
//    public static final int []mTabRes = new int[]{R.drawable.tab_home_selector,R.drawable.tab_discovery_selector,R.drawable.tab_attention_selector,R.drawable.tab_profile_selector};
//    public static final int []mTabResPresse = new int[]{R.drawable.ic_tab_strip_icon_feed_selected,R.drawable.ic_tab_strip_icon_category_selected,R.drawable.ic_tab_strip_icon_pgc_selected,R.drawable.ic_tab_strip_icon_profile_selected};
//    public static final String []mTabTitle = new String[] {"市场","出售","库存","我的"};


    public static Fragment[] getFragments(String from) {
        Fragment fragments[] = new Fragment[4];

        fragments[0] = MarketFragment.newInstance(from);
        fragments[1] = ShelfFragment.newInstance(from);
        fragments[2] = InventoryFragment.newInstance(from);
        fragments[3] = ProfileFragment.newInstance(from);

        return fragments;
    }

//    public static View getTabView(Context context, int position) {
//        View view = LayoutInflater.from(context).inflate(R.layout.home_tab_content,null);
//        ImageView tabIcon = (ImageView) view.findViewById(R.id.tab_content_image);
//        tabIcon.setImageResource(DataGenerator.mTabRes[position]);
//        TextView tabText = (TextView) view.findViewById(R.id.tab_content_text);
//        tabText.setText(mTabTitle[position]);
//        return view;
//    }

}
