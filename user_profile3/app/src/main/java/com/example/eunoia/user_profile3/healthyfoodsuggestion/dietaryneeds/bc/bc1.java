package com.example.eunoia.user_profile3.healthyfoodsuggestion.dietaryneeds.bc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eunoia.user_profile3.R;
public class bc1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bc1);

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
                        textView.setText("A yummy and creamy fruit salad with no added sugar.\n" +
                                "\n" +
                                "Calories:\t\t135.9 per serving\n" +
                                "Total Fat:\t\t2.7 g\n" +
                                "Total Carbohydrate:\t\t29.0 g\n" +
                                "Protein:\t\t0.5 g");
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
                                "Number of Servings: 10\n" +
                                "\n" +
                                "Ingredients\n" +
                                "\n" +
                                "-One 20 oz can Crushed Pineapple in pineapple juice (do not drain!)\n" +
                                "-One 15 oz can Mandarin orange sections canned in water (drained)\n" +
                                "-One container Sugar Free Cool Whip\n" +
                                "-One package Sugar Free Fat Free Jello brand Banana Cream pudding mix\n" +
                                "-1 Cup Grapes\n" +
                                "-1 Cup Strawberries sliced\n" +
                                "-1 Cup Blueberries\n" +
                                "\n" +
                                "**Any other fruit can be put into this fruit salad except bananas because they get brown and mushy.\n" +
                                "\n" +
                                "Directions\n" +
                                "\n" +
                                "Mix all ingredients together in a large bowl\n" +
                                "\n" +
                                "Enjoy right away or refridgerate until needed.");
                    }

                }
            });
        }
    }
}