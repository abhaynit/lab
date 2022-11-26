package com.example.lab_report_no_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Chronometer;

public class MainActivity extends AppCompatActivity {

    private Chronometer chronometer;
    private long pauseOffset;
    private boolean running;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chronometer = findViewById(R.id.chronometer);
    }
    public void startChronometer(View v) {
        //first check if the chronometer is running or not
        if(!running){
            //seleect elapsedrealtime and press control+B then we can use it by downloading the clock
            chronometer.setBase(SystemClock.elapsedRealtime() - pauseOffset);
            //without using the above code the stopwatch can be made but that stopwatch will not run in a proper way.
            chronometer.start();
            running = true;
        }

    }

    public void pauseChronometer(View v){
        if(running){
            chronometer.stop();
            pauseOffset = SystemClock.elapsedRealtime() - chronometer.getBase();
            running = false;
        }

    }
    public void resetChronometer(View v){
        chronometer.setBase(SystemClock.elapsedRealtime());
        pauseOffset = 0;
    }
}