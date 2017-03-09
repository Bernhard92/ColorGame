package com.example.bernhard.colorgame;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class GameActivity extends AppCompatActivity {

    TextView farbLeiste = (TextView) findViewById(R.id.TextfieldColor);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        setColor(farbLeiste);
        farbLeiste.setText(getWord());

    }

    public void buttonListener(View view) {

        farbLeiste.setText(getWord());
        setColor(farbLeiste);

    }

    private String getWord() {
        Random random = new Random();
        int h = random.nextInt(8 - 1) + 1;

        String word = "";

        switch (h) {
            case 1:
                word = "RED";
                break;
            case 2:
                word = "BLUE";
                break;
            case 3:
                word = "GRAY";
                break;
            case 4:
                word = "GREEN";
                break;
            case 5:
                word = "YELLOW";
                break;
            case 6:
                word = "WHITE";
                break;
            case 7:
                word = "BLACK";
                break;
        }
        return word;
    }

    private void setColor(TextView farbleiste) {
        Random random = new Random();
        int h = random.nextInt(8 - 1) + 1;


        switch (h) {
            case 1:
                farbleiste.setTextColor(Color.RED);
                break;
            case 2:
                farbleiste.setTextColor(Color.BLUE);
                break;
            case 3:
                farbleiste.setTextColor(Color.GRAY);
                break;
            case 4:
                farbleiste.setTextColor(Color.GREEN);
                break;
            case 5:
                farbleiste.setTextColor(Color.YELLOW);
                break;
            case 6:
                farbleiste.setTextColor(Color.WHITE);
               break;
            case 7:
                farbleiste.setTextColor(Color.BLACK);
                break;
        }

    }





}
