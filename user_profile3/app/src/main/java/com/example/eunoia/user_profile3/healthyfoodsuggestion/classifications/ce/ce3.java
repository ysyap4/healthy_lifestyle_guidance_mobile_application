package com.example.eunoia.user_profile3.healthyfoodsuggestion.classifications.ce;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eunoia.user_profile3.R;
public class ce3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ce3);

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
                        textView.setText("This hearty soup is super easy to prepare but packed with flavor. Change up the flavor by swapping in your favourite sausage.\n" +
                                "\n" +
                                "Calories:\t\t248.6 per serving\n" +
                                "Total Fat:\t\t4.3 g\n" +
                                "Total Carbohydrate:\t\t40.1 g\n" +
                                "Protein:\t\t15.4 g");
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
                                "Minutes to Cook: 30\n" +
                                "Number of Servings: 6\n" +
                                "\n" +
                                "Ingredients\n" +
                                "\n" +
                                "1 medium onion, chopped\n" +
                                "1 large carrot, peeled or scrubbed, chopped\n" +
                                "1 stalk of celery, sliced\n" +
                                "2 large cloves of garlic, minced\n" +
                                "1/2 tsp dried oregano\n" +
                                "1 medium potato, peeled, diced\n" +
                                "2 cups beef or chicken broth\n" +
                                "1 28 oz tin, diced tomatoes\n" +
                                "4-6 oz lean kielbasa sausage, cubed\n" +
                                "1 19oz tin black beans, or your favorite canned beans\n" +
                                "\n" +
                                "\n" +
                                "Directions\n" +
                                "\n" +
                                "1. Heat large pot with low fat cooking spray. Add onion, carrot and celery; cook and stir over medium heat until vegetables begin to soften.\n" +
                                "\n" +
                                "2. Stir in garlic, oregano, potato, broth and tomatoes; heat to boiling. Stir in Kielbasa. Cover and simmer gently for at least 1/2 hour to blend flavours.\n" +
                                "\n" +
                                "3. Drain and rinse beans. Add to soup. Heat until hot. Add salt and pepper to taste. Serve with crusty bread.");
                    }

                }
            });
        }
    }
}