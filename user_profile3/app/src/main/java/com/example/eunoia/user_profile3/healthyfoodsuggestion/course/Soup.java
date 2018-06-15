package com.example.eunoia.user_profile3.healthyfoodsuggestion.course;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.eunoia.user_profile3.R;
import com.example.eunoia.user_profile3.healthyfoodsuggestion.course.ae.*;

public class Soup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soup);
    }

    public void goToAe1(View view)
    {
        Intent intent = new Intent(Soup.this, ae1.class);
        startActivity(intent);
    }

    public void goToAe2(View view)
    {
        Intent intent = new Intent(Soup.this, ae2.class);
        startActivity(intent);
    }

    public void goToAe3(View view)
    {
        Intent intent = new Intent(Soup.this, ae3.class);
        startActivity(intent);
    }

    public void goToAe4(View view)
    {
        Intent intent = new Intent(Soup.this, ae4.class);
        startActivity(intent);
    }
}
