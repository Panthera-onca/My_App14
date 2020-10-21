package com.example.myapplication.myapplication14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class TargetActivity extends AppCompatActivity {

    private TextView tvInter = null;
    private TextView tvIntra = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);}

    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences spIntra = getPreferences(MODE_PRIVATE);
        tvIntra.setText(spIntra.getString(MainActivity.CLE_INTRA, "VIDE"));

        SharedPreferences spInter = getSharedPreferences(MainActivity.NOM_FICHIER, MODE_PRIVATE);
        tvInter.setText(spInter.getString(MainActivity.CLE_INTER, "VIDE"));

    }


    }