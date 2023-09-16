package com.example.leafguardianbeta1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class CaptureOrUpload extends AppCompatActivity {

    ImageButton imagebtnCamera, imagebtnUpload;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capture_or_upload);

        imagebtnCamera = findViewById(R.id.imagebtnCamera);
        imagebtnUpload = findViewById(R.id.imagebtnUpload);

        imagebtnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CaptureOrUpload.this, Capture.class);
                startActivity(intent);
            }
        });

        imagebtnUpload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CaptureOrUpload.this, Upload.class);
                startActivity(intent);
            }
        });
    }
}