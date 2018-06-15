package com.example.eunoia.user_profile3.userprofile;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.eunoia.user_profile3.Menu;
import com.example.eunoia.user_profile3.R;
import com.example.eunoia.user_profile3.bmicalculator.Update;

public class User extends Menu {

    protected DatabaseHelper db;
    EditText inputName;
    EditText inputHeight;
    EditText inputWeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user);

        Update p1 ;

        db = new DatabaseHelper(this);// added code

        if (!db.checkDB())
        {
            Update p2=new Update("Amirah",45,154);
            db.addUser(p2);
        }

        p1 = db.getAllUsers();

        final Button buttonSave = (Button) findViewById(R.id.buttonSave);
        inputName = (EditText) findViewById(R.id.inputName);
        inputHeight = (EditText) findViewById(R.id.inputHeight);
        inputWeight = (EditText) findViewById(R.id.inputWeight);

        if (inputName == null) throw new AssertionError("Name cannot be null");
        if (inputHeight == null) throw new AssertionError("Height cannot be null");
        if (inputWeight == null) throw new AssertionError("Weight cannot be null");

        inputName.setText(p1.getName());
        inputHeight.setText(String.format(String.valueOf(p1.getHeight())));
        inputWeight.setText(String.format(String.valueOf(p1.getWeight())));

        assert buttonSave != null;
    }

    public void updateProfile(View v) {


        String name;
        double weight, height;

        name = inputName.getText().toString();
        height = Double.parseDouble(inputHeight.getText().toString());
        weight = Double.parseDouble(inputWeight.getText().toString());

        if (name.equalsIgnoreCase("") || weight == 0.0 || (height == 0.0)) {
            Toast.makeText(getApplicationContext(), "please insert user details", Toast.LENGTH_LONG).show();
        } else {
            Update p1 = new Update(name, weight, height);
            db.addUser(p1);
            Toast.makeText(getApplicationContext(), "User profile updated!", Toast.LENGTH_LONG).show();
            db.getAllUsers();
        }
    }
}