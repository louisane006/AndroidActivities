package com.example.malumukendi.assignment6activities;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.example.malumukendi.assignment6activities.repos.Impl.UserLoginRepoImpl;

/**
 * Created by Malu.Mukendi on 2016-06-02.
 */
public class DisplayActivity extends AppCompatActivity {
    UserLoginRepoImpl user;
    private EditText i;
    private EditText e;
    private EditText p;
    private EditText n;
    private EditText s;
    private Button homeButton;
    private Button displayButton;

    public DisplayActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        //i = (EditText) findViewById(R.id.id);
        e = (EditText) findViewById(R.id.prev_email);
        p = (EditText) findViewById(R.id.prev_password);
        n = (EditText) findViewById(R.id.prev_name);
        s = (EditText) findViewById(R.id.prev_surname);

        homeButton = (Button) findViewById(R.id.home_button);
        displayButton = (Button) findViewById(R.id.display_button);
        assert homeButton != null;
        homeButton.setOnClickListener(new View.OnClickListener() {
            Intent i = new Intent(getApplicationContext(), HomeActivity.class);

            public void onClick(View v) {
                startActivity(i);
            }
        });
        viewAll();
    }

    public void viewAll()
    {
        displayButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Cursor res= user.getAllData();
                if(res.getCount() == 0)
                {
                    //show message
                    showMessage("Error", "NO Data Found");
                    return ;
                }
                StringBuffer buffer = new StringBuffer();
                while(res.moveToNext())
                {
                    buffer.append(res.getString(0)+"\n");
                    buffer.append(res.getString(1)+"\n");
                    buffer.append(res.getString(2)+"\n");
                    buffer.append(res.getString(2)+"\n");
                    buffer.append(res.getString(3)+"\n\n");
                }
                //show all data
                showMessage("Data", buffer.toString());
            }
        });
    }
    public void showMessage(String title, String message)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }
}
