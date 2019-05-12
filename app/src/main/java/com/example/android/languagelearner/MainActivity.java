package com.example.android.languagelearner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Numbers(View view)
    {
        Intent i= new Intent(MainActivity.this,Numbers.class);
        startActivity(i);
    }
    public void Family(View view)
    {
        Intent i= new Intent(MainActivity.this,FamilyMembers.class);
        startActivity(i);
    }
    public void Colours(View view)
    {
        Intent i= new Intent(MainActivity.this,Colours.class);
        startActivity(i);
    }
    public void Phrases(View view)
    {
        Intent i= new Intent(MainActivity.this,Phrases.class);
        startActivity(i);
    }
}
