package com.dashi.android.dashidashcam.activities.accountscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.dashi.android.dashidashcam.activities.dashboardscreen.DashboardActivity;
import com.dashi.android.dashidashcam.R;

public class SigninActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }

    private void createAccount(View v) {
        setContentView(R.layout.activity_create_account);
    }

    private void signIn(View v) {
        // TODO: Authenticate w/server

        // Start the Dashboard activity
        Intent dashboard = new Intent(this, DashboardActivity.class);
        startActivity(dashboard);
    }

    private void forgotPassword(View v) {

    }
}
