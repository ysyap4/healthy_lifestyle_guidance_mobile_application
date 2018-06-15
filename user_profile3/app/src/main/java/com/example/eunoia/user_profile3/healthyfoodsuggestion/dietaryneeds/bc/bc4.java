package com.example.eunoia.user_profile3.healthyfoodsuggestion.dietaryneeds.bc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eunoia.user_profile3.R;
public class bc4 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bc4);

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
                        textView.setText("This dessert is to die for and can be made with so many different flavors. Try vanilla, plus it has 19 grams of protein in just one serving.\n" +
                                "\n" +
                                "Calories:\t\t143.3 per serving\n" +
                                "Total Fat:\t\t1.5 g\n" +
                                "Total Carbohydrate:\t\t12.8 g\n" +
                                "Protein:\t\t19.3 g");
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
                                "Minutes to Prepare: 4\n" +
                                "Number of Servings: 4\n" +
                                "\n" +
                                "Ingredients\n" +
                                "\n" +
                                "1 cup skim milk\n" +
                                "1 cup cold water\n" +
                                "3 scoops Pure Protein® Natural Whey Protein Powder, Rich Chocolate Flavor\n" +
                                "1 package Jell-o Sugar-Free Instant Pudding, Cheesecake flavor\n" +
                                "\n" +
                                "Directions\n" +
                                "\n" +
                                "Mix ingredients together in blender until well mixed, and portion out into small cups. Chill.");
                    }

                }
            });
        }
    }
}