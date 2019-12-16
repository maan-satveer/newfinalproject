package com.example.a4s_finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class registration extends AppCompatActivity {

    EditText firstname, lastname , email , password, repassword;
    Button regitration;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        //getActionBar().setTitle("Registration");

        firstname = findViewById(R.id.firsttext);
        lastname = findViewById(R.id.lasttext);
        email = findViewById(R.id.emailid);
        password = findViewById(R.id.passid1);
        repassword = findViewById(R.id.passwordid2);
        regitration = findViewById(R.id.reg_button);


        regitration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String firsttxt = firstname.getText().toString();
                String lasttxt = lastname.getText().toString();

                String emailtxt = email.getText().toString();
                String passtxt = password.getText().toString();
                String pass2txt = repassword.getText().toString();

                if (emailtxt.isEmpty() && passtxt.isEmpty() && pass2txt.isEmpty() &&  firsttxt.isEmpty() && lasttxt.isEmpty()){
                    Toast.makeText(registration.this, "Fields are empty  Fill the text fields " , Toast.LENGTH_SHORT).show();

                    if((pass2txt != passtxt)){
                        Toast.makeText(registration.this, "Re-enter password " , Toast.LENGTH_SHORT).show();}

                }
                else{
                    Intent intent = new Intent(registration.this,MainActivity.class);
                    intent.putExtra("emailid", emailtxt);
                    intent.putExtra("password",passtxt);


                    startActivity(intent);
                }







            }
        });
    }


}
