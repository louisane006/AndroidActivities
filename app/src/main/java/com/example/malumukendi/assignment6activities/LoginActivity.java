package com.example.malumukendi.assignment6activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Malu.Mukendi on 2016-05-31.
 */
public class LoginActivity extends AppCompatActivity {

    private EditText emailAddress;
    private  EditText password;
    private  EditText name;
    private  EditText surname;
    private Button accButton;
    private Button login;
    String username, pass;
    Context ctx =this;

    public LoginActivity(){

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        emailAddress = (EditText) findViewById(R.id.emailAddress);
        password = (EditText) findViewById(R.id.pass);

        accButton = (Button) findViewById(R.id.accountButton);
        login = (Button) findViewById(R.id.loginButton);
        assert accButton != null;
        accButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), PreviewActivity.class);
                startActivity(i);
            }
        });
        //assert login != null;
       /* login.setOnClickListener(new View.OnClickListener() {
            Intent i = new Intent(getApplicationContext(), HomeActivity.class);
            public void onClick(View v)
            {
                username = emailAddress.getText().toString();
                pass = password.getText().toString();
                //UserLogin user =  new UserLogin(ctx);
                Cursor cr = user.getData(user);
                boolean loginStatus = false;
                String name = "";
                do{
                        if(username == cr.getString(0) && pass == cr.getString(1));
                    {
                        loginStatus = true;
                        name = cr.getString(0);
                    }
                }
                while (cr.moveToNext());
                if(loginStatus){
                    Toast.makeText(getBaseContext(), "Login Successful..\n Welcome" + name , Toast.LENGTH_LONG).show();}
                else
                { Toast.makeText(getBaseContext(), "Login Failed", Toast.LENGTH_LONG).show();
                startActivity(i);}
            }
        });*/
    }
}