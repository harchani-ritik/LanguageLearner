package com.example.android.languagelearner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("हिक","one"));
        words.add(new Word("ब","two"));
        words.add(new Word("ट्रे","three"));
        words.add(new Word("चार","four"));
        words.add(new Word("पंज","five"));
        words.add(new Word("छ","six"));
        words.add(new Word("सत","seven"));
        words.add(new Word("अठ","eight"));
        words.add(new Word("नॅव","nine"));
        words.add(new Word("डह","ten"));

        WordAdapter adapter = new WordAdapter(this,words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
