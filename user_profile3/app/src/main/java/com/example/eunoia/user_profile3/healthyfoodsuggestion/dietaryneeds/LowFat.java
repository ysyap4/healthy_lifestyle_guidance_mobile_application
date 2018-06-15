package com.example.eunoia.user_profile3.healthyfoodsuggestion.dietaryneeds;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.eunoia.user_profile3.R;
import com.example.eunoia.user_profile3.healthyfoodsuggestion.dietaryneeds.bb.*;

public class LowFat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_low_fat);
    }

    public void goToBb1(View view)
    {
        Intent intent = new Intent(LowFat.this, bb1.class);
        startActivity(intent);
    }

    public void goToBb2(View view)
    {
        Intent intent = new Intent(LowFat.this, bb2.class);
        startActivity(intent);
    }

    public void goToBb3(View view)
    {
        Intent intent = new Intent(LowFat.this, bb3.class);
        startActivity(intent);
    }
}
