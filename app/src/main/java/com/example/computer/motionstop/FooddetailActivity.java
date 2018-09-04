package com.example.computer.motionstop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FooddetailActivity extends AppCompatActivity {
    ImageView imgpImageView,imgppImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fooddetail);

        imgpImageView = findViewById(R.id.img1);
        imgpImageView.setImageResource(getIntent().getIntExtra("Image",R.drawable.b));

        imgppImageView= findViewById(R.id.imgv11);
    }

    public void clickBack(View view) {
        finish();
    }
}
