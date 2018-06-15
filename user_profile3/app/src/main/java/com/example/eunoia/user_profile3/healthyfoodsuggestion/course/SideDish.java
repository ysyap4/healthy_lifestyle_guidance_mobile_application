package com.example.eunoia.user_profile3.healthyfoodsuggestion.course;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.eunoia.user_profile3.R;
import com.example.eunoia.user_profile3.healthyfoodsuggestion.course.ad.*;

public class SideDish extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_side_dish);
    }

    public void goToAd1(View view)
    {
        Intent intent = new Intent(SideDish.this, ad1.class);
        startActivity(intent);
    }

    public void goToAd2(View view)
    {
        Intent intent = new Intent(SideDish.this, ad2.class);
        startActivity(intent);
    }
}
