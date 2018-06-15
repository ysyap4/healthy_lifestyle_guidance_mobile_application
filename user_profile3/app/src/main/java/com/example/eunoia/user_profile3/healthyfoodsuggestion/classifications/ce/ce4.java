package com.example.eunoia.user_profile3.healthyfoodsuggestion.classifications.ce;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eunoia.user_profile3.R;
public class ce4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ce4);

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
                        textView.setText("Use low-fat milk instead of cream lowers the saturated fat content in this hearty summer soup.\n" +
                                "\n" +
                                "Calories:\t\t209.5 per serving\n" +
                                "Total Fat:\t\t5.3 g\n" +
                                "Total Carbohydrate:\t\t33.3 g\n" +
                                "Protein:\t\t8.1 g");
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
                                "Number of Servings: 1\n" +
                                "\n" +
                                "Ingredients\n" +
                                "\n" +
                                "1 tablespoon olive oil\n" +
                                "2 tablespoons finely diced celery\n" +
                                "2 tablespoons finely diced onion\n" +
                                "2 tablespoons finely diced green pepper\n" +
                                "1 package frozen whole kernel corn (10 oz.)\n" +
                                "1 cup peeled, diced, 1/2\" raw potatoes\n" +
                                "2 tablespoons chopped fresh parsley\n" +
                                "1 cup water\n" +
                                "1/4 teaspoon salt\n" +
                                "black pepper to taste\n" +
                                "1/4 teaspoon paprika\n" +
                                "2 tablespoons flour\n" +
                                "2 cups low-fat (1%) or skim milk\n" +
                                "1/4 cup fresh parsley, minced\n" +
                                "\n" +
                                "Directions\n" +
                                "\n" +
                                "1. Heat oil in medium saucepan. \n" +
                                "\n" +
                                "2. Add celery, onion, and green pepper and saute for 2 minutes. \n" +
                                "\n" +
                                "3. Add corn, potatoes, water, salt, pepper, and paprika. Bring to a boil; reduce heat to medium; and cook, covered, about 10 minutes or until potatoes are tender. \n" +
                                "\n" +
                                "4. Place 1/2 cup milk in a jar with tight fitting lid. Add flour and shake vigorously. \n" +
                                "\n" +
                                "5. Add gradually to cooked vegetables and add remaining milk. \n" +
                                "\n" +
                                "6. Cook, stirring constantly, until mixture comes to a boil and thickens. Serve garnished with chopped fresh parsley.\n");
                    }

                }
            });
        }
    }
}