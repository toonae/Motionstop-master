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

    }//end
        public void clickLink (View view) {
            Intent historyIntent = new Intent(MainActivity.this, HistoryActivity.class);
            startActivity(historyIntent);
    }//end
        public  void clickMeat (View view){
            Intent MeatIntent = new Intent(MainActivity.this, MeatActivity.class);
            startActivity(MeatIntent);
        }//end

}

