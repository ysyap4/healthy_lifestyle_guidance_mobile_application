package com.example.eunoia.user_profile3.workout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.eunoia.user_profile3.R;

public class instruc extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instruc);


    }

    public void pushIns(View p){
        Intent intent = new Intent(this, instruc_chair.class);
        startActivity(intent);
    }

    public void wallIns(View w){
        Intent intent = new Intent(this, instruc_wall.class);
        startActivity(intent);
    }

    public void chairIns(View w){
        Intent intent = new Intent(this, instruc_triceps.class);
        startActivity(intent);
    }

    public void triIns(View w){
        Intent intent = new Intent(this, instruc_push.class);
        startActivity(intent);
    }

    public void adWrist(View w){
        Intent intent = new Intent(this, instruc_wrist.class);
        startActivity(intent);
    }
}
