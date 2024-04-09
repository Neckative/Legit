package com.example.test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Product1 extends AppCompatActivity {

    private ImageButton btn2;

    private Button btn3;
    private Button btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_product1);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.product1_page), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btn2 = (ImageButton) findViewById(R.id.product1);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fn_Product2();
            }
        });
        btn3 = (Button) findViewById(R.id.button_size);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fn_sizechart();
            }
        });
        btn4 = (Button) findViewById(R.id.recommendbutton);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fn_random();
            }
        });
    }
    public void fn_Product2() {
        Intent intent = new Intent(this, Product2.class);
        startActivity(intent);
    }
    public void fn_sizechart() {
        Intent intent = new Intent(this, SizeChart.class);
        startActivity(intent);
    }
    public void fn_random() {
        Intent intent = new Intent(this, Random.class);
        startActivity(intent);
    }

}
