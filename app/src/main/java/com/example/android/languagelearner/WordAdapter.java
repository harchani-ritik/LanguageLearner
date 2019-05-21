package com.example.android.languagelearner;

import android.app.Activity;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private String mColorCode;

    public WordAdapter(Activity context, ArrayList<Word>words,String colorCode)
    {
        super(context,0,words);
        mColorCode=colorCode;
    }
    @Override
    public View getView(int position,View convertView,ViewGroup parent) {

        Word words = getItem(position);

        if(convertView==null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        LinearLayout verticalLinearLayout=(LinearLayout)convertView.findViewById(R.id.vertical_linear_layout) ;
        TextView sindhiTranslation=(TextView)convertView.findViewById(R.id.textViewA);
        TextView dafaultTranslation=(TextView)convertView.findViewById(R.id.textViewB);
        ImageView iconview=(ImageView)convertView.findViewById(R.id.iconImage);

        verticalLinearLayout.setBackgroundColor(Color.parseColor(mColorCode));
        sindhiTranslation.setText(words.getSindhiTranslation());
        dafaultTranslation.setText(words.getDefaultTranslation());
        if(words.hasImage())
            iconview.setImageResource(words.getImageResourceId());
        else
            iconview.setVisibility(View.GONE);
        return convertView;
    }
}
