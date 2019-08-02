package com.example.listviewsample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

class CustomAdapter extends ArrayAdapter<String> {
    public CustomAdapter(Context context, String [] avengers) {
        super(context,R.layout.customrow,avengers);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater myinf = LayoutInflater.from(getContext());
        View customview = myinf.inflate(R.layout.customrow,parent,false);
        String singleavenger = getItem(position);
        TextView mytext = (TextView) customview.findViewById(R.id.tex);
        ImageView myimg = (ImageView) customview.findViewById(R.id.img);
        mytext.setText(singleavenger);
        myimg.setImageResource(R.drawable.avengers);
        return customview;
    }
}
