package com.example.computer.motionstop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Meat1Activity extends AppCompatActivity {

    TextView titleTextView, detailTextView;
    ImageView signImageView,ImageView;
    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meat1);

        //Initial View ผูกตัวแปรบน JAVA กับ XML
        titleTextView = findViewById(R.id.txvTitle);
        detailTextView = findViewById(R.id.txvDetail);
        signImageView = findViewById(R.id.imvSign);
        ImageView = findViewById(R.id.imvSign4);

        //รับข้อมูลจากการ Intent ไปแสดงผลบนหน้า XML
        titleTextView.setText(getIntent().getStringExtra("Title"));
        detailTextView.setText(getIntent().getStringExtra("Detail"));
        signImageView.setImageResource(getIntent().getIntExtra("Image",R.drawable.koi));
        ImageView.setImageResource(getIntent().getIntExtra("Image2",R.drawable.koii));


    }//end onCreate Method



}//end Class