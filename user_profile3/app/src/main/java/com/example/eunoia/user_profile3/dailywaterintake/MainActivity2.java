package com.example.eunoia.user_profile3.dailywaterintake;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.eunoia.user_profile3.Menu;
import com.example.eunoia.user_profile3.R;
import com.example.eunoia.user_profile3.bmicalculator.Update;
import com.example.eunoia.user_profile3.userprofile.DatabaseHelper;

public class MainActivity2 extends Menu implements OnClickListener
{
    protected DatabaseHelper db;

    ImageButton button;
    ImageButton button2;
    ImageButton imageButton;
    TextView dispToday;
    TextView textView2;
    TextView dispTogo;
    TextView textView3;
    TextView dispTaken;

    double today ;
    double taken;
    double togo;
    Update p1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water);

        db = new DatabaseHelper(this);
        p1 = db.getAllUsers();
        today = p1.getWater();

        button = (ImageButton) findViewById(R.id.button);
        button2 = (ImageButton) findViewById(R.id.button2);
        imageButton = (ImageButton) findViewById((R.id.imageButton));
        dispToday = (TextView) findViewById(R.id.dispToday);
        textView2 = (TextView) findViewById(R.id.textView2);
        dispTogo = (TextView) findViewById(R.id.dispTogo);
        textView3 = (TextView) findViewById(R.id.textView3);
        dispTaken = (TextView) findViewById(R.id.dispTaken);

        dispToday.setText(String.format("%.2f",p1.getWater()));

        button.setOnClickListener((OnClickListener)this);
        button2.setOnClickListener((OnClickListener)this);
    }

    public void onClick (View v)
    {
        if (v.getId() == R.id.button)
        {

            taken = taken + 0.1;
            //dispTaken.setText(String.format("%.2f", taken));

            togo = today - 0.1;
            //dispTogo.setText(String.format("%.2f", togo)) ;
        }

        if (v.getId() == R.id.button2)
        {
            taken = taken  - 0.1 ;
            //dispTaken.setText(String.format("%.2f", taken));

            togo = today + 0.1 ;
            //dispTogo.setText(String.format("%.2f", togo)) ;
        }

        dispTaken.setText(String.format("%.2f", taken));
        dispTogo.setText(String.format("%.2f", togo)) ;
    }

    public void addGraph (View g)
    {
        Intent intent = new Intent(MainActivity2.this, Graph.class);
        startActivity(intent);
    }
}
