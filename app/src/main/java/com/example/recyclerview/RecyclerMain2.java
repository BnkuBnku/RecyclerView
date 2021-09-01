package com.example.recyclerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.*;


public class RecyclerMain2 extends AppCompatActivity {

    TextView departmentHolder;
    TextView coursefullHolder;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_main2);
        departmentHolder = findViewById(R.id.textView3);
        coursefullHolder = findViewById(R.id.textView4);


        Intent i = getIntent();
        departmentHolder.setText(i.getStringExtra("department"));
        coursefullHolder.setText(i.getStringExtra("full"));


    }
}