package com.example.stippejan.aufgabe3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FormattingStringActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formatting_string);
    }

    @Override
    protected void onStart() {
        super.onStart();

        EditText nameEditText = findViewById(R.id.name_edit_text);
        EditText speciesEditText = findViewById(R.id.species_edit_text);

        Button insertButton = findViewById(R.id.insert_button);
        insertButton.setOnClickListener((v) -> {
            String userName = nameEditText.getText().toString();
            String species = speciesEditText.getText().toString();

            if (userName.length() > 0 && species.length() > 0) {
                Toast.makeText(this, getString(R.string.formatting_string, userName, species), Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this, getString(R.string.err_empty), Toast.LENGTH_LONG).show();
            }
        });
    }
}