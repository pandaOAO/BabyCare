package com.example.charlessin.baby_care;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;



public class AreaActivity extends AppCompatActivity {


    private static final int LIST_HOTEL = 1;
    private AreaArrayAdapter adapter = null;
    private String[] areaArray = new String[30];

    //??????????????????????到底幹嘛用的

    private Handler handler = new Handler(){
        public void handleMessage(Message message){
            switch(message.what){
                case LIST_HOTEL:{
                    List<AreaItem> hotels = (List<AreaItem>) message.obj;
                    refreshHotelList(hotels);
                    break;
                }
            }
        }
    };

    private void refreshHotelList(List<AreaItem> areas){
        adapter.clear();
        adapter.addAll(areas);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);

        ListView lvHotel = (ListView) findViewById(R.id.lv_area);
        adapter = new AreaArrayAdapter(this, new ArrayList<AreaItem>());
        lvHotel.setAdapter(adapter);
        lvHotel.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "你選擇的是" + areaArray[position], Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(AreaActivity.this, ChoosedAreaActivity.class);
                intent.putExtra("CHOOSED_AREA", areaArray[position]);
                startActivity(intent);
            }
        });

        getAreaFromFirebase();

    }
    class FirebaseThread extends Thread{

        private DataSnapshot dataSnapshot;

        public FirebaseThread(DataSnapshot dataSnapshot){
            this.dataSnapshot = dataSnapshot;
        }

        @Override
        public void run() {
            //super.run();

            List<AreaItem> lsHotel = new ArrayList<>();

            int i = 0 ;
            for (DataSnapshot ds : dataSnapshot.getChildren()){

                DataSnapshot dsArea = ds.child("Area");
                String area = (String) dsArea.getValue();

                boolean isDouble = false;
                for (int j=0;j<i;j++){
                    if (area.equals(areaArray[j])){
                        isDouble = true;
                        break;
                    }
                }

                if (isDouble == false){
                    areaArray[i] = area;
                    i++;
                    Log.v("Area", area);


                    AreaItem aArea = new AreaItem(area);
                    lsHotel.add(aArea);
                }





            }

            Message message = new Message();
            message.what = LIST_HOTEL;
            message.obj = lsHotel;
            handler.sendMessage(message);
        }
    }


    private void getAreaFromFirebase(){

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
