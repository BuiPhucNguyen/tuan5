package com.example.tuan5demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<Donut> listDonut;
    AdapterDonut adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.listDonut);
        listDonut = new ArrayList<>();

        listDonut.add(new Donut("Tasty Donut","Spicy tasty donut family","$10.00",R.drawable.donutyellow));
        listDonut.add(new Donut("Pink Donut","Spicy tasty donut family","$20.00",R.drawable.tastydonut));
        listDonut.add(new Donut("Floating Donut","Spicy tasty donut family","$30.00",R.drawable.greendonut));
        listDonut.add(new Donut("Tasty Donut","Spicy tasty donut family","$40.00",R.drawable.donutred));

        adapter = new AdapterDonut(this,R.layout.layout_donut_item, listDonut);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(MainActivity.this, DonutActivity.class);
                Bundle b = new Bundle();

                b.putString("name", listDonut.get(position).txtName);
                b.putString("note",listDonut.get(position).txtNote);
                b.putString("money",listDonut.get(position).txtMoney);
                b.putInt("img",listDonut.get(position).imgImage);

                i.putExtras(b);
                startActivity(i);
            }
        });
    }
}