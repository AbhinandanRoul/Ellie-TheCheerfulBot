package com.example.emotiontracer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MissonP1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_misson_p1);
    }

    @Override
    protected void onResume() {
        super.onResume();
        FloatingActionButton btnf1 = findViewById(R.id.btnf_missonp1_1);
        FloatingActionButton btnf2 = findViewById(R.id.btnf_missonp1_2);
        FloatingActionButton btnf3 = findViewById(R.id.btnf_missonp1_3);

        btnf1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext() , MissonP2.class);
                startActivity(intent);
            }
        });

        btnf2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext() , MissonP3.class);
                startActivity(intent);
            }
        });

        btnf3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext() , MissonP2.class);
                startActivity(intent);
            }
        });
    }
}