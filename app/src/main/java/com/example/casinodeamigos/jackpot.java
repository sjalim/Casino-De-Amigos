package com.example.casinodeamigos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class jackpot extends AppCompatActivity implements View.OnClickListener {
    Button jackpot;
    EditText betText,guessedNum,nameText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jackpot);
        jackpot = (Button)findViewById(R.id.jackpotButton);
        jackpot.setOnClickListener(this);
        betText =(EditText)findViewById(R.id.betText);
        guessedNum =(EditText)findViewById(R.id.guessNumText);
        nameText =(EditText)findViewById(R.id.enterName);




    }

    @Override
    public void onClick(View v) {

        String bet = betText.getText().toString();
        String guess = guessedNum.getText().toString();
        String name = nameText.getText().toString();

        Intent wheelPage = new Intent(jackpot.this,result.class);
        wheelPage.putExtra("bet",bet);
        wheelPage.putExtra("guessedNum",guess);
        wheelPage.putExtra("name",name);



        startActivity(wheelPage);

    }
}
