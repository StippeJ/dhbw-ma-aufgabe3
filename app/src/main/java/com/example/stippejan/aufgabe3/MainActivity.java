package com.example.stippejan.aufgabe3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public ArrayList<Animal> animalList = new ArrayList<>();

    public void loadAnimals() {
        Animal wolf = new Animal(R.string.wolf, R.drawable.wolf, 5);
        Animal rabbit = new Animal(R.string.rabbit, R.drawable.rabbit, 3);

        animalList.add(wolf);
        animalList.add(rabbit);
        animalList.add(wolf);
        animalList.add(rabbit);
        animalList.add(wolf);
        animalList.add(rabbit);
        animalList.add(wolf);
        animalList.add(rabbit);
        animalList.add(wolf);
        animalList.add(rabbit);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }
}