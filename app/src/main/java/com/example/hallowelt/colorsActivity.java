package com.example.hallowelt;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class colorsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        //Array of words & Numbers.
        ArrayList<Word> words = new ArrayList<>();

        //Create words using Word constructor and add it to Words Arraylist
        words.add(new Word("Black", "Schwarz"));
        words.add(new Word("White","Weiß"));
        words.add(new Word("Red","Rot"));
        words.add(new Word("yellow", "Gelb"));
        words.add(new Word("blue", "Blau"));
        words.add(new Word("green", "Grün"));
        words.add(new Word("brown", "Braun"));
        words.add(new Word("pink", "Rosa"));
        words.add(new Word("orange", "Orange"));
        words.add(new Word("grey", "Grau"));
        words.add(new Word("purple/violet", "Lila/Violett"));

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
