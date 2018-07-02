package com.example.charlessin.baby_care;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * 托婴服务。
 */

public class ServiceActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    private String[] title ={
            "臺中市私立勁寶兒福安托嬰中心",
            "臺中市私立奇蒙兒托嬰中心",
            "臺中市私立卡吉雅比托嬰中心",
            "臺中市私立小蝸牛托嬰中心",
            "臺中市私立小熊多元智慧托嬰中心",
            "臺中市私立至善寶貝園托嬰中心",
            "臺中市私立巧比兒托嬰中心",
            "臺中市私立欣兒托嬰中心",
            "臺中市私立小蘋果托嬰中心",
            "臺中市私立延康托嬰中心(104.01.01-104.12.31停業)",
            "臺中市私立巨采托嬰中心",
            "臺中市私立福星兒托嬰中心",
            "臺中市私立今久托嬰中心",
            "臺中市私立劍聲托嬰中心",
            "臺中市私立李家槥托嬰中心",
            "臺中市私立格安托嬰中心",
            "臺中市私立欣米兒托嬰中心",
            "臺中市私立臺中榮民總醫院附設中榮托嬰中心",
            "臺中市私立雲上太陽托嬰中心",
            "臺中市私立小熊多元智慧上安托嬰中心",
            "臺中市私立格安諾予托嬰中心"};

    private double[] fx ={24.1813311,
            24.167622,
            24.1804643,
            24.187097,
            24.1692773,
            24.1720749,
            24.184983,
            24.173666,
            24.1854379,
            24.188667,
            24.1869762,
            24.17308,
            24.1689299,
            24.1602359,
            24.177933,
            24.1790679,
            24.186339,
            24.189626,
            24.171421,
            24.1691811,
            24.1846282};
    private double[] fy={
            120.619477
            ,120.6616923
            ,120.61982
            ,120.6095499
            ,120.6383213
            ,120.6383193
            ,120.6158283
            ,120.6412283
            ,120.6154064
            ,120.6169873
            ,120.6170385
            ,120.6453993
            ,120.6539323
            ,120.6471233
            ,120.6382263
            ,120.614906
            ,120.6172926
            ,120.6078203
            ,120.640076
            ,120.6380038
            ,120.6157515
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera

        LatLng fcu = new LatLng(24.1801318,120.6461069);
        mMap.addMarker(new MarkerOptions().position(fcu).title("逢甲大學"));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(fcu));

        for (int i=0; i<21; i++){
            addMarker(title[i],fx[i],fy[i]);
        }
    }

    private void addMarker(String title, double fx, double fy){
        LatLng fcu = new LatLng(fx,fy);
        mMap.addMarker(new MarkerOptions().position(fcu).title(title));
    }
}
