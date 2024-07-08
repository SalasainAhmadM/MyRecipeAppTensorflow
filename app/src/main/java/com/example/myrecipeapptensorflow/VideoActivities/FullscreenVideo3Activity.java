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

public class FullscreenVideo3Activity extends AppCompatActivity {

    private VideoView videoView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen_video3);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        videoView3 = findViewById(R.id.video_view3);
        videoView3.setMediaController(new MediaController(this));
        videoView3.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.chicken_adobo));
        videoView3.requestFocus();
        videoView3.start();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (videoView3 != null) {
            videoView3.stopPlayback();
        }
    }

    public void onCloseButtonClick(View view) {
        finish();
    }
}
