package com.example.test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class Random extends AppCompatActivity {

    private ImageSlider imageSlider;
    private ImageView btn1;
    private ImageView btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_random);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.random_page), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        imageSlider = (ImageSlider) findViewById(R.id.slider);
        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("https://www.goyard.com/media/wysiwyg/2024/homepage/202401/desktop/3.BLOC-ACTU-1-gauche-desktop.jpg","Goyard", ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel("https://scontent.fbkk29-4.fna.fbcdn.net/v/t39.30808-6/414925428_753236700184140_644455958575504481_n.jpg?_nc_cat=111&ccb=1-7&_nc_sid=5f2048&_nc_ohc=WAvmtFXDBn8AX-DQmbA&_nc_ht=scontent.fbkk29-4.fna&oh=00_AfBkFlCWByXD7mtewpa_1KX6VN9QLAMJqU0plCDOtNLpmQ&oe=6611FE8F","50th Aniversay Cartier", ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel("https://i.pinimg.com/1200x/06/ee/f0/06eef03400cb99816b951e3f45e4a5a8.jpg","Travis Scott x Nike", ScaleTypes.CENTER_CROP));
        imageSlider.setImageList(slideModels);
        btn1 = (ImageView) findViewById(R.id.imageView13);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fn_Product1();
            }
        });
        btn2 = (ImageView) findViewById(R.id.imageView11);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fn_vdo();
            }
        });
    }
    public void fn_Product1() {
        Intent intent = new Intent(this, Product1.class);
        startActivity(intent);
    }
    public void fn_vdo() {
        Intent intent = new Intent(this, Vdo.class);
        startActivity(intent);
    }

}