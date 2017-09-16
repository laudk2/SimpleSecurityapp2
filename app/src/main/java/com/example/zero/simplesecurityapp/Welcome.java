package com.example.zero.simplesecurityapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;




public class Welcome extends AppCompatActivity
{
private final int password = 1234;
    int correct = 0;
    int cred = 0;
    public Button btnUnlock;
    String stuff;
    public void initialize(){
        btnUnlock = (Button)findViewById(R.id.btnUnlock);
        btnUnlock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toy = new Intent(Welcome.this, Code.class);
                toy.putExtra("cred",cred);
                startActivityForResult(toy, password);


            }
        });}

        protected void  onActivityResult (int requestCode, int resultCode, Intent data)
        {
            if (resultCode == password) {

                TextView textViewToChange = (TextView) findViewById(R.id.txtWelcome);
                textViewToChange.setText("Welcome to the app! The App is unlocked!");
            }
            else {
                {
                    TextView textViewToChange = (TextView) findViewById(R.id.txtWelcome);
                    textViewToChange.setText("Welcome to the app! The App is locked!");
                    setContentView(R.layout.activity_welcome);
                     initialize();
                }

            }



        }



    @Override

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        initialize();
    }





        }





