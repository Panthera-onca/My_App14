package com.example.myapplication.myapplication14;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.TargetApi;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String CLE_INTRA = "intra";
    public static final String CLE_INTER = "inter";
    public static final String NOM_FICHIER = "inter";

    private EditText etInter = null;
    private EditText etIntra = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etInter = findViewById(R.id.et_inter);
        etIntra = findViewById(R.id.et_intra);
    }

    public void onClickTargetActivity(View view) {
        Intent intention = new Intent(this, TargetActivity.class);
        startActivity(intention);
    }

    public void onClickInter(View view) {
        EditText et = findViewById(R.id.et_intra);
        SharedPreferences sp = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editeur = sp.edit();
        editeur.putString(CLE_INTRA, et.getText().toString());
        editeur.commit();
    }

    public void onClickIntra(View view) {
        EditText et = findViewById(R.id.et_inter);
        SharedPreferences sp = getSharedPreferences(NOM_FICHIER, MODE_PRIVATE);
        SharedPreferences.Editor editeur = sp.edit();
        editeur.putString(CLE_INTER, et.getText().toString());
        editeur.commit();
    }
}