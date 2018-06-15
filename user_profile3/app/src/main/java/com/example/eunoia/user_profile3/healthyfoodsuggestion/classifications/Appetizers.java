package com.example.eunoia.user_profile3.healthyfoodsuggestion.classifications;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.eunoia.user_profile3.healthyfoodsuggestion.classifications.ce.*;
import com.example.eunoia.user_profile3.R;

public class Appetizers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appetizers);
    }

    public void goToCe1(View view)
    {
        Intent intent = new Intent(Appetizers.this, ce1.class);
        startActivity(intent);
    }

    public void goToCe2(View view)
    {
        Intent intent = new Intent(Appetizers.this, ce2.class);
        startActivity(intent);
    }

    public void goToCe3(View view)
    {
        Intent intent = new Intent(Appetizers.this, ce3.class);
        startActivity(intent);
    }

    public void goToCe4(View view)
    {
        Intent intent = new Intent(Appetizers.this, ce4.class);
        startActivity(intent);
    }

    public void goToCe5(View view)
    {
        Intent intent = new Intent(Appetizers.this, ce5.class);
        startActivity(intent);
    }

    public void goToCe6(View view)
    {
        Intent intent = new Intent(Appetizers.this, ce6.class);
        startActivity(intent);
    }
}
