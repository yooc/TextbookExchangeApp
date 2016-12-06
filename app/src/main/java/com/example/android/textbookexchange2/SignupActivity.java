package com.example.android.textbookexchange2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by cyoo0706 on 11/15/16.
 */


public class SignupActivity extends AppCompatActivity {
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        submitButton = (Button) findViewById(R.id.submit_userinfo);

        //Assign a listener to your button
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Start your second activity
                Intent intent = new Intent(SignupActivity.this, BrowseActivity.class);
                startActivity(intent);
            }
        }

        );
    }


}
