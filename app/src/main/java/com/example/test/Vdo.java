package com.example.test;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.net.URL;

public class Vdo extends AppCompatActivity {

    private VideoView videoUrl;

    private MediaController mediaControllerUrl;

    private URL url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_vdo);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        videoUrl = findViewById(R.id.videoUrl);
        String videoUrlPath = "https://cdn.discordapp.com/attachments/1151771073805832262/1224753826863644823/blcgxadidas.mp4?ex=661ea3e3&is=660c2ee3&hm=e5a903e1be9eccd177bb86c41fa51717de82b6fe0ccdc069348b25ec12f9aa8e&";
        videoUrl.setVideoPath(videoUrlPath);

        mediaControllerUrl = new MediaController(this);
        videoUrl.setMediaController(mediaControllerUrl);
        mediaControllerUrl.setAnchorView(videoUrl);
        videoUrl.start();


    }

}