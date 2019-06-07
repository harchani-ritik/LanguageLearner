package com.example.android.languagelearner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Colours extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("लाल","red",R.drawable.color_red));
        words.add(new Word("साओ","green",R.drawable.color_green));
        words.add(new Word("भूरो","brown",R.drawable.color_brown));
        words.add(new Word("कारो","black",R.drawable.color_black));
        words.add(new Word("पिरो","yellow",R.drawable.color_mustard_yellow));
        words.add(new Word("अछो","white",R.drawable.color_white));

        WordAdapter adapter = new WordAdapter(this,words,"#8800A0");
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
