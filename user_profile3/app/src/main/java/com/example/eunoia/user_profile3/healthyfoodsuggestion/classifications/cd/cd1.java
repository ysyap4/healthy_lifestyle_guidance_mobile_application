package com.example.eunoia.user_profile3.healthyfoodsuggestion.classifications.cd;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eunoia.user_profile3.R;
public class cd1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cd1);

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
                        textView.setText("This healthy veggie frittata features all of our favourite spring goodies! Serve it with crusty bread and fresh fruit salad for a filling meal.\n" +
                                "\n" +
                                "Calories:\t\t146.2 per serving\n" +
                                "Total Fat:\t\t8.8 g\n" +
                                "Total Carbohydrate:\t\t7.4 g\n" +
                                "Protein:\t\t10.6 g");
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
                                "Minutes to Prepare: 20\n" +
                                "Minutes to Cook: 35\n" +
                                "Number of Servings: 6\n" +
                                "\n" +
                                "Ingredients\n" +
                                "\n" +
                                "1 pound asparagus\n" +
                                "6 ounces button mushrooms\n" +
                                "1 tbsp olive oil\n" +
                                "1 clove garlic\n" +
                                "1 shallot\n" +
                                "1 small or 1/2 large zucchini\n" +
                                "6 large eggs\n" +
                                "1/3 cup 1% milk\n" +
                                "1 tsp salt\n" +
                                "1/4 tsp freshly ground black pepper\n" +
                                "dash nutmeg\n" +
                                "1 tbsp chopped chives\n" +
                                "1/4 cup freshly grated parmesan cheese\n" +
                                "2 medium or 1 large tomato\n" +
                                "\n" +
                                "Directions\n" +
                                "\n" +
                                "1. Preheat the oven to 350 degrees.\n" +
                                "\n" +
                                "2. Wash and trim asparagus and cut into 1-inch long pieces. Blanche asparagus in boiling water for 1-2 minutes and immediately shock in ice water. Drain and dry asparagus, set aside.\n" +
                                "\n" +
                                "3. Clean and slice mushrooms. In a skillet, heat olive oil and saute the mushrooms over medium heat for about ten minutes. While they cook, grate or finely mince the garlic and shallots. Add the garlic and shallots to the mushrooms and continue to cook for about two minutes more. Remove the mushroom mixture from the heat and set aside.\n" +
                                "\n" +
                                "4. Cut the zucchini in half lengthwise and slice into thin, half-moon shapes.\n" +
                                "\n" +
                                "5. In a large bowl, beat together eggs, milk, salt, pepper, nutmeg, and chives. Add asparagus, mushroom mixture, and zucchini.\n" +
                                "\n" +
                                "6. Lightly spray a 2-quart baking dish (11 x 7 x 1.5) with cooking spray. Pour the egg and vegetable mixture into the dish.\n" +
                                "\n" +
                                "7. Thinly slice tomatoes and arrange on top of the egg mixture. Sprinkle parmesan cheese over the top and bake in the oven until set, about 30-35 minutes. If desired, place under the broiler for 2-3 minutes to brown the top.\n" +
                                "\n" +
                                "8. Allow the frittata to cool before serving. Frittata can be made ahead and chilled, covered, overnight -- allow to come to room temperature before serving.");
                    }

                }
            });
        }
    }
}