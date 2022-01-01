package com.example.m5l5t3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    void initViews(){
        Button button = (Button) findViewById(R.id.buuton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 open();
            }
        });
    }

    void open(){
        Intent intent = new Intent(this,MainActivity2.class);
        EditText text1 = (EditText) findViewById(R.id.edt1);
        EditText text2 = (EditText) findViewById(R.id.edt2);
        String str1 = text1.getText().toString();
        String str2 = text2.getText().toString();
        intent.putExtra("id", str1);
        intent.putExtra("pw", str2);
        startActivity(intent);
    }
}