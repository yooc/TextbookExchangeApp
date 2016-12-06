package com.example.android.textbookexchange2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by cyoo0706 on 11/15/16.
 */

public class StartPageActivity extends AppCompatActivity{
    Button signUpButton;
    Button continueAsVisitor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startpage);

        signUpButton = (Button) findViewById(R.id.signup_button);
        continueAsVisitor = (Button) findViewById(R.id.visitor_button);


//Assign a listener to your button
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Start your second activity
                Intent intent = new Intent(StartPageActivity.this, SignupActivity.class);
                startActivity(intent);
            }
        });

        continueAsVisitor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartPageActivity.this, BrowseActivity.class);
                startActivity(intent);
            }
        });
    }
}
