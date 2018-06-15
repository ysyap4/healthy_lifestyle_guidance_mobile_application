package com.example.eunoia.user_profile3.healthyfoodsuggestion.course.ad;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eunoia.user_profile3.R;
public class ad2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ad2);

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
                        textView.setText("Sweet sweet healthy babe.\n" +
                                "\n" +
                                "Calories:\t\t103.7 per serving\n" +
                                "Total Fat:\t\t4.1 g\n" +
                                "Total Carbohydrate:\t\t15.9 g\n" +
                                "Protein:\t\t1.1 g");
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
                        textView.setText("Ingredients\n" +
                                "\n" +
                                "2 med-lg sweet potatoes, peeled and cubed\n" +
                                "1 Tbsp light butter w/ canola oil \n" +
                                "1 tsp canola oil\n" +
                                "\n" +
                                "Directions\n" +
                                "\n" +
                                "Melt the butter and combine with canola oil and salt. Coat the sweet potatoes. Spread the potatoes in a foil lined baking sheet. Bake at 350 degrees for about 25-30 minutes or until tender.\n" +
                                "\n" +
                                "Number of Servings: 4");
                    }

                }
            });
        }
    }
}