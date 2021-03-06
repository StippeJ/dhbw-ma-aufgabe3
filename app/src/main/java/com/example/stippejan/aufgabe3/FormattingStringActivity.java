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

    /**
     * References different Views and adds an onClickListener to the Button
     */
    @Override
    protected void onStart() {
        super.onStart();

        // Reference the EditTexts
        EditText nameEditText = findViewById(R.id.name_edit_text);
        EditText ageEditText = findViewById(R.id.age_edit_text);
        EditText favoriteColorEditText = findViewById(R.id.color_edit_text);

        // Add a Button-onClickListener to process the content of the EditTexts
        Button insertButton = findViewById(R.id.insert_button);
        insertButton.setOnClickListener((v) -> {
            // Get the content of the EditTexts
            String userName = nameEditText.getText().toString();
            String age = ageEditText.getText().toString();
            String favoriteColor = favoriteColorEditText.getText().toString();

            // Either insert the strings in to a translated string or show an error-message
            if (userName.length() > 0 && age.length() > 0 && favoriteColor.length() > 0) {
                Toast.makeText(this, getString(R.string.formatting_string, userName, age, favoriteColor), Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this, getString(R.string.err_empty), Toast.LENGTH_LONG).show();
            }
        });
    }
}