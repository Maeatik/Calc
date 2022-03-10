package com.example.calculator;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AnimeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anime);

        Button buttonOpenFirst = findViewById(R.id.buttonOpenFirst);
        Button buttonOpenSecond = findViewById(R.id.buttonOpenSecond);
        Button buttonOpenThird = findViewById(R.id.buttonOpenThird);
        Button buttonBack = findViewById(R.id.buttonBack);

        buttonOpenFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://sovetromantica.com/anime/86-boku-no-hero-academia";
                try{
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);
                } catch (ActivityNotFoundException e) {
                    Toast.makeText(AnimeActivity.this, "Ошибка",  Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                }
            }
        });

        buttonOpenSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://sovetromantica.com/anime/702-domestic-na-kanojo";
                try {
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                     startActivity(i);
                } catch (ActivityNotFoundException e) {
                    Toast.makeText(AnimeActivity.this, "Ошибка",  Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                }
            }
        });

        buttonOpenThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://naruto-base.su/novosti/chjornyj_klever_1_sezon_1_serija/2017-10-02-3275";
                try {
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);
                } catch (ActivityNotFoundException e) {
                    Toast.makeText(AnimeActivity.this, "Ошибка",  Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                }
            }
        });

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(AnimeActivity.this, MainMenuActivity.class);
                startActivity(intent);
            }
        });


    }
}
