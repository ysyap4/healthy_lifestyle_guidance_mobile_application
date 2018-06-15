package com.example.eunoia.user_profile3.healthyfoodsuggestion.course.aa;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eunoia.user_profile3.R;
public class aa5 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aa5);

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
                        textView.setText("Salty feta and velvety scramble eggs combine beautifully with broccoli and tomatoes for a filling breakfast that's high in protein.\n" +
                                "\n" +
                                "Calories:\t\t200.3 per serving\n" +
                                "Total Fat:\t\t8.7 g\n" +
                                "Total Carbohydrate:\t\t13.0 g\n" +
                                "Protein:\t\t18.4 g");
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
                                "Celebrate spinach season with this lean and green scramble. Salty feta and velvety eggs combine beautifully with wilted spinach for a filling breakfast that's high in protein.\n" +
                                "\n" +
                                "Number of Servings: 1\n" +
                                "\n" +
                                "Ingredients\n" +
                                "\n" +
                                "3 egg whites\n" +
                                "2 cups Fresh Express Baby Spinach \n" +
                                "1 1 Italian tomato, chopped (any tomato)\n" +
                                "1/4 c. chopped onion\n" +
                                "1/4 c crumbled feta cheese\n" +
                                "salt & pepper to taste\n" +
                                "\n" +
                                "Tips\n" +
                                "\n" +
                                "Scramble the eggs up or flip as an omelet!\n" +
                                "\n" +
                                "\n" +
                                "Directions\n" +
                                "\n" +
                                "Chop onion & tomato. Spray pan with cooking spray and put on medium heat. Cook onions until translucent. \n" +
                                "\n" +
                                "Add 3 egg whites, tomato, spinach and cook until cooked through.\n" +
                                "\n" +
                                "Just before you are ready to take off heat, take 1/2 of the feta cheese and throw in pan and melt.\n" +
                                "\n" +
                                "Top with remaining crumbled cheese and salt and pepper to taste.");
                    }

                }
            });
        }
    }
}