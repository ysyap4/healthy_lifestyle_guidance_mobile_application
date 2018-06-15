package com.example.eunoia.user_profile3.healthyfoodsuggestion.dietaryneeds;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.eunoia.user_profile3.R;
import com.example.eunoia.user_profile3.healthyfoodsuggestion.dietaryneeds.ba.*;

public class Vegetarian extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetarian);
    }

    public void goToBa1(View view)
    {
        Intent intent = new Intent(Vegetarian.this, ba1.class);
        startActivity(intent);
    }

    public void goToBa2(View view)
    {
        Intent intent = new Intent(Vegetarian.this, ba2.class);
        startActivity(intent);
    }

    public void goToBa3(View view)
    {
        Intent intent = new Intent(Vegetarian.this, ba3.class);
        startActivity(intent);
    }
}
