package com.example.malumukendi.assignment6activities;

/**
 * Created by Malu.Mukendi on 2016-05-31.
 */

/*public class ActivateActivity extends AppCompatActivity {

    private  EditText emailAddress;
    private  EditText password;
    private  EditText name;
    private  EditText surname;
    private  Button activateButton;
    private  Button prevButton;

    public ActivateActivity() {
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.preview_activity);
       // show = new PreviewActivity(this);

        emailAddress = (EditText) findViewById(R.id.prev_email);
        password = (EditText) findViewById(R.id.prev_password);
        name = (EditText) findViewById(R.id.activate_Name);
        surname = (EditText) findViewById(R.id.prev_surname);
        activateButton = (Button) findViewById(R.id.prevButton);
        prevButton = (Button) findViewById(R.id.prev_button);
        // Listening to register new account link
        AddData();
        //viewAll();
        //prevButton = (Button) findViewById(R.id.prev_button);

       /* prevButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent (ActivateActivity.this, PreviewActivity.class);
                startActivity(intent);
            }
        });

    }
      /*public void AddData()
       {
           activateButton.setOnClickListener(
                   new View.OnClickListener()
                   {
                       //Intent intent = new Intent (ActivateActivity.this, PreviewActivity.class);
                       @Override
                       public void onClick(View v) {
                           boolean isInserted = user.insertData(
                                   emailAddress.getText().toString(),
                                   password.getText().toString(),
                                   name.getText().toString(),
                                   surname.getText().toString());
                           if(isInserted == true)
                           {
                               Toast.makeText(ActivateActivity.this, "Inserted Successfully", Toast.LENGTH_LONG).show();
                               //startActivity(intent);
                           }
                           else
                               Toast.makeText(ActivateActivity.this, "Not Inserted", Toast.LENGTH_LONG).show();
                       }
                   }
           );
       }
    public void viewAll()
    {
       //prevButton.setOnClickListener(new View.OnClickListener(){

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
                    buffer.append("id:" +res.getString(0)+"\n");
                    buffer.append("email:" +res.getString(1)+"\n");
                    buffer.append("password:" +res.getString(2)+"\n");
                    buffer.append("name:" +res.getString(2)+"\n");
                    buffer.append("surname:" +res.getString(3)+"\n\n");
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
}*/



