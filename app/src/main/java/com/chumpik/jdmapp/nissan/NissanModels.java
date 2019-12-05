package com.chumpik.jdmapp.nissan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.chumpik.jdmapp.R;

public class NissanModels extends AppCompatActivity implements View.OnClickListener {

    Button ALSI_1;
    Button ALSI_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nissan_models);

        ALSI_1 = (Button) findViewById(R.id.ALSI_1);
        ALSI_1.setOnClickListener(this);

        ALSI_2 = (Button) findViewById(R.id.ALSI_2);
        ALSI_2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ALSI_1:
                Intent alsi1 = new Intent(this, com.chumpik.jdmapp.nissan.nissan_models.ALSI_1.class);
                startActivity(alsi1);
                break;
            case R.id.ALSI_2:
                Intent alsi2 = new Intent(this, com.chumpik.jdmapp.nissan.nissan_models.ALSI_2.class);
                startActivity(alsi2);
                break;
        }

    }
}
