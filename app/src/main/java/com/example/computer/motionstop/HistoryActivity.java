package com.example.computer.motionstop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class HistoryActivity extends AppCompatActivity {
    TextView  detailTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        detailTextView = findViewById(R.id.txv9);
        //detailTextView.setText(getIntent().getStringExtra("Detail"));

        TextView label = (TextView) this.findViewById(R.id.txv9);
        String data = (String) label.getText();
        Toast toast = Toast.makeText(this,data,Toast.LENGTH_LONG);


    }

    public void clickBack(View view) {finish();}

    }

