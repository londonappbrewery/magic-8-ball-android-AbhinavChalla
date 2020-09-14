package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] ballArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4
        };
        Button myButton = findViewById(R.id.askButton);
        ImageView ballDisplay = findViewById(R.id.imageEightBall);

        myButton.setOnClickListener(view -> {
            Random randomNumberGenerator = new Random();
            ballDisplay.setImageResource(ballArray[randomNumberGenerator.nextInt(4)]);
        });
    }
}
