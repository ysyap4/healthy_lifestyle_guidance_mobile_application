package com.example.eunoia.user_profile3.healthyfoodsuggestion.course;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.eunoia.user_profile3.R;
import com.example.eunoia.user_profile3.healthyfoodsuggestion.course.ac.*;

public class Dinner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinner);
    }

    public void goToAc1(View view)
    {
        Intent intent = new Intent(Dinner.this, ac1.class);
        startActivity(intent);
    }

    public void goToAc2(View view)
    {
        Intent intent = new Intent(Dinner.this, ac2.class);
        startActivity(intent);
    }

    public void goToAc3(View view)
    {
        Intent intent = new Intent(Dinner.this, ac3.class);
        startActivity(intent);
    }

    public void goToAc4(View view)
    {
        Intent intent = new Intent(Dinner.this, ac4.class);
        startActivity(intent);
    }
}
