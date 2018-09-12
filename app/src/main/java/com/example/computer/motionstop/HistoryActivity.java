package com.example.computer.motionstop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class HistoryActivity extends AppCompatActivity {
    TextView  detailTextView;
    ImageButton imb10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        imb10 = findViewById(R.id.imb10);




    }

    public void clickBack(View view) {finish();}

    }

