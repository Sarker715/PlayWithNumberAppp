package com.map.playwithnumberapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();
        randomNumber = rand.nextInt(20) + 1;
    }

    public void guess(View view) {
        EditText editText = findViewById(R.id.editText);

        int guessNumber = Integer.parseInt(editText.getText().toString());

        if (guessNumber > randomNumber) {
            displayResult("Lower!");
        } else if (guessNumber < randomNumber) {
            displayResult("Higher");
        } else {
            displayResult("That's right. Try again!");

            Random rand = new Random();

            randomNumber = rand.nextInt(20) + 1;
        }


    }

    public void displayResult(String result) {
        Toast.makeText(MainActivity.this, result, Toast.LENGTH_SHORT).show();
    }
}
