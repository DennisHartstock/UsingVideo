package com.example.usingvideo;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playUriVideo();

        playPathVideo();

    }

    private void playUriVideo() {
        Uri videoUri = Uri.parse("http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4");

        VideoView uriVideoView = findViewById(R.id.UriVideoView);
        uriVideoView.setVideoURI(videoUri);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(uriVideoView);

        uriVideoView.setMediaController(mediaController);
        uriVideoView.start();
    }

    private void playPathVideo() {
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.demo;

        VideoView pathVideoView = findViewById(R.id.pathVideoView);
        pathVideoView.setVideoPath(videoPath);

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(pathVideoView);

        pathVideoView.setMediaController(mediaController);
        pathVideoView.start();
    }
}