package com.example.eunoia.user_profile3.healthyfoodsuggestion.course;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.eunoia.user_profile3.R;
import com.example.eunoia.user_profile3.healthyfoodsuggestion.course.ab.*;

public class Lunch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch);
    }

    public void goToAb1(View view)
    {
        Intent intent = new Intent(Lunch.this, ab1.class);
        startActivity(intent);
    }

    public void goToAb2(View view)
    {
        Intent intent = new Intent(Lunch.this, ab2.class);
        startActivity(intent);
    }

    public void goToAb3(View view)
    {
        Intent intent = new Intent(Lunch.this, ab3.class);
        startActivity(intent);
    }
}
