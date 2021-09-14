package com.example.ass1_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

   TextView user,pass,email,contact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        user=findViewById(R.id.u2);
        pass=findViewById(R.id.p2);
        email=findViewById(R.id.e2);
        contact=findViewById(R.id.c2);

        Intent i=getIntent();
        String suser=i.getExtras().getString("u1");
        String spass=i.getExtras().getString("p1");;
        String semail=i.getExtras().getString("e1");
        String scontact=i.getExtras().getString("c1");
        Log.d("pavan",suser+"23");
        Log.d("pavan","afrefsfs");
        String t="User name :"+suser;
        Log.d("pavan",t);
        user.setText(t);
        pass.setText("Password :"+spass);
        email.setText("Email :"+semail);
        contact.setText("Contact :"+scontact);
    }

}