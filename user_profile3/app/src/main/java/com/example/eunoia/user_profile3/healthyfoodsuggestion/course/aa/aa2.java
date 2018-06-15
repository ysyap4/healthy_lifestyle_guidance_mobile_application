package com.example.eunoia.user_profile3.healthyfoodsuggestion.course.aa;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eunoia.user_profile3.R;
public class aa2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aa2);

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
                        textView.setText("I am known for my pancakes, so trust me on this one!\n" +
                                "\n" +
                                "Calories:\t\t92.6 per serving\n" +
                                "Total Fat:\t\t0.4 g\n" +
                                "Total Carbohydrate:\t\t18.2 g\n" +
                                "Protein:\t\t5.2 g");
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
                                "Minutes to Cook: 15\n" +
                                "Number of Servings: 8\n" +
                                "\n" +
                                "Ingredients\n" +
                                "\n" +
                                "Whole Wheat Flour, 1.25 cup\n" +
                                "Baking Soda, 1 tsp \n" +
                                "Splenda No Calorie Sweetener, 2 tbsp\n" +
                                "Skim Milk, 1 cup\n" +
                                "Eggbeaters, .5 cup\n" +
                                "Vanilla extract, 1 tbsp \n" +
                                "Cinnamon, 2 tbsp\n" +
                                "\n" +
                                "Directions\n" +
                                "\n" +
                                "Mix flour, baking soda, and splenda in bowl. Mix milk, eggs, and vanilla in another bowl. Beat into dry mix roughly, so as to add more air to mix. Stir in cinnamon last. Serving size is 1/3 cup mix. Use PAM on skillet when cooking and sweeten with sugar free syrup and/or fruit!");
                    }

                }
            });
        }
    }
}