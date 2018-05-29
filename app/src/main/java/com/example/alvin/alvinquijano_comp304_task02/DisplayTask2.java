package com.example.alvin.alvinquijano_comp304_task02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayTask2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_task2);


        // Pulls name information from MainActivity
        Intent intent = getIntent();

        String name = intent.getStringExtra("yourName");
        TextView nameView = findViewById(R.id.nameTextView);
        nameView.setText(name); // Displays name string variable

        String qualification = intent.getStringExtra("qualification");
        TextView qualificationView = findViewById(R.id.qualificationTextView);
        qualificationView.setText(qualification); // Displays qualification string variable

        String job = intent.getStringExtra("dreamJob");
        TextView dreamJobView = findViewById(R.id.djobTextView);
        dreamJobView.setText(job); // Displays dream job string variable

        String specField = intent.getStringExtra("specializedField");
        TextView specializedFieldView = findViewById(R.id.fieldTextView);
        specializedFieldView.setText(specField); // Displays specialized field string variable

    }
}
