package com.boom_co.android.boomcoapp;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Locale;

import static android.R.attr.typeface;

public class StartActivity extends AppCompatActivity {
    Button mCalculator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FontsOverride.setDefaultFont(this, "MONOSPACE", "fonts/Capture it.ttf");
        setContentView(R.layout.activity_start);

        mCalculator = (Button) findViewById(R.id.calculator);


    }

    public void onCalculator(View view) {
        Intent intent = new Intent(this, SelectCalcActivity.class);
        startActivity(intent);
    }
}
