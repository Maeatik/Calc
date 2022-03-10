package com.example.calculator;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainMenuActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        Button calcButton = findViewById(R.id.buttonCalc);
        Button animeButton = findViewById(R.id.buttonAnime1);
        Button animeListButton = findViewById(R.id.buttonAnime2);


        calcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainMenuActivity.this, CalculatorActivity.class);
                startActivity(intent);
            }
        });

        animeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainMenuActivity.this, AnimeActivity.class);
                startActivity(intent);
            }
        });

        animeListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainMenuActivity.this, NewAnimeActivity.class);
                startActivity(intent);
            }
        });

    }
}
