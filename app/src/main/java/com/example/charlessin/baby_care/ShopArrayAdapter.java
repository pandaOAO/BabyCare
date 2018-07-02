package com.example.charlessin.baby_care;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class ShopArrayAdapter extends ArrayAdapter<ShopItem> {

    Context context;

    public ShopArrayAdapter(Context context,ArrayList<ShopItem> items){
        super(context,0,items);
        this.context = context;
    }

    @Override
    public View getView(int position,View convertView,ViewGroup parent){
        LayoutInflater inflater = LayoutInflater.from(context);
        LinearLayout itemlayout = null;
        if(convertView == null){
            itemlayout = (LinearLayout)inflater.inflate(R.layout.listview_shop,null);
        }
        else{
            itemlayout = (LinearLayout)convertView;
        }

        ShopItem item = getItem(position);

        TextView tv_name = itemlayout.findViewById(R.id.itemtv);
        tv_name.setText(item.name);
        ImageView iv = itemlayout.findViewById(R.id.itemiv);
        iv.setImageResource(item.image);
        return itemlayout;
    }

}

