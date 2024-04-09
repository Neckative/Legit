package com.example.test;

import static kotlinx.coroutines.DelayKt.delay;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HomeActivity extends AppCompatActivity {

    private ImageButton btn2;
    private ImageButton btn3;

    private Button btn_setting;
    private TextView recommend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.home), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btn2 = (ImageButton) findViewById(R.id.travis1);
        btn3 = (ImageButton) findViewById(R.id.jd4fr);
        btn_setting = (Button) findViewById(R.id.profile_button);
        recommend = (TextView) findViewById(R.id.recommend);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fn_Product1();
            }
        });

        btn_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fn_Setting();
            }
        });
        recommend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fn_random();
            }
        });
    }
    public void fn_Product1() {
        Intent intent = new Intent(this, Product1.class);
        startActivity(intent);
        }
    public void fn_Setting() {
        Intent intent = new Intent(this, Setting.class);
        startActivity(intent);
    }
    public void fn_random() {
        Intent intent = new Intent(this, Random.class);
        startActivity(intent);
    }
    }