package com.boom_co.android.boomcoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import static com.boom_co.android.boomcoapp.R.id.flare;

public class IntelCalcActivity extends AppCompatActivity {

    EditText mFlare;
    EditText mSmoke;
    EditText mShock;
    EditText mCritter;
    EditText mArtillery;
    EditText mBarrage;
    EditText mMedkit;
    TextView mGbeValue;
    TextView mFlareEnergy;
    TextView mSmokeEnergy;
    TextView mShockEnergy;
    TextView mCritterEnergy;
    TextView mArtilleryEnergy;
    TextView mBarrageEnergy;
    TextView mMedkitEnergy;

    int prevFlare;
    int newFlare;
    int flareEnergy;
    int prevSmoke;
    int newSmoke;
    int smokeEnergy;
    int prevShock;
    int newShock;
    int shockEnergy;
    int prevCritter;
    int newCritter;
    int critterEnergy;
    int prevArtillery;
    int newArtillery;
    int artilleryEnergy;
    int prevBarrage;
    int newBarrage;
    int barrageEnergy;
    int newMedkit;
    int prevMedkit;
    int medkitEnergy;
    int sum;
    int difference;
    String suno; // my temp variable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intel_calc);

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
        mMedkit = (EditText) findViewById(R.id.battle);
        mFlareEnergy = (TextView) findViewById(R.id.flare_energy);
        mSmokeEnergy = (TextView) findViewById(R.id.smoke_energy);
        mShockEnergy = (TextView) findViewById(R.id.shock_energy);
        mCritterEnergy = (TextView) findViewById(R.id.critter_energy);
        mArtilleryEnergy = (TextView) findViewById(R.id.artillery_energy);
        mBarrageEnergy = (TextView) findViewById(R.id.barrage_energy);
        mMedkitEnergy = (TextView) findViewById(R.id.medkit_energy);


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
                flareEnergy = partialSum(newFlare,2,1);
                if (flareEnergy == 0) {
                    mFlareEnergy.setText("");
                } else {
                    suno = Integer.toString(flareEnergy);
                    mFlareEnergy.setText(suno);
                }
                difference = flareEnergy - partialSum(prevFlare, 2, 1);
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
                smokeEnergy = partialSum(newSmoke,2,1);
                if (smokeEnergy == 0) {
                    mSmokeEnergy.setText("");
                } else {
                    suno = Integer.toString(smokeEnergy);
                    mSmokeEnergy.setText(suno);
                }
                difference = smokeEnergy - partialSum(prevSmoke, 2, 1);
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
                shockEnergy = partialSum(newShock,7,5);
                if (shockEnergy == 0) {
                    mShockEnergy.setText("");
                } else {
                    suno = Integer.toString(shockEnergy);
                    mShockEnergy.setText(suno);
                }
                difference = shockEnergy - partialSum(prevShock, 7, 5);
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
                critterEnergy = partialSum(newCritter,8,5);
                if (critterEnergy == 0) {
                    mCritterEnergy.setText("");
                } else {
                    suno = Integer.toString(critterEnergy);
                    mCritterEnergy.setText(suno);
                }
                difference = critterEnergy - partialSum(prevCritter, 8, 5);
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
                artilleryEnergy = partialSum(newArtillery,3,2);
                if (artilleryEnergy == 0) {
                    mArtilleryEnergy.setText("");
                } else {
                    suno = Integer.toString(artilleryEnergy);
                    mArtilleryEnergy.setText(suno);
                }
                difference = artilleryEnergy - partialSum(prevArtillery, 3, 2);
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
                barrageEnergy = partialSum(newBarrage,10,6);
                if (barrageEnergy == 0) {
                    mBarrageEnergy.setText("");
                } else {
                    suno = Integer.toString(barrageEnergy);
                    mBarrageEnergy.setText(suno);
                }
                difference = barrageEnergy - partialSum(prevBarrage, 10, 6);
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
                medkitEnergy = partialSum(newMedkit,6,3);
                if (medkitEnergy == 0) {
                    mMedkitEnergy.setText("");
                } else {
                    suno = Integer.toString(medkitEnergy);
                    mMedkitEnergy.setText(suno);
                }
                difference = medkitEnergy - partialSum(prevMedkit, 6, 3);
                sum += difference;
                prevMedkit = newMedkit;
                suno = Integer.toString(sum);
                mGbeValue.setText(suno);
            }
        });

    }

    public int partialSum(int terms, int first, int rate) {
        int last = first + (terms - 1) * rate;
        return ((terms) * (first + last)) / 2;
    }
}

