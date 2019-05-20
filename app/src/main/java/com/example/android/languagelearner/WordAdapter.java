package com.example.android.languagelearner;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Activity context, ArrayList<Word>words)
    {
        super(context,0,words);
    }
    @Override
    public View getView(int position,View convertView,ViewGroup parent) {

        Word words = getItem(position);

        if(convertView==null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        TextView sindhiTranslation=(TextView)convertView.findViewById(R.id.textViewA);
        TextView dafaultTranslation=(TextView)convertView.findViewById(R.id.textViewB);
        ImageView iconview=(ImageView)convertView.findViewById(R.id.iconImage);

        sindhiTranslation.setText(words.getSindhiTranslation());
        dafaultTranslation.setText(words.getDefaultTranslation());
        iconview.setImageResource(words.getImageResourceId());
        return convertView;
    }
}
