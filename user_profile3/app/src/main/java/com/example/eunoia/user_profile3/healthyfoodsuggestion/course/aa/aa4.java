package com.example.eunoia.user_profile3.healthyfoodsuggestion.course.aa;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eunoia.user_profile3.R;
public class aa4 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aa4);

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
                        textView.setText("Bread, made over with oat bran and love!\n" +
                                "\n" +
                                "Calories:\t\t125.5 per serving\n" +
                                "Total Fat:\t\t1.4 g\n" +
                                "Total Carbohydrate:\t\t27.0 g\n" +
                                "Protein:\t\t3.4 g");
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
                                "Minutes to Prepare: 15\n" +
                                "Minutes to Cook: 40\n" +
                                "Number of Servings: 10\n" +
                                "\n" +
                                "Ingredients\n" +
                                "\n" +
                                "1 c whole wheat flour\n" +
                                "1/2 c oat bran\n" +
                                "1/4 tsp salt\n" +
                                "1/2 tsp baking soda\n" +
                                "1/4 tsp baking powder\n" +
                                "1 tbsp cinnamon\n" +
                                "1/2 c packed brown sugar\n" +
                                "1/2 apple sauce\n" +
                                "2 eggs, lightly beaten\n" +
                                "2 ripe bananas, mashed\n" +
                                "\n" +
                                "Directions\n" +
                                "\n" +
                                "Preheat oven to 350, & spray loaf pan with cooking spray.\n" +
                                "In a bowl, combine flour, oat bran, salt, baking powder, baking soda, and cinnamon. Set aside.\n" +
                                "In a mixer bowl, combine brown sugar and apple sauce and beat on low speed until blended and mostly dissolved. Add in eggs and mix until combined. Add bananas and mix until combined. While the mixer is running, add in flour mixture slowly, until all is just combined. \n" +
                                "Pour into loaf pan and bake for 40-50 min. or until toothpick inserted in the middle comes out clean.\n" +
                                "Let cool on counter 10 minutes before slicing. Enjoy!");
                    }

                }
            });
        }
    }
}