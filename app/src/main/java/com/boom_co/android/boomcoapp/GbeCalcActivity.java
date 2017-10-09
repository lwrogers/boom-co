package com.boom_co.android.boomcoapp;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import static com.boom_co.android.boomcoapp.R.id.flare;

public class GbeCalcActivity extends AppCompatActivity {

    EditText mFlare;
    EditText mSmoke;
    EditText mShock;
    EditText mCritter;
    EditText mArtillery;
    EditText mBarrage;
    EditText mMedkit;
    TextView mGbeValue;
    int prevFlare;
    int newFlare;
    int prevSmoke;
    int newSmoke;
    int prevShock;
    int newShock;
    int prevCritter;
    int newCritter;
    int prevArtillery;
    int newArtillery;
    int prevBarrage;
    int newBarrage;
    int newMedkit;
    int prevMedkit;
    int sum;
    int difference;
    String suno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gbe_calc);

        prevFlare = 0;
        prevSmoke = 0;
        prevShock = 0;
        prevCritter = 0;
        prevArtillery = 0;
        prevBarrage = 0;
        prevMedkit = 0;
        sum = 0;

        mGbeValue = (TextView) findViewById(R.id.gbe_value);
        mFlare = (EditText) findViewById(flare);
        mSmoke = (EditText) findViewById(R.id.smoke);
        mShock = (EditText) findViewById(R.id.shock);
        mCritter = (EditText) findViewById(R.id.critter);
        mArtillery = (EditText) findViewById(R.id.artillery);
        mBarrage = (EditText) findViewById(R.id.barrage);
        mMedkit = (EditText) findViewById(R.id.medkit);

        mFlare.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    newFlare = Integer.parseInt(mFlare.getText().toString());
                } catch (NumberFormatException e) {
                    newFlare = 0;
                }
                difference = partialSum(newFlare,2,1) - partialSum(prevFlare,2,1);
                sum += difference;
                prevFlare = newFlare;
                suno = Integer.toString(sum);
                mGbeValue.setText(suno);
            }
        });

        mSmoke.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    newSmoke = Integer.parseInt(mSmoke.getText().toString());
                } catch (NumberFormatException e) {
                    newSmoke = 0;
                }
                difference = partialSum(newSmoke,2,1) - partialSum(prevSmoke,2,1);
                sum += difference;
                prevSmoke = newSmoke;
                suno = Integer.toString(sum);
                mGbeValue.setText(suno);

            }
        });

        mShock.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    newShock = Integer.parseInt(mShock.getText().toString());
                } catch (NumberFormatException e) {
                    newShock = 0;
                }
                difference = partialSum(newShock,7,5) - partialSum(prevShock,7,5);
                sum += difference;
                prevShock = newShock;
                suno = Integer.toString(sum);
                mGbeValue.setText(suno);
            }
        });

        mCritter.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    newCritter = Integer.parseInt(mCritter.getText().toString());
                } catch (NumberFormatException e) {
                    newCritter = 0;
                }
                difference = partialSum(newCritter,8,5) - partialSum(prevCritter,8,5);
                sum += difference;
                prevCritter = newCritter;
                suno = Integer.toString(sum);
                mGbeValue.setText(suno);

            }
        });

        mArtillery.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    newArtillery = Integer.parseInt(mArtillery.getText().toString());
                } catch (NumberFormatException e) {
                    newArtillery = 0;
                }
                difference = partialSum(newArtillery,3,2) - partialSum(prevArtillery,3,2);
                sum += difference;
                prevArtillery = newArtillery;
                suno = Integer.toString(sum);
                mGbeValue.setText(suno);
            }
        });

        mBarrage.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    newBarrage = Integer.parseInt(mBarrage.getText().toString());
                } catch (NumberFormatException e) {
                    newBarrage = 0;
                }
                difference = partialSum(newBarrage,10,6) - partialSum(prevBarrage,10,6);
                sum += difference;
                prevBarrage = newBarrage;
                suno = Integer.toString(sum);
                mGbeValue.setText(suno);

            }
        });

        mMedkit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {
                    newMedkit = Integer.parseInt(mMedkit.getText().toString());
                } catch (NumberFormatException e) {
                    newMedkit = 0;
                }
                difference = partialSum(newMedkit,6,3) - partialSum(prevMedkit,6,3);
                sum += difference;
                prevMedkit = newMedkit;
                suno = Integer.toString(sum);
                mGbeValue.setText(suno);
            }
        });

    }

    public int partialSum(int terms, int first, int rate) {
        int last = first+(terms-1)*rate;
        return ((terms)*(first+last))/2;
    }

}