package com.example.eunoia.user_profile3.healthyfoodsuggestion.course.af;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eunoia.user_profile3.R;
public class af1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_af1);

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
                        textView.setText("A filling breakfast or post-workout recovery drink, this protein-packed smoothie taste just like strawberry cheesecake!\n" +
                                "\n" +
                                "Calories:\t\t236.3 per serving\n" +
                                "Total Fat:\t\t2.7 g\n" +
                                "Total Carbohydrate:\t\t36.4 g\n" +
                                "Protein:\t\t19.4 g");
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
                                "Number of Servings: 1\n" +
                                "\n" +
                                "Ingredients\n" +
                                "\n" +
                                "1/2 cup 1% Milk \n" +
                                "1/2 cup Lowfat 1% Cottage Cheese \n" +
                                "4-8 packets of Splenda (or sweeten to taste w/ your choice of sweeteners) \n" +
                                "1/2 tsp. Vanilla or Almond extract (optional) \n" +
                                "2 cups (300 grams) Strawberries, frozen, unsweetened\n" +
                                "\n" +
                                "Tips\n" +
                                "\n" +
                                "Do not add the frozen fruit until cottage cheese is blended smooth.\n" +
                                "\n" +
                                "\n" +
                                "Directions\n" +
                                "\n" +
                                "Place the milk, cottage cheese, sweetener and extract in blender and blend until completely smooth and all lumps are gone (30 seconds). NOTE: DO NOT ADD FROZEN FRUIT UNTIL COTTAGE CHEESE IS BLENDED SMOOTH.\n" +
                                "\n" +
                                "Then add frozen strawberries (or frozen fruit of choice) a few at a time, blending in-between each addition until all are added and shake is smooth. ");
                    }

                }
            });
        }
    }
}