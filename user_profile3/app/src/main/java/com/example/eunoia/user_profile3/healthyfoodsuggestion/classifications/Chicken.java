package com.example.eunoia.user_profile3.healthyfoodsuggestion.classifications;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.eunoia.user_profile3.R;
import com.example.eunoia.user_profile3.healthyfoodsuggestion.classifications.ca.*;

public class Chicken extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chicken);
    }

    public void goToCa1(View view)
    {
        Intent intent = new Intent(Chicken.this, ca1.class);
        startActivity(intent);
    }

    public void goToCa2(View view)
    {
        Intent intent = new Intent(Chicken.this, ca2.class);
        startActivity(intent);
    }

    public void goToCa3(View view)
    {
        Intent intent = new Intent(Chicken.this, ca3.class);
        startActivity(intent);
    }

    public void goToCa4(View view)
    {
        Intent intent = new Intent(Chicken.this, ca4.class);
        startActivity(intent);
    }

    public void goToCa5(View view)
    {
        Intent intent = new Intent(Chicken.this, ca5.class);
        startActivity(intent);
    }
}
