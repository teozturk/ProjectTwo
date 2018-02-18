package com.example.android.projecttwo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    TextView textViewTeamOneGoal, textViewTeamOneFoul, textViewTeamTwoGoal, textViewTeamTwoFoul;
    Button btnAddTeamOneGoal, btnAddTeamOneFoul, btnAddTeamTwoGoal, btnAddTeamTwoFoul;
    int teamOneGoal = 0, teamOneFoul = 0, teamTwoGoal = 0, teamTwoFoul = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewTeamOneGoal = (TextView) findViewById(R.id.textTeamOneGoals);
        textViewTeamOneFoul = (TextView) findViewById(R.id.textTeamOneFouls);
        textViewTeamTwoGoal = (TextView) findViewById(R.id.textTeamTwoGoals);
        textViewTeamTwoFoul = (TextView) findViewById(R.id.textTeamTwoFouls);

        btnAddTeamOneGoal = (Button) findViewById(R.id.btnTeamOneGoal);
        btnAddTeamOneFoul = (Button) findViewById(R.id.btnTeamOneFoul);
        btnAddTeamTwoGoal = (Button) findViewById(R.id.btnTeamTwoGoal);
        btnAddTeamTwoFoul = (Button) findViewById(R.id.btnTeamTwoFoul);

    }

    public void addGoalAndFoul(View v)

    {

        //ADD TEAM ONE GOAL
        if (btnAddTeamOneGoal.isPressed())

        {
            teamOneGoal = teamOneGoal + 1;
            textViewTeamOneGoal.setText(String.valueOf(teamOneGoal));

        }

        //ADD TEAM ONE FOUL
        if (btnAddTeamOneFoul.isPressed())

        {
            teamOneFoul = teamOneFoul + 1;
            textViewTeamOneFoul.setText(String.valueOf(teamOneFoul));

        }

        //ADD TEAM TWO GOAL
        if (btnAddTeamTwoGoal.isPressed())

        {
            teamTwoGoal = teamTwoGoal + 1;
            textViewTeamTwoGoal.setText(String.valueOf(teamTwoGoal));

        }

        //ADD TEAM TWO FOUL
        if (btnAddTeamTwoFoul.isPressed())

        {
            teamTwoFoul = teamTwoFoul + 1;
            textViewTeamTwoFoul.setText(String.valueOf(teamTwoFoul));

        }

    }

    //reset all value
    public void resetValue(View v)

    {

        teamOneGoal = 0;
        teamOneFoul = 0;
        teamTwoGoal = 0;
        teamTwoFoul = 0;

        textViewTeamOneGoal.setText(String.valueOf(teamOneGoal));
        textViewTeamOneFoul.setText(String.valueOf(teamOneFoul));
        textViewTeamTwoGoal.setText(String.valueOf(teamTwoGoal));
        textViewTeamTwoFoul.setText(String.valueOf(teamTwoFoul));

    }

    //share value
    public void Share(View v)

    {
        String score = "Team One Goal= " + teamOneGoal + " Team One Foul= " + teamOneFoul + " Team Two Goal= " + teamTwoGoal + " Team Two Foul= " + teamTwoFoul;
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_TEXT, score);
        sendIntent.setType("text/plain");
        startActivity(sendIntent);

    }


}
