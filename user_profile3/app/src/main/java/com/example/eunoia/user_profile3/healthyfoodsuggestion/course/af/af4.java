package com.example.eunoia.user_profile3.healthyfoodsuggestion.course.af;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eunoia.user_profile3.R;
public class af4 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_af4);

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
                        textView.setText("For those of you who need a little assistance waking up, this is a great substitute for your regular cup of coffee.\n" +
                                "\n" +
                                "Calories:\t\t117.0 per serving\n" +
                                "Total Fat:\t\t3.3 g\n" +
                                "Total Carbohydrate:\t\t4.0 g\n" +
                                "Protein:\t\t17.8 g");
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
                                "Number of Servings: 1\n" +
                                "\n" +
                                "Ingredients\n" +
                                "\n" +
                                "1 cup brewed coffee \n" +
                                "Half a scoop of Mocha cooffee powder\n" +
                                "1/2 cup milk\n" +
                                "\n" +
                                "Directions\n" +
                                "\n" +
                                "Mix together and enjoy. Or, alternatively, take cold coffee, add a few crushed ice cubes and drink as an iced coffee beverage.\n");
                    }

                }
            });
        }
    }
}