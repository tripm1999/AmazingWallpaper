package com.phamminhtri.amazingwallpaper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.Timer;
import java.util.TimerTask;

public class ACTSplash extends AppCompatActivity {
    ImageView img_logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actsplash);
        init();

        //glide load img
        Glide.with(this).load(R.drawable.splash).into(img_logo);
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                startActivity(new Intent(ACTSplash.this, ACTLatest.class));
                finish();
            }
        }, 1000);
    }

    public void init() {
        img_logo = findViewById(R.id.img_logo);
    }

}

