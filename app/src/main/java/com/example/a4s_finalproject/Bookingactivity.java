package com.example.a4s_finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Bookingactivity extends AppCompatActivity {

    TextView txt_bookiid;

    EditText editText_name, editText_contact, editText_itemname, editText_address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookingactivity);
        txt_bookiid = (TextView) findViewById(R.id.orderid);
        editText_name = (EditText) findViewById(R.id.bname);
        editText_contact = (EditText) findViewById(R.id.bcontact);
        editText_itemname = (EditText) findViewById(R.id.bitem);
        editText_address = (EditText) findViewById(R.id.baddress);

        Intent intent = getIntent();
        final String  text = intent.getExtras().getString("price");
        String  text1 = intent.getExtras().getString("PIZZANAME");

//        String result = extras.getString("PIZZANAME");
//        String pricevalue = extras.getString("price");
        //  String result = intent.getStringExtra("MESSAGE");


        txt_bookiid.setText(text1);
        editText_itemname.setText(text);

    }

    public void Registeritem(View view) {


        String name = editText_name.getText().toString().trim();
        String mobile = editText_contact.getText().toString().trim();
        String contact = editText_itemname.getText().toString().trim();
        String address = editText_address.getText().toString().trim();



        if (name.isEmpty() && mobile.isEmpty()  && address.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Enter valid name", Toast.LENGTH_LONG).show();
            return;
        }

         else {
            Toast.makeText(Bookingactivity.this,"successfully done",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(getApplicationContext(), paymentactivity.class);

            startActivity(intent);


        }
    }
}