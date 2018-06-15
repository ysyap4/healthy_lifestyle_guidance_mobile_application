package com.example.eunoia.user_profile3.healthyfoodsuggestion.classifications.ca;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eunoia.user_profile3.R;
public class ca5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ca5);

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
                        textView.setText("Tasty and nutritious, this will be a family favourite.\n" +
                                "\n" +
                                "Calories:\t\t167.8 per serving\n" +
                                "Total Fat:\t\t5.6 g\n" +
                                "Total Carbohydrate:\t\t0.9 g\n" +
                                "Protein:\t\t27.0 g");
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
                                "Number of Servings: 6\n" +
                                "\n" +
                                "Ingredients\n" +
                                "\n" +
                                "1 tsp oregano\n" +
                                "1/4 tsp black pepper\n" +
                                "2 lbs boneless, skinless chicken breasts (six halves)\n" +
                                "1 tbsp olive oil\n" +
                                "1/4 cup water\n" +
                                "3 tbsp lemon juice\n" +
                                "2 tsp minced garlic\n" +
                                "1 tsp chicken bouillon granules\n" +
                                "1 tsp parsley\n" +
                                "\n" +
                                "Directions\n" +
                                "\n" +
                                "Mix oregano and pepper and sprinkle evenly over chicken pieces. \n" +
                                "In a large non-stick skillet, using medium heat, brown chicken evenly on both sides in olive oil. \n" +
                                "Mix remaining ingredients and pour over chicken, bringing mixture to a gentle boil. \n" +
                                "Pour skillet contents into slow cooker, cover, and cook on low for 6 hours (3 hours on high). \n" +
                                "Chicken is very tasty served on a bed of brown rice with steamed carrots!");
                    }

                }
            });
        }
    }
}