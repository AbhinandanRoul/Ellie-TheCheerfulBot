package com.example.emotiontracer;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.emotiontracer.ml.ExpressionSs;
import org.tensorflow.lite.support.image.TensorImage;
import org.tensorflow.lite.support.label.Category;
import java.io.IOException;
import java.util.List;

public class ResPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res_page);
    }

    @Override
    protected void onResume() {
        super.onResume();
        ImageView ivResImg = findViewById(R.id.iv_resImage);
        TextView tvRes = findViewById(R.id.tv_res);
        Bundle extras = this.getIntent().getExtras();
        Bitmap img = (Bitmap) extras.get("data");
        ivResImg.setImageBitmap(img);

        try {
            ExpressionSs model = ExpressionSs.newInstance(this);

            // Creates inputs for reference.
            TensorImage image = TensorImage.fromBitmap(img);

            // Runs model inference and gets result.
            ExpressionSs.Outputs outputs = model.process(image);
            List<Category> probability = outputs.getProbabilityAsCategoryList();

            // Releases model resources if no longer used.

            Category c = probability.get(0);
            for(int i=1; i<probability.size(); i++){
                if(probability.get(i).getScore()>c.getScore()){
                    c = probability.get(i);
                }
            }

            tvRes.setText("emotion : " +  c.getLabel().toString() + " , probability :  " + c.getScore());
            model.close();


        } catch (IOException e) {
            // TODO Handle the exception
        }

    }



}