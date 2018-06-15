package com.example.eunoia.user_profile3.healthyfoodsuggestion.dietaryneeds.bc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eunoia.user_profile3.R;
public class bc5 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bc5);

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
                        textView.setText("This dip tastes decadent but is very healthy. Great Valentine to share with someone you love!\n" +
                                "\n" +
                                "Calories:\t\t37.8 per serving\n" +
                                "Total Fat:\t\t0.0 g\n" +
                                "Total Carbohydrate:\t\t3.4 g\n" +
                                "Protein:\t\t5.9 g");
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
                                "Number of Servings: 4\n" +
                                "\n" +
                                "Ingredients\n" +
                                "\n" +
                                "4 oz Philadelphia* Fat Free Cream Cheese\n" +
                                "3 oz Dannon Light & Fit Vanilla Yogurt\n" +
                                "1 tablespoon fresh Orange Juice\n" +
                                "1 teaspoon grated Orange Peel\n" +
                                "\n" +
                                "Directions\n" +
                                "\n" +
                                "1. Let cream cheese soften then add remaining ingredients. \n" +
                                "\n" +
                                "2. Mix with electric mixer until blended well. \n" +
                                "\n" +
                                "3. Store in covered container in refrigerator or serve immediately. \n" +
                                "\n" +
                                "Great with fresh fruit of any kind, sliced apples, pears, bananas, melon, grapes, etc. \n" +
                                "\n" +
                                "Can be doubled to serve at a party with a fruit tray.");
                    }

                }
            });
        }
    }
}
