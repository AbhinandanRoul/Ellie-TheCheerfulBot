package com.example.emotiontracer;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity2 extends AppCompatActivity {

    static int CAMERA_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Animation fade_all = AnimationUtils.loadAnimation(this , R.anim.fade_all);
        Animation fade_slow = AnimationUtils.loadAnimation(this , R.anim.fade_slow);
        FloatingActionButton btn_more = findViewById(R.id.btnf_more);
        CardView cv1 = findViewById(R.id.cv1);
        CardView cv2 = findViewById(R.id.cv2);
        TextView title = findViewById(R.id.textViewTitle);
        fade_all.setDuration(50);
        cv1.setAnimation(fade_all);
        fade_all.setDuration(400);
        cv2.setAnimation(fade_all);
        fade_slow.setDuration(900);
        title.setAnimation(fade_slow);
        LottieAnimationView lavmenu = findViewById(R.id.lavmenu);
        lavmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lavmenu.playAnimation();
            }
        });

        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MissonP1.class);
                startActivity(intent);
            }
        });

        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent camera_intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                    startActivityForResult(camera_intent , CAMERA_CODE);
            }
        });

        btn_more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext() , AllActions.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode== CAMERA_CODE &&resultCode== RESULT_OK ){
            Log.i("hello", "onActivityResult: Inside the if condition");
            Bundle extras = data.getExtras();
            Bitmap imageBitmap =(Bitmap) extras.get("data");
            Intent resPage = new Intent(this, ResPage.class );
            resPage.putExtras(extras);
            startActivity(resPage);
        }
    }
}