package com.example.a4s_finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Calendar;

public class paymentactivity extends AppCompatActivity {


    EditText edt_cardname,edt_cardnumber,edt_expdate,edt_cvv;
    Button btn_submit;
    private int year,month, day;
    Calendar calendar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paymentactivity);

        edt_cardname=(EditText)findViewById(R.id.cardname);
        edt_cardnumber=(EditText)findViewById(R.id.cardnumber);
        edt_expdate=(EditText)findViewById(R.id.expdate);
        edt_cvv=(EditText)findViewById(R.id.cvv);
        btn_submit=(Button)findViewById(R.id.submit);
        edt_cvv.getText().toString();
        calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        // day = calendar.get(Calendar.DAY_OF_MONTH);
        showDate(year, month+2, day);
    }

    private void showDate(int year, int i, int day) {
        edt_expdate.setText(new StringBuilder().append(month).append("/").append(year));

    }

    public void submit(View view) {
        String  str=edt_cardnumber.getText().toString();
        String  str1=edt_cardname.getText().toString();
        String  str2=edt_expdate.getText().toString();
        String  str3=edt_cvv.getText().toString();
        if(str.equalsIgnoreCase(""))
        {
            edt_cardnumber.setHint("please enter number");//it gives user to hint
            edt_cardnumber.setError("please enter number");//it gives user to info message //use any one //
        }
        if (str1.equalsIgnoreCase("")){
            edt_cvv.setHint("Please enter name");
            edt_cvv.setError("please enter name");
        }
        if (str2.equalsIgnoreCase("")){
            edt_expdate.setHint("Please enter exp date");
            edt_expdate.setError("please enter exp date");
        }
        if (str3.equalsIgnoreCase("")){
            edt_cvv.setHint("Please enter cvv");
            edt_cvv.setError("please enter cvv");
        }
        else
        {

            Toast.makeText(this, "Payment successfully completed order will reached as soon as possible", Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(getApplicationContext(),homepagescrolling.class);
            startActivity(intent);

        }
    }
}
