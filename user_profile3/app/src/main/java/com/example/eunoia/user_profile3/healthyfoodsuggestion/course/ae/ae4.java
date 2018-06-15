package com.example.eunoia.user_profile3.healthyfoodsuggestion.course.ae;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eunoia.user_profile3.R;
public class ae4 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ae4);

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
                        textView.setText("This soup is packed with flavor yet low in fat. You can customize it with any vegetables or protein you have on hand.\n" +
                                "\n" +
                                "Calories:\t\t247.5 per serving\n" +
                                "Total Fat:\t\t5.8 g\n" +
                                "Total Carbohydrate:\t\t29.1 g\n" +
                                "Protein:\t\t22.8 g");
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
                                "This soup is packed with flavor yet low in fat. You can customize it with any vegetables or protein you have on hand.\n" +
                                "\n" +
                                "Minutes to Prepare: 10\n" +
                                "Minutes to Cook: 15\n" +
                                "Number of Servings: 4\n" +
                                "\n" +
                                "Ingredients\n" +
                                "\n" +
                                "1 tablespoon low-sodium soy sauce\n" +
                                "2 teaspoons fresh ginger, grated\n" +
                                "8 ounces beef sirloin, sliced into 1-inch strips\n" +
                                "1 quart (32 ounces) reduced-sodium or homemade beef stock\n" +
                                "2 large carrots, shredded or thinly chopped\n" +
                                "1/2 head Napa cabbage (about 2 1/2 cups), shredded\n" +
                                "1 1/2 cups sliced mushrooms, tops only\n" +
                                "1/2 teaspoon sesame oil\n" +
                                "2 cups bean sprouts\n" +
                                "1 teaspoon sriracha sauce\n" +
                                "1/4 cup cilantro leaves, chopped\n" +
                                "3 green onions, chopped\n" +
                                "\n" +
                                "\n" +
                                "Directions\n" +
                                "\n" +
                                "Mix the soy sauce and ginger in a medium bowl, add the beef, and let marinate.\n" +
                                "Meanwhile, bring the stock to a boil in a large saucepan or stock pot. \n" +
                                "Add the beef and sauce to the boiling stock, and reduce heat to medium-high. Cook for two minutes, then add the carrots, cabbage, and mushrooms. \n" +
                                "Cook another two minutes then add the sesame oil, sriracha, and bean sprouts. \n" +
                                "Cook two more minutes, then remove from heat and garnish with cilantro and green onions.");
                    }

                }
            });
        }
    }
}