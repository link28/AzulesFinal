package edu.itchii.plat2.azulesfinal;


import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;


public class Mapa extends FragmentActivity implements OnMapReadyCallback {

    private static final LatLng Catedral = new LatLng(28.635917,-106.077361);
    private static final LatLng Congreso = new LatLng(28.6368499, -106.07704590000003);
    private static final LatLng Hotel  = new LatLng(28.6353093, -106.07773450000002);


    private Marker mCatedral;
    private Marker mCongreso;
    private Marker mHotel;
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);

        SupportMapFragment mapFragment =
                (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.mapa);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap map) {
        mMap = map;


        mCatedral = mMap.addMarker(new MarkerOptions()
                .position(Catedral)
                .title("Catedral"));

        mCatedral.setTag(0);

        mCongreso = mMap.addMarker(new MarkerOptions()
                .position(Congreso)
                .title("Congreso del estado"));
        mCongreso.setTag(0);

        mHotel = mMap.addMarker(new MarkerOptions()
                .position(Hotel)
                .title("Hotel Qualityn"));
        mHotel.setTag(0);




    }




}


















/* @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);
        // Obtenemos el mapa de forma asíncrona (notificará cuando esté listo)
        SupportMapFragment mapFragment = (SupportMapFragment)
                getSupportFragmentManager().findFragmentById(R.id.mapa);
        mapFragment.getMapAsync(this);
    }*/



































    /*@Override
    public void onMapReady(GoogleMap googleMap) {
        GoogleMap map = googleMap;
        LatLng UPV = new LatLng(39.481106, -0.340987); //Nos ubicamos en la UPV
        map.addMarker(new MarkerOptions().position(UPV).title("Marker UPV"));
        map.moveCamera(CameraUpdateFactory.newLatLng(UPV));
    }*/

   /* @Override
    public void onMapReady(GoogleMap map) {
        map.addMarker(new MarkerOptions()
                .position(new LatLng(10, 10))
                .title("Hello world"));
    }*/







//oswald-168923 id del proyecto
// clave api  AIzaSyBQcOMhmOY9brCPc6sDVcUllgA5ELq5-WA