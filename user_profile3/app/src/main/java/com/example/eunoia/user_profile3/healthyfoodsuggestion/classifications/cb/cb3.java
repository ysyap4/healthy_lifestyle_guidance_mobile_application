package com.example.eunoia.user_profile3.healthyfoodsuggestion.classifications.cb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eunoia.user_profile3.R;
public class cb3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cb3);

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
                        textView.setText("These spicy and moist boneless pork chops are made with no added fat, egg whites, evaporated skim milk, and a lively herb mixture.\n" +
                                "\n" +
                                "Calories:\t\t271.4 per serving\n" +
                                "Total Fat:\t\t12.1 g\n" +
                                "Total Carbohydrate:\t\t11.1 g\n" +
                                "Protein:\t\t27.9 g");
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
                                "6 lean center-cut pork chops, 1/2\" thick \n" +
                                "1 egg white \n" +
                                "1 cup evaporated skim milk \n" +
                                "3/4 cup cornflake crumbs \n" +
                                "1/4 cup fine dry bread crumbs \n" +
                                "4 teaspoons paprika \n" +
                                "2 teaspoons oregano \n" +
                                "3/4 teaspoon chili powder \n" +
                                "1/2 teaspoon garlic powder \n" +
                                "1/2 teaspoon black pepper \n" +
                                "1/8 teaspoon cayenne pepper \n" +
                                "1/8 teaspoon dry mustard \n" +
                                "1/2 teaspoon salt \n" +
                                "as needed nonstick spray coating \n" +
                                "\n" +
                                "Directions\n" +
                                "\n" +
                                "1. Trim all fat from chops. \n" +
                                "\n" +
                                "2. Beat egg white with evaporated skim milk. Place chops in milk mixture and let stand for 5 minutes, turning chops once. \n" +
                                "\n" +
                                "3. Meanwhile, mix together cornflake crumbs, bread crumbs, spices, and salt. \n" +
                                "\n" +
                                "4. Spray a 9xl3-inch baking pan with nonstick spray coating. \n" +
                                "\n" +
                                "5. Remove chops from milk mixture. Coat thoroughly with crumb mixture. \n" +
                                "\n" +
                                "6. Place chops in pan and bake in 375º F oven for 20 minutes. Turn chops and bake 15 minutes longer or till no pink remains. \n");
                    }

                }
            });
        }
    }
}