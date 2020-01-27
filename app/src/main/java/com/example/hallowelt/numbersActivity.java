package com.example.hallowelt;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class numbersActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("zero", "Null"));
        words.add(new Word("one", "Eins"));
        words.add(new Word("two", "Zwei"));
        words.add(new Word("three", "Drei"));
        words.add(new Word("four", "Vier"));
        words.add(new Word("five", "Funf"));
        words.add(new Word("six", "Sechs"));
        words.add(new Word("seven", "Sieben"));
        words.add(new Word("eight", "Acht"));
        words.add(new Word("nine", "Neun"));
        words.add(new Word("ten", "Zehn"));
        words.add(new Word("eleven", "Elf"));
        words.add(new Word("twelve", "Zwölf"));
        words.add(new Word("thirteen", "Dreizehn"));
        words.add(new Word("fourteen", "Vierzehn"));
        words.add(new Word("fifteen", "Fünfzehn"));
        words.add(new Word("sixteen", "Sechzehn"));
        words.add(new Word("seventeen", "Siebzehn"));
        words.add(new Word("eighteen", "Achtzehn"));
        words.add(new Word("nineteen", "Neunzehn"));
        words.add(new Word("twenty", "Zwanzig"));

        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
