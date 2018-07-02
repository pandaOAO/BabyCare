package com.example.charlessin.baby_care;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class ChoosedAreaArrayAdapter extends ArrayAdapter<ChoosedAreaItem> {

    Context mContex;
    public ChoosedAreaArrayAdapter(@NonNull Context context, List<ChoosedAreaItem> hotels) {
        super(context, 0, hotels);
        this.mContex = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(mContex);
        LinearLayout itemlayout = null;

        if (convertView == null){
            itemlayout = (LinearLayout) inflater.inflate(R.layout.choosed_area_item, null);
        } else {
            itemlayout = (LinearLayout) convertView;
        }

        ChoosedAreaItem hotel = (ChoosedAreaItem) getItem(position);


        TextView name = itemlayout.findViewById(R.id.tv_name);
        name.setText(hotel.getName());
        TextView add = itemlayout.findViewById(R.id.tv_add);
        add.setText(hotel.getAdd());
        TextView tel = itemlayout.findViewById(R.id.tv_tel);
        tel.setText(hotel.getTel());

        return itemlayout;
    }
}
