package com.example.eunoia.user_profile3.healthyfoodsuggestion.classifications.cb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eunoia.user_profile3.R;
public class cb4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cb4);

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
                        textView.setText("This beef stroganoff can be readily served in 25 minutes.\n" +
                                "\n" +
                                "Calories:\t\t214.7 per serving\n" +
                                "Total Fat:\t\t24.1 g\n" +
                                "Total Carbohydrate:\t\t31.5 g\n" +
                                "Protein:\t\t30.9 g");
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
                                "Minutes to Cook: 15\n" +
                                "Number of Servings: 1\n" +
                                "\n" +
                                "Ingredients\n" +
                                "\n" +
                                "1 lb. beef tenderloin tips \n" +
                                "1 1/2 cups whole wheat bow tie pasta\n" +
                                "1/2 lb. mushrooms, sliced \n" +
                                "1/3 cup chopped onion \n" +
                                "2 teaspoons olive oil \n" +
                                "2 tablespoons whole wheat flour \n" +
                                "1 (10.5 oz.) can beef broth \n" +
                                "\n" +
                                "Tips\n" +
                                "\n" +
                                "Garnish with a few sprinkles of parsley for a touch of color.\n" +
                                "\n" +
                                "\n" +
                                "Directions\n" +
                                "\n" +
                                "1. Cook pasta according to package directions. \n" +
                                "2. While pasta is cooking, trim fat from meat and cut into 1 x 1/2\" pieces. Spray a large skillet with vegetable cooking spray. Heat skillet over medium-high heat until hot. Add beef and stir-fry 3-5 minutes until outside surface is no longer pink. Remove from skillet. \n" +
                                "3. In the same skillet, add the olive oil and heat until hot. Add the onions and mushrooms and cook until tender, about 2-3 minutes. \n" +
                                "4. Stir in the flour. Gradually add 1 cup beef broth, stirring until blended. Bring to boil. Cook and stir 2 minutes. Return beef to skillet and heat through. If stroganoff appears too thick, add more beef broth to thin as desired. \n" +
                                "Salt and pepper to taste. \n" +
                                "Serve beef mixture over pasta. Add dollop of sour cream, if desired. ");
                    }

                }
            });
        }
    }
}