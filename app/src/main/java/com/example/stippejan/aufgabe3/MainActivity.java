package com.example.stippejan.aufgabe3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public ArrayList<Animal> animalList = new ArrayList<>();

    public void loadAnimals() {
        animalList.add(new Animal(R.string.bat, R.drawable.bat, new Random().nextInt(8) + 1));
        animalList.add(new Animal(R.string.bear, R.drawable.bear, new Random().nextInt(8) + 1));
        animalList.add(new Animal(R.string.cat, R.drawable.cat, new Random().nextInt(8) + 1));
        animalList.add(new Animal(R.string.dog, R.drawable.dog, new Random().nextInt(8) + 1));
        animalList.add(new Animal(R.string.fox, R.drawable.fox, new Random().nextInt(8) + 1));
        animalList.add(new Animal(R.string.gorilla, R.drawable.gorilla, new Random().nextInt(8) + 1));
        animalList.add(new Animal(R.string.mouse, R.drawable.mouse, new Random().nextInt(8) + 1));
        animalList.add(new Animal(R.string.panda, R.drawable.panda, new Random().nextInt(8) + 1));
        animalList.add(new Animal(R.string.pig, R.drawable.pig, new Random().nextInt(8) + 1));
        animalList.add(new Animal(R.string.rabbit, R.drawable.rabbit, new Random().nextInt(8) + 1));
        animalList.add(new Animal(R.string.squirrel, R.drawable.squirrel, new Random().nextInt(8) + 1));
        animalList.add(new Animal(R.string.tiger, R.drawable.tiger, new Random().nextInt(8) + 1));
        animalList.add(new Animal(R.string.wolf, R.drawable.wolf, new Random().nextInt(8) + 1));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadAnimals();
    }

    @Override
    protected void onStart() {
        super.onStart();

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        AnimalAdapter animalAdapter = new AnimalAdapter(animalList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        recyclerView.setAdapter(animalAdapter);

        Button addAnimalButton = findViewById(R.id.button_add_animal);
        addAnimalButton.setOnClickListener((v) -> {
            Animal unicorn = new Animal(R.string.unicorn, R.drawable.unicorn, new Random().nextInt(8) + 1);
            animalList.add(unicorn);
            int position = animalList.indexOf(unicorn);
            animalAdapter.notifyItemInserted(position);
            animalAdapter.notifyDataSetChanged();
        });

        Button navigateButton = findViewById(R.id.button_navigate);
        navigateButton.setOnClickListener((v) -> {
            Intent navIntent = new Intent(this, FormattingStringActivity.class);
            startActivity(navIntent);
        });
    }
}