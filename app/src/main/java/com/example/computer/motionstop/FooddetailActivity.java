package com.example.computer.motionstop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ImageView;

public class FooddetailActivity extends AppCompatActivity {

    private int[] ints2 = new int[]{R.drawable.vbuaroy,R.drawable.vkaya};
int i;



    ImageView imgpImageView, imgppImageView;
    ImageButton imb2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fooddetail);

        imgpImageView = findViewById(R.id.img1);
        imgppImageView = findViewById(R.id.im1);
        imb2 = findViewById(R.id.imb2);


       imgpImageView.setImageResource(getIntent().getIntExtra("Image2", R.drawable.vbuaroy));



    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        Intent detailIntent = new Intent(this, FooddetailActivity.class);
        detailIntent.putExtra("Image2",ints2[i]);
        startActivity(detailIntent);

    }





    public void clickBack(View view) {
        finish();
    }


}
