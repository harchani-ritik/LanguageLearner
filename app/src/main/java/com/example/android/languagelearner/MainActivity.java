package com.example.android.languagelearner;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView headingText,numberText,familyText,coloursText,phrasesText;
    Typeface myCustomFont;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        headingText= (TextView)(findViewById(R.id.textView));
        numberText= (TextView)(findViewById(R.id.textView2));
        familyText= (TextView)(findViewById(R.id.textView3));
        coloursText= (TextView)(findViewById(R.id.textView4));
        phrasesText= (TextView)(findViewById(R.id.textView5));

        myCustomFont=Typeface.createFromAsset(getAssets(),"fonts/cursive.ttf");
        headingText.setTypeface(myCustomFont);

        numberText.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, Numbers.class);
                startActivity(numbersIntent);
            }
        });

        familyText.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view){
                Intent familyIntent = new Intent(MainActivity.this,FamilyMembers.class);
                startActivity(familyIntent);
            }
        });

        coloursText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent coloursIntent = new Intent(MainActivity.this,Colours.class);
                startActivity(coloursIntent);
            }
        });

        phrasesText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phrasesIntent = new Intent(MainActivity.this,Phrases.class);
                startActivity(phrasesIntent);
            }
        });
    }
}
