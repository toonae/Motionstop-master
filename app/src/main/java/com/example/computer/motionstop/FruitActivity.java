package com.example.computer.motionstop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class FruitActivity extends AppCompatActivity {

    ListView listView;
    private String[] titleStrings, detailStrings;
    private int[] ints = new int[]{R.drawable.chid,R.drawable.tan,R.drawable.jak,
            R.drawable.maprang,R.drawable.mamung};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit);
        listView = findViewById(R.id.listView9);
        titleStrings = getResources().getStringArray(R.array.title9);
        detailStrings = getResources().getStringArray(R.array.detail9);

        MyAdapter9 myAdapter = new MyAdapter9(FruitActivity.this, ints, titleStrings, detailStrings);
        listView.setAdapter(myAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent detailIntent = new Intent(FruitActivity.this, Fruit1Activity.class);
                detailIntent.putExtra("Title", titleStrings[i]);
                detailIntent.putExtra("Detail", detailStrings[i]);
                detailIntent.putExtra("Image", ints[i]);
                startActivity(detailIntent);
            }
        });


    }
}