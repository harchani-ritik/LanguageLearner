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

        words.add(new Word("काथे वने तोह?","Where are you going?",R.drawable.ic_launcher_background));
        words.add(new Word("तुंझो नालो छा आहे?","What is your name",R.drawable.ic_launcher_background));
        words.add(new Word("मांझो नालो..","My name is..",R.drawable.ic_launcher_background));
        words.add(new Word("मा सुथो महसूस तो कया","I'm feeling good",R.drawable.ic_launcher_background));
        words.add(new Word("तू अचे तोह?","Are you coming?",R.drawable.ic_launcher_background));
        words.add(new Word("हा, मा अचा तोह","Yes, I'm coming",R.drawable.ic_launcher_background));
        words.add(new Word("हल!","Let's go!",R.drawable.ic_launcher_background));
        words.add(new Word("हेडे अच!","Come here!",R.drawable.ic_launcher_background));

        WordAdapter adapter = new WordAdapter(this,words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
