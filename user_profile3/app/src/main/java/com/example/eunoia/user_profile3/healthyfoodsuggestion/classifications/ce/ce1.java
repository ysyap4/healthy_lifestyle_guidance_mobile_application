package com.example.eunoia.user_profile3.healthyfoodsuggestion.classifications.ce;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eunoia.user_profile3.R;
public class ce1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ce1);

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
                        textView.setText("A healthy and filling middle eastern dip! Eat it as an appetizer with some pita.\n" +
                                "\n" +
                                "Calories:\t\t63.9 per serving\n" +
                                "Total Fat:\t\t2.0 g\n" +
                                "Total Carbohydrate:\t\t9.4 g\n" +
                                "Protein:\t\t3.1 g");
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
                                "Number of Servings: 14\n" +
                                "\n" +
                                "Ingredients\n" +
                                "\n" +
                                "2 15 ounce cans of chickpeas, drained and rinsed\n" +
                                "Juice of 1 small lemon (seeds removed, pulp optional)\n" +
                                "1 tablespoon good olive oil\n" +
                                "1 tablespoon tahini (sesame paste, you can find it in the \"international\" aisle in the grocery store or more cheaply in a middle eastern specialty shop)\n" +
                                "2 small or one large clove of garlic, finely grated\n" +
                                "Water to adjust consistancy\n" +
                                "Sweet hungarian paprika to garnish\n" +
                                "\n" +
                                "A strong blender or food processor.\n" +
                                "\n" +
                                "Directions\n" +
                                "\n" +
                                "1. Drain and wash the chickpeas, add to blender or food processor. \n" +
                                "2. Add grated garlic, olive oil, tahini, lemon juice, and about 2 tablespoons of water.\n" +
                                "3. Puree until there are no whole chickpeas, and the hummus is a thick paste.\n" +
                                "4. Remove from bowl of mixer and garnish with a sprinkle of paprika. You could drizzle some olive oil and toss some chopped tomatoes on top of it if you desire. Serve with pita bread.\n" +
                                "\n" +
                                "This dish makes a lovely addition to a middle eastern appetizer platter, the centerpiece for a tray of veggies, or an amazingly filling snack. You can add all sorts of things to your hummus (see the variety of different pre-made hummus in the grocery store for inspiration!)");
                    }

                }
            });
        }
    }
}