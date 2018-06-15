package com.example.eunoia.user_profile3.healthyfoodsuggestion.dietaryneeds.ba;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eunoia.user_profile3.R;
public class ba3 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ba3);

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
                        textView.setText("Baked potatoes stuffed with seasoned cottage cheese are a lavish low-fat, low-cholesterol, low-sodium treat.\n" +
                                "\n" +
                                "Calories:\t\t164.4 per serving\n" +
                                "Total Fat:\t\t0.8 g\n" +
                                "Total Carbohydrate:\t\t32.8 g\n" +
                                "Protein:\t\t7.5 g");
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
                                "Baked potatoes stuffed with seasoned cottage cheese are a lavish low-fat, low-cholesterol, low-sodium treat.\n" +
                                "\n" +
                                "Minutes to Prepare: 10\n" +
                                "Minutes to Cook: 45\n" +
                                "Number of Servings: 8\n" +
                                "\n" +
                                "Ingredients\n" +
                                "\n" +
                                "4 medium baking potatoes\n" +
                                "3/4 cup low-fat (1%) cottage cheese\n" +
                                "1/4 cup 1% milk\n" +
                                "2 tablespoons fat-free plain Greek yogurt\n" +
                                "1 green onion, chopped\n" +
                                "3/4 teaspoon herb seasoning\n" +
                                "4-6 drops hot pepper sauce\n" +
                                "2 tablespoons shredded reduced-fat Cheddar or Parmesan cheese\n" +
                                "\n" +
                                "Directions\n" +
                                "\n" +
                                "1. Prick potatoes with fork. Bake at 425º F for 60 minutes or microwave on high until fork is easily inserted. \n" +
                                "\n" +
                                "2. Cut potatoes in half lengthwise. Carefully scoop out potato leaving about 1/2 inch of pulp inside shell. Mash pulp in large bowl. \n" +
                                "\n" +
                                "3. Mix in the remaining ingredients except cheese. Spoon mixture into potato shells. \n" +
                                "\n" +
                                "4. Sprinkle each top with 1/4 tablespoon cheese. \n" +
                                "\n" +
                                "5. Place on baking sheet and return to oven. Bake 15-20 minutes or until tops are golden brown.");
                    }

                }
            });
        }
    }
}