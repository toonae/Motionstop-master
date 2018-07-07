package com.example.computer.motionstop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MeatActivity extends AppCompatActivity {

    ListView listView;
    private String[] titleStrings, detailStrings;
    private int[] ints = new int[]{R.drawable.koi,R.drawable.pal,R.drawable.pork,
            R.drawable.taipla,R.drawable.yam};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meat);
        listView = findViewById(R.id.listView);
        titleStrings = getResources().getStringArray(R.array.title);
        detailStrings = getResources().getStringArray(R.array.detail);

        MyAdapter myAdapter = new MyAdapter(MeatActivity.this, ints, titleStrings, detailStrings);
        listView.setAdapter(myAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> ar0, View ar1, int ar2, long ar3) {
                Intent intent;
                switch (ar2){
                    case 0:
                        intent = new Intent(getApplicationContext(),MeatDetailActivity.class);
                }
            }
        });



    }
}
