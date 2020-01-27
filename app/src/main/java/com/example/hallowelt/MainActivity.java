package com.example.hallowelt;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.deutsche_learn)
    TextView deutscheLearn;
    @BindView(R.id.german_flag)
    ImageView germanFlag;
    @BindView(R.id.fun_tag)
    TextView funTag;
    @BindView(R.id.number_button)
    Button numberButton;
    @BindView(R.id.color_button)
    Button colorButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        numberButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent NumbersIntent = new Intent(MainActivity.this, numbersActivity.class);
                startActivity(NumbersIntent);
            }
        });
        colorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ColorsIntent = new Intent(MainActivity.this, colorsActivity.class);
                startActivity(ColorsIntent);
            }
        });

    }
}
