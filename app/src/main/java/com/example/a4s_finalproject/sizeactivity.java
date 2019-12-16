package com.example.a4s_finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class sizeactivity extends AppCompatActivity {

    TextView txt_pizzas;
    EditText editText_name,editText_mobile,editText_price,editText_address;
    Spinner spinner_size;
    ArrayAdapter adapter_size;
    Button btn_Ok;
    String TAG = "Android";
    int priceofpizza = 0;
    int totalvalue = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sizeactivity);
        txt_pizzas=(TextView)findViewById(R.id.pizzaname);
        editText_name=(EditText)findViewById(R.id.bkname);
        editText_mobile=(EditText)findViewById(R.id.bkcontact);
        editText_price=(EditText) findViewById(R.id.price);
        editText_address=(EditText)findViewById(R.id.bkaddress);
        spinner_size=(Spinner)findViewById(R.id.bksize);
        btn_Ok=(Button)findViewById(R.id.ukbook);
        Log.i(TAG, "spinner");

        Intent intent = getIntent();
       // Bundle extras = intent.getExtras();

        final String  text = intent.getExtras().getString("price");
        String  text1 = intent.getExtras().getString("PIZZANAME");

//        String result = extras.getString("PIZZANAME");
//        String pricevalue = extras.getString("price");
        //  String result = intent.getStringExtra("MESSAGE");


        txt_pizzas.setText(text1);
        editText_price.setText(text);



        adapter_size = ArrayAdapter.createFromResource(this, R.array.Select_size, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter_size.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner_size.setAdapter(adapter_size);

        spinner_size.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                priceofpizza = Integer.valueOf(editText_price.getText().toString());

                switch(spinner_size.getSelectedItem().toString()){
                    case "Small":
                        totalvalue = priceofpizza + 0;
                         editText_price.setText(String.valueOf(totalvalue));
                         break;

                    case "Medium":
                        totalvalue = priceofpizza + 5;
                        editText_price.setText(String.valueOf(totalvalue));
                        break;

                    case "Large":
                        totalvalue = priceofpizza + 10;
                        editText_price.setText(String.valueOf(totalvalue));
                        break;

                    case "Extra Large":
                        totalvalue = priceofpizza + 15;
                        editText_price.setText(String.valueOf(totalvalue));
                        break;




                }


    }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }
    public void Bookitem(View view){

        String  name=editText_name.getText().toString().trim();
        String  mobile=editText_mobile.getText().toString().trim();
        String  item =editText_price.getText().toString().trim();
        String size  = spinner_size.getSelectedItem().toString();
        String    address=editText_address.getText().toString().trim();



        if (name.isEmpty() && mobile.isEmpty()   && address.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Enter empty fields", Toast.LENGTH_LONG).show();
            return;
        }

        else {
            Toast.makeText(sizeactivity.this, "successfully insert a row",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(getApplicationContext(), paymentactivity.class);
            startActivity(intent);


        }



    }
}
