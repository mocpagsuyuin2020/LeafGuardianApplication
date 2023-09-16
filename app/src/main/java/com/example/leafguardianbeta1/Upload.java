package com.example.leafguardianbeta1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Upload extends AppCompatActivity {

    ImageButton imagebtnBack2;
    Button btncapture2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload);

        imagebtnBack2 = findViewById(R.id.imagebtnBack2);

        imagebtnBack2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Upload.this, CaptureOrUpload.class);
                startActivity(intent);
            }
        });
    }
}