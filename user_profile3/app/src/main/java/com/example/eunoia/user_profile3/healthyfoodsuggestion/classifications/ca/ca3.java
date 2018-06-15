package com.example.eunoia.user_profile3.healthyfoodsuggestion.classifications.ca;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eunoia.user_profile3.R;
public class ca3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ca3);

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
                        textView.setText("Six ingredients, 5 minutes of hands-on cooking, and dinner is served!\n" +
                                "\n" +
                                "Calories:\t\t385.4 per serving\n" +
                                "Total Fat:\t\t12.5 g\n" +
                                "Total Carbohydrate:\t\t24.1 g\n" +
                                "Protein:\t\t41.0 g");
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
                                "Minutes to Cook: 240\n" +
                                "Number of Servings: 6\n" +
                                "\n" +
                                "Ingredients\n" +
                                "\n" +
                                "2 pounds boneless, skinless chicken breasts\n" +
                                "1 packet Italian dressing mix\n" +
                                "1/2 cup water \n" +
                                "1 (8-ounce) package reduced-fat cream cheese\n" +
                                "1 can 98% fat free cream of chicken soup\n" +
                                "3 cups cooked long grain rice (white or brown)\n" +
                                "\n" +
                                "Tips\n" +
                                "\n" +
                                "Just to clarify for the questions below:\n" +
                                "First, YES the cream cheese is figured into the totals...if you use FULL FAT cream cheese, the fat content will be considerably higher. But low fat cream cheese really takes the fat down.\n" +
                                "\n" +
                                "Second, I haven't ever tried it with regular Italian dressing...let me know how it turns out!\n" +
                                "\n" +
                                "Third, I HIGHLY recommend using the low setting for cooking...it allows the juices from the chicken to really seep into the dressing.\n" +
                                "\n" +
                                "\n" +
                                "Directions\n" +
                                "\n" +
                                "*1. Place chicken in crock pot\n" +
                                "*2. Mix together Italian dressing mix and water. Pour over chicken.\n" +
                                "*3. Cover and cook on high for 4 hours OR low for 8 hours.\n" +
                                "*4. Mix together cream cheese and soup in separate bowl.\n" +
                                "*5. Carefully remove chicken from crock pot to plate.\n" +
                                "*6. Pour cream cheese/soup mixture into crock pot and mix together with dressing in bottom.\n" +
                                "*7. Return chicken to crock pot and mix gently to shred the chicken.\n" +
                                "*8. Cook on LOW until heated through.");
                    }

                }
            });
        }
    }
}