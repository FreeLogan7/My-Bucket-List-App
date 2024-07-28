package com.freedman.mybucketlist;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.freedman.mybucketlist.doing.DoingActivity;
import com.freedman.mybucketlist.places.PlacesActivity;

public class MainActivity extends AppCompatActivity {

    CardView placesToGo;
    CardView thingToDo;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        placesToGo = findViewById(R.id.card_view_places_to_go);
        thingToDo = findViewById(R.id.card_view_things_to_do);


        placesToGo.setOnClickListener(v -> {

            Intent firstIntent = new Intent(MainActivity.this, PlacesActivity.class);
            startActivity(firstIntent);
        });


        thingToDo.setOnClickListener(v -> {
            Intent secondIntent = new Intent(MainActivity.this, DoingActivity.class);
            startActivity(secondIntent);
        });


    }
}