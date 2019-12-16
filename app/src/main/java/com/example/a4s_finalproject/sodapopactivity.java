package com.example.a4s_finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class sodapopactivity extends AppCompatActivity {
    GridView gridView;

    int[] imageIcons = {R.drawable.coke, R.drawable.dietcoke, R.drawable.gingerale, R.drawable.orange,
            R.drawable.soda, R.drawable.sprite};
    String[] numbers = {
            "Coke", "Diet coke", "Gingerale",
            "Orange juice", "Soda", "Sprite"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sodapopactivity);

        gridView = findViewById(R.id.gridView4);

        final iconadapter4 iconAdapter = new iconadapter4(this, imageIcons, numbers);
        gridView.setAdapter(iconAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(sodapopactivity.this, "You clicked on " + iconAdapter.getItem(position), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), Bookingactivity.class);
//                Bundle extras = new Bundle();
                String str = iconAdapter.getItem(position);
                String price = "0";
                String price1 = "0";
                String price2 = "0";
                String price3 = "0";
                String price4 = "0";
                String price5 = "0";



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

