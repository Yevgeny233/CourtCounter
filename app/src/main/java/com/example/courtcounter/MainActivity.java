package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    protected void displayForTeamA(int str){
        TextView textView = findViewById(R.id.team_a_score);
        textView.setText(String.valueOf(str));
    }
    public void displayForTeamAPlusTree(View view) {
        displayForTeamA(scoreTeamA += 3);
    }

    public void displayForTeamAPlusTwo(View view) {
        displayForTeamA(scoreTeamA += 2);
    }

    public void displayForTeamAFreeThrow(View view) {
        displayForTeamA(scoreTeamA += 1);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamBPlusTree(View view) {
        displayForTeamB(scoreTeamB += 3);
    }

    public void displayForTeamBPlusTwo(View view) {
        displayForTeamB(scoreTeamB += 2);
    }

    public void displayForTeamBFreeThrow(View view) {
        displayForTeamB(scoreTeamB += 1);
    }

    public void doReset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}