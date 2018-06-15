package com.example.eunoia.user_profile3.healthyfoodsuggestion.course.af;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eunoia.user_profile3.R;
public class af2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_af2);

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
                        textView.setText("This low-cal lemonade is perfect on a hot afternoon.\n" +
                                "\n" +
                                "Calories:\t\t7.6 per serving\n" +
                                "Total Fat:\t\t0.0 g\n" +
                                "Total Carbohydrate:\t\t6.2 g\n" +
                                "Protein:\t\t0.1 g");
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
                                "Number of Servings: 8\n" +
                                "\n" +
                                "Ingredients\n" +
                                "\n" +
                                "5 cups water\n" +
                                "1 cup fresh lemon juice\n" +
                                "24 packets Splenda (1/2 cup), or to taste\n" +
                                "Ice cubes for serving\n" +
                                "Optional: Fresh mint sprigs, raspberries, or lemon slices for garnish\n" +
                                "\n" +
                                "Directions\n" +
                                "\n" +
                                "1. Stir water, lemon juice and Splenda in a large pitcher until Splenda dissolves.\n" +
                                "\n" +
                                "2. Serve over ice, garnish with mint (or berries) and lemon if desired.\n");
                    }

                }
            });
        }
    }
}