package com.example.multiwindows;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMove = findViewById(R.id.btn_move);
        Button btnShare = findViewById(R.id.btn_share);

        btnMove.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, NewActivity.class)));
        btnShare.setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.putExtra(Intent.EXTRA_TEXT, "Hallo Saya Rifan");
            intent.setType("text/plain");

            startActivity(Intent.createChooser(intent, "Share"));
        });D

    }
}