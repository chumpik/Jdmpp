package com.chumpik.jdmapp.nissan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.chumpik.jdmapp.R;

public class nissan extends AppCompatActivity implements View.OnClickListener {
    Button bModNis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nissan);

        bModNis = (Button) findViewById(R.id.bModNis);
        bModNis.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bModNis:
                Intent modNis = new Intent(this, NissanModels.class);
                startActivity(modNis);
                break;
        }

    }
}
