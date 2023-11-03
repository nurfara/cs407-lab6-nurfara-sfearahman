package com.cs407.lab6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity {

    // Bascom Hall's LatLng
    private final LatLng mDestinationLatLng = new LatLng(43.07574513666928, -89.40400707377597);
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // reference the layout XML & retrieve SupportMapFragment
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.fragment_map);
        // Display a marker: use .getMapAsync() to be notified when MapFragment is ready
        mapFragment.getMapAsync(googleMap -> {
            mMap = googleMap;
            // code to display a marker
            googleMap.addMarker(new MarkerOptions().position(mDestinationLatLng).title("Destination"));
        });
    }
}