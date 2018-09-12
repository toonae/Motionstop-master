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
    private int[] ints = new int[]{R.drawable.gangoom,R.drawable.pal,R.drawable.tub,
            R.drawable.taipla,R.drawable.yam};
    private int[] ints2= new int[]{R.drawable.gangoomm,R.drawable.pall,R.drawable.tubb,
            R.drawable.taiplaa,R.drawable.yamm};


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
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent detailIntent = new Intent(MeatActivity.this, Meat1Activity.class);
                detailIntent.putExtra("Title", titleStrings[i]);
                detailIntent.putExtra("Detail", detailStrings[i]);
                detailIntent.putExtra("Image", ints[i]);
                detailIntent.putExtra("Image2", ints2[i]);
                startActivity(detailIntent);
            }
        });


    }
}
