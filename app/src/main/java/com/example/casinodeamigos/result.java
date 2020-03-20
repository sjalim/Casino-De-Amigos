package com.example.casinodeamigos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class result extends AppCompatActivity {
    TextView resText,nameText;
    ImageView left[] = new ImageView[11];
    ImageView right[] = new ImageView[11];
    int betInt, gussedNumInt;
    String bet,guessedNum,name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        resText = (TextView)findViewById(R.id.resultText);
        nameText =(TextView)findViewById(R.id.nameText);

        left[0] = (ImageView) findViewById(R.id.zeroL);
        left[1] = (ImageView) findViewById(R.id.oneL);
        left[2] = (ImageView) findViewById(R.id.twoL);
        left[3] = (ImageView) findViewById(R.id.threeL);
        left[4] = (ImageView) findViewById(R.id.fourL);
        left[5] = (ImageView) findViewById(R.id.fiveL);
        left[6] = (ImageView) findViewById(R.id.sixL);
        left[7] = (ImageView) findViewById(R.id.savenL);
        left[8] = (ImageView) findViewById(R.id.eightL);
        left[9] = (ImageView) findViewById(R.id.nineL);


        right[0] = (ImageView) findViewById(R.id.zeroR);
        right[1] = (ImageView) findViewById(R.id.oneR);
        right[2] = (ImageView) findViewById(R.id.twoR);
        right[3] = (ImageView) findViewById(R.id.threeR);
        right[4] = (ImageView) findViewById(R.id.fourR);
        right[5] = (ImageView) findViewById(R.id.fiveR);
        right[6] = (ImageView) findViewById(R.id.sixR);
        right[7] = (ImageView) findViewById(R.id.saverR);
        right[8] = (ImageView) findViewById(R.id.eightR);
        right[9] = (ImageView) findViewById(R.id.nineR);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
             bet = bundle.getString("bet");
             guessedNum = bundle.getString("guessedNum");
            betInt = Integer.parseInt(bet);
            gussedNumInt = Integer.parseInt(guessedNum);
            name = bundle.getString("name");


        }
        nameText.setText(name);

        Random rand = new Random();
        int randNum = rand.nextInt(100);
        left[1].setVisibility(View.GONE);
        right[1].setVisibility(View.GONE);

        left[0].setVisibility(View.VISIBLE);
        right[0].setVisibility(View.VISIBLE);


        left[2].setVisibility(View.GONE);
        left[3].setVisibility(View.GONE);
        left[4].setVisibility(View.GONE);
        left[5].setVisibility(View.GONE);
        left[6].setVisibility(View.GONE);
        left[7].setVisibility(View.GONE);
        left[8].setVisibility(View.GONE);
        left[9].setVisibility(View.GONE);


        right[2].setVisibility(View.GONE);
        right[3].setVisibility(View.GONE);
        right[4].setVisibility(View.GONE);
        right[5].setVisibility(View.GONE);
        right[6].setVisibility(View.GONE);
        right[7].setVisibility(View.GONE);
        right[8].setVisibility(View.GONE);
        right[9].setVisibility(View.GONE);


        if (gussedNumInt == randNum) {
            resText.setText("JACKPOT!!! Score:"+bet );
            int n1 = gussedNumInt % 10;
            if (gussedNumInt < 10) {
                if(gussedNumInt!=0)
                {
                    right[0].setVisibility(View.GONE);
                }
                if (gussedNumInt == 1) {
                    right[1].setVisibility(View.VISIBLE);
                } else if (gussedNumInt == 2) {
                    right[2].setVisibility(View.VISIBLE);
                } else if (gussedNumInt == 3) {
                    right[3].setVisibility(View.VISIBLE);
                } else if (gussedNumInt == 4) {
                    right[4].setVisibility(View.VISIBLE);
                } else if (gussedNumInt == 5) {
                    right[5].setVisibility(View.VISIBLE);
                } else if (gussedNumInt == 6) {
                    right[6].setVisibility(View.VISIBLE);
                } else if (gussedNumInt == 7) {
                    right[7].setVisibility(View.VISIBLE);
                } else if (gussedNumInt == 8) {
                    right[8].setVisibility(View.VISIBLE);
                } else if (gussedNumInt == 9) {
                    right[9].setVisibility(View.VISIBLE);
                }
            } else {

                gussedNumInt /= 10;
                if(n1!=0)
                {
                    right[0].setVisibility(View.GONE);
                }
                if (n1 == 1) {
                    right[1].setVisibility(View.VISIBLE);
                } else if (n1 == 2) {
                    right[2].setVisibility(View.VISIBLE);
                } else if (n1 == 3) {
                    right[3].setVisibility(View.VISIBLE);
                } else if (n1 == 4) {
                    right[4].setVisibility(View.VISIBLE);
                } else if (n1 == 5) {
                    right[5].setVisibility(View.VISIBLE);
                } else if (n1 == 6) {
                    right[6].setVisibility(View.VISIBLE);
                } else if (n1 == 7) {
                    right[7].setVisibility(View.VISIBLE);
                } else if (n1 == 8) {
                    right[8].setVisibility(View.VISIBLE);
                } else if (n1 == 9) {
                    right[9].setVisibility(View.VISIBLE);
                }

                if(gussedNumInt!=0)
                {
                    left[0].setVisibility(View.GONE);
                }
                if (gussedNumInt == 1) {
                    left[1].setVisibility(View.VISIBLE);
                } else if (gussedNumInt == 2) {
                    left[2].setVisibility(View.VISIBLE);
                } else if (gussedNumInt == 3) {
                    left[3].setVisibility(View.VISIBLE);
                } else if (gussedNumInt == 4) {
                    left[4].setVisibility(View.VISIBLE);
                } else if (gussedNumInt == 5) {
                    left[5].setVisibility(View.VISIBLE);
                } else if (gussedNumInt == 6) {
                    left[6].setVisibility(View.VISIBLE);
                } else if (gussedNumInt == 7) {
                    left[7].setVisibility(View.VISIBLE);
                } else if (gussedNumInt == 8) {
                    left[8].setVisibility(View.VISIBLE);
                } else if (gussedNumInt == 9) {
                    left[9].setVisibility(View.VISIBLE);
                }

            }


        } else {
            resText.setText("YOU LOST");

        }

    }
}
