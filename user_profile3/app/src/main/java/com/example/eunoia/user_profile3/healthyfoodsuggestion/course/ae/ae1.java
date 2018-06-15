package com.example.eunoia.user_profile3.healthyfoodsuggestion.course.ae;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eunoia.user_profile3.R;
public class ae1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ae1);

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
                        textView.setText("This soup is filling and delicious - a perfect starter or light vegetarian meal.\n" +
                                "\n" +
                                "Calories:\t\t165.2 per serving\n" +
                                "Total Fat:\t\t1.8 g\n" +
                                "Total Carbohydrate:\t\t36.6 g\n" +
                                "Protein:\t\t8.3 g");
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
                                "Minutes to Cook: 25\n" +
                                "Number of Servings: 6\n" +
                                "\n" +
                                "Ingredients\n" +
                                "\n" +
                                "1 28 oz can crushed tomatoes\n" +
                                "1 medium onion, diced\n" +
                                "3 stalks celery, diced\n" +
                                "3 medium carrots, diced\n" +
                                "1 head cabbage, shredded\n" +
                                "1 14.5 oz can green beans\n" +
                                "1 12 oz can sweet yellow corn\n" +
                                "1 15 oz can pinto beans\n" +
                                "\n" +
                                "Directions\n" +
                                "\n" +
                                "1. Place tomatoes, onion, celery, carrots, and cabbage in a pot, simmer over medium heat until tender, about 20 minutes.\n" +
                                "\n" +
                                "2. Add canned vegetables. Heat and serve.\n");
                    }

                }
            });
        }
    }
}