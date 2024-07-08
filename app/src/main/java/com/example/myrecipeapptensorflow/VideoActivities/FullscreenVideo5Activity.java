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

public class FullscreenVideo5Activity extends AppCompatActivity {

    private VideoView videoView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen_video5);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        videoView5 = findViewById(R.id.video_view5);
        videoView5.setMediaController(new MediaController(this));
        videoView5.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.filipino_style_spaghetti));
        videoView5.requestFocus();
        videoView5.start();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (videoView5 != null) {
            videoView5.stopPlayback();
        }
    }

    public void onCloseButtonClick(View view) {
        finish();
    }
}
