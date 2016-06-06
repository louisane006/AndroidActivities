package com.example.malumukendi.assignment6activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Malu.Mukendi on 2016-06-02.
 */
public class PreviewActivity extends AppCompatActivity {

    private EditText emailAddress;
    private EditText password;
    private EditText name;
    private EditText surname;
    private Button prevButton;
    private Button backButton;

    public PreviewActivity() {
    }
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.preview_activity);

            emailAddress = (EditText) findViewById(R.id.prev_email);
            password = (EditText) findViewById(R.id.prev_password);
            name = (EditText) findViewById(R.id.prev_name);
            surname = (EditText) findViewById(R.id.prev_surname);

            prevButton = (Button) findViewById(R.id.prevButton);
            backButton = (Button) findViewById(R.id.back_button);

           assert prevButton != null;
            prevButton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), ShowActivity.class);
                    intent.putExtra("emailAddress", emailAddress.getText().toString());
                    intent.putExtra("password", password.getText().toString());
                    intent.putExtra("name", name.getText().toString());
                    intent.putExtra("surname", surname.getText().toString());
                    startActivity(intent);
                }
            });
            assert backButton != null;
            backButton.setOnClickListener(new View.OnClickListener() {
                Intent i = new Intent(getApplicationContext(), LoginActivity.class);
                public void onClick(View v) {
                    startActivity(i);
                }
            });
        }
}






