package com.example.computer.motionstop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Sweet1Activity extends AppCompatActivity {

    TextView titleTextView, detailTextView;
    ImageView signImageView;
    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sweet1);

        //Initial View ผูกตัวแปรบน JAVA กับ XML
        titleTextView = findViewById(R.id.txvTitle1);
        detailTextView = findViewById(R.id.txvDetail1);
        signImageView = findViewById(R.id.imvSign1);

        //รับข้อมูลจากการ Intent ไปแสดงผลบนหน้า XML
        titleTextView.setText(getIntent().getStringExtra("topic"));
        detailTextView.setText(getIntent().getStringExtra("data"));
        signImageView.setImageResource(getIntent().getIntExtra("Image",R.drawable.bua));


    }//end onCreate Method



}//end Class