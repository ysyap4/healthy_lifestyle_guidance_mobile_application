package com.example.eunoia.user_profile3.healthyfoodsuggestion.classifications.cc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eunoia.user_profile3.R;
public class cc3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cc3);

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
                        textView.setText("The people who don't like fish much will love this baked tilapia!\n" +
                                "\n" +
                                "Calories:\t\t175.2 per serving\n" +
                                "Total Fat:\t\t7.3 g\n" +
                                "Total Carbohydrate:\t\t1.8 g\n" +
                                "Protein:\t\t26.1 g");
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
                                "Number of Servings: 4\n" +
                                "\n" +
                                "Ingredients\n" +
                                "\n" +
                                "4 tilapia fillets\n" +
                                "1 tbsp olive oil\n" +
                                "1 tbsp butter or margarine\n" +
                                "Juice of 1 lemon\n" +
                                "1 tsp garlic salt\n" +
                                "1 tsp dried parsley flakes\n" +
                                "Dash of salt\n" +
                                "Cayenne pepper to taste\n" +
                                "\n" +
                                "Directions\n" +
                                "\n" +
                                "Preheat oven to 400.\n" +
                                "Spray a baking dish with non-stick cooking spray.\n" +
                                "Melt butter in microwave.\n" +
                                "Add olive oil, lemon juice, garlic powder, salt and parsley and saute for a few minutes.\n" +
                                "Pour over tilapia fillets in baking pan.\n" +
                                "Sprinkle some cayenne pepper on top of fish.\n" +
                                "Bake in preheated oven for about 13 minutes, and broil for an additional 2-3 minutes.");
                    }

                }
            });
        }
    }
}