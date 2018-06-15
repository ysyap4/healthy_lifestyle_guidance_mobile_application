package com.example.eunoia.user_profile3.healthyfoodsuggestion.classifications.ca;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eunoia.user_profile3.R;

public class ca1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ca1);

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
                        textView.setText("Rich, flavorful honey mustard chicken with carrots and potatoes.\n" +
                                "\n" +
                                "Calories:\t\t356.7 per serving\n" +
                                "Total Fat:\t\t8.9 g\n" +
                                "Total Carbohydrate:\t\t39.4 g\n" +
                                "Protein:\t\t30.5 g");
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
                                "Rich, flavorful honey mustard chicken with carrots and potatoes.\n" +
                                "\n" +
                                "Ingredients\n" +
                                "\n" +
                                "1 lb. potatoes, cut into wedges\n" +
                                "2 lbs. chicken, rinsed\n" +
                                "6 medium carrots, sliced\n" +
                                "2 Tablespoons olive oil\n" +
                                "1-1/2 Tablespoons honey\n" +
                                "3 Tablespoons mustard\n" +
                                "1 teaspoon dried rosemary\n" +
                                "2 heads garlic, peeled\n" +
                                "salt and pepper to taste\n" +
                                "\n" +
                                "Directions\n" +
                                "\n" +
                                "1. Preheat oven to 425 degrees F. \n" +
                                "2. In a shallow pan, toss potatoes and carrots with oil, salt and pepper. \n" +
                                "3. Nestle peeled garlic cloves amongst the vegetables and scatter the rosemary on top. \n" +
                                "4. Arrange the chicken among the vegetables and bake uncovered for 30 minutes.\n" +
                                "5. Meanwhile, stir the mustard and honey together.\n" +
                                "6. Remove the pan from the oven. Carefully take the chicken from the pan to another clean plate. Spread the honey-mustard mixture over the chicken.\n" +
                                "7. Stir vegetables in the pan, return coated chicken to the pan, and place pan back into the oven. Bake 10-20 minutes, until chicken is cooked and vegetables are tender. ");
                    }

                }
            });
        }
    }
}