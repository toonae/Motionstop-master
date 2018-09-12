package com.example.computer.motionstop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class FooddetailActivity extends AppCompatActivity {
    ImageView imgpImageView,imgppImageView;
    ImageButton imb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fooddetail);

        imgpImageView = findViewById(R.id.img1);
        imb2 = findViewById(R.id.imb2);
        imgpImageView.setImageResource(getIntent().getIntExtra("Image",R.drawable.buaroy));

        imgppImageView= findViewById(R.id.im1);
    }

    public void clickBack(View view) {
        finish();
    }
}
