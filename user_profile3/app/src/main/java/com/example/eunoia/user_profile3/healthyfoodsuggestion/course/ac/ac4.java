package com.example.eunoia.user_profile3.healthyfoodsuggestion.course.ac;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eunoia.user_profile3.R;
public class ac4 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ac4);

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
                        textView.setText("Forget about fancy spices, the ingredients are easy to gather to make this deliciously simple supper.\n" +
                                "\n" +
                                "Calories:\t\t183.1 per serving\n" +
                                "Total Fat:\t\t5.5 g\n" +
                                "Total Carbohydrate:\t\t14.9 g\n" +
                                "Protein:\t\t18.0 g");
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
                                "Forget fancy spices--four ingredients are all you need to make this deliciously simple supper.\n" +
                                "\n" +
                                "Minutes to Prepare: 5\n" +
                                "Minutes to Cook: 15\n" +
                                "Number of Servings: 4\n" +
                                "\n" +
                                "Ingredients\n" +
                                "\n" +
                                "1/4 cup pure maple syrup (NOT pancake syrup!) or honey\n" +
                                "1/4 cup soy sauce\n" +
                                "2-3 cloves minced garlic\n" +
                                "12 ounces fresh or thawed salmon\n" +
                                "\n" +
                                "Tips\n" +
                                "\n" +
                                "I usually go for the more complicated recipes, assuming that the more ingredients and preparation steps, the better. Not after trying this recipe!\n" +
                                "\n" +
                                "\n" +
                                "Directions\n" +
                                "\n" +
                                "Combine the first 3 ingredients in a gallon-size ziploc bag, shake it up, and then add the salmon. Allow to marinate in the refrigerator for an hour, turning after half an hour. Pour the salmon and the marinade into a baking dish and bake in a 350 degree oven, covered with foil, for 15 minutes. The salmon is done when it flakes easily at the thickest part. Enjoy! Makes (4) 3 ounce servings.");
                    }

                }
            });
        }
    }
}