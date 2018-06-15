package com.example.eunoia.user_profile3.healthyfoodsuggestion.dietaryneeds.bb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eunoia.user_profile3.R;
public class bb2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bb2);

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
                        textView.setText("This comes out so moist, and you cut out most of the fat using banana.\n" +
                                "\n" +
                                "Calories:\t\t147.8 per serving\n" +
                                "Total Fat:\t\t0.9 g\n" +
                                "Total Carbohydrate:\t\t32.3 g\n" +
                                "Protein:\t\t3.5 g");
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
                                "Minutes to Cook: 60\n" +
                                "Number of Servings: 12\n" +
                                "\n" +
                                "Ingredients\n" +
                                "\n" +
                                "2 cups flour\n" +
                                "3/4 cup sugar\n" +
                                "3 tsp baking powder\n" +
                                "1/2 tsp baking soda\n" +
                                "1/2 tsp salt\n" +
                                "1 egg\n" +
                                "3/4 cup milk\n" +
                                "1/4 cup applesauce\n" +
                                "1 1/2 cups mashed bananas\n" +
                                "\n" +
                                "Directions\n" +
                                "\n" +
                                "Preheat oven to 350. Grease bread loaf pan, unless it's non stick.\n" +
                                "\n" +
                                "Mix all dry ingredients into a large bowl, make sure to mix well.\n" +
                                "\n" +
                                "Mix all wet ingredients in another bowl, make sure to mix thoroughly.\n" +
                                "\n" +
                                "Add liquid mix to dry mix and stir thoroughly.\n" +
                                "\n" +
                                "Put into bread loaf pan and cook for approximately 55 to 65 minutes. I always start checking the colour around 50 minutes, should be a nice golden brown. Insert a toothpick in centre to check if it's done. Toothpick may be moist from bananas, just make sure it's not moist from batter.\n" +
                                "\n" +
                                "Let bread cool in pans for about 5 to 10 minutes. Run a knife along outside edge to loosen sides.\n" +
                                "\n" +
                                "Looking for something sweet, add chocolate chips, just make sure to add in your calories.\n" +
                                "\n" +
                                "This bread is great warm with peanut butter on it.\n");
                    }

                }
            });
        }
    }
}