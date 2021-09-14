package com.example.temp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText n1;
    private EditText n2;
    private TextView ans;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1=(EditText)findViewById(R.id.n1);
        n2=(EditText)findViewById(R.id.n2);
        ans=(TextView)findViewById(R.id.ans);
        button=(Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nu1=Integer.parseInt(n1.getText().toString());
                int nu2=Integer.parseInt(n2.getText().toString());
                int sum=nu1+nu2;
                ans.setText("Answer :"+String.valueOf(sum));

            }
        });


    }
}