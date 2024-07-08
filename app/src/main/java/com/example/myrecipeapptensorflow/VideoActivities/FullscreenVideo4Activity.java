package com.example.myrecipeapptensorflow.VideoActivities;

import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myrecipeapptensorflow.R;

public class FullscreenVideo4Activity extends AppCompatActivity {

    private VideoView videoView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen_video4);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        videoView4 = findViewById(R.id.video_view4);
        videoView4.setMediaController(new MediaController(this));
        videoView4.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.chicken_tinola));
        videoView4.requestFocus();
        videoView4.start();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (videoView4 != null) {
            videoView4.stopPlayback();
        }
    }

    public void onCloseButtonClick(View view) {
        finish();
    }
}
