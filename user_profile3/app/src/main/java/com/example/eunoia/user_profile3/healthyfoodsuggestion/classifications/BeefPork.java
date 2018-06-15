package com.example.eunoia.user_profile3.healthyfoodsuggestion.classifications;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.eunoia.user_profile3.R;
import com.example.eunoia.user_profile3.healthyfoodsuggestion.classifications.cb.*;

public class BeefPork extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beef_pork);
    }

    public void goToCb1(View view)
    {
        Intent intent = new Intent(BeefPork.this, cb1.class);
        startActivity(intent);
    }

    public void goToCb2(View view)
    {
        Intent intent = new Intent(BeefPork.this, cb2.class);
        startActivity(intent);
    }

    public void goToCb3(View view)
    {
        Intent intent = new Intent(BeefPork.this, cb3.class);
        startActivity(intent);
    }

    public void goToCb4(View view)
    {
        Intent intent = new Intent(BeefPork.this, cb4.class);
        startActivity(intent);
    }
}
