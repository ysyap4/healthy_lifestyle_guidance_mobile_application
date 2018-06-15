package com.example.eunoia.user_profile3.healthyfoodsuggestion;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


import com.example.eunoia.user_profile3.R;
import com.example.eunoia.user_profile3.healthyfoodsuggestion.classifications.*;

public class Classifications extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classifications);
    }

    public void goToChicken(View view)
    {
        Intent intent = new Intent(Classifications.this, Chicken.class);
        startActivity(intent);
    }

    public void goToBeefPork(View view)
    {
        Intent intent = new Intent(Classifications.this, BeefPork.class);
        startActivity(intent);
    }

    public void goToFish(View view)
    {
        Intent intent = new Intent(Classifications.this, Fish.class);
        startActivity(intent);
    }

    public void goToVegetable(View view)
    {
        Intent intent = new Intent(Classifications.this, Vegetable.class);
        startActivity(intent);
    }

    public void goToAppetizers(View view)
    {
        Intent intent = new Intent(Classifications.this, Appetizers.class);
        startActivity(intent);
    }
}
