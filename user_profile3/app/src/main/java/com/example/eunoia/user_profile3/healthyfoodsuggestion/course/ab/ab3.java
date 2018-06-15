package com.example.eunoia.user_profile3.healthyfoodsuggestion.course.ab;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eunoia.user_profile3.R;
public class ab3 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ab3);

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
                        textView.setText("Top this soup with toasted tortilla strips and serve with lime wedges and avocado slides.\n" +
                                "\n" +
                                "Calories:\t\t290.7 per serving\n" +
                                "Total Fat:\t\t13.7 g\n" +
                                "Total Carbohydrate:\t\t24.3 g\n" +
                                "Protein:\t\t20.6 g");
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
                                "Minutes to Cook: 20\n" +
                                "Number of Servings: 6\n" +
                                "\n" +
                                "Ingredients\n" +
                                "\n" +
                                "16 ounces extra lean ground beef \n" +
                                "1 small yellow onion, chopped (about 1/2 cup)\n" +
                                "1 recipe Taco Seasoning\n" +
                                "\n" +
                                "1 (14.5 ounce) can no salt added tomato sauce\n" +
                                "1 (14.5 ounce) diced tomatoes with green chilies\n" +
                                "1 (14.5 ounce) dark kidney beans, drained and rinsed \n" +
                                "1 cup frozen or canned corn kernels\n" +
                                "1/2 cup chickpeas, drained and rinsed, mashed\n" +
                                "\n" +
                                "Tips\n" +
                                "\n" +
                                "Just before serving, squeeze in the juice of half a lime for a kick.\n" +
                                "\n" +
                                "\n" +
                                "Directions\n" +
                                "\n" +
                                "Brown the ground beef and onion in a large saucepan over medium heat. Blot any excess grease with a paper towel, then add the taco seasoning. Cook for one minute, then add the tomato sauce, diced tomatoes, kidney beans, and one cup water. \n" +
                                "\n" +
                                "Reduce heat to medium-low, and simmer for 10 minutes. \n" +
                                "\n" +
                                "Add the corn and mashed garbanzo beans, and simmer five more minutes. ");
                    }

                }
            });
        }
    }
}