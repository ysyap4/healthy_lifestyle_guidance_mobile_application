package com.example.eunoia.user_profile3.healthyfoodsuggestion.classifications.ca;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eunoia.user_profile3.R;
public class ca4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ca4);

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
                        textView.setText("A quick, easy and healthy meal in minutes.\n" +
                                "\n" +
                                "Calories:\t\t195.0 per serving\n" +
                                "Total Fat:\t\t8.8 g\n" +
                                "Total Carbohydrate:\t\t3.3 g\n" +
                                "Protein:\t\t24.4 g");
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
                                "Number of Servings: 8\n" +
                                "\n" +
                                "Ingredients\n" +
                                "\n" +
                                "4 cups shredded cooked chicken\n" +
                                "1 cup shredded cheddar cheese\n" +
                                "2 eggs \n" +
                                "1/4 chopped onion\n" +
                                "1/4 cup seasoned breadcrumbs \n" +
                                "2 tablespoons poultry seasoning \n" +
                                "\n" +
                                "Directions\n" +
                                "\n" +
                                "Combine all ingredients in a medium bowl. \n" +
                                "Chill the mixture for at least 30 minutes. \n" +
                                "Place a large skillet coated with cooking spray over medium-high heat. \n" +
                                "Divide the mixture into 8 portions and cook for about five minutes per side, until the outside is crispy and the cheese has melted. \n" +
                                "Serve with reduced-fat sour cream (calories not included). ");
                    }

                }
            });
        }
    }
}