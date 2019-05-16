package com.example.android.languagelearner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("पिय","father"));
        words.add(new Word("माव","mother"));
        words.add(new Word("पुत्त्र","son"));
        words.add(new Word("पुट्ट्री","daughter"));
        words.add(new Word("वॅड्डो भाव","older brother"));
        words.add(new Word("नॅंढो भाव","younger brother"));
        words.add(new Word("वॅड्डी भेड़","older sister"));
        words.add(new Word("नाँधि भेड़","younger sister"));
        words.add(new Word("डाडी","grandmother"));
        words.add(new Word("डाडो","grandfather"));

        WordAdapter adapter = new WordAdapter(this,words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
