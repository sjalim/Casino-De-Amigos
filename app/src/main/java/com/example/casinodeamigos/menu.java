package com.example.casinodeamigos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu extends AppCompatActivity implements View.OnClickListener {
    Button startButton,scorebutton,aboutbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        startButton =(Button)findViewById(R.id.startButton);
        scorebutton =(Button) findViewById(R.id.scoreButton);
        aboutbutton =(Button)findViewById(R.id.aboutButton);

        startButton.setOnClickListener(this);
        scorebutton.setOnClickListener(this);
        aboutbutton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent action;

        if(v.getId()==R.id.startButton) {
            action = new Intent(menu.this,jackpot.class);
            startActivity(action);

        }
        else if(v.getId()==R.id.scoreButton)
        {
            action = new Intent(menu.this,score.class);
            startActivity(action);

        }
        else if(v.getId()==R.id.aboutButton)
        {
            action = new Intent(menu.this,about.class);
            startActivity(action);

        }

    }
}
