package com.example.eunoia.user_profile3.healthyfoodsuggestion.classifications.cc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eunoia.user_profile3.R;
public class cc2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cc2);

        final TextView textView = (TextView)findViewById(R.id.textView12);
        final Button button1 = (Button)findViewById(R.id.button4);
        final Button button2 = (Button)findViewById(R.id.button5);


        if (button1 != null)
        {
            button1.setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View v)
                {
                    if (textView != null)
                    {
                        textView.setText("Dill and lemon make this light fish dinner shine.\n" +
                                "\n" +
                                "Calories:\t\t210.2 per serving\n" +
                                "Total Fat:\t\t9.5 g\n" +
                                "Total Carbohydrate:\t\t0.4 g\n" +
                                "Protein:\t\t29.0 g");
                    }

                }
            });
        }

        if (button2 != null)
        {
            button2.setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View v)
                {
                    if (textView != null)
                    {
                        textView.setText("Introduction\n" +
                                "\n" +
                                "Minutes to Prepare: 5\n" +
                                "Minutes to Cook: 15\n" +
                                "Number of Servings: 1\n" +
                                "\n" +
                                "Ingredients\n" +
                                "\n" +
                                "1 1/2 lbs. salmon\n" +
                                "2 tablespoons olive oil\n" +
                                "2 tablespoons fresh dill\n" +
                                "1 garlic clove, minced\n" +
                                "1 tablespoon lemon juice\n" +
                                "salt and pepper to taste\n" +
                                "\n" +
                                "Directions\n" +
                                "\n" +
                                "1. Prepare grill. \n" +
                                "\n" +
                                "2. In a small bowl, combine oil, herbs, garlic, lemon juice, salt and pepper. \n" +
                                "\n" +
                                "3. Using a pastry brush, brush salmon with herbed mixture. \n" +
                                "\n" +
                                "4. Cook on barbecue until done (salmon is done when it flakes when tested with a fork.) ");
                    }

                }
            });
        }
    }
}