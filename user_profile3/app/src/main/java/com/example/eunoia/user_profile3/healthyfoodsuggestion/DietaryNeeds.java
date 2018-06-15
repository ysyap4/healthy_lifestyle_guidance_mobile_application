package com.example.eunoia.user_profile3.healthyfoodsuggestion;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.eunoia.user_profile3.R;
import com.example.eunoia.user_profile3.healthyfoodsuggestion.dietaryneeds.*;

public class DietaryNeeds extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dietary_needs);
    }

    public void goToVegetarian(View view)
    {
        Intent intent = new Intent(DietaryNeeds.this, Vegetarian.class);
        startActivity(intent);
    }

    public void goToLowFat(View view)
    {
        Intent intent = new Intent(DietaryNeeds.this, LowFat.class);
        startActivity(intent);
    }

    public void goToSugarFree(View view)
    {
        Intent intent = new Intent(DietaryNeeds.this, SugarFree.class);
        startActivity(intent);
    }
}
