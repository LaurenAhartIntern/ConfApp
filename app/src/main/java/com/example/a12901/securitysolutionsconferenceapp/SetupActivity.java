package com.example.a12901.securitysolutionsconfapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SetupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup);

        //check functionality
        Spinner dropdown = findViewById(R.id.dropdownCompany;
        String[] items = new String[]{"Company:", "Comp1", "Comp2"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);
    }

}
