package com.example.eunoia.user_profile3.workout;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.eunoia.user_profile3.Menu;
import com.example.eunoia.user_profile3.R;

import java.util.concurrent.TimeUnit;

public class wallsit extends AppCompatActivity {

    ImageButton Start, Stop;
    TextView textViewTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallsit);

        Start=(ImageButton)findViewById(R.id.button10);
        Stop=(ImageButton)findViewById(R.id.button11);
        textViewTime=(TextView)findViewById(R.id.textView25);

        textViewTime.setText("00:00:20");

        final CounterClass timer = new CounterClass(20000,1000);
        Start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timer.start();
            }
        });
        Stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timer.cancel();
            }
        });
    }

    public class CounterClass extends CountDownTimer{
        public CounterClass(long millisInFuture, long countDownInterval){
            super(millisInFuture,countDownInterval);

        }

        public void onTick(long millisUntilFinished){
            long millis = millisUntilFinished;
            String hms = String.format("%02d,%02d,%02d", TimeUnit.MILLISECONDS.toHours(millis),
                    TimeUnit.MILLISECONDS.toMinutes(millis)-TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(millis)),
                    TimeUnit.MILLISECONDS.toSeconds(millis)-TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis)));
            System.out.println(hms);
            textViewTime.setText(hms);

        }

        public void onFinish(){

            textViewTime.setText("Complete");

        }
    }



    public void addInt(View i){
        Intent intent = new Intent(this, videoWorkout.class);
        startActivity(intent);
    }

    public void adWall(View i){
        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("Great! You have Completed!")
                .setPositiveButton("End", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which){
                        dialog.dismiss();
                }
        })
                .create();
        myAlert.show();
    }

    public void done(View i){
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }



}
