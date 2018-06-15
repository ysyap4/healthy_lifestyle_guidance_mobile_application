package com.example.eunoia.user_profile3.healthyfoodsuggestion.classifications.cc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eunoia.user_profile3.R;
public class cc1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cc1);

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
                        textView.setText("Delicious and quick, this dish is a great way to get more fish into your healthy meal plan! This baked tilapia cannot be beaten.\n" +
                                "\n" +
                                "Calories:\t\t177.1 per serving\n" +
                                "Total Fat:\t\t10.5 g\n" +
                                "Total Carbohydrate:\t\t1.2 g\n" +
                                "Protein:\t\t19.6 g");
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
                                "Minutes to Cook: 10\n" +
                                "Number of Servings: 4\n" +
                                "\n" +
                                "Ingredients\n" +
                                "\n" +
                                "1/4 cup Parmesan cheese \n" +
                                "2 tablespoons butter, softened \n" +
                                "1 tablespoon and 1-1/2 teaspoons reduced-fat mayonnaise \n" +
                                "1 tablespoon fresh lemon juice \n" +
                                "1/8 teaspoon dried basil \n" +
                                "1/8 teaspoon ground black pepper \n" +
                                "1/8 teaspoon onion powder \n" +
                                "1/8 teaspoon celery seed\n" +
                                "1 pound tilapia fillets\n" +
                                "\n" +
                                "Tips\n" +
                                "\n" +
                                "Serve with broccoli and brown rice.\n" +
                                "\n" +
                                "\n" +
                                "Directions\n" +
                                "\n" +
                                "Preheat your oven's broiler. Grease a broiling pan or line pan with aluminum foil. \n" +
                                "\n" +
                                "In a small bowl, mix together the Parmesan cheese, butter, mayonnaise and lemon juice. Season with dried basil, pepper, onion powder and celery salt. Mix well and set aside. \n" +
                                "\n" +
                                "Arrange fillets in a single layer on the prepared pan. Broil a few inches from the heat for 2 to 3 minutes. Flip the fillets over and broil for a couple more minutes. Remove the fillets from the oven and cover them with the Parmesan cheese mixture on the top side. Broil for 2 more minutes or until the topping is browned and fish flakes easily with a fork. Be careful not to overcook the fish. ");
                    }

                }
            });
        }
    }
}