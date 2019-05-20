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

        words.add(new Word("हिक","one",R.drawable.number_one));
        words.add(new Word("ब","two",R.drawable.number_two));
        words.add(new Word("ट्रे","three",R.drawable.number_three));
        words.add(new Word("चार","four",R.drawable.number_four));
        words.add(new Word("पंज","five",R.drawable.number_five));
        words.add(new Word("छ","six",R.drawable.number_six));
        words.add(new Word("सत","seven",R.drawable.number_seven));
        words.add(new Word("अठ","eight",R.drawable.number_eight));
        words.add(new Word("नॅव","nine",R.drawable.number_nine));
        words.add(new Word("डह","ten",R.drawable.number_ten));

        WordAdapter adapter = new WordAdapter(this,words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
