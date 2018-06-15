package com.example.eunoia.user_profile3.healthyfoodsuggestion.course.ab;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eunoia.user_profile3.R;
public class ab2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ab2);

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
                        textView.setText("Ditch the crust and boost your veggie intake with these eggplant \"pizzas\".\n" +
                                "\n" +
                                "Calories:\t\t119.1 per serving\n" +
                                "Total Fat:\t\t7.5 g\n" +
                                "Total Carbohydrate:\t\t8.9 g\n" +
                                "Protein:\t\t4.9 g");
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
                                "Minutes to Cook: 12\n" +
                                "Number of Servings: 4\n" +
                                "\n" +
                                "Ingredients\n" +
                                "\n" +
                                "1 eggplant - 3 inches in diameter, peeled and cut into 4 half-inch thick slices\n" +
                                "4 teaspoons olive oil\n" +
                                "1/2 teaspoon salt\n" +
                                "1/8 teaspoon ground black pepper\n" +
                                "1/4 cup pasta sauce\n" +
                                "1/2 cup shredded part-skim mozzarella cheese\n" +
                                "\n" +
                                "Directions\n" +
                                "\n" +
                                "Preheat the oven or toaster oven to 425 degrees F. Brush both sides of the eggplant with the oil and season with the salt and pepper. Arrange on a baking sheet and bake until browned and almost tender, 6 to 8 minutes, turning once. Spread 1 tablespoon of pasta sauce on each eggplant slice. Top with the shredded cheese. Bake until the cheese melts, 3 to 5 minutes. Serve hot.");
                    }

                }
            });
        }
    }
}