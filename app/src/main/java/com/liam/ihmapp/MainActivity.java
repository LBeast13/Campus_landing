package com.liam.ihmapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void LogIn(View view) {
    }

    /**
     * Launch the Register Form Part 1 for a new user.
     * @param view
     */
    public void RegisterForm(View view) {
        Intent intent = new Intent(this, InscriptionPart1Activity.class);
        startActivity(intent);
    }
}