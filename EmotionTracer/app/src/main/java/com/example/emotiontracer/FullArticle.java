package com.example.emotiontracer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FullArticle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_article);
    }

    @Override
    protected void onResume() {
        super.onResume();
        TextView tvTitle = findViewById(R.id.tv_nameOfArticle);
        TextView tvBody = findViewById(R.id.tv_about_article);
        ImageView ivArticle = findViewById(R.id.iv_image_article);
        ivArticle.setImageResource(R.mipmap.smile_pnh);
        Bundle b = this.getIntent().getExtras();
        String title = b.get("title").toString();
        String body = b.get("body").toString();
        tvTitle.setText(title);
        tvBody.setText(body);
    }
}