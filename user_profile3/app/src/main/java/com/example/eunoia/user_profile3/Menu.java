package com.example.eunoia.user_profile3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eunoia.user_profile3.healthyfoodsuggestion.MainActivity;
import com.example.eunoia.user_profile3.userprofile.User;
import com.example.eunoia.user_profile3.workout.Workout;
import com.example.eunoia.user_profile3.dailywaterintake.MainActivity2;

public class Menu extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        final Button Profile = (Button) findViewById(R.id.profile);
        final Button Workout = (Button) findViewById(R.id.workout);
        final Button Water = (Button) findViewById(R.id.water);
        final Button Bmi = (Button) findViewById(R.id.bmi);
        final Button Food = (Button) findViewById(R.id.food);
        //final Button pharmacy = (Button) findViewById(R.id.pharmacy);
        final TextView About = (TextView) findViewById(R.id.about);

        Profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Menu.this, User.class));
            }
        });

        Bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Menu.this, com.example.eunoia.user_profile3.bmicalculator.Bmi.class));
            }
        });

        assert Workout != null;
        Workout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Menu.this,Workout.class));
            }
        });

        assert Food != null;
        Food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Menu.this,MainActivity.class));
            }
        });


        assert Water != null;
        Food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Menu.this,MainActivity2.class));
            }
        });

        About.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                Intent launchActivity1= new Intent(Menu.this,About.class);
                startActivity(launchActivity1);
            }
        });
    }

}