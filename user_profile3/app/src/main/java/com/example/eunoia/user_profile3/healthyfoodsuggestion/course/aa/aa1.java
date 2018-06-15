package com.example.eunoia.user_profile3.healthyfoodsuggestion.course.aa;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eunoia.user_profile3.R;
public class aa1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aa1);

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
                        textView.setText("A yummy way to start the day with very little fat and lots of flavor!\n" +
                                "\n" +
                                "Calories:\t\t93.2 per serving\n" +
                                "Total Fat:\t\t0.5 g\n" +
                                "Total Carbohydrate:\t\t23.6 g\n" +
                                "Protein:\t\t3.0 g");
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
                                "Minutes to Cook: 25\n" +
                                "Number of Servings: 12\n" +
                                "\n" +
                                "Ingredients\n" +
                                "\n" +
                                "1 cup old fashioned oats (not instant)\n" +
                                "1 cup skim milk\n" +
                                "1 cup whole wheat flour\n" +
                                "1/2 cup brown sugar\n" +
                                "1/2 cup unsweetened applesauce\n" +
                                "2 egg whites \n" +
                                "1 teaspoon baking powder\n" +
                                "1/2 teaspoon baking soda\n" +
                                "1/2 teaspoon salt\n" +
                                "1 teaspoon cinnamon\n" +
                                "1 teaspoon sugar\n" +
                                "raisins or nuts (optional)\n" +
                                "\n" +
                                "Directions\n" +
                                "\n" +
                                "Soak the oats in milk for about one hour. \n" +
                                "Preheat the oven to 400 degrees. \n" +
                                "Spray muffin pan with cooking spray. \n" +
                                "Combine the oat mixture with the applesauce and egg whites, and mix until combined. \n" +
                                "In a separate bowl measure and whisk the dry ingredients together. \n" +
                                "Add wet ingredients to dry and mix until just combined. Add nuts or raisins if desired. \n" +
                                "Do not over mix the batter or the muffins will be tough. Spoon muffin mixture into muffin pan. \n" +
                                "Combine the cinnamon and sugar and top each muffin with some of the mixture. \n" +
                                "Bake for 20-25 minutes or until done. \n" +
                                "Remove from pan, cool and enjoy. \n" +
                                "These can be frozen and reheated in the microwave for a quick breakfast.");
                    }

                }
            });
        }
    }
}