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

        words.add(new Word("लाल","red"));
        words.add(new Word("हरो","green"));
        words.add(new Word("भूरो","brown"));
        words.add(new Word("नीरो","blue"));
        words.add(new Word("कारो","black"));
        words.add(new Word("अछो","white"));
        words.add(new Word("पीलो","yellow"));

        WordAdapter adapter = new WordAdapter(this,words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
