package com.example.casinodeamigos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    LinearLayout lay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    lay = findViewById(R.id.background);
    lay.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent menuPage = new Intent(MainActivity.this,menu.class);
        startActivity(menuPage);
    }
}
