package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText n1,n2;
    Button p,m,ml,d;
    TextView ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1=findViewById(R.id.n1);
        n2=findViewById(R.id.n2);
        p=findViewById(R.id.p);
        m=findViewById(R.id.m);
        ml=findViewById(R.id.ml);
        d=findViewById(R.id.d);
        ans=findViewById(R.id.answer);
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=n1.getText().toString();
                String s2=n2.getText().toString();
                int sn1=Integer.parseInt(s1);
                int sn2=Integer.parseInt(s2);
                int a=sn1+sn2;
                ans.setText(a);
            }
        });
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sn1=Integer.parseInt(n1.getText().toString());
                int sn2=Integer.parseInt(n2.getText().toString());
                int a=sn1-sn2;
                ans.setText(a);
            }
        });
        ml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sn1=Integer.parseInt(n1.getText().toString());
                int sn2=Integer.parseInt(n2.getText().toString());
                int a=sn1*sn2;
                ans.setText(a);
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sn1=Integer.parseInt(n1.getText().toString());
                int sn2=Integer.parseInt(n2.getText().toString());
                int a=sn1/sn2;
                ans.setText(a);
            }
        });




    }
}