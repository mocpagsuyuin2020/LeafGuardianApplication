package com.example.leafguardianbeta1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Home extends AppCompatActivity {

    ImageButton imagebtnBack3, imagebtnTreatment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        imagebtnBack3 = findViewById(R.id.imagebtnBack3);
        //imagebtnTreatment = findViewById(R.id.imagebtnTreatment);//

        imagebtnBack3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, CaptureOrUpload.class);
                startActivity(intent);
            }
        });

        /*imagebtnTreatment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Treatment.class);
                startActivity(intent);
            }
        });*/

    }
}