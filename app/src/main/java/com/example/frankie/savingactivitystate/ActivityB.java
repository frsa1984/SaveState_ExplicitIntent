package com.example.frankie.savingactivitystate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityB extends AppCompatActivity {

    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        back = (Button) findViewById(R.id.back);

    }
    public void goBack(View v){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
