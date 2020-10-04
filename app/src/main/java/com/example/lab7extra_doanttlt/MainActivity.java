package com.example.lab7extra_doanttlt;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button Test, HighScore, Quit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Test = (Button) findViewById(R.id.BtnTest);
        Test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, activity_test.class);
                startActivity(intent);
            }
        });
        HighScore = (Button) findViewById(R.id.BtnHighScore);
        HighScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, activity_highscore.class);
                startActivity(intent);
            }
        });
        Quit = (Button) findViewById(R.id.BtnThoat);
        Quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}