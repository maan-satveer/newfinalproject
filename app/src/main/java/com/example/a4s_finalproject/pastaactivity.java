package com.example.a4s_finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class pastaactivity extends AppCompatActivity {
    GridView gridView;

    int[] imageIcons = {R.drawable.pasta3, R.drawable.pasta1, R.drawable.pasta2, R.drawable.images,
            };
    String[] numbers = {
            "Classic Tomato ", "Paprika Chicken", "White beans pasta",
            "Broccoli style pasta "};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pastaactivity);

        gridView = findViewById(R.id.gridView3);

        final iconadapter3 iconAdapter = new iconadapter3(this, imageIcons, numbers);
        gridView.setAdapter(iconAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(pastaactivity.this, "You clicked on " + iconAdapter.getItem(position), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), Bookingactivity.class);
//                Bundle extras = new Bundle();
                String str = iconAdapter.getItem(position);
                String price = "0";
                String price1 = "0";
                String price2 = "0";
                String price3 = "0";



                if(position == 0){
                    price = "25";
                    intent.putExtra("price",price);

                }
                else if(position == 1){
                    price1 = "26";
                    intent.putExtra("price" ,price1);

                }
                else if(position == 2){
                    price2 = "30";
                    intent.putExtra("price" ,price2);
                }

                else if(position == 3){
                    price3 = "15";
                    intent.putExtra("price" ,price3);
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


