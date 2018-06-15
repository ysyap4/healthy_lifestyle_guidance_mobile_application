package com.example.eunoia.user_profile3.healthyfoodsuggestion;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.eunoia.user_profile3.R;
import com.example.eunoia.user_profile3.healthyfoodsuggestion.course.*;

public class Course extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);
    }

    public void goToBreakfast(View view)
    {
        Intent intent = new Intent(Course.this, Breakfast.class);
        startActivity(intent);
    }

    public void goToLunch(View view)
    {
        Intent intent = new Intent(Course.this, Lunch.class);
        startActivity(intent);
    }

    public void goToDinner(View view)
    {
        Intent intent = new Intent(Course.this, Dinner.class);
        startActivity(intent);
    }

    public void goToSideDish(View view)
    {
        Intent intent = new Intent(Course.this, SideDish.class);
        startActivity(intent);
    }

    public void goToSoup(View view)
    {
        Intent intent = new Intent(Course.this, Soup.class);
        startActivity(intent);
    }

    public void goToDrink(View view)
    {
        Intent intent = new Intent(Course.this, Drink.class);
        startActivity(intent);
    }
}
