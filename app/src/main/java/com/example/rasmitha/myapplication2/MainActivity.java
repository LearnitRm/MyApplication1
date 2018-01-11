package com.example.rasmitha.myapplication2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText ed1, ed2;
    Button b;
    Intent i1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = findViewById(R.id.username);
        ed2 = findViewById(R.id.password);
        b = findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s1 = ed1.getText().toString().trim();
                Bundle bundle = new Bundle();
                bundle.putString("message", s1);
                Intent i1 = new Intent(getApplicationContext(), Main2Activity.class);
                i1.putExtras(bundle);
                startActivity(i1);
            }

        });
    }

}
