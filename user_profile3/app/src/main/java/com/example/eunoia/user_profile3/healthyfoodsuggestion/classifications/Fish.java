package com.example.eunoia.user_profile3.healthyfoodsuggestion.classifications;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.eunoia.user_profile3.R;
import com.example.eunoia.user_profile3.healthyfoodsuggestion.classifications.cc.*;

public class Fish extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fish);
    }

    public void goToCc1(View view)
    {
        Intent intent = new Intent(Fish.this, cc1.class);
        startActivity(intent);
    }

    public void goToCc2(View view)
    {
        Intent intent = new Intent(Fish.this, cc2.class);
        startActivity(intent);
    }

    public void goToCc3(View view)
    {
        Intent intent = new Intent(Fish.this, cc3.class);
        startActivity(intent);
    }
}
