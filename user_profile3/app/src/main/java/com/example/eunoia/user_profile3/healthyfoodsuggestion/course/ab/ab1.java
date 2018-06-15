package com.example.eunoia.user_profile3.healthyfoodsuggestion.course.ab;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eunoia.user_profile3.R;
public class ab1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ab1);

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
                        textView.setText("This tastes just like cheese pizza! Pair this with a salad and you have a great pizzeria style lunch without the calories attached.\n" +
                                "\n" +
                                "Calories:\t\t242.3 per serving\n" +
                                "Total Fat:\t\t8.3 g\n" +
                                "Total Carbohydrate:\t\t26.3 g\n" +
                                "Protein:\t\t15.0 g");
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
                                "Minutes to Prepare: 2\n" +
                                "Minutes to Cook: 5\n" +
                                "Number of Servings: 1\n" +
                                "\n" +
                                "Ingredients\n" +
                                "\n" +
                                "2 slices mixed grain bread (I like Orowheat)\n" +
                                "2 tablespoons marinara sauce\n" +
                                "1/4 cup mozzarella cheese (low moisture, part skim)\n" +
                                "1 teaspoon shredded Parmesan\n" +
                                "Salt and pepper to taste\n" +
                                "\n" +
                                "Directions\n" +
                                "\n" +
                                "Spread 1 tablespoon of marinara sauce on each piece of bread. Spread mozzarella cheese evenly, on side with sauce, on first piece of bread. Sprinkle Parmesan cheese over mozzarella. Top with second piece of bread, sauce side down. Place in heated pan and cook until cheese inside is melted and outside is golden brown...or darker if you like. Plate up and enjoy!");
                    }

                }
            });
        }
    }
}