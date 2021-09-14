package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText n1;
    private EditText n2;
    private Button add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1=(EditText)findViewById(R.id.n1);
        n2=(EditText)findViewById(R.id.n2);
        add=(Button)findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nu1=n1.getText().toString();
                String nu2=n2.getText().toString();
                int in1=Integer.parseInt(nu1);
                int in2=Integer.parseInt(nu2);
                int ans=in1+in2;
                String sans=Integer.toString(ans);
                Toast.makeText(getApplicationContext(),sans,Toast.LENGTH_SHORT).show();
            }
        });
    }
}