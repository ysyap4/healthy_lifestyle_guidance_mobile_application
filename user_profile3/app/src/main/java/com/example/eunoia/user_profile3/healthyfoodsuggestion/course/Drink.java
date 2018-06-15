package com.example.eunoia.user_profile3.healthyfoodsuggestion.course;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.eunoia.user_profile3.R;
import com.example.eunoia.user_profile3.healthyfoodsuggestion.course.af.*;

public class Drink extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);
    }

    public void goToAf1(View view)
    {
        Intent intent = new Intent(Drink.this, af1.class);
        startActivity(intent);
    }

    public void goToAf2(View view)
    {
        Intent intent = new Intent(Drink.this, af2.class);
        startActivity(intent);
    }

    public void goToAf3(View view)
    {
        Intent intent = new Intent(Drink.this, af3.class);
        startActivity(intent);
    }

    public void goToAf4(View view)
    {
        Intent intent = new Intent(Drink.this, af4.class);
        startActivity(intent);
    }
}
