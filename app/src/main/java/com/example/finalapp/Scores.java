package com.example.finalapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Button;


public class Scores extends AppCompatActivity {
    Button click;
    public static TextView data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scores);
        click = (Button) findViewById(R.id.scoresButton);
        data = (TextView) findViewById(R.id.fetch);

        click.setOnClickListener(new OnClickListener() {
            @Override

    public void onClick(View view) {
        fetchData process = new fetchData();
        process.execute();
    }
        });

    }
}
