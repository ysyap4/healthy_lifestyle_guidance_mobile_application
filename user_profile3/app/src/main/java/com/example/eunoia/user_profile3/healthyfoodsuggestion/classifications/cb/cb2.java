package com.example.eunoia.user_profile3.healthyfoodsuggestion.classifications.cb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eunoia.user_profile3.R;
public class cb2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cb2);

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
                        textView.setText("If you are looking for the perfect boneless pork chops, this is it!\n" +
                                "\n" +
                                "Calories:\t\t204.3 per serving\n" +
                                "Total Fat:\t\t5.7 g\n" +
                                "Total Carbohydrate:\t\t18.4 g\n" +
                                "Protein:\t\t19.9 g");
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
                                "Number of Servings: 6\n" +
                                "\n" +
                                "Ingredients\n" +
                                "\n" +
                                "1/4 + 1/8 cup honey\n" +
                                "3 tbsp soy sauce\n" +
                                "6 cloves garlic, minced\n" +
                                "6 pork loin chops, boneless, trimmed of excess fat, 4 oz each\n" +
                                "\n" +
                                "Directions\n" +
                                "\n" +
                                "In a shallow dish, whisk together honey, soy sauce and garlic.\n" +
                                "Coat chops in mixture.\n" +
                                "Reserve left over honey mixture for basting.\n" +
                                "Place chops on greased grill over med high heat, close lid and cook. basting 2 times.\n");
                    }

                }
            });
        }
    }
}