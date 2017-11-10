package com.example.shreyas.jokersjoke;

import android.graphics.Color;
import android.icu.text.RelativeDateTimeFormatter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class JokersJoke extends AppCompatActivity {
    private JokeBook jokeBook= new JokeBook();
    private  ColorWheel colorWheel = new ColorWheel();
    // Declare our view variables
    private TextView jokeTextView;
    private Button showJokeButton;
    private RelativeLayout relativeLayout;
    String TAG="JokersJoke";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokers_joke);

        //Assign the views from the layout file to the coressponding variables
        jokeTextView = (TextView) findViewById(R.id.jokeTextView);
        showJokeButton=(Button) findViewById(R.id.showJokeButton);
        relativeLayout =(RelativeLayout) findViewById(R.id.relativeLayout);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //the button was clicked ,so update the fact TextView with a new joke
            String joke=jokeBook.getJoke();
                jokeTextView.setText(joke);
                int color=colorWheel.getColor();
                relativeLayout.setBackgroundColor(color);
                showJokeButton.setTextColor(color);
            }
        };
        showJokeButton.setOnClickListener(listener);

        Toast.makeText(this,"Welcome to Shreyas's First App",Toast.LENGTH_LONG).show();
        Log.d(TAG,"We are loggin from the onCreate method");


    }
}
