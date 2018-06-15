package com.example.eunoia.user_profile3.healthyfoodsuggestion.course.ae;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eunoia.user_profile3.R;
public class ae3 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ae3);

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
                        textView.setText("A quick and hearty soup with chicken.\n" +
                                "\n" +
                                "Calories:\t\t270.5 per serving\n" +
                                "Total Fat:\t\t10.6 g\n" +
                                "Total Carbohydrate:\t\t25.8 g\n" +
                                "Protein:\t\t19.8 g");
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
                                "Minutes to Cook: 25\n" +
                                "Number of Servings: 8\n" +
                                "\n" +
                                "Ingredients\n" +
                                "\n" +
                                "1 lb (16 oz) chicken breasts, chopped into bite-size pieces \n" +
                                "1 small onion, chopped \n" +
                                "3 cloves garlic, chopped\n" +
                                "1 jalapeno pepper, seeded and chopped (optional; leave in seeds for more heat)\n" +
                                "1 green pepper, chopped \n" +
                                "4 c fresh spinach or about 4 oz frozen spinach (this is an estimate; you can add more or less) \n" +
                                "1 T cumin\n" +
                                "1 T olive oil \n" +
                                "1 14-oz can chopped tomatoes (preferably low-sodium) \n" +
                                "2 avocados, chopped \n" +
                                "1 quart chicken stock (preferably reduced-sodium) \n" +
                                "1/4 c cilantro, torn \n" +
                                "2 limes, juiced \n" +
                                "1 14-oz can pinto or black beans, drained and rinsed\n" +
                                "2 c cooked brown rice \n" +
                                "\n" +
                                "Directions\n" +
                                "\n" +
                                "Makes 8 hearty cup-size servings\n" +
                                "\n" +
                                "If you're not using cooked rice, start making rice before you begin the soup. \n" +
                                "\n" +
                                "Heat oil in a large soup pot set over medium-high flame, and add garlic, onion and peppers. Cook until soft and starting to get some color, about 5 minutes. Lower heat to medium. Add chicken and cumin and cook another five minutes. Add chicken broth, beans, spinach and tomatoes. Raise heat to medium-high and simmer for 10 minutes. Remove from heat and add lime juice, stirring well. Season with salt and pepper to taste.");
                    }

                }
            });
        }
    }
}