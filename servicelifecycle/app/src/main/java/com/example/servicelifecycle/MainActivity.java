package com.example.servicelifecycle;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;


public class MainActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);}

        public void startService(View view) {
            startService(new Intent(getBaseContext(),MyServices.class));
        }

        // Method to stop the service
        public void stopService(View view) {
            stopService(new Intent(getBaseContext(),MyServices.class));
    }
}