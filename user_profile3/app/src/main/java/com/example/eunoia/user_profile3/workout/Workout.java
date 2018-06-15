package com.example.eunoia.user_profile3.workout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.eunoia.user_profile3.Menu;
import com.example.eunoia.user_profile3.R;

public class Workout extends Menu {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.workout);
    }

    public void addFront(View f){

        Intent intent = new Intent(this, frontinterface.class);
        startActivity(intent);
    }

    public void addIns(View v){

        Intent intent = new Intent(this, instruc.class);
        startActivity(intent);
    }



}
