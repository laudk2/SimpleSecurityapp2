package com.example.zero.simplesecurityapp;


import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;



public class Code extends AppCompatActivity implements OnClickListener {
    private final int finalPassword = 1234; // The Final security password
    int password = 0; // The password the user puts in
    public Button btn_1; //makes a button called btn_1
    public Button btn_2;//makes a button called btn_2
    public Button btn_3;//makes a button called btn_3
    public Button btn_4;//makes a button called btn_4
    public Button btn_submit;
    int first = 0; //The first number the user inputs
    int second = 0;//The second number the user inputs
    int third = 0;//The third number the user inputs
    int forth = 0;//The forth number the user inputs
    String stuff;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code);


        btn_1 = (Button) findViewById(R.id.btn1);//Sets the value of btn_1 to btn1
        btn_2 = (Button) findViewById(R.id.btn2);//Sets the value of btn_2 to btn2
        btn_3 = (Button) findViewById(R.id.btn3);//Sets the value of btn_3 to btn3
        btn_4 = (Button) findViewById(R.id.btn4);//Sets the value of btn_4 to btn4
        btn_submit = (Button) findViewById(R.id.btnSubmit);
        btn_1.setOnClickListener(new OnClickListener()//Checks if the number one button has been pressed
        {

            @Override
            public void onClick(View v)
            {
                if (first == 0)//Checks if the thousands place is filled
                {
                    first = Integer.parseInt(btn_1.getText().toString());//parses the value of btn_1 to an int
                    first = first * 1000; //Appends the first number to the thousands place
                }
                else if (second == 0)//Checks if the hundreds place is filled
                {
                    second = Integer.parseInt(btn_1.getText().toString());//parses the value of btn_3 to an int
                    second = second * 100;//Appends the second number to the hundreds place
                }
                else if (third == 0)//Checks if the tens place is filled
                {
                    third = Integer.parseInt(btn_1.getText().toString());//parses the value of btn_4 to an int
                    third = third * 10;//Appends the third number to the tens place
                }
                else if (forth == 0)//Checks if the ones place is filled
                {
                    forth = Integer.parseInt(btn_1.getText().toString()); //parses the value of btn_4 to an int
                    forth = forth * 1;//Appends the last number to the ones  place
                    password = first + second + third + forth; //adds up all the number

                }


            }
        });
        btn_2.setOnClickListener(new OnClickListener()//Checks if the number one button has been pressed
        {

            @Override
            public void onClick(View v)
            {
                if (first == 0)
                {
                    first = Integer.parseInt(btn_2.getText().toString());
                    first = first * 1000;
                }
                else if (second == 0)
                {
                    second = Integer.parseInt(btn_2.getText().toString());
                    second = second * 100;
                }
                else if (third == 0)
                {
                    third = Integer.parseInt(btn_2.getText().toString());
                    third = third * 10;
                }
                else if (forth == 0)
                {
                    forth = Integer.parseInt(btn_2.getText().toString());
                    forth = forth * 1;

                    password = first + second + third + forth;

                }

            }
        });
        btn_3.setOnClickListener(new OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                if (first == 0)
                {
                    first = Integer.parseInt(btn_3.getText().toString());
                    first = first * 1000;
                }
                else if (second == 0)
                {
                    second = Integer.parseInt(btn_3.getText().toString());
                    second = second * 100;
                }
                else if (third == 0)
                {
                    third = Integer.parseInt(btn_3.getText().toString());
                    third = third * 10;
                }
                else if (forth == 0)
                {
                    forth = Integer.parseInt(btn_3.getText().toString());
                    forth = forth * 1;
                    password = first + second + third + forth;

                }


            }
        });
        btn_4.setOnClickListener(new OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                if (first == 0)
                {
                    first = Integer.parseInt(btn_4.getText().toString());
                    first = first * 1000;
                }
                else if (second == 0)
                {
                    second = Integer.parseInt(btn_4.getText().toString());
                    second = second * 100;
                }
                else if (third == 0)
                {
                    third = Integer.parseInt(btn_4.getText().toString());
                    third = third * 10;
                }
                else if (forth == 0)
                {
                    forth= Integer.parseInt(btn_4.getText().toString());
                    forth = forth * 1;
                    password = first + second + third + forth;



                }



            }

        });
        btn_submit.setOnClickListener(new OnClickListener()
        {

            @Override
            public void onClick(View v) {
                Intent output = new Intent(Code.this, Welcome.class);
                output.getIntExtra("VALUE", password);
                output.putExtra("VALUE", password);
                setResult(password, output);
                finish();//stops the screen
            }


        });
    }



    public void onClick(View v) {

    }


}

