package com.example.eunoia.user_profile3.healthyfoodsuggestion.classifications;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.eunoia.user_profile3.R;
import com.example.eunoia.user_profile3.healthyfoodsuggestion.classifications.cd.*;


public class Vegetable extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetable);
    }

    public void goToCd1(View view)
    {
        Intent intent = new Intent(Vegetable.this, cd1.class);
        startActivity(intent);
    }

    public void goToCd2(View view)
    {
        Intent intent = new Intent(Vegetable.this, cd2.class);
        startActivity(intent);
    }
}
