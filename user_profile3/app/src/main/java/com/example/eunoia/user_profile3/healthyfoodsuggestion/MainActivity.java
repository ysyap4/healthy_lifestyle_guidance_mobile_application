package com.example.eunoia.user_profile3.healthyfoodsuggestion;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.eunoia.user_profile3.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToCourse(View view)
    {
        Intent intent = new Intent(MainActivity.this, Course.class);
        startActivity(intent);
    }

    public void goToDietaryNeeds(View view)
    {
        Intent intent = new Intent(MainActivity.this, DietaryNeeds.class);
        startActivity(intent);
    }

    public void goToClassifications(View view)
    {
        Intent intent = new Intent(MainActivity.this, Classifications.class);
        startActivity(intent);
    }
}
