package com.example.computer.motionstop;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

public class VdoActivity extends AppCompatActivity {
    private VideoView videoView1;
    private Button btn11,btn12;
    ImageView imgpaImageView;
    ImageButton imb11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vdo);

        imb11 = findViewById(R.id.imb11);

        //imgpaImageView = findViewById(R.id.img01);


        VideoView myVideoV = (VideoView)findViewById(R.id.videoView1);
        myVideoV.setVideoURI(Uri.parse("android.resource://" + getPackageName() +"/"+R.raw.vdoyam));
        myVideoV.setMediaController(new MediaController(this));
        myVideoV.requestFocus();
        myVideoV.start();

        VideoView myVideo = (VideoView)findViewById(R.id.videoView);
        myVideo.setVideoURI(Uri.parse("android.resource://" + getPackageName() +"/"+R.raw.vdopasom));
        myVideo.setMediaController(new MediaController(this));
        myVideo.requestFocus();
        myVideo.start();

    }
    public void clickBack(View view) {
        finish();
    }
}
