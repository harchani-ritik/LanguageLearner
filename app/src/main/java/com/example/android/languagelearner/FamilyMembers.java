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

        words.add(new Word("पिय","father",R.drawable.family_father));
        words.add(new Word("माव","mother",R.drawable.family_mother));
        words.add(new Word("पुत्त्र","son",R.drawable.family_son));
        words.add(new Word("पुट्ट्री","daughter",R.drawable.family_daughter));
        words.add(new Word("वॅड्डो भाव","older brother",R.drawable.family_older_brother));
        words.add(new Word("नॅंढो भाव","younger brother",R.drawable.family_younger_brother));
        words.add(new Word("वॅड्डी भेड़","older sister",R.drawable.family_older_sister));
        words.add(new Word("नाँधि भेड़","younger sister",R.drawable.family_younger_sister));
        words.add(new Word("डाडी","grandmother",R.drawable.family_grandmother));
        words.add(new Word("डाडो","grandfather",R.drawable.family_grandfather));

        WordAdapter adapter = new WordAdapter(this,words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
