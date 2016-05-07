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

    /**
     * Increment the score of team A by 3 points.
     *
     * @param view
     */

    public void incrementABy3Points(View view)
    {
        TextView textView = (TextView) findViewById(R.id.team_a_score);
        int score = Integer.parseInt(textView.getText().toString());
        score +=3;
        textView.setText(score + "");
    }

    /**
     *  Increment the score of team A by 2 points.
     *
     * @param view
     */
    public void incrementABy2Points(View view)
    {
        TextView textView = (TextView) findViewById(R.id.team_a_score);
        int score = Integer.parseInt(textView.getText().toString());
        score +=2;
        textView.setText(score + "");
    }

    /**
     *  Increment the score of team A by 1 point.
     *
     * @param view
     */
    public void incrementABy1Point(View view)
    {
        TextView textView = (TextView) findViewById(R.id.team_a_score);
        int score = Integer.parseInt(textView.getText().toString());
        score +=1;
        textView.setText(score + "");
    }

    /**
     *  Increment the score of team B by 3 points.
     *
     * @param view
     */
    public void incrementBBy3Points(View view)
    {
        TextView textView = (TextView) findViewById(R.id.team_b_score);
        int score = Integer.parseInt(textView.getText().toString());
        score +=3;
        textView.setText(score + "");
    }

    /**
     *  Increment the score of team B by 2 points.
     *
     * @param view
     */
    public void incrementBBy2Points(View view)
    {
        TextView textView = (TextView) findViewById(R.id.team_b_score);
        int score = Integer.parseInt(textView.getText().toString());
        score +=2;
        textView.setText(score + "");
    }

    /**
     *  Increment the score of team B by 1 point.
     *
     * @param view
     */
    public void incrementBBy1Point(View view)
    {
        TextView textView = (TextView) findViewById(R.id.team_b_score);
        int score = Integer.parseInt(textView.getText().toString());
        score +=1;
        textView.setText(score + "");
    }

    /**
     *  Reset the score of both teams to 0.
     *
     * @param view
     */
    public void resetBothScores(View view)
    {
        TextView textViewA = (TextView) findViewById(R.id.team_a_score);
        TextView textViewB = (TextView) findViewById(R.id.team_b_score);
        textViewA.setText("0");
        textViewB.setText("0");
    }
}