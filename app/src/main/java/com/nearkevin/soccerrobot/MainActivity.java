package com.nearkevin.soccerrobot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button startButton;
    private TextView aboutText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("Welcome User !");
        startButton = (Button) findViewById(R.id.button_start);
        startButton.setVisibility(View.VISIBLE);
        startButton.setOnClickListener(this);
        aboutText = (TextView) findViewById(R.id.text_about);
        aboutText.setOnClickListener(this);
    }



    @Override
    public void onClick(View view) {
        Intent intent;
        if(view.getId()==R.id.button_start){
            intent = new Intent(this,gameActivity.class);
            startActivity(intent);
        }
        else if (view.getId()==R.id.text_about){
            intent = new Intent(this,AboutActivity.class);
            startActivity(intent);
        }
    }
}
