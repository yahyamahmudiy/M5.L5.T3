package com.example.m5l5t3;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.Nullable;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    static final String TAG = MainActivity2.class.toString();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initViews();
    }

    void initViews(){
        TextView txt = findViewById(R.id.text_v1);

        String name = getIntent().getStringExtra("id");
        Log.d(TAG,name);

        txt.setText(name);

        TextView txt1 = findViewById(R.id.text_v2);

        String name1 = getIntent().getStringExtra("pw");
        Log.d(TAG,name1);

        txt1.setText(name1);
    }
}