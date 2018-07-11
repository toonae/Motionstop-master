package com.example.computer.motionstop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class SweetActivity extends AppCompatActivity {
    ListView listView1;
    private String[] titleStrings, detailStrings;
    private int[] ints = new int[]{R.drawable.bua,R.drawable.kaya,R.drawable.nok,
            R.drawable.salim,R.drawable.tong};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sweet);
        listView1 = findViewById(R.id.listView1);
        titleStrings = getResources().getStringArray(R.array.topic);
        detailStrings = getResources().getStringArray(R.array.data);

        MyAdapter1 myAdapter = new MyAdapter1(SweetActivity.this, ints, titleStrings, detailStrings);
        listView1.setAdapter(myAdapter);



        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent detailIntent = new Intent(SweetActivity.this, Sweet1Activity.class);
                detailIntent.putExtra("topic", titleStrings[i]);
                detailIntent.putExtra("data", detailStrings[i]);
                detailIntent.putExtra("Image", ints[i]);
                startActivity(detailIntent);
            }
        });


    }
}