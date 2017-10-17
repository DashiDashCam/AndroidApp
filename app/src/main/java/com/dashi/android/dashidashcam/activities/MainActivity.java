package com.dashi.android.dashidashcam.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dashi.android.dashidashcam.activities.accountscreen.SigninActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Start the SignIn activity
        Intent sign_in = new Intent(this, SigninActivity.class);
        startActivity(sign_in);
    }

}
