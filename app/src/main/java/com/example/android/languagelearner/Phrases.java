package com.example.android.languagelearner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Phrases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("काथे वने तोह?","Where are you going?"));
        words.add(new Word("तुंझो नालो छा आहे?","What is your name"));
        words.add(new Word("मांझो नालो..","My name is.."));
        words.add(new Word("मा सुथो महसूस तो कया","I'm feeling good"));
        words.add(new Word("तू अचे तोह?","Are you coming?"));
        words.add(new Word("हा, मा अचा तोह","Yes, I'm coming"));
        words.add(new Word("हल!","Let's go!"));
        words.add(new Word("हेडे अच!","Come here!"));

        WordAdapter adapter = new WordAdapter(this,words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
