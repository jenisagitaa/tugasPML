package com.fiore_id.fioreidapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Beranda extends AppCompatActivity implements View.OnClickListener {

    private CardView bungacard, pesanancard, akuncard, helpcard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);

        bungacard = (CardView) findViewById(R.id.cardbunga);
        pesanancard = (CardView) findViewById(R.id.cardpesanan);
        akuncard = (CardView) findViewById(R.id.cardakun);
        helpcard = (CardView) findViewById(R.id.cardhelp);

        bungacard.setOnClickListener(this);
        pesanancard.setOnClickListener(this);
        akuncard.setOnClickListener(this);
        helpcard.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent i;

        switch (v.getId()){
            case R.id.cardhelp : i = new Intent(this, beranda_botnav.class);startActivity(i);break;
            case R.id.cardakun : i = new Intent(this,akun.class);startActivity(i);break;
        }


    }
}