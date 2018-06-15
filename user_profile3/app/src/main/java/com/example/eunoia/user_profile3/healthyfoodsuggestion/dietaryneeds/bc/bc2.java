package com.example.eunoia.user_profile3.healthyfoodsuggestion.dietaryneeds.bc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eunoia.user_profile3.R;
public class bc2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bc2);

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
                        textView.setText("mmm... mmm... good.\n" +
                                "\n" +
                                "Calories:\t\t71.1 per serving\n" +
                                "Total Fat:\t\t0.3 g\n" +
                                "Total Carbohydrate:\t\t15.9 g\n" +
                                "Protein:\t\t2.8 g");
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
                                "Minutes to Cook: 20\n" +
                                "Number of Servings: 12\n" +
                                "\n" +
                                "Ingredients\n" +
                                "\n" +
                                "1.5 C Flour\n" +
                                "3/4 C Splenda\n" +
                                "2 tsp baking powder\n" +
                                "1 tsp baking soda\n" +
                                "1/2 tsp salt\n" +
                                "2/3 C plain non-fat yogurt\n" +
                                "2/3 C water\n" +
                                "3/4 C Blueberries (can sub. other fruit)\n" +
                                "\n" +
                                "Directions\n" +
                                "\n" +
                                "Combine and mix dry ingredients. Then add water and yogurt, mix then add berries and stir carefully. Fill greased muffin cups 3/4 full. Bake at 400 F. for 18 minutes. \n");
                    }

                }
            });
        }
    }
}