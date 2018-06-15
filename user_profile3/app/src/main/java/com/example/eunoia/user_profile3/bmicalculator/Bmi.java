package com.example.eunoia.user_profile3.bmicalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.eunoia.user_profile3.userprofile.DatabaseHelper;
import com.example.eunoia.user_profile3.Menu;
import com.example.eunoia.user_profile3.R;

/**
 * Created by username on 28/5/2016.
 */
public class Bmi extends Menu {

    protected DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmi);

        Update p1;
        db = new DatabaseHelper(this);// added code
        p1 = db.getAllUsers();

        final Button button_calc = (Button) findViewById(R.id.button_calc);
        final EditText field_weight = (EditText) findViewById(R.id.field_weight);
        final EditText field_height = (EditText) findViewById(R.id.field_height);
        final TextView view_result = (TextView) findViewById(R.id.view_result);
        final TextView view_msg = (TextView) findViewById(R.id.view_bmi);
        final TextView water_intake = (TextView) findViewById(R.id.water_intake);
        final TextView view_msg2 = (TextView) findViewById(R.id.water_intake);
        final TextView view_water = (TextView) findViewById(R.id.water_intake);
        final TextView normal_weight_scale = (TextView) findViewById(R.id.normal_weight);
        final TextView normal_weight = (TextView) findViewById(R.id.normal_weight);
        final TextView height_scale = (TextView) findViewById(R.id.textView);
        final TextView weight_scale = (TextView) findViewById(R.id.textView3);

        field_weight.setText(String.format(String.valueOf(p1.getWeight())));
        field_height.setText(String.format(String.valueOf(p1.getHeight())));

        final int SETTING_CHOICE=1;// From setting

        if(SETTING_CHOICE==1)
        {
            height_scale.setText(String.format("Weight (kg)"));
            weight_scale.setText(String.format("Height (cm)"));
            water_intake.setText(String.format("0.00 litre"));
            normal_weight_scale.setText(String.format("0 - 0 kg"));
        }

        if (SETTING_CHOICE==2)
        {
            height_scale.setText(String.format("Weight (lbs)"));
            weight_scale.setText(String.format("Height (m)"));
            water_intake.setText(String.format("0.00 oz"));
            normal_weight_scale.setText(String.format("0 - 0 lbs"));
        }


        assert button_calc != null;
        button_calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double weight;
                double height;
                double bmi;
                double weight_pound, weight_in_kg;
                double water_needed;
                String norm_weight="";
                String msg="";
                String msg2="Suggested Daily Water Intake";

                if (field_height.getText().toString().equals("") || field_weight.getText().toString().equals(""))
                {
                    Toast.makeText(getApplicationContext(), "No valid values!", Toast.LENGTH_LONG);
                }

                else // kg, cm and l
                {
                    weight = Double.parseDouble(field_weight.getText().toString());
                    height = Double.parseDouble(field_height.getText().toString());

                    if(SETTING_CHOICE==1)
                    {
                        height = height/100;        // get height in metre
                        bmi = height * height;
                        bmi = weight / bmi;         // calculate BMI

                        view_result.setText(String.format("%.2f",bmi));
                        msg = calculateBmi(bmi);

                        norm_weight = normalWeight(height*100);

                        weight_pound = weight * 2.20462;    // Convert weight into pound
                        water_needed = 0.029574*2*weight_pound/3;    // Calculate water intake in litre

                        view_msg.setText(msg);
                        view_msg2.setText(msg2);
                        view_water.setText(String.format("%.2f litre",(water_needed)));
                        normal_weight.setText(norm_weight);
                    }

                    if(SETTING_CHOICE==2)
                    {
                        // do note if height is already in metre
                        bmi = height * height;
                        weight_in_kg = weight*0.453592;
                        bmi = weight_in_kg / bmi; // calculate BMI

                        view_result.setText(String.format("%.2f",bmi));
                        msg = calculateBmi(bmi);

                        norm_weight = normalWeight2(height*100);

                        weight_pound = weight * 2.20462; // Convert weight into pound
                        water_needed = weight_pound/3; // Calculate water intake in litre

                        view_msg.setText(msg);
                        view_msg2.setText(msg2);
                        view_water.setText(String.format("%.2f oz",(water_needed)));
                        normal_weight.setText(norm_weight);
                    }

                }
            }
        });
    }

    protected String calculateBmi(double bmi)
    {
        String msg="";
        if (bmi<=16.0) {msg = "Very Severely Underweight";}
        else if (bmi>16.0 && bmi<17.0) {msg = "Severely Underweight";}
        else if (bmi>=17.0 && bmi<18.5) {msg = "Underweight";}
        else if (bmi>=18.5 && bmi<25.0) {msg = "Normal";}
        else if (bmi>=25.0 && bmi<30.0) {msg = "Overweight";}
        else if (bmi>=30.0 && bmi<35.0) {msg = "Obese Class I";}
        else if (bmi>=35.0 && bmi<40.0) {msg = "Obese Class II";}
        else if (bmi>=40.0) {msg = "Obese Class III";}
        return msg;
    }

    protected String normalWeight(double w)
    {
        if (w<147) return "< 41.0 kg";
        if (w>=147 && w<150) return "41.0 - 52.0 kg";
        if (w>=150 && w<152) return "43.0 - 54.0 kg";
        if (w>=152 && w<155) return "44.0 - 56.0 kg";
        if (w>=155 && w<157) return "45.0 - 57.0 kg";
        if (w>=157 && w<160) return "47.0 - 59.0 kg";
        if (w>=160 && w<163) return "49.0 - 61.0 kg";
        if (w>=163 && w<165) return "50.0 - 64.0 kg";
        if (w>=165 && w<168) return "52.0 - 65.0 kg";
        if (w>=168 && w<170) return "54.0 - 67.0 kg";
        if (w>=170 && w<172) return "55.0 - 69.0 kg";
        if (w>=172 && w<175) return "57.0 - 72.0 kg";
        if (w>=175 && w<178) return "58.0 - 73.0 kg";
        if (w>=178 && w<180) return "60.0 - 76.0 kg";
        if (w>=180 && w<183) return "62.0 - 78.0 kg";
        if (w>=183 && w<185) return "64.0 - 80.0 kg";
        if (w>=185 && w<188) return "65.0 - 83.0 kg";
        if (w>=188 && w<191) return "67.0 - 84.0 kg";
        if (w>=191 && w<193) return "69.0 - 87.0 kg";
        else return "> 71.0 kg";
    }

    protected String normalWeight2(double w)
    {
        if (w<147) return "< 89.0 lbs";
        if (w>=147 && w<150) return "90.0 - 115.0 lbs";
        if (w>=150 && w<152) return "94.0 - 117.0 lbs";
        if (w>=152 && w<155) return "97.0 - 123.0 lbs";
        if (w>=155 && w<157) return "99.0 - 126.0 lbs";
        if (w>=157 && w<160) return "104.0 - 130.0 lbs";
        if (w>=160 && w<163) return "108.0 - 134.0 lbs";
        if (w>=163 && w<165) return "110.0 - 141.0 lbs";
        if (w>=165 && w<168) return "115.0 - 143.0 lbs";
        if (w>=168 && w<170) return "119.0 - 148.0 lbs";
        if (w>=170 && w<172) return "121.0 - 152.0 lbs";
        if (w>=172 && w<175) return "126.0 - 159.0 lbs";
        if (w>=175 && w<178) return "128.0 - 161.0 lbs";
        if (w>=178 && w<180) return "132.0 - 168.0 lbs";
        if (w>=180 && w<183) return "137.0 - 172.0 lbs";
        if (w>=183 && w<185) return "141.0 - 176.0 lbs";
        if (w>=185 && w<188) return "143.0 - 183.0 lbs";
        if (w>=188 && w<191) return "148.0 - 185.0 lbs";
        if (w>=191 && w<193) return "152.0 - 191.0 lbs";
        else return "> 157.0 lbs";
    }
}


