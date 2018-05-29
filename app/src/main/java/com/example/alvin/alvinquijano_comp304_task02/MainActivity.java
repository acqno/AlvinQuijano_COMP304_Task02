package com.example.alvin.alvinquijano_comp304_task02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/*
Name: Alvin Quijano
Version: 1.0
Description: Assignment 1 - Task 2 - Press button on main activity to display contents of string.xml on a second activity.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){
        Intent intent = new Intent(this, DisplayTask2.class);

        String nameString = getString(R.string.Your_Name); // stores Your_Name from XML into a variable
        intent.putExtra("yourName", nameString); // sends variable to next activity

        String qualificationString = getString(R.string.Qualification); // stores Qualification from XML into variable
        intent.putExtra("qualification", qualificationString);

        String dreamJobString = getString(R.string.Dream_Job); // stores Dream_Job from XML into variable
        intent.putExtra("dreamJob", dreamJobString);

        String fieldString = getString(R.string.Specialized_Field);// stores Specialized_Field from XML into variable
        intent.putExtra("specializedField", fieldString);

        startActivity(intent);

    }
}
