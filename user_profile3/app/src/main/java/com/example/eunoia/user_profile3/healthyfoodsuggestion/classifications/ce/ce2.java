package com.example.eunoia.user_profile3.healthyfoodsuggestion.classifications.ce;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eunoia.user_profile3.R;
public class ce2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ce2);

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
                        textView.setText("The versatility of this pico de gallo salsa is limitless. This salsa can be topped with all dishes.\n" +
                                "\n" +
                                "Calories:\t\t22.5 per serving\n" +
                                "Total Fat:\t\t0.3 g\n" +
                                "Total Carbohydrate:\t\t5.9 g\n" +
                                "Protein:\t\t0.9 g");
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
                                "Minutes to Prepare: 10\n" +
                                "Number of Servings: 8\n" +
                                "\n" +
                                "Ingredients\n" +
                                "\n" +
                                "3 large diced tomatoes\n" +
                                "1 diced medium sized onion\n" +
                                "1/4 bunch of cilantro (use more or less depending on your taste)\n" +
                                "juice of half a lemon\n" +
                                "1/2 teaspoon of minced garlic\n" +
                                "1 tsp of salt\n" +
                                "2 jalapenos (or more if you prefer it hotter)\n" +
                                "\n" +
                                "Optional ingredients (not included in nutrition facts)\n" +
                                "half a cucumber, peeled and diced\n" +
                                "1 avocado, peeled and diced\n" +
                                "\n" +
                                "Directions\n" +
                                "\n" +
                                "1. Wash tomatoes and cilantro.\n" +
                                "2. Dice tomatoes, onions, chop cilantro, jalapenos, and the optional ingredients (avocado, cucumber)\n" +
                                "3. Put ingredients in a bowl. \n" +
                                "4. Add salt, garlic, the juice of half a lemon. Mix it up and serve.");
                    }

                }
            });
        }
    }
}