package com.example.computer.motionstop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Fooddetail1Activity extends AppCompatActivity {
    private int[] ints8 = new int[]{R.drawable.vkaya};


    ImageView im2, img2;
    ImageButton imbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fooddetail1);

        im2 = findViewById(R.id.im2);
        img2 = findViewById(R.id.img2);
        imbtn = findViewById(R.id.imbtn1);

        img2.setImageResource(getIntent().getIntExtra("Image8", R.drawable.vbuaroy));
    }


    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        Intent detail1Intent = new Intent(this, Fooddetail1Activity.class);
        detail1Intent.putExtra("Image2", ints8[i]);
        startActivity(detail1Intent);
    }

}

