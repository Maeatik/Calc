package com.example.calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;

public class NewAnimeActivity extends AppCompatActivity {

    ArrayList<State> states = new ArrayList<>();
    ListView animeList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_anime);
        setInitialData();
        // получаем элемент ListView
        animeList = findViewById(R.id.animeList);
        // создаем адаптер
        StateAdapter stateAdapter = new StateAdapter(this, R.layout.list_item, states);
        // устанавливаем адаптер
        animeList.setAdapter(stateAdapter);
        // слушатель выбора в списке
        System.out.println(111111);
        AdapterView.OnItemClickListener itemListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                // получаем выбранный пункт
                State selectedState = (State)parent.getItemAtPosition(position);
                String url = selectedState.getLink();
                System.out.println(111111);
                System.out.println(selectedState.getLink());
                try{
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(url));
                    startActivity(i);
                } catch (ActivityNotFoundException e) {
                    Toast.makeText(NewAnimeActivity.this, "Ошибка",  Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                }
            }
        };
        animeList.setOnItemClickListener(itemListener);


        Button buttonBack = findViewById(R.id.buttonBack);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(NewAnimeActivity.this, MainMenuActivity.class);
                startActivity(intent);
            }
        });

    }

    private void setInitialData(){

        states.add(new State ("Моя геройская академия", "https://sovetromantica.com/anime/86-boku-no-hero-academia"));
        states.add(new State ("Домашняя девушка", "https://sovetromantica.com/anime/702-domestic-na-kanojo"));
        states.add(new State ("Черный клевер", "https://naruto-base.su/novosti/chjornyj_klever_1_sezon_1_serija/2017-10-02-3275"));
    }
}
