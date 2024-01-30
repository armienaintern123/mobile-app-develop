package com.example.learningproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.view;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewByID(R.id.textView);
    }

    public void updateText(View view){
        System.out.println("Button clicked");
    }
}