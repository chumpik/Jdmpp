package com.chumpik.jdmapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.chumpik.jdmapp.nissan.nissan;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton ibToyota;
    ImageButton ibNissan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ibToyota = (ImageButton) findViewById(R.id.ibToyota);
        ibToyota.setImageResource(R.drawable.logo_toyota);
        ibToyota.setOnClickListener(this);

        ibNissan = (ImageButton) findViewById(R.id.ibNissan);
        ibNissan.setImageResource(R.drawable.logo_nissan);
        ibNissan.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ibNissan:
                Intent iNiss = new Intent(this, nissan.class);
                startActivity(iNiss);
                break;
            case R.id.ibToyota:
                Intent iToyota = new Intent(this, toyota.class);
                startActivity(iToyota);
                break;
        }
    }
}
