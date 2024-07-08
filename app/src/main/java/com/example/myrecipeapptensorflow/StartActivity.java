package com.example.myrecipeapptensorflow;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myrecipeapptensorflow.BottomNavActivities.HomeActivity;

public class StartActivity extends AppCompatActivity {

    ImageButton start, exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_start);
        start = findViewById(R.id.start);
        exit = findViewById(R.id.exit);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartActivity.this, HomeActivity.class);
                v.startAnimation(AnimationUtils.loadAnimation(StartActivity.this, R.anim.exit_animation));
                Toast.makeText(StartActivity.this, "Welcome to Recipic", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                // Hide the loading animation when the new activity is ready to be displayed
                getWindow().getDecorView().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        findViewById(R.id.loading_layout).setVisibility(View.GONE);
                    }
                }, 2000);
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(StartActivity.this);
                builder.setTitle("Exit Recipic");
                builder.setMessage("Are you sure you want to exit?");
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finish();
                        System.exit(0);
                    }
                });
                builder.setNegativeButton("No", null);
                builder.show();
                v.startAnimation(AnimationUtils.loadAnimation(StartActivity.this, R.anim.exit_animation));
            }
        });
    }
}
