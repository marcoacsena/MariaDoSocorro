package com.example.mariadosocorro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    private TextView tvNome, tvLuEMarco;
    private VideoView viParabens;
    private Button btnVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvNome = findViewById(R.id.tvNome);
        tvLuEMarco = findViewById(R.id.tvLuEMarco);
        viParabens = findViewById(R.id.viParabens);
        btnVideo = findViewById(R.id.btnVideo);

        viParabens.setMediaController(new MediaController(this));

        btnVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                viParabens.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.cantores );
                viParabens.start();
                tvLuEMarco.setVisibility(View.VISIBLE);

            }
        });
    }
}
