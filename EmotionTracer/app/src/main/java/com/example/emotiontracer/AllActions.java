package com.example.emotiontracer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AllActions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_actions);
    }

    @Override
    protected void onResume() {
        super.onResume();
        CardView cvHappy = findViewById(R.id.cv_happy);
        CardView cvAngry = findViewById(R.id.cv_angry);
        CardView cvSad = findViewById(R.id.cv_sad);
        CardView cvNeutral = findViewById(R.id.cv_neutral);

        cvHappy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle b = new Bundle();
                b.putString("emotion" , "happy");
                Intent intent = new Intent(getApplicationContext(), ShowArticles.class);
                intent.putExtras(b);
                startActivity(intent);
            }
        });

        cvSad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle b = new Bundle();
                b.putString("emotion" , "sad");
                Intent intent = new Intent(getApplicationContext(), ShowArticles.class);
                intent.putExtras(b);
                startActivity(intent);
            }
        });

        cvAngry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle b = new Bundle();
                b.putString("emotion" , "angry");
                Intent intent = new Intent(getApplicationContext(), ShowArticles.class);
                intent.putExtras(b);
                startActivity(intent);
            }
        });

        cvNeutral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle b = new Bundle();
                b.putString("emotion" , "neutral");
                Intent intent = new Intent(getApplicationContext(), ShowArticles.class);
                intent.putExtras(b);
                startActivity(intent);
            }
        });
    }
}