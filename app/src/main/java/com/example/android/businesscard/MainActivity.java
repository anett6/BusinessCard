package com.example.android.businesscard;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void findAddress(View view) {

        //Create a URI from an intent string. Use the result to create an Intent.
        //geo: to display a map at the specified location
        //q=a place to highlight on the map, String should be URL-escaped, without spaces
        Uri gmmIntentUri = Uri.parse("geo:0,0?q=1B, Building+5, Chiswick+Business+Park, 566+Chiswick+High+Rd, Chiswick, London W4+5YA, United Kingdom");
        //Create an Intent from gmmIntentUri. Set the action to ACTION_VIEW.
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        //Make the Intent explicit by setting the Google Maps package
        mapIntent.setPackage("com.google.android.apps.maps");
        if (mapIntent.resolveActivity(getPackageManager()) != null) {
            //Attempt to start an activity that can handle the Intent
            startActivity(mapIntent);
        }
    }
}
