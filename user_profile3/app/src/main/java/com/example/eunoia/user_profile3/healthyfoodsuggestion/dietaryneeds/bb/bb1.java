package com.example.eunoia.user_profile3.healthyfoodsuggestion.dietaryneeds.bb;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eunoia.user_profile3.R;
public class bb1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bb1);

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
                        textView.setText("The perfect dessert. I always have at least one person ask me for more bars.\n" +
                                "\n" +
                                "Calories:\t\t131.6 per serving\n" +
                                "Total Fat:\t\t1.7 g\n" +
                                "Total Carbohydrate:\t\t28.5 g\n" +
                                "Protein:\t\t2.8 g");
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
                                "Minutes to Prepare: 20\n" +
                                "Minutes to Cook: 25\n" +
                                "Number of Servings: 24\n" +
                                "\n" +
                                "Ingredients\n" +
                                "\n" +
                                "Filling:\n" +
                                "2 cups flour\n" +
                                "1 1/4 teaspoon pumpkin pie spice\n" +
                                "2 teaspoon baking powder\n" +
                                "1 teaspoon baking soda\n" +
                                "1 cup sugar\n" +
                                "1/3 cup light butter/margerine, softened\n" +
                                "1/2 cup brown sugar\n" +
                                "2 eggs\n" +
                                "2 large egg whites\n" +
                                "1 can (15 oz.) pumpkin pie filling\n" +
                                "1 cup carrot, finely shredded\n" +
                                "\n" +
                                "Cream cheese topping:\n" +
                                "4 oz light cream cheese, softened\n" +
                                "1/4 cup sugar\n" +
                                "1 tablespoon skim milk\n" +
                                "\n" +
                                "Directions\n" +
                                "\n" +
                                "Pre-heat oven to 350. Grease 15 x 10 jellyroll pan.\n" +
                                "\n" +
                                "Prepare Filling:\n" +
                                "In small bowl: combine flour, pumpkin spice, baking powder & baking soda.\n" +
                                "\n" +
                                "In larger bowl: Beat sugar, butter and brown sugar until crumbly. Add eggs, egg whites, pumpkin pie mix and carrots. Beat until well blended. Add flour mixture and mix until well blended. Spread onto greased pan. \n" +
                                "\n" +
                                "Prepare Cream Cheese topping: \n" +
                                "Mix together cream cheese, sugar and milk until thoroughly blended.\n" +
                                "\n" +
                                "Drop teaspoon-fulls of topping over pumpkin batter and swirl mixture with a butter knife. \n" +
                                "\n" +
                                "Bake for 25-30 minutes or until cake tester (inserted in center) comes out clean. Cool in pan completely on wire rack before cutting into squares.\n" +
                                "\n" +
                                "Makes 24 squares.");
                    }

                }
            });
        }
    }
}