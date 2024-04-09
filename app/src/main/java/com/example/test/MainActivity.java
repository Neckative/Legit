package com.example.test;

import static android.os.SystemClock.sleep;
import static kotlinx.coroutines.DelayKt.delay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public static int stat = 0;
    public static int lang =0;
    public static String hiName = "hi";

    private int counter = 0;

    public EditText inputUser;
    public EditText inputPassword;
    private Button btn2Home;

    private TextView txtNotifiacation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputUser = (EditText) findViewById(R.id.Username);
        inputPassword = (EditText) findViewById(R.id.Password);
        btn2Home = (Button) findViewById(R.id.button3);
        txtNotifiacation = (TextView) findViewById(R.id.textView3);

        txtNotifiacation.setVisibility(View.GONE);
        txtNotifiacation.setText("Invalid Username or Password");

        btn2Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(inputUser.getText().toString().toLowerCase(), inputPassword.getText().toString());
            }
        });
    }
    /*
    * Lang
    * 0.Thai
    * 1.English
    * 2.Japanese
    * 3.Chinese
    * 4.Korean
    * 5.French
     */
    public void validate(String userName, String userPassword){
        if((userName.equals("admin")) && (userPassword.equals("1234"))){
            stat = 3;
            lang = 0;
            getUserName(userName);
            userlogin();
        } else if (userName.equals("neckkatie") && (userPassword.equals("1234"))){
            txtNotifiacation.setVisibility(View.GONE);

            stat = 3;
            lang = 0;
            getUserName(userName);
            userlogin();
        }else if (userName.equals("tawan") && (userPassword.equals("1234"))){
            txtNotifiacation.setVisibility(View.GONE);
            stat = 2;
            lang = 0;
            getUserName(userName);
            userlogin();
        }else if (userName.equals("pita") && (userPassword.equals("1234"))){
            txtNotifiacation.setVisibility(View.GONE);
            stat = 1;
            lang = 0;
            getUserName(userName);
            userlogin();
        }else if (userName.equals("ishowspeed") && (userPassword.equals("1234"))){
            txtNotifiacation.setVisibility(View.GONE);
            stat = 1;
            lang = 1;
            getUserName(userName);
            userlogin();
        }else if (userName.equals("miyabi") && (userPassword.equals("1234"))){
            txtNotifiacation.setVisibility(View.GONE);
            stat = 1;
            lang = 2;
            getUserName(userName);
            userlogin();
        }else if (userName.equals("ming") && (userPassword.equals("1234"))){
            txtNotifiacation.setVisibility(View.GONE);
            stat = 1;
            lang = 3;
            getUserName(userName);
            userlogin();
        }else if (userName.equals("lisa") && (userPassword.equals("1234"))){
            txtNotifiacation.setVisibility(View.GONE);
            stat = 1;
            lang = 4;
            getUserName(userName);
            userlogin();
        }else if (userName.equals("pogba") && (userPassword.equals("!1234"))){
            txtNotifiacation.setVisibility(View.GONE);
            stat = 1;
            lang = 5;
            getUserName(userName);
            userlogin();
        }
        else{
            counter++;
            txtNotifiacation.setVisibility(View.VISIBLE);
            txtNotifiacation.setText("You have " + String.valueOf(5-counter) + " attempts left");
            if(counter == 5){
                txtNotifiacation.setText("Try again later!");
                btn2Home.setEnabled(false);
            }
        }
    }

    private void delay(int i) {
    }

    void fn_Product1() {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
    void userlogin(){
        Intent intent = new Intent(this, SayHi.class);
        startActivity(intent);

    }
    public void getUserName(String userName){
        hiName = userName;

    }

}
