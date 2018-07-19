package com.example.computer.motionstop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Fruit1Activity extends AppCompatActivity {

    TextView titleTextView, detailTextView;
    ImageView signImageView,ImageView;
    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit1);

        //Initial View ผูกตัวแปรบน JAVA กับ XML
        titleTextView = findViewById(R.id.txvTitle9);
        detailTextView = findViewById(R.id.txvDetail9);
        signImageView = findViewById(R.id.img);
        ImageView = findViewById(R.id.img9);

        //รับข้อมูลจากการ Intent ไปแสดงผลบนหน้า XML
        titleTextView.setText(getIntent().getStringExtra("Title"));
        detailTextView.setText(getIntent().getStringExtra("Detail"));
        signImageView.setImageResource(getIntent().getIntExtra("Image",R.drawable.chid));
        ImageView.setImageResource(getIntent().getIntExtra("Image9",R.drawable.chidd));


    }//end onCreate Method



}//end Class