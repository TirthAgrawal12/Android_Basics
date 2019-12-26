package com.example.a17it003_wcmc_pr3;

import android.os.Bundle;
import android.widget.Chronometer;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    Chronometer ch;
    int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counter = -1;
        ch = findViewById(R.id.chronometer);
        ch.start();

        ch.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
            @Override
           public void onChronometerTick(Chronometer chronometer) {
                counter++;
                if(counter%5 == 0)
                    Toast.makeText(MainActivity.this, "17IT006", Toast.LENGTH_SHORT).show();
            }
        });
    }
}