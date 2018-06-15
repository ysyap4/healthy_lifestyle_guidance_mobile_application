package com.example.eunoia.user_profile3.healthyfoodsuggestion.course.ac;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eunoia.user_profile3.R;
public class ac2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ac2);

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
                        textView.setText("Try this inexpensive and fresh version of a chicken casserole, no need for processed soups or sauces!\n" +
                                "\n" +
                                "Calories:\t\t320.6 per serving\n" +
                                "Total Fat:\t\t8.9 g\n" +
                                "Total Carbohydrate:\t\t36.1 g\n" +
                                "Protein:\t\t27.9 g");
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
                                "Minutes to Prepare: 15\n" +
                                "Minutes to Cook: 30\n" +
                                "Number of Servings: 6\n" +
                                "\n" +
                                "Ingredients\n" +
                                "\n" +
                                "12 oz cooked chicken breasts, diced\n" +
                                "2 T all purpose flour\n" +
                                "2 T butter, unsalted\n" +
                                "10 oz skim milk\n" +
                                "1 pinch white pepper\n" +
                                "1 t Italian seasoning\n" +
                                "1 T parmesan cheese, grated\n" +
                                "7 oz penne pasta, whole wheat\n" +
                                "2 yellow or orange bell peppers, chopped\n" +
                                "1 zucchini, chopped\n" +
                                "2 heads, approx. 12 ounces broccoli, chopped\n" +
                                "1/3 c monterey jack cheese\n" +
                                "nonstick cooking spray\n" +
                                "\n" +
                                "Directions\n" +
                                "\n" +
                                "Prepare the white sauce by placing the butter in a small sauce pot that has been preheated over medium heat. Once the butter foams, add flour and stir for 1 minute; try not to let the mixture turn brown. Add milk to the mixture and continue to stir until it starts to bubble. Reduce heat and simmer for 10 minutes. Add pepper, Italian seasoning and parmesan cheese to the sauce. Stir to combine. Cook pasta according to package directions. While pasta is cooking, preheat oven to 350 degrees. During the last minute of the pasta's cooking, add the chopped broccoli to the water. Allow to simmer for one minute. \n" +
                                "\n" +
                                "Drain the pasta and broccoli. Spritz the bottom and sides of a 9 X 13 oven-proof casserole dish with nonstick cooking spray. \n" +
                                "\n" +
                                "In a large bowl, combine the pasta and broccoli with the chicken and chopped vegetables; cover with the sauce. Place in the baking dish. Sprinkle with the Monterey jack cheese and cover with foil. \n" +
                                "\n" +
                                "Bake for 20 minutes; remove foil and continue to bake until cheese is melted.");
                    }

                }
            });
        }
    }
}