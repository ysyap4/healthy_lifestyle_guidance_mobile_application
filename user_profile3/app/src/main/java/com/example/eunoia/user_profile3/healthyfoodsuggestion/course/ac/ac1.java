package com.example.eunoia.user_profile3.healthyfoodsuggestion.course.ac;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eunoia.user_profile3.R;
public class ac1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ac1);

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
                        textView.setText("This is a delicious chicken recipe that my family loves!\n" +
                                "\n" +
                                "Calories:\t\t166.4 per serving\n" +
                                "Total Fat:\t\t8.0 g\n" +
                                "Total Carbohydrate:\t\t4.3 g\n" +
                                "Protein:\t\t19.4 g");
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
                                "4 tsp brown sugar\n" +
                                "12 ounces boneless, skinless chicken breasts\n" +
                                "1 clove garlic\n" +
                                "2 Tbsp butter\n" +
                                "Dash black pepper\n" +
                                "\n" +
                                "Directions\n" +
                                "\n" +
                                "This makes four servings, 3 oz per person\n" +
                                "1. Melt the butter in a frying pan\n" +
                                "2. Brown the garlic in the butter\n" +
                                "3. Add chicken breasts to garlic and butter and cook thoroughly, adding pepper as you like it.\n" +
                                "4. When chicken is fully cooked add brown sugar on top of each breast\n" +
                                "5. Allow the brown sugar to melt into the chicken (about 5 minutes)\n" +
                                "6. Serve with your favorite carb, and veggie or salad. We usually have rice or noodles and carrots or green beans.");
                    }

                }
            });
        }
    }
}