package com.example.charlessin.baby_care;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class ChoosedAreaActivity extends AppCompatActivity {

    private String choosedArea;
    private static final int LIST_HOTEL = 1;
    private ChoosedAreaArrayAdapter adapter = null;

    //??????????????????????到底幹嘛用的

    private Handler handler = new Handler(){
        public void handleMessage(Message message){
            switch(message.what){
                case LIST_HOTEL:{
                    List<ChoosedAreaItem> hotels = (List<ChoosedAreaItem>) message.obj;
                    refreshHotelList(hotels);
                    break;
                }
            }
        }
    };

    private void refreshHotelList(List<ChoosedAreaItem> hotels){
        adapter.clear();
        adapter.addAll(hotels);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosed_area);

        Intent intent = getIntent();
        choosedArea = intent.getStringExtra("CHOOSED_AREA");

        ListView lvHotel = (ListView) findViewById(R.id.lv_choosed_area);
        adapter = new ChoosedAreaArrayAdapter(this, new ArrayList<ChoosedAreaItem>());
        lvHotel.setAdapter(adapter);

        getHotelFromFirebase();
    }
    class FirebaseThread extends Thread{

        private DataSnapshot dataSnapshot;

        public FirebaseThread(DataSnapshot dataSnapshot){
            this.dataSnapshot = dataSnapshot;
        }

        @Override
        public void run() {
            //super.run();

            List<ChoosedAreaItem> lsHotel = new ArrayList<>();

            for (DataSnapshot ds : dataSnapshot.getChildren()){

                DataSnapshot dsArea = ds.child("Area");
                String area = (String) dsArea.getValue();
                if (area.equals(choosedArea)){

                    DataSnapshot dsName = ds.child("Name");
                    String name = (String) dsName.getValue();
                    DataSnapshot dsAdd = ds.child("Add");
                    String add = (String) dsAdd.getValue();
                    DataSnapshot dsTel = ds.child("Tel");
                    String tel = (String) dsTel.getValue();

                    Log.v("ChoosedArea", area + ";" + name + ";" + add + ";" + tel);

                    //讀取圖片



                    ChoosedAreaItem aHotel = new ChoosedAreaItem(name, add, tel);
                    lsHotel.add(aHotel);
                    //aHotel.setImgUrl(img);
                }




            }

            Message message = new Message();
            message.what = LIST_HOTEL;
            message.obj = lsHotel;
            handler.sendMessage(message);
        }
    }


    private void getHotelFromFirebase(){

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("");        //????????????
        myRef.addValueEventListener(
                new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {

                        new FirebaseThread(dataSnapshot).start();

                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                        Log.v("Hotel",databaseError.getMessage());
                    }
                }
        );

    }
}
