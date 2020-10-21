package com.example.myapplication.myapplication14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class TargetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);

        SharedPreferences spIntra = getPreferences(MODE_PRIVATE);
        String valeurIntra = spIntra.getString(MainActivity.CLE_INTRA, "null");

        SharedPreferences spInter = getSharedPreferences(MainActivity.NOM_FICHIER, MODE_PRIVATE);
        String valeurInter = spInter.getString(MainActivity.CLE_INTER, "null");
        TextView tvIntra = findViewById(R.id.valeur_intra);
        tvIntra.setText(valeurIntra);
        TextView tvInter = findViewById(R.id.valeur_inter);
        tvInter.setText(valeurInter);
    }
}