package com.example.bitskins.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.util.Log;
import android.util.LruCache;
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
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.display.RoundedBitmapDisplayer;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

public class InventoryItemAdapter extends BaseAdapter {
    private List<ItemSteam> inventoryData;
    private Context context;
    private ListView listview;
    private LruCache<String, BitmapDrawable> mImageCache;
    private DisplayImageOptions options;
    private ImageLoader imageLoader;
    ViewHolder holder = null;
    private int sell_Quantity = 0;


    public InventoryItemAdapter(Context context,List<ItemSteam> inventoryData){
        this.context = context;
        this.inventoryData = inventoryData;
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

    public View getView(final int postition, View convertView, ViewGroup viewGroup) {

        View view;
        if (listview != null) {
            listview = (ListView) viewGroup;
        }

        if (convertView == null) {
            view = LayoutInflater.from(context).inflate(R.layout.inventory_item, null);
            holder = new ViewHolder();
            holder.imageView1 = view.findViewById(R.id.image1);
            holder.imageView2 = view.findViewById(R.id.image2);
//            TextView imagetext1 = view.findViewById(R.id.imagetext1);
//            TextView imagetext2 = view.findViewById(R.id.imagetext2);
            holder.select1 = view.findViewById(R.id.select1);
            holder.select2 = view.findViewById(R.id.select2);
            holder.hashname1 = view.findViewById(R.id.mkhashname1);
            holder.hashname2 = view.findViewById(R.id.mkhashname2);
            holder.price1 = view.findViewById(R.id.price1);
            holder.price2 = view.findViewById(R.id.price2);
            view.setTag(holder);
        } else {
            view = convertView;
            holder = (ViewHolder) convertView.getTag();
        }

        Log.d("iia", "run");
        Log.d("iia", "size:" + inventoryData.size()+inventoryData.get(postition).getMarket_hash_name());

        holder.hashname1.setText(inventoryData.get(postition*2).getMarket_hash_name());
        holder.hashname2.setText(inventoryData.get(postition*2+1).getMarket_hash_name());
        holder.price1.setText("$" +inventoryData.get(postition*2).getSuggested_price());
        holder.price2.setText("$" +inventoryData.get(postition*2+1).getSuggested_price());
        imageLoader.displayImage(inventoryData.get(postition*2).getImage(), holder.imageView1, options);
        imageLoader.displayImage(inventoryData.get(postition*2+1).getImage(), holder.imageView2, options);
        if (inventoryData.get(postition * 2).getSelect() == true) {
            holder.select1.setVisibility(View.VISIBLE);
        } else {
            holder.select1.setVisibility(View.GONE);
        }
        if (inventoryData.get(postition * 2+1).getSelect() == true) {
            holder.select2.setVisibility(View.VISIBLE);
        } else {
            holder.select2.setVisibility(View.GONE);
        }
        holder.imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean flag = inventoryData.get(postition * 2).getSelect();
                if (flag) {
                    inventoryData.get(postition * 2).setSelect(false);
                    sell_Quantity-=1;
                } else {
                    inventoryData.get(postition * 2).setSelect(true);
                    sell_Quantity+=1;
                }
                mOnItemSelectListener.onSelectClick(postition*2,!flag);
            }
        });
        holder.imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean flag = inventoryData.get(postition * 2+1).getSelect();
                if (flag) {
                    inventoryData.get(postition * 2+1).setSelect(false);
                    sell_Quantity-=1;
                } else {
                    inventoryData.get(postition * 2+1).setSelect(true);
                    sell_Quantity+=1;
                }
                mOnItemSelectListener.onSelectClick(postition*2+1,!flag);
            }
        });


        return view;
    }

    public interface onItemSelectListener {
        void onSelectClick(int i,boolean flag);
    }
    private onItemSelectListener mOnItemSelectListener;

    public void setOnItemSelectClickListener(onItemSelectListener mOnItemSelectListener) {
        this.mOnItemSelectListener = mOnItemSelectListener;
    }




    class ViewHolder{
        TextView hashname1;
        TextView hashname2;
        TextView price1;
        TextView price2;
        ImageView imageView1;
        ImageView imageView2;
        ImageView select1;
        ImageView select2;
    }




    class ImageTask extends AsyncTask<String, Void, BitmapDrawable> {
        private String imageUrl;

        protected BitmapDrawable doInBackground(String... params) {
            imageUrl = params[0];
            Bitmap bitmap = downloadImage();
            BitmapDrawable db = new BitmapDrawable(listview.getResources(), bitmap);

            if (mImageCache.get(imageUrl) == null) {
                mImageCache.put(imageUrl, db);
            }

            return db;

        }

        protected void onPostExecute(BitmapDrawable result) {
            ImageView iv = (ImageView) listview.findViewWithTag(imageUrl);
            if (iv != null && result != null) {
                iv.setImageDrawable(result);
            }
        }



        private Bitmap downloadImage() {
            HttpsURLConnection con = null;
            Bitmap bitmap = null;
            try {
                URL url = new URL(imageUrl);
                con = (HttpsURLConnection) url.openConnection();
                con.setConnectTimeout(5 * 1000);
                con.setReadTimeout(10 * 1000);
                bitmap = BitmapFactory.decodeStream(con.getInputStream());
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (con != null) {
                    con.disconnect();
                }
            }
            return bitmap;
        }
    }

}
