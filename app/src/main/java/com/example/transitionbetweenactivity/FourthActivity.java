package com.example.transitionbetweenactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FourthActivity extends AppCompatActivity implements View.OnClickListener {


    Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button4:
                Intent intent = new Intent(this,FifthActivity.class);
                startActivity(intent);
                break;
            default:
                break;

        }

    }
}
