package com.example.malumukendi.assignment6activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.malumukendi.assignment6activities.repos.Impl.UserLoginRepoImpl;

/**
 * Created by Malu.Mukendi on 2016-06-02.
 */
public class ShowActivity extends AppCompatActivity {

    UserLoginRepoImpl user;
    TextView tv;
    TextView tv1;
    TextView tv2;
    TextView tv3;
    private Button submitButton;
    private Button v;
    public ShowActivity(){}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_activity);
        user = new UserLoginRepoImpl(this);

        tv = (TextView) findViewById(R.id.emailAddress);
        tv1 = (TextView) findViewById(R.id.password);
        tv2 = (TextView) findViewById(R.id.display_name);
        tv3 = (TextView) findViewById(R.id.surname);
        submitButton = (Button) findViewById(R.id.submit_button);
        //v = (Button) findViewById(R.id.show);


        Intent intent = getIntent();
        String email = intent.getStringExtra("emailAddress");
        String pass = intent.getStringExtra("password");
        String nm = intent.getStringExtra("name");
        String srnm = intent.getStringExtra("surname");

        tv.setText("Email: " + email);
        tv1.setText("password: " + pass);
        tv2.setText("Name: " + nm);
        tv3.setText("Surname: " + srnm);

        AddData();

    }
    public void AddData()
       {
           assert submitButton != null;
           submitButton.setOnClickListener(
                   new View.OnClickListener()
                   {
                       Intent intent = new Intent (getApplicationContext(), DisplayActivity.class);
                       @Override
                       public void onClick(View v) {
                           boolean isInserted = user.insertData(
                                   tv.getText().toString(),
                                   tv1.getText().toString(),
                                   tv2.getText().toString(),
                                   tv3.getText().toString());
                           if(isInserted == true)
                           {
                               Toast.makeText(getApplicationContext(), "Inserted Successfully", Toast.LENGTH_LONG).show();
                               startActivity(intent);
                           }
                           else
                               Toast.makeText(getApplicationContext(), "Not Inserted", Toast.LENGTH_LONG).show();
                       }
                   }
           );
       }
}
