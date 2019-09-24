package com.example.transitionbetweenactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FifthActivity extends AppCompatActivity implements View.OnClickListener {

    Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);


        Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button5:
                Intent intent = new Intent(this,FirstActivity.class);
                startActivity(intent);
                break;
            default:
                break;

        }

    }
}
