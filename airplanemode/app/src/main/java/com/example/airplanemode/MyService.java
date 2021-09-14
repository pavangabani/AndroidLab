package com.example.airplanemode;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyService extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "AIRPLANE MODE CHANGED.", Toast.LENGTH_LONG).show();
    }
}
