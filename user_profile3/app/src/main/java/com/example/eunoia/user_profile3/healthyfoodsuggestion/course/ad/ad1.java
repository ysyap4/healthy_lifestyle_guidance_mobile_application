package com.example.eunoia.user_profile3.healthyfoodsuggestion.course.ad;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eunoia.user_profile3.R;
public class ad1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad1);

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
                        textView.setText("Fresh, juicy and delicious when combined with tender spinach and creamy goat cheese.\n" +
                                "\n" +
                                "Calories:\t\t181.2 per serving\n" +
                                "Total Fat:\t\t16.6 g\n" +
                                "Total Carbohydrate:\t\t6.4 g\n" +
                                "Protein:\t\t4.0 g");
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
                                "Minutes to Cook: 2\n" +
                                "Number of Servings: 4\n" +
                                "\n" +
                                "Ingredients\n" +
                                "\n" +
                                "1/3 cup almonds, slivered\n" +
                                "4 cups baby spinach\n" +
                                "3/4 cup strawberries, quartered\n" +
                                "1 tablespoon balsamic vinegar\n" +
                                "1 teaspoon Dijon mustard\n" +
                                "1 teaspoon honey\n" +
                                "3 tablespoon extra virgin olive oil\n" +
                                "1 ounce soft goat cheese\n" +
                                "Salt and pepper to taste\n" +
                                "\n" +
                                "Directions\n" +
                                "\n" +
                                "Place the almonds in a dry skillet or saute pan. Cook over low heat, shaking the pan the entire time until the almonds are toasting. The almonds are done when you start to smell a \"nutty\" scent. \n" +
                                "\n" +
                                "Remove almonds from the pan to cool. (Do not cool in the skillet because they will burn from the heat that remains in the pan.) \n" +
                                "\n" +
                                "Prepare the dressing by placing the vinegar, mustard, and honey in a mixing bowl. Slowly whisk in the oil. \n" +
                                "\n" +
                                "Place the spinach in a large bowl. Add the strawberries, almonds, and dressing. Toss to coat. Top with goat cheese. If desired, season with a pinch of salt and pepper.");
                    }

                }
            });
        }
    }
}