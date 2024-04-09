package com.example.test;

import static android.os.SystemClock.sleep;
import static kotlinx.coroutines.DelayKt.delay;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import java.util.Random;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;


public class SayHi extends AppCompatActivity {

    public TextView sayhiText;
    public TextView name;
    public TextView date;

    public String nameOut;
    public static ConstraintLayout background;
    public int stat;
    Timer timer;


    public static int num = 0;
    private final String[][] sayhiTextArrays = {{"สวัสดี","ยินดีต้อนรับ"},
            {"Hello","Welcome", "Salute",},
            {"こんにちは","ようこそ", "おはようございます"},
            {"你好","欢迎", "早上好"},
            {"안녕하세요","환영합니다", "좋은 아침"},
            {"Bonjour","Bienvenue", "Bonjour"}};
    public Date today = new Date();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_say_hi);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.greetings), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
//      int num = rand.nextInt(6);
        sayhiText = (TextView) findViewById(R.id.randomgreeting);
        name = (TextView) findViewById(R.id.name);
        nameOut = MainActivity.hiName;
        date = (TextView) findViewById(R.id.date);
        background = (ConstraintLayout)findViewById(R.id.greetings);
        stat = MainActivity.stat;
        date.setText(today.toString());

        if(nameOut.equals("neckkatie") ){
            sayhiText.setText("Hello, Boss!");
            nameOut = "Owner";
            name.setText(nameOut);

        }
        else if (nameOut.equals("admin")) {
            sayhiText.setText("Ready to work?");
            nameOut = "Admin";
            name.setText(nameOut);
        }
        else if (nameOut.equals("ishowspeed")) {
            sayhiText.setText("I show the meat!");
            nameOut = "iShowSpeed";
            name.setText(nameOut);
        }
        else if ((stat==2) && (!nameOut.equals("vip"))){
            sayhiText.setText("I'm ready to serve you, VIP!");
            nameOut = ("VIP" +"\t\t" + MainActivity.hiName.substring(0, 1).toUpperCase() + MainActivity.hiName.substring(1));
            name.setText(nameOut);
        }
        else {
            nameOut = MainActivity.hiName.substring(0, 1).toUpperCase() + MainActivity.hiName.substring(1);
            name.setText(nameOut);
            random(3);
            sayhiText.setText(sayhiTextArrays[MainActivity.lang][num]);

        }
        sayhiText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fn_Product1();
            }
        });
    }

    void fn_Product1() {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
    void random(int x){
        Random rand = new Random();
        num = rand.nextInt(x);
    }

}

