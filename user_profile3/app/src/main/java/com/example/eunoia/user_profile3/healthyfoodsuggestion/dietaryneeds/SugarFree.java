package com.example.eunoia.user_profile3.healthyfoodsuggestion.dietaryneeds;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.eunoia.user_profile3.R;
import com.example.eunoia.user_profile3.healthyfoodsuggestion.dietaryneeds.bc.*;

public class SugarFree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sugar_free);
    }

    public void goToBc1(View view)
    {
        Intent intent = new Intent(SugarFree.this, bc1.class);
        startActivity(intent);
    }

    public void goToBc2(View view)
    {
        Intent intent = new Intent(SugarFree.this, bc2.class);
        startActivity(intent);
    }

    public void goToBc3(View view)
    {
        Intent intent = new Intent(SugarFree.this, bc3.class);
        startActivity(intent);
    }

    public void goToBc4(View view)
    {
        Intent intent = new Intent(SugarFree.this, bc4.class);
        startActivity(intent);
    }

    public void goToBc5(View view)
    {
        Intent intent = new Intent(SugarFree.this, bc5.class);
        startActivity(intent);
    }
}
