package com.example.a4s_finalproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class iconadapter2  extends BaseAdapter {
    Context context;
    int[] imageIcons;
    String[] numbers;

    public iconadapter2(Context context, int[] imageIcons, String[] numbers) {
        this.context = context;
        this.imageIcons = imageIcons;
        this.numbers = numbers;
    }

    @Override
    public int getCount() {
        return numbers.length;
    }

    @Override
    public String getItem(int position) {
        return numbers[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null)
            convertView = LayoutInflater.from(context).inflate(R.layout.celliconadapter2, null);
        ImageView imageView = convertView.findViewById(R.id.image_view2);
        TextView textView = convertView.findViewById(R.id.icon_text2);
        imageView.setImageResource(imageIcons[position]);
        textView.setText(numbers[position]);
        return convertView;
    }
}

