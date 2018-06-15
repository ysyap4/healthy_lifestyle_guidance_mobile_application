package com.example.eunoia.user_profile3.healthyfoodsuggestion.dietaryneeds.bb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eunoia.user_profile3.R;
public class bb3 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bb3);

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
                        textView.setText("High fiber, healthy breakfast muffin.\n" +
                                "\n" +
                                "Calories:\t\t115.7 per serving\n" +
                                "Total Fat:\t\t3.4 g\n" +
                                "Total Carbohydrate:\t\t20.8 g\n" +
                                "Protein:\t\t2.9 g");
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
                                "Number of Servings: 24\n" +
                                "\n" +
                                "Ingredients\n" +
                                "\n" +
                                "1 C.flaxseed ground\n" +
                                "1 C whole wheat flour\n" +
                                "1 C. Oat Bran\n" +
                                "1 C. Brown sugar\n" +
                                "2 tsp. Baking soda\n" +
                                "1 tsp Baking Powder\n" +
                                "1/2 tsp salt\n" +
                                "2 tbsp. Cinnamon\n" +
                                "1 1/2 C. shredded Carrots\n" +
                                "2-3 Apples, cored and chopped up or shredded\n" +
                                "1/2 C. Chopped nuts (optional)\n" +
                                "1/2 c. Raisins (optional)\n" +
                                "3/4 C. 2 % milk\n" +
                                "2 Eggs, beaten\n" +
                                "1 tsp. Vanilla\n" +
                                "\n" +
                                "Directions\n" +
                                "\n" +
                                "Mix flour, flaxseed, bran, sugar and dry ingredients together. Shred carrots and apples and add these along with optional raisins and nuts to dry ingredients. Mix well. Stir together milk eggs and vanilla and stir this into batter until well moistened. Fill cupcake papers until 3.4 full and bake at 350* for 20 to 25 minutes.\n" +
                                "Makes 24 med muffins. ");
                    }

                }
            });
        }
    }
}