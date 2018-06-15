package com.example.eunoia.user_profile3.healthyfoodsuggestion.classifications.cb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eunoia.user_profile3.R;
public class cb1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cb1);

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
                        textView.setText("A much quicker version of the Italian classic, less time but no less taste.\n" +
                                "\n" +
                                "Calories:\t\t342.3 per serving\n" +
                                "Total Fat:\t\t10.7 g\n" +
                                "Total Carbohydrate:\t\t34.5 g\n" +
                                "Protein:\t\t28.0 g");
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
                                "Minutes to Cook: 20\n" +
                                "Number of Servings: 6\n" +
                                "\n" +
                                "Ingredients\n" +
                                "\n" +
                                "1 pound lean ground beef\n" +
                                "1 small onion (chopped)\n" +
                                "3 cloves garlic (minced)\n" +
                                "1 (14-ounce) can diced tomatoes (undrained)\n" +
                                "1 1/4 cups water\n" +
                                "8 ounces tomato sauce\n" +
                                "1 tbsp dried parsley flakes\n" +
                                "1 tsp dried basil leaves\n" +
                                "1 tsp dried oregano leaves\n" +
                                "1 tsp salt\n" +
                                "2 1/2 cups broken-up whole wheat lasagna noodles\n" +
                                "1 cup fat-free cottage cheese\n" +
                                "1/4 cup fat-free grated Parmesan cheese\n" +
                                "Dash dried basil and pepper (optional)\n" +
                                "1 egg\n" +
                                "Shredded fat-free mozzarella cheese for garnish\n" +
                                "\n" +
                                "Directions\n" +
                                "\n" +
                                "In a large skillet, brown beef with onions and garlic. Drain.\n" +
                                "Add tomatoes, water, tomato sauce, parsley, basil, oregano, and salt.\n" +
                                "Stir in uncooked pasta. \n" +
                                "Bring to a boil, stirring occasionally.\n" +
                                "Reduce heat, cover and simmer for 20 minutes or until pasta is tender.\n" +
                                "Combine cottage and Parmesan cheeses. \n" +
                                "Mix in the egg. \n" +
                                "Sprinkle in basil and pepper to taste. \n" +
                                "Drop cheese mixture by rounded tablespoons onto pasta mixture. \n" +
                                "Cover and cook for 5 minutes more. \n" +
                                "Sprinkle with shredded mozzarella and serve. ");
                    }

                }
            });
        }
    }
}