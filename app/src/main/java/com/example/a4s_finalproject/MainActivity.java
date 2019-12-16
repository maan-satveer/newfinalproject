package com.example.a4s_finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText email , password ;
    Button loginbutton , registartionbutton;

    TextView invisible;



        // getSupportActionBar().setTitle("Login")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String text , text1;
        email = findViewById(R.id.emailtext);
        password = findViewById(R.id.passtext);
        loginbutton = findViewById(R.id.login_button1);
        registartionbutton = findViewById(R.id.register);
        //invisible = findViewById(R.id.textView);
        Intent i = getIntent();


        registartionbutton.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this,registration.class);
        startActivity(intent);
        }
        });

        loginbutton.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

        String   user , passwordtext1;
        user = email.getText().toString();
        passwordtext1 = password.getText().toString();
        //invisibletxt = invisible.getText().toString();


        if(user.equals("chakkal@29") && passwordtext1.equals("simran")) {

        Toast.makeText(MainActivity.this, "welcome to homescreen " + user, Toast.LENGTH_SHORT).show();

//
        Intent i2 = new Intent(MainActivity.this,homepagescrolling.class);
        startActivity(i2);


//                    Intent intent = new Intent(loginactivity.this, homepage.class);
//                    startActivity(intent);
        }
               else if(user.equals("suman@12") && passwordtext1.equals("suman")) {

                    Toast.makeText(MainActivity.this, "welcome to homescreen " + user, Toast.LENGTH_SHORT).show();

//
                    Intent i2 = new Intent(MainActivity.this, homepagescrolling.class);
                    startActivity(i2);
                }

               else if(user.equals("satveer@12") && passwordtext1.equals("satveer")) {

                    Toast.makeText(MainActivity.this, "welcome to homescreen " + user, Toast.LENGTH_SHORT).show();

//
                    Intent i2 = new Intent(MainActivity.this, homepagescrolling.class);
                    startActivity(i2);
                }

//        }
        else
        Toast.makeText(MainActivity.this,"login failed " + " choose correct email and password", Toast.LENGTH_SHORT).show();




        }
        });
        }


        }

