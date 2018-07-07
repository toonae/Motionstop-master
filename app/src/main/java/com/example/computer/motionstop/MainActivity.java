package com.example.computer.motionstop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

public class MainActivity extends AppCompatActivity {

    private String[]  detailStrings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
        public void clickLink (View view) {
            Intent aboutmeIntent = new Intent(MainActivity.this, HistoryActivity.class);
            startActivity(aboutmeIntent);


    }
}
