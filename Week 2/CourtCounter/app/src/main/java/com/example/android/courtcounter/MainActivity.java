package com.example.android.courtcounter;

import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void incrementABy3Points(View view)
    {
        TextView textView = (TextView) findViewById(R.id.team_a_score);
        int score = Integer.parseInt(textView.getText().toString());
        score +=3;
        textView.setText(score + "");
    }

    public void incrementABy2Points(View view)
    {
        TextView textView = (TextView) findViewById(R.id.team_a_score);
        int score = Integer.parseInt(textView.getText().toString());
        score +=2;
        textView.setText(score + "");
    }

    public void incrementABy1Point(View view)
    {
        TextView textView = (TextView) findViewById(R.id.team_a_score);
        int score = Integer.parseInt(textView.getText().toString());
        score +=1;
        textView.setText(score + "");
    }

    public void incrementBBy3Points(View view)
    {
        TextView textView = (TextView) findViewById(R.id.team_b_score);
        int score = Integer.parseInt(textView.getText().toString());
        score +=3;
        textView.setText(score + "");
    }

    public void incrementBBy2Points(View view)
    {
        TextView textView = (TextView) findViewById(R.id.team_b_score);
        int score = Integer.parseInt(textView.getText().toString());
        score +=2;
        textView.setText(score + "");
    }

    public void incrementBBy1Point(View view)
    {
        TextView textView = (TextView) findViewById(R.id.team_b_score);
        int score = Integer.parseInt(textView.getText().toString());
        score +=1;
        textView.setText(score + "");
    }

    public void resetBothScores(View view)
    {
        TextView textViewA = (TextView) findViewById(R.id.team_a_score);
        TextView textViewB = (TextView) findViewById(R.id.team_b_score);
        textViewA.setText("0");
        textViewB.setText("0");
    }
}
