package com.example.computer.motionstop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Sweet1Activity extends AppCompatActivity {

    TextView titleTextView, detailTextView;
    ImageView signImageView,ImageView,ImageView1;
    ImageButton imb,imb1;
    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sweet1);

        //Initial View ผูกตัวแปรบน JAVA กับ XML
        titleTextView = findViewById(R.id.txvTitle1);
        detailTextView = findViewById(R.id.txvDetail1);
        signImageView = findViewById(R.id.imvSign1);
        ImageView = findViewById(R.id.imvSign3);
        ImageView1 = findViewById(R.id.imgt);
        imb = findViewById(R.id.imb);
        imb1 = findViewById(R.id.imb1);

        //รับข้อมูลจากการ Intent ไปแสดงผลบนหน้า XML
        titleTextView.setText(getIntent().getStringExtra("topic"));
        detailTextView.setText(getIntent().getStringExtra("data"));

        signImageView.setImageResource(getIntent().getIntExtra("Image",R.drawable.bua));
        ImageView.setImageResource(getIntent().getIntExtra("Image1",R.drawable.buaa));



    }//end onCreate Method

    public  void clickfoodtail (View view) {
        Intent foodtailIntent = new Intent(Sweet1Activity.this, FooddetailActivity.class);
        startActivity(foodtailIntent);
    }
}//end Class