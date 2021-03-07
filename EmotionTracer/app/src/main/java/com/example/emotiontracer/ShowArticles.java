package com.example.emotiontracer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ShowArticles extends AppCompatActivity {

    static ArrayList<Article> list ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_articles);
    }

    @Override
    protected void onResume() {
        super.onResume();
        listOfArticles ob = new listOfArticles();
//        article 1
        ConstraintLayout clArticle1 = findViewById(R.id.cl_article1);
        ImageView ivArticle1 = findViewById(R.id.iv_artilce1);
        TextView tvArticl1Head = findViewById(R.id.tv_article1_head);
        TextView tvArticl1Body = findViewById(R.id.tv_article1_body);

        //        article 2
        ConstraintLayout clArticle2 = findViewById(R.id.cl_article2);
        ImageView ivArticle2 = findViewById(R.id.iv_artilce2);
        TextView tvArticl2Head = findViewById(R.id.tv_article2_head);
        TextView tvArticl2Body = findViewById(R.id.tv_article2_body);

        //        article 3
        ConstraintLayout clArticle3 = findViewById(R.id.cl_article3);
        ImageView ivArticle3 = findViewById(R.id.iv_artilce3);
        TextView tvArticl3Head = findViewById(R.id.tv_article3_head);
        TextView tvArticl3Body = findViewById(R.id.tv_article3_body);

        //        article 4
        ConstraintLayout clArticle4 = findViewById(R.id.cl_article4);
        ImageView ivArticle4 = findViewById(R.id.iv_artilce4);
        TextView tvArticl4Head = findViewById(R.id.tv_article4_head);
        TextView tvArticl4Body = findViewById(R.id.tv_article4_body);

        //        article 5
        ConstraintLayout clArticle5 = findViewById(R.id.cl_article5);
        ImageView ivArticle5 = findViewById(R.id.iv_artilce5);
        TextView tvArticl5Head = findViewById(R.id.tv_article5_head);
        TextView tvArticl5Body = findViewById(R.id.tv_article5_body);


        Bundle b = this.getIntent().getExtras();
        String emotion = b.get("emotion").toString();
        switch (emotion){
            case "happy":
                    list =  ob.listOfArticlesHappy;
            break;
            case "sad":
                list =  ob.listOfArticlesSad;
            break;
            case "angry":
                list =  ob.listOfArticlesAngry;
            break;
            case "neutral":
                list = ob.listOfArticlesBored;
            break;
        }

        String title = "";
        String body = "";
//        articl1
        ivArticle1.setImageResource(R.mipmap.smile_pnh);
        title = list.get(0).title;
        if(title.length()>35){
            title = title.substring(0,30) + "...";
        }
        body = list.get(0).body;
        if(body.length()>80){
            body= body.substring(0,70) + "...";
        }
        tvArticl1Head.setText(title);
        tvArticl1Body.setText(body);
        clArticle1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle b = new Bundle();
                b.putString("title" , list.get(0).title);
                b.putString("body" , list.get(0).body);
                Intent intent = new Intent(getApplicationContext() , FullArticle.class);
                intent.putExtras(b);
                startActivity(intent);

            }
        });

        //        articl2
        ivArticle2.setImageResource(R.mipmap.smile_pnh);
        title = list.get(1).title;
        if(title.length()>35){
            title = title.substring(0,30) + "...";
        }
        body = list.get(1).body;
        if(body.length()>80){
            body= body.substring(0,70) + "...";
        }
        tvArticl2Head.setText(title);
        tvArticl2Body.setText(body);

        clArticle2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle b = new Bundle();
                b.putString("title" , list.get(1).title);
                b.putString("body" , list.get(1).body);
                Intent intent = new Intent(getApplicationContext() , FullArticle.class);
                intent.putExtras(b);
                startActivity(intent);

            }
        });


        //        articl3
        ivArticle3.setImageResource(R.mipmap.smile_pnh);
        title = list.get(2).title;
        if(title.length()>35){
            title = title.substring(0,30) + "...";
        }
        body = list.get(2).body;
        if(body.length()>80){
            body= body.substring(0,70) + "...";
        }
        tvArticl3Head.setText(title);
        tvArticl3Body.setText(body);

        clArticle3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle b = new Bundle();
                b.putString("title" , list.get(2).title);
                b.putString("body" , list.get(2).body);
                Intent intent = new Intent(getApplicationContext() , FullArticle.class);
                intent.putExtras(b);
                startActivity(intent);

            }
        });

        //        articl4
        ivArticle4.setImageResource(R.mipmap.smile_pnh);
        title = list.get(3).title;
        if(title.length()>35){
            title = title.substring(0,30) + "...";
        }
        body = list.get(3).body;
        if(body.length()>80){
            body= body.substring(0,70) + "...";
        }
        tvArticl4Head.setText(title);
        tvArticl4Body.setText(body);

        clArticle4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle b = new Bundle();
                b.putString("title" , list.get(3).title);
                b.putString("body" , list.get(3).body);
                Intent intent = new Intent(getApplicationContext() , FullArticle.class);
                intent.putExtras(b);
                startActivity(intent);

            }
        });

        //        articl1
        ivArticle5.setImageResource(R.mipmap.smile_pnh);
        title = list.get(4).title;
        if(title.length()>35){
            title = title.substring(0,30) + "...";
        }
        body = list.get(4).body;
        if(body.length()>80){
            body= body.substring(0,70) + "...";
        }
        tvArticl5Head.setText(title);
        tvArticl5Body.setText(body);

        clArticle5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle b = new Bundle();
                b.putString("title" , list.get(4).title);
                b.putString("body" , list.get(4).body);
                Intent intent = new Intent(getApplicationContext() , FullArticle.class);
                intent.putExtras(b);
                startActivity(intent);

            }
        });

    }
}