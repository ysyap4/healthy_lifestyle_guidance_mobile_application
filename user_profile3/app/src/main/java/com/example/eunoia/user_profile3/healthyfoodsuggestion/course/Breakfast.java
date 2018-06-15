package com.example.eunoia.user_profile3.healthyfoodsuggestion.course;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.eunoia.user_profile3.R;
import com.example.eunoia.user_profile3.healthyfoodsuggestion.course.aa.*;

public class Breakfast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfast);
    }

    public void goToAa1(View view)
    {
        Intent intent = new Intent(Breakfast.this, aa1.class);
        startActivity(intent);
    }

    public void goToAa2(View view)
    {
        Intent intent = new Intent(Breakfast.this, aa2.class);
        startActivity(intent);
    }

    public void goToAa3(View view)
    {
        Intent intent = new Intent(Breakfast.this, aa3.class);
        startActivity(intent);
    }

    public void goToAa4(View view)
    {
        Intent intent = new Intent(Breakfast.this, aa4.class);
        startActivity(intent);
    }

    public void goToAa5(View view)
    {
        Intent intent = new Intent(Breakfast.this, aa5.class);
        startActivity(intent);
    }
}
