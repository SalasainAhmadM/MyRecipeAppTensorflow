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

public class FullscreenVideo2Activity extends AppCompatActivity {

    private VideoView videoView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen_video2);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        videoView2 = findViewById(R.id.video_view2);
        videoView2.setMediaController(new MediaController(this));
        videoView2.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.buffalo_wings));
        videoView2.requestFocus();
        videoView2.start();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (videoView2 != null) {
            videoView2.stopPlayback();
        }
    }

    public void onCloseButtonClick(View view) {
        finish();
    }
}
