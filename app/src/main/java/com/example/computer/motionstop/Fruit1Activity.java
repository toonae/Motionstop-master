package com.example.computer.motionstop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Fruit1Activity extends AppCompatActivity {

    TextView titleTextView, detailTextView;
    ImageView signImageView,ImageView;
    ImageButton imb4,imb5,btn03;
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
        imb4 = findViewById(R.id.imb4);
        imb5 = findViewById(R.id.imb5);
        btn03 = findViewById(R.id.btn03);

        //รับข้อมูลจากการ Intent ไปแสดงผลบนหน้า XML
        titleTextView.setText(getIntent().getStringExtra("Title"));
        detailTextView.setText(getIntent().getStringExtra("Detail"));
        signImageView.setImageResource(getIntent().getIntExtra("Image",R.drawable.chid));
        ImageView.setImageResource(getIntent().getIntExtra("Image9",R.drawable.chidd));


    }//end onCreate Method

    public void clickBack(View view) {
        finish();
    }

}//end Class