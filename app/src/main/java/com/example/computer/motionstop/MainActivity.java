package com.example.computer.motionstop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private String[]  detailStrings;
    ImageButton imb6,imb7,imb8,imb9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imb6 = findViewById(R.id.imb6);
        imb7 = findViewById(R.id.imb7);
        imb8 = findViewById(R.id.imb8);
        imb9 = findViewById(R.id.imb9);

    }//end
        public void clickLink (View view) {
            Intent historyIntent = new Intent(MainActivity.this, HistoryActivity.class);
            startActivity(historyIntent);
    }//end
        public  void clickMeat (View view){
            Intent MeatIntent = new Intent(MainActivity.this, MeatActivity.class);
            startActivity(MeatIntent);
    }//end
        public  void clickSweet (View view) {
            Intent SweetIntent = new Intent(MainActivity.this, SweetActivity.class);
            startActivity(SweetIntent);
        }//end
    public  void clickFruit (View view) {
        Intent FruitIntent = new Intent(MainActivity.this, FruitActivity.class);
        startActivity(FruitIntent);
    }
}

