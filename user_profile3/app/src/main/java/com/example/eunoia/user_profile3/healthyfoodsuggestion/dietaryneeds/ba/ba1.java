package com.example.eunoia.user_profile3.healthyfoodsuggestion.dietaryneeds.ba;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eunoia.user_profile3.R;
public class ba1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ba1);

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
                        textView.setText("This quick and easy fruit pizza makes a delicious, refreshing dessert and a colorful centerpiece. Try it at your next special occasion.\n" +
                                "\n" +
                                "Calories:\t\t256.7 per serving\n" +
                                "Total Fat:\t\t12.0 g\n" +
                                "Total Carbohydrate:\t\t35.5 g\n" +
                                "Protein:\t\t2.6 g");
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
                                "Minutes to Cook: 12\n" +
                                "Number of Servings: 10\n" +
                                "\n" +
                                "Ingredients\n" +
                                "\n" +
                                "1/2 package of refrigerated sugar cookie dough\n" +
                                "8 ounces reduced-fat cream cheese, whipped\n" +
                                "1/3 cup powdered sugar\n" +
                                "1/2 teaspoon vanilla\n" +
                                "1 tablespoon water\n" +
                                "1/4 cup apricot preserves\n" +
                                "Fruit of your choice (sliced bananas, sliced strawberries, sliced kiwi, seedless grapes cut in half, blueberries, melon balls sliced in half)\n" +
                                "\n" +
                                "Directions\n" +
                                "\n" +
                                "CRUST: Spread the sugar cookie dough over a 14-inch pizza pan. Bake in a 375 degree oven for 12 minutes or until lightly golden brown. Cool in the pan. \n" +
                                "\n" +
                                "TOPPING: Blend the cream cheese with the sugar and vanilla until completely mixed. Spread in a thin layer over the cooled crust. \n" +
                                "\n" +
                                "FRUIT LAYER: Creatively arrange the fruit in circles while slightly overlapping the slices around the crust. \n" +
                                "\n" +
                                "GLAZE: Bring the water and preserves to a boil, stirring constantly. Lightly brush this glaze on top on the fruit to preserve the color. Refrigerate until ready to serve. \n");
                    }

                }
            });
        }
    }
}