package com.example.eunoia.user_profile3.healthyfoodsuggestion.course.aa;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eunoia.user_profile3.R;
public class aa3 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aa3);

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
                        textView.setText("How does oatmeal fuel your busy day? With this hearty, healthy breakfast, of course!\n" +
                                "\n" +
                                "Calories:\t\t214.2 per serving\n" +
                                "Total Fat:\t\t5.7 g\n" +
                                "Total Carbohydrate:\t\t38.4 g\n" +
                                "Protein:\t\t6.9 g");
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
                                "Number of Servings: 2\n" +
                                "\n" +
                                "Ingredients\n" +
                                "\n" +
                                "1 cup 100% Natural Whole Grain oatmeal\n" +
                                "2 tbsp Flax Seed Meal (ground flax)\n" +
                                "2 tsp Brown Sugar\n" +
                                "1/2 tbsp dry Cocoa powder, unsweetened\n" +
                                "1/2 cup Blueberries, frozen (unsweetened)\n" +
                                "1.5 cup water\n" +
                                "\n" +
                                "Directions\n" +
                                "\n" +
                                "Bring Water to boil in pan. Mix all dry ingredients in bowl and add to boiling water. Reduce heat to low and cook for 2-3 minutes, or until desired consistency. Stir in still-frozen blueberries after cooking.");
                    }

                }
            });
        }
    }
}