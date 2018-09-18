package com.example.computer.motionstop;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Meat1Activity extends AppCompatActivity {
    MediaPlayer mediaPlayer;//สำหรับเล่นเสียง

    TextView titleTextView, detailTextView;
    ImageView signImageView,ImageView;
    ImageButton imb2,imb3,btn02,volumnImageButton;
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
        imb2 = findViewById(R.id.imb2);
        imb3 = findViewById(R.id.imb3);
        btn02 = findViewById(R.id.btn02);
        volumnImageButton = findViewById(R.id.volume);
        mediaPlayer = MediaPlayer.create(this, R.raw.mgangoom);
        volumnImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                }else {
                    mediaPlayer.start();

                }

            }
        });

        //รับข้อมูลจากการ Intent ไปแสดงผลบนหน้า XML
        titleTextView.setText(getIntent().getStringExtra("Title"));
        detailTextView.setText(getIntent().getStringExtra("Detail"));
        signImageView.setImageResource(getIntent().getIntExtra("Image",R.drawable.gangoom));
        ImageView.setImageResource(getIntent().getIntExtra("Image2",R.drawable.gangoomm));



    }//end onCreate Method
    public  void clickVdo (View view) {
        Intent vdoIntent = new Intent(Meat1Activity.this, VdoActivity.class);
        startActivity(vdoIntent);

    }
    public void clickBack(View view) {
        finish();
    }
    public  void playSound(View view) {  //ชนิดview ตัวแปรview
        mediaPlayer.start();
    }//end playSound Method
}//end Class