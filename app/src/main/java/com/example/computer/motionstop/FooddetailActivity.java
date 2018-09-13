package com.example.computer.motionstop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class FooddetailActivity extends AppCompatActivity {

    private int[] ints2= new int[]{R.drawable.vbuaroy};
    private int[] ints3= new int[]{R.drawable.vkaya};
    //private int[] ints4= new int[]{R.drawable.vlam};
   // private int[] ints5= new int[]{R.drawable.vping};
  //  private int[] ints6= new int[]{R.drawable.vtong};



    ImageView imgpImageView,imgpImage1View,imgppImageView;
    ImageButton imb2;
    private int i;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fooddetail);

        imgpImageView = findViewById(R.id.img1);
        imgpImage1View = findViewById(R.id.img1);
        imgppImageView = findViewById(R.id.im1);

        imb2 = findViewById(R.id.imb2);
        imgpImageView.setImageResource(getIntent().getIntExtra("Image2", R.drawable.vbuaroy));
        imgpImage1View.setImageResource(getIntent().getIntExtra("Image3", R.drawable.vkaya));
        // imgpImageView.setImageResource(getIntent().getIntExtra("Image4", R.drawable.vlam));
        //imgpImageView.setImageResource(getIntent().getIntExtra("Image5", R.drawable.vping));
        // imgpImageView.setImageResource(getIntent().getIntExtra("Image6", R.drawable.vtong));

    }

        public void onItemClick( View view, int i,long l) {
        Intent detailIntent = new Intent(FooddetailActivity.this, FooddetailActivity.class);
        detailIntent.putExtra("Image2", ints2[i]);
       // detailIntent.putExtra("Image3", ints3[i]);
       // detailIntent.putExtra("Image4", ints4[i]);
       // detailIntent.putExtra("Image5", ints5[i]);
       // detailIntent.putExtra("Image6", ints6[i]);
        startActivity(detailIntent);
        }

    public void onItemClick1( View view, int i,long l) {
        Intent detailIntent = new Intent(FooddetailActivity.this, FooddetailActivity.class);
        detailIntent.putExtra("Image3", ints3[i]);
        startActivity(detailIntent);
    }




    public void clickBack(View view) {
        finish();
    }
}
