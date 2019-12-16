package com.example.a4s_finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class tipsandsuggestions extends AppCompatActivity {

    EditText et_name,et_email,et_suggestion;
    Button button_post;
   // DataBaseTipsandSuggestionAdapter dataBaseTipsandSuggestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipsandsuggestions);

        et_name= (EditText) findViewById(R.id.editText10);
        et_email= (EditText) findViewById(R.id.editText11);
        et_suggestion= (EditText) findViewById(R.id.editText12);
        button_post= (Button) findViewById(R.id.button2);

    }

    public void insertTips(View view)
    {
        String name= et_name.getText().toString();
        String email= et_email.getText().toString();
        String suggesation= et_suggestion.getText().toString();
       // long id=   dataBaseTipsandSuggestion.insert(name,email,suggesation);
        if (email.isEmpty()){
            Toast.makeText(tipsandsuggestions.this,"unsuccessfully",Toast.LENGTH_LONG).show();


        }
        else {
            Toast.makeText(tipsandsuggestions.this,"successfully insert a suggestion",Toast.LENGTH_LONG).show();

            Intent intent=new Intent(this,homepagescrolling.class);
            startActivity(intent);
        }
    }
}
