package com.example.connect3app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {







    int player = 1;

    boolean gameover = false;




    public void play(View view){
        ImageView Casilla_1 = (ImageView) findViewById(R.id.Casilla_1);
        ImageView Casilla_2 = (ImageView) findViewById(R.id.Casilla_2);
        ImageView Casilla_3 = (ImageView) findViewById(R.id.Casilla_3);
        ImageView Casilla_4 = (ImageView) findViewById(R.id.Casilla_4);
        ImageView Casilla_5 = (ImageView) findViewById(R.id.Casilla_5);
        ImageView Casilla_6 = (ImageView) findViewById(R.id.Casilla_6);
        ImageView Casilla_7 = (ImageView) findViewById(R.id.Casilla_7);
        ImageView Casilla_8 = (ImageView) findViewById(R.id.Casilla_8);
        ImageView Casilla_9 = (ImageView) findViewById(R.id.Casilla_9);

        switch(view.getId()){
            case R.id.Casilla_1:

                if(!Casilla_1.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.red).getConstantState())
                        && !Casilla_1.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.yellow).getConstantState())
                && gameover == false) {
                    if (player == 1) {
                        Casilla_1.setImageResource(R.drawable.red);
                        player++;
                    } else if (player == 2) {
                        Casilla_1.setImageResource(R.drawable.yellow);
                        player--;
                    }

                    check();

                }

                break;

            case R.id.Casilla_2:

                if(!Casilla_2.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.red).getConstantState())
                        && !Casilla_2.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.yellow).getConstantState())
                        && gameover == false) {
                    if (player == 1) {
                        Casilla_2.setImageResource(R.drawable.red);
                        player++;
                    } else if (player == 2) {
                        Casilla_2.setImageResource(R.drawable.yellow);
                        player--;
                    }

                    check();

                }

                break;

            case R.id.Casilla_3:

                if(!Casilla_3.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.red).getConstantState())
                        && !Casilla_3.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.yellow).getConstantState())
                        && gameover == false) {
                    if (player == 1) {
                        Casilla_3.setImageResource(R.drawable.red);
                        player++;
                    } else if (player == 2) {
                        Casilla_3.setImageResource(R.drawable.yellow);
                        player--;
                    }

                    check();

                }

                break;

            case R.id.Casilla_4:

                if(!Casilla_4.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.red).getConstantState())
                        && !Casilla_4.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.yellow).getConstantState())
                        && gameover == false) {
                    if (player == 1) {
                        Casilla_4.setImageResource(R.drawable.red);
                        player++;
                    } else if (player == 2) {
                        Casilla_4.setImageResource(R.drawable.yellow);
                        player--;
                    }

                    check();

                }

                break;

            case R.id.Casilla_5:

                if(!Casilla_5.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.red).getConstantState())
                        && !Casilla_5.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.yellow).getConstantState())
                        && gameover == false) {
                    if (player == 1) {
                        Casilla_5.setImageResource(R.drawable.red);
                        player++;
                    } else if (player == 2) {
                        Casilla_5.setImageResource(R.drawable.yellow);
                        player--;
                    }

                    check();

                }

                break;

            case R.id.Casilla_6:

                if(!Casilla_6.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.red).getConstantState())
                        && !Casilla_6.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.yellow).getConstantState())
                        && gameover == false) {
                    if (player == 1) {
                        Casilla_6.setImageResource(R.drawable.red);
                        player++;
                    } else if (player == 2) {
                        Casilla_6.setImageResource(R.drawable.yellow);
                        player--;
                    }

                    check();

                }

                break;


            case R.id.Casilla_7:

                if(!Casilla_7.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.red).getConstantState())
                        && !Casilla_7.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.yellow).getConstantState())
                        && gameover == false) {
                    if (player == 1) {
                        Casilla_7.setImageResource(R.drawable.red);
                        player++;
                    } else if (player == 2) {
                        Casilla_7.setImageResource(R.drawable.yellow);
                        player--;
                    }

                    check();

                }

                break;


            case R.id.Casilla_8:

                if(!Casilla_8.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.red).getConstantState())
                        && !Casilla_8.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.yellow).getConstantState())
                        && gameover == false) {
                    if (player == 1) {
                        Casilla_8.setImageResource(R.drawable.red);
                        player++;
                    } else if (player == 2) {
                        Casilla_8.setImageResource(R.drawable.yellow);
                        player--;
                    }

                    check();

                }

                break;


            case R.id.Casilla_9:

                if(!Casilla_9.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.red).getConstantState())
                        && !Casilla_9.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.yellow).getConstantState())
                        && gameover == false) {
                    if (player == 1) {
                        Casilla_9.setImageResource(R.drawable.red);
                        player++;
                    } else if (player == 2) {
                        Casilla_9.setImageResource(R.drawable.yellow);
                        player--;
                    }

                    check();
                }

                break;

        }


    }

    public void check(){
        ImageView Casilla_1 = (ImageView) findViewById(R.id.Casilla_1);
        ImageView Casilla_2 = (ImageView) findViewById(R.id.Casilla_2);
        ImageView Casilla_3 = (ImageView) findViewById(R.id.Casilla_3);
        ImageView Casilla_4 = (ImageView) findViewById(R.id.Casilla_4);
        ImageView Casilla_5 = (ImageView) findViewById(R.id.Casilla_5);
        ImageView Casilla_6 = (ImageView) findViewById(R.id.Casilla_6);
        ImageView Casilla_7 = (ImageView) findViewById(R.id.Casilla_7);
        ImageView Casilla_8 = (ImageView) findViewById(R.id.Casilla_8);
        ImageView Casilla_9 = (ImageView) findViewById(R.id.Casilla_9);
        Button overButton = (Button) findViewById(R.id.overButton);
        TextView winner = (TextView) findViewById(R.id.winner);
        TextView winnerText = (TextView) findViewById(R.id.winnerText);


        if((Casilla_1.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.red).getConstantState()) &&
                Casilla_2.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.red).getConstantState())) &&
                Casilla_3.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.red).getConstantState())
                ||
                (Casilla_4.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.red).getConstantState()) &&
                        Casilla_5.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.red).getConstantState())) &&
                        Casilla_6.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.red).getConstantState())
                ||
                (Casilla_7.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.red).getConstantState()) &&
                        Casilla_8.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.red).getConstantState())) &&
                        Casilla_9.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.red).getConstantState())
                ||
                (Casilla_1.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.red).getConstantState()) &&
                        Casilla_4.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.red).getConstantState())) &&
                        Casilla_7.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.red).getConstantState())
                ||
                (Casilla_2.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.red).getConstantState()) &&
                        Casilla_5.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.red).getConstantState())) &&
                        Casilla_8.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.red).getConstantState())
                ||
                (Casilla_3.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.red).getConstantState()) &&
                        Casilla_6.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.red).getConstantState())) &&
                        Casilla_9.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.red).getConstantState())
                ||
                (Casilla_1.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.red).getConstantState()) &&
                        Casilla_5.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.red).getConstantState())) &&
                        Casilla_9.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.red).getConstantState())
                ||
                (Casilla_3.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.red).getConstantState()) &&
                        Casilla_5.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.red).getConstantState())) &&
                        Casilla_7.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.red).getConstantState())){
            /*
            Red
             */

            winner.setAlpha(1f);
            winnerText.setText("Red");
            winnerText.setAlpha(1f);
            overButton.setAlpha(1f);
            gameover = true;

        }else if((Casilla_1.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.yellow).getConstantState()) &&
                Casilla_2.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.yellow).getConstantState())) &&
                Casilla_3.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.yellow).getConstantState())
                ||
                (Casilla_4.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.yellow).getConstantState()) &&
                        Casilla_5.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.yellow).getConstantState())) &&
                        Casilla_6.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.yellow).getConstantState())
                ||
                (Casilla_7.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.yellow).getConstantState()) &&
                        Casilla_8.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.yellow).getConstantState())) &&
                        Casilla_9.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.yellow).getConstantState())
                ||
                (Casilla_1.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.yellow).getConstantState()) &&
                        Casilla_4.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.yellow).getConstantState())) &&
                        Casilla_7.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.yellow).getConstantState())
                ||
                (Casilla_2.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.yellow).getConstantState()) &&
                        Casilla_5.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.yellow).getConstantState())) &&
                        Casilla_8.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.yellow).getConstantState())
                ||
                (Casilla_3.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.yellow).getConstantState()) &&
                        Casilla_6.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.yellow).getConstantState())) &&
                        Casilla_9.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.yellow).getConstantState())
                ||
                (Casilla_1.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.yellow).getConstantState()) &&
                        Casilla_5.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.yellow).getConstantState())) &&
                        Casilla_9.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.yellow).getConstantState())
                ||
                (Casilla_3.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.yellow).getConstantState()) &&
                        Casilla_5.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.yellow).getConstantState())) &&
                        Casilla_7.getDrawable().getConstantState().equals(getResources().getDrawable(R.drawable.yellow).getConstantState())){
            /*
            Yellow
             */
            winner.setAlpha(1f);
            winnerText.setText("Yellow");
            winnerText.setAlpha(1f);
            overButton.setAlpha(1f);
            gameover = true;

        }else if(!Casilla_1.getDrawable().getConstantState().equals(getResources().getDrawable(android.R.color.transparent).getConstantState())
         && !Casilla_2.getDrawable().getConstantState().equals(getResources().getDrawable(android.R.color.transparent).getConstantState()) &&
        !Casilla_3.getDrawable().getConstantState().equals(getResources().getDrawable(android.R.color.transparent).getConstantState()) &&
                !Casilla_4.getDrawable().getConstantState().equals(getResources().getDrawable(android.R.color.transparent).getConstantState())
        && !Casilla_5.getDrawable().getConstantState().equals(getResources().getDrawable(android.R.color.transparent).getConstantState())
        && !Casilla_6.getDrawable().getConstantState().equals(getResources().getDrawable(android.R.color.transparent).getConstantState())
        && !Casilla_7.getDrawable().getConstantState().equals(getResources().getDrawable(android.R.color.transparent).getConstantState())
        && !Casilla_8.getDrawable().getConstantState().equals(getResources().getDrawable(android.R.color.transparent).getConstantState())
        && !Casilla_9.getDrawable().getConstantState().equals(getResources().getDrawable(android.R.color.transparent).getConstantState())){

            winner.setText("Results: ");
            winner.setAlpha(1f);
            winnerText.setText("Tie");
            winnerText.setAlpha(1f);
            overButton.setAlpha(1f);
            gameover = true;


        }


    }

    public void reset(View view){
        ImageView Casilla_1 = (ImageView) findViewById(R.id.Casilla_1);
        ImageView Casilla_2 = (ImageView) findViewById(R.id.Casilla_2);
        ImageView Casilla_3 = (ImageView) findViewById(R.id.Casilla_3);
        ImageView Casilla_4 = (ImageView) findViewById(R.id.Casilla_4);
        ImageView Casilla_5 = (ImageView) findViewById(R.id.Casilla_5);
        ImageView Casilla_6 = (ImageView) findViewById(R.id.Casilla_6);
        ImageView Casilla_7 = (ImageView) findViewById(R.id.Casilla_7);
        ImageView Casilla_8 = (ImageView) findViewById(R.id.Casilla_8);
        ImageView Casilla_9 = (ImageView) findViewById(R.id.Casilla_9);
        Button overButton = (Button) findViewById(R.id.overButton);
        TextView winner = (TextView) findViewById(R.id.winner);
        TextView winnerText = (TextView) findViewById(R.id.winnerText);

        overButton.setAlpha(0f);
        winner.setAlpha(0f);
        winnerText.setAlpha(0f);

        Casilla_1.setImageResource(android.R.color.transparent);
        Casilla_2.setImageResource(android.R.color.transparent);
        Casilla_3.setImageResource(android.R.color.transparent);
        Casilla_4.setImageResource(android.R.color.transparent);
        Casilla_5.setImageResource(android.R.color.transparent);
        Casilla_6.setImageResource(android.R.color.transparent);
        Casilla_7.setImageResource(android.R.color.transparent);
        Casilla_8.setImageResource(android.R.color.transparent);
        Casilla_9.setImageResource(android.R.color.transparent);
        player = 1;
        gameover = false;

    }

    public void start(){
        ImageView Casilla_1 = (ImageView) findViewById(R.id.Casilla_1);
        ImageView Casilla_2 = (ImageView) findViewById(R.id.Casilla_2);
        ImageView Casilla_3 = (ImageView) findViewById(R.id.Casilla_3);
        ImageView Casilla_4 = (ImageView) findViewById(R.id.Casilla_4);
        ImageView Casilla_5 = (ImageView) findViewById(R.id.Casilla_5);
        ImageView Casilla_6 = (ImageView) findViewById(R.id.Casilla_6);
        ImageView Casilla_7 = (ImageView) findViewById(R.id.Casilla_7);
        ImageView Casilla_8 = (ImageView) findViewById(R.id.Casilla_8);
        ImageView Casilla_9 = (ImageView) findViewById(R.id.Casilla_9);
        Button overButton = (Button) findViewById(R.id.overButton);
        TextView winner = (TextView) findViewById(R.id.winner);
        TextView winnerText = (TextView) findViewById(R.id.winnerText);


        Casilla_1.setImageResource(android.R.color.transparent);
        Casilla_2.setImageResource(android.R.color.transparent);
        Casilla_3.setImageResource(android.R.color.transparent);
        Casilla_4.setImageResource(android.R.color.transparent);
        Casilla_5.setImageResource(android.R.color.transparent);
        Casilla_6.setImageResource(android.R.color.transparent);
        Casilla_7.setImageResource(android.R.color.transparent);
        Casilla_8.setImageResource(android.R.color.transparent);
        Casilla_9.setImageResource(android.R.color.transparent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start();



    }
}