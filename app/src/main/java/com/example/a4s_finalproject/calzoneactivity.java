package com.example.a4s_finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class calzoneactivity extends AppCompatActivity {

    GridView gridView;

    int[] imageIcons = {R.drawable.pepperonicalzone, R.drawable.beconcalzone, R.drawable.greencalzone, R.drawable.mashrromcalzone,
            R.drawable.pineapplecalzone, R.drawable.onioncalone, R.drawable.tomatocalzone};
    String[] numbers = {
            "Pepperoni", "Becon", "Green pepper",
            "Mashroom", "Pineapple", "Onion",
            "Tomato hot pepper"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calzoneactivity);
        gridView = findViewById(R.id.gridView2);

        final iconadapter2 iconAdapter = new iconadapter2(this, imageIcons, numbers);
        gridView.setAdapter(iconAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(calzoneactivity.this, "You clicked on " + iconAdapter.getItem(position), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), sizeactivity.class);
//                Bundle extras = new Bundle();
                String str = iconAdapter.getItem(position);
                String price = "0";
                String price1 = "0";
                String price2 = "0";
                String price3 = "0";
                String price4 = "0";
                String price5 = "0";
                String price6 = "0";


                if(position == 0){
                    price = "10";
                    intent.putExtra("price",price);

                }
                else if(position == 1){
                    price1 = "15";
                    intent.putExtra("price" ,price1);

                }
                else if(position == 2){
                    price2 = "18";
                    intent.putExtra("price" ,price2);
                }

                else if(position == 3){
                    price3 = "20";
                    intent.putExtra("price" ,price3);
                }
                else if(position == 4){
                    price4 = "22";
                    intent.putExtra("price" ,price4);
                }
                else if(position == 5){
                    price5 = "25";
                    intent.putExtra("price" ,price5);
                }
                else if(position == 6){
                    price6 = "30";
                    intent.putExtra("price" ,price6);
                }

//                Toast.makeText(pizzalist.this,"price" + price,Toast.LENGTH_LONG).show();
//                extras.putString("prize" , price);
//                extras.putString("PIZZANAME", str);
//                intent.putExtras(extras);
                intent.putExtra("prize",price);
                intent.putExtra("PIZZANAME",str);
                startActivity(intent);
            }
        });
    }
}


