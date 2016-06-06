package com.example.malumukendi.assignment6activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Malu.Mukendi on 2016-06-02.
 */
public class HomeActivity extends AppCompatActivity {

    private Button adminButton;
    private Button closeButton;
    public HomeActivity() {
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        adminButton = (Button) findViewById(R.id.admin_button);
        closeButton = (Button) findViewById(R.id.close_button);

        assert adminButton != null;
        adminButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(i);
            }
        });
        assert closeButton != null;
        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                moveTaskToBack(true);
            }
        });
    }
}

