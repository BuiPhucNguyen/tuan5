package com.example.tuan5demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DonutActivity extends AppCompatActivity {
    TextView txtName, txtNote, txtMoney;
    ImageView imgImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_donut);

        txtName = findViewById(R.id.txtName);
        txtNote = findViewById(R.id.txtNote);
        txtMoney = findViewById(R.id.txtMoney);
        imgImage = findViewById(R.id.imgImage);

        Intent i = getIntent();
        Bundle b = i.getExtras();

        txtName.setText(b.getString("name"));
        txtNote.setText(b.getString("note"));
        txtMoney.setText(b.getString("money"));
        imgImage.setImageResource(b.getInt("img"));
    }
}