package com.example.frankie.savingactivitystate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    int counter=0;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);

    }

    public void doSomething(View v){  //This method is to call the other screen test
        Intent i = new Intent(this,ActivityB.class);
        startActivity(i);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TEST1","On Resume was called");
        counter++;
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("counter", counter);
        Log.d("TEST1", counter+" was saved");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        counter=savedInstanceState.getInt("counter");
        Log.d("TEST1", counter+" was restored");
    }
}
