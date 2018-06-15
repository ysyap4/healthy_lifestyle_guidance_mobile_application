package com.example.eunoia.user_profile3.healthyfoodsuggestion.dietaryneeds.bc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eunoia.user_profile3.R;
public class bc3 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bc3);

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
                        textView.setText("Whole pie = 6 points.\n" +
                                "\n" +
                                "Calories:\t\t54.0 per serving\n" +
                                "Total Fat:\t\t0.4 g\n" +
                                "Total Carbohydrate:\t\t11.4 g\n" +
                                "Protein:\t\t1.6 g");
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
                                "Minutes to Cook: 5\n" +
                                "Number of Servings: 6\n" +
                                "\n" +
                                "Ingredients\n" +
                                "\n" +
                                "4 cups sliced stawberries\n" +
                                "1 small box Cook and Serve Jello Sugar-free pudding mix\n" +
                                "2 cups water\n" +
                                "1 small box Sugar-Free Strawberry Jello Mix\n" +
                                "\n" +
                                "Directions\n" +
                                "\n" +
                                "This makes about 6 servings!\n" +
                                "\n" +
                                "Mix 2 cups of water and Jello Sugar Free Vanilla Pudding mix in a large bowl. Microwave for 3 minutes. Remove and stir with a wire whisk. Return to microwave another 3 or so minutes until boiling. Remove and add sugar free jello strawberry gelatin mix. Stir to dissolve jello mix. Set aside to let cool. Put strawberries in a pie dish and pour cooled mix over berries. Refrigerate and let cool. Good with Sugar Free Cool Whip, but count extra calories for the Cool Whip!");
                    }

                }
            });
        }
    }
}