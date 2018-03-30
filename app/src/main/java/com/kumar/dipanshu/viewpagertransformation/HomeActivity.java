package com.kumar.dipanshu.viewpagertransformation;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class HomeActivity extends AppCompatActivity {
    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        String videopath="android.resource://com.kumar.dipanshu.viewpagetransformation/"+R.raw.load;
        videoView= findViewById(R.id.videoview);
        MediaController mediaController=new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        Uri uri=Uri.parse(videopath);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();

    }
}
