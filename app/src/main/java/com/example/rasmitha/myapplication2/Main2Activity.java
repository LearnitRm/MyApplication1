package com.example.rasmitha.myapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle bundle2 = getIntent().getExtras();
        TextView tv = findViewById(R.id.textView);
        String str = bundle2.getString("message");
        tv.setText("Welcome"+" "+ str);

    }
}
