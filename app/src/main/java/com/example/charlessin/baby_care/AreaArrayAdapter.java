package com.example.charlessin.baby_care;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.charlessin.baby_care.R;

import java.util.List;

public class AreaArrayAdapter extends ArrayAdapter<AreaItem> {

    Context mContex;
    public AreaArrayAdapter(@NonNull Context context, List<AreaItem> hotels) {
        super(context, 0, hotels);
        this.mContex = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(mContex);
        LinearLayout itemlayout = null;

        if (convertView == null){
            itemlayout = (LinearLayout) inflater.inflate(R.layout.area_item, null);
        } else {
            itemlayout = (LinearLayout) convertView;
        }

        AreaItem area = (AreaItem) getItem(position);


        Button name = itemlayout.findViewById(R.id.btn_area);
        name.setText(area.getArea());


        return itemlayout;
    }
}
