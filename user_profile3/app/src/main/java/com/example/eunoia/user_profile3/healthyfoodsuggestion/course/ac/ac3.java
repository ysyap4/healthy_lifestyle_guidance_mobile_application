package com.example.eunoia.user_profile3.healthyfoodsuggestion.course.ac;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eunoia.user_profile3.R;
public class ac3 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ac3);

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
                        textView.setText("A quick and easy pasta dish perfect for any night of the week.\n" +
                                "\n" +
                                "Calories:\t\t207.6 per serving\n" +
                                "Total Fat:\t\t7.0 g\n" +
                                "Total Carbohydrate:\t\t25.4 g\n" +
                                "Protein:\t\t14.3 g");
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
                                "Minutes to Cook: 15\n" +
                                "Number of Servings: 4\n" +
                                "\n" +
                                "Ingredients\n" +
                                "\n" +
                                "3 cups whole wheat pasta\n" +
                                "12 spears asparagus\n" +
                                "1/2 chicken breast, bone and skin removed \n" +
                                "1-1/2 cups fresh mushrooms, pieces or slices \n" +
                                "1/2 cup low sodium chicken broth\n" +
                                "1 tbsp extra virgin olive oil\n" +
                                "1/4 cup feta cheese, crumbled\n" +
                                "1 medium tomato\n" +
                                "Pinch of pepper, red or cayenne\n" +
                                "\n" +
                                "Directions\n" +
                                "\n" +
                                "Cook pasta according to package directions. \n" +
                                "Meanwhile, cut chicken into bite-sized cubes and place in skillet with olive oil. \n" +
                                "Cook until partially done. \n" +
                                "Add asparagus and mushrooms, continue cooking until chicken is done. \n" +
                                "Add chicken broth and cover pan, cook until asparagus is crisp tender. \n" +
                                "Add pasta, red pepper flakes (to taste), and feta cheese. Remove from heat. \n" +
                                "Serve with fresh diced tomatoes to garnish. Enjoy!");
                    }

                }
            });
        }
    }
}