package com.boom_co.android.boomcoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectCalcActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_calc);
    }



    public void onGbeCalc (View view) {
        Intent intent = new Intent(this, GbeCalcActivity.class);
        startActivity(intent);
    }

    public void onTdCalc (View view) {
        Intent intent = new Intent(this, TdCalcActivity.class);
        startActivity(intent);
    }

    public void onIntelCalc (View view) {
        Intent intent = new Intent(this, IntelCalcActivity.class);
        startActivity(intent);
    }
}
