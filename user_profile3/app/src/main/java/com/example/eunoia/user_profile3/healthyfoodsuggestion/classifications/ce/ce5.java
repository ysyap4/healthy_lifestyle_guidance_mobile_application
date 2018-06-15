package com.example.eunoia.user_profile3.healthyfoodsuggestion.classifications.ce;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eunoia.user_profile3.R;
public class ce5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ce5);

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
                        textView.setText("Serve this at your next potluck.\n" +
                                "\n" +
                                "Calories:\t\t68.8 per serving\n" +
                                "Total Fat:\t\t2.8 g\n" +
                                "Total Carbohydrate:\t\t9.4 g\n" +
                                "Protein:\t\t2.6 g");
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
                                "Number of Servings: 24\n" +
                                "\n" +
                                "Ingredients\n" +
                                "\n" +
                                "2 (15 oz) cans black beans, rinsed\n" +
                                "1 (17 oz) can whole kernel corn, drained\n" +
                                "2 large tomatoes, chopped\n" +
                                "1 large avocado, diced\n" +
                                "1/2 red onion, chopped\n" +
                                "1/4 cup chopped fresh cilantro\n" +
                                "\n" +
                                "Dressing\n" +
                                "\n" +
                                "1 Tbsp red wine vinegar\n" +
                                "3-4 Tbsp lime juice\n" +
                                "2 Tbsp olive oil\n" +
                                "1 tsp salt\n" +
                                "1/2 tsp pepper\n" +
                                "\n" +
                                "\n" +
                                "Directions\n" +
                                "\n" +
                                "1. Combine all ingredients in a large bowl.\n" +
                                "\n" +
                                "2. Cover and chill.\n" +
                                "\n" +
                                "3. Garnish with avocado slices\n" +
                                "or cilantro sprigs.\n" +
                                "\n" +
                                "4. Serve with tortilla chips.");
                    }

                }
            });
        }
    }
}