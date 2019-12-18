package com.example.bitskins.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.bitskins.R;
import com.example.bitskins.bean.MyInventoryBean.ItemSteam;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.ArrayList;
import java.util.List;


public class ShelvesItemAdapter extends BaseAdapter {
    private List<ItemSteam> items ;
    private ImageLoader imageLoader;
    private Context context;
    private DisplayImageOptions options;
    private List<String> price;
    private ListView listview;
    ViewHolder holder = null;

    public ShelvesItemAdapter(Context context, List<ItemSteam> items){
        this.context = context;
        price = new ArrayList<String>();
        this.items = items;
        this.imageLoader = ImageLoader.getInstance();


        options = new DisplayImageOptions.Builder()
                .showImageOnLoading(R.drawable.item_bg) // 设置图片下载期间显示的图片
                .showImageForEmptyUri(R.drawable.item_bg) // 设置图片Uri为空或是错误的时候显示的图片
                .showImageOnFail(R.drawable.item_bg) // 设置图片加载或解码过程中发生错误显示的图片
                .cacheInMemory(true) // 设置下载的图片是否缓存在内存中
                .cacheOnDisk(true) // 设置下载的图片是否缓存在SD卡中
//                .displayer(new RoundedBitmapDisplayer(20)) // 设置成圆角图片
                .build(); // 构建完成


    }

    @Override
    public int getCount() {
        return items.size();
    }
    @Override
    public Object getItem(int position) {
        return items.get(position);
    }
    @Override
    public long getItemId(int position) {
        return 0;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
//        if (listview != null) {
//            listview = (Listview) parent;
//        }

        if (convertView == null) {
            view = LayoutInflater.from(context).inflate(R.layout.shelves_item, null);
            holder = new ViewHolder();
            holder.imageView = view.findViewById(R.id.item_img);
            holder.hashname = view.findViewById(R.id.sell_hashname);
            holder.sp = view.findViewById(R.id.sp);
            holder.put_price = view.findViewById(R.id.put_price);
            view.setTag(holder);
        } else {
            view = convertView;
            holder = (ViewHolder) convertView.getTag();
        }
        ItemSteam item = items.get(position);
        holder.hashname.setText(item.getMarket_hash_name());
        holder.sp.setText(item.getSuggested_price());
//        String p = price.get(position);
//        if (p != null) {
//            holder.put_price.setText(p);
//        }
        imageLoader.displayImage(item.getImage(), holder.imageView);

        return view;
    }

    class ViewHolder {
        ImageView imageView;
        TextView hashname;
        TextView sp;
        EditText put_price;
    }

}
