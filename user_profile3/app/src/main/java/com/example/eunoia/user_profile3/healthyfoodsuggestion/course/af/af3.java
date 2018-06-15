package com.example.eunoia.user_profile3.healthyfoodsuggestion.course.af;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eunoia.user_profile3.R;
public class af3 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_af3);

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
                        textView.setText("A healthy version of a classic fall favourite.\n" +
                                "\n" +
                                "Calories:\t\t119.6 per serving\n" +
                                "Total Fat:\t\t0.4 g\n" +
                                "Total Carbohydrate:\t\t29.3 g\n" +
                                "Protein:\t\t0.8 g");
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
                                "Minutes to Cook: 10\n" +
                                "Number of Servings: 12\n" +
                                "\n" +
                                "Ingredients\n" +
                                "\n" +
                                "1 large orange \n" +
                                "3 whole cloves \n" +
                                "3 cups fresh orange juice \n" +
                                "2 quarts unsweetened apple juice or apple cider\n" +
                                "1/4 cup raisins\n" +
                                "1 cinnamon stick \n" +
                                "\n" +
                                "Directions\n" +
                                "\n" +
                                "1. Peel the skin from the orange leaving the bitter white pith behind. \n" +
                                "2. Stick the cloves into the skin. \n" +
                                "3. Squeeze the juice from the orange and add to the orange juice. \n" +
                                "4. Place all ingredients into a large nonreactive pan and bring to a boil over high heat. \n" +
                                "5. Remove from heat, cover and allow to stand at least 30 minutes to allow flavors to blend. Serve warm or cold. ");
                    }

                }
            });
        }
    }
}