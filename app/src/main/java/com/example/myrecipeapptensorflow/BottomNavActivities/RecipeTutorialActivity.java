package com.example.myrecipeapptensorflow.BottomNavActivities;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.myrecipeapptensorflow.BeefRecipes.BeefRecipe1;
import com.example.myrecipeapptensorflow.BeefRecipes.BeefRecipe2;
import com.example.myrecipeapptensorflow.BeefRecipes.BeefRecipe3;
import com.example.myrecipeapptensorflow.BeefRecipes.BeefRecipe4;
import com.example.myrecipeapptensorflow.BeefRecipes.BeefRecipe5;
import com.example.myrecipeapptensorflow.BeefRecipes.BeefRecipe6;
import com.example.myrecipeapptensorflow.BeefRecipes.BeefRecipe7;
import com.example.myrecipeapptensorflow.BeefRecipes.BeefRecipe8;
import com.example.myrecipeapptensorflow.CardViewActivities.BeefRecipesActivity;
import com.example.myrecipeapptensorflow.CardViewActivities.ChickenRecipesActivity;
import com.example.myrecipeapptensorflow.CardViewActivities.PastaRecipesActivity;
import com.example.myrecipeapptensorflow.CardViewActivities.SeafoodRecipesActivity;
import com.example.myrecipeapptensorflow.CardViewActivities.VegetablesRecipesActivity;
import com.example.myrecipeapptensorflow.ChickenRecipes.ChickenRecipe1;
import com.example.myrecipeapptensorflow.ChickenRecipes.ChickenRecipe2;
import com.example.myrecipeapptensorflow.ChickenRecipes.ChickenRecipe3;
import com.example.myrecipeapptensorflow.ChickenRecipes.ChickenRecipe4;
import com.example.myrecipeapptensorflow.ChickenRecipes.ChickenRecipe5;
import com.example.myrecipeapptensorflow.ChickenRecipes.ChickenRecipe6;
import com.example.myrecipeapptensorflow.ChickenRecipes.ChickenRecipe7;
import com.example.myrecipeapptensorflow.ChickenRecipes.ChickenRecipe8;
import com.example.myrecipeapptensorflow.DessertRecipes.DessertRecipe1;
import com.example.myrecipeapptensorflow.DessertRecipes.DessertRecipe2;
import com.example.myrecipeapptensorflow.DessertRecipes.DessertRecipe3;
import com.example.myrecipeapptensorflow.DessertRecipes.DessertRecipe4;
import com.example.myrecipeapptensorflow.DessertRecipes.DessertRecipe5;
import com.example.myrecipeapptensorflow.DessertRecipes.DessertRecipe6;
import com.example.myrecipeapptensorflow.DessertRecipes.DessertRecipe7;
import com.example.myrecipeapptensorflow.DessertRecipes.DessertRecipe8;
import com.example.myrecipeapptensorflow.VideoActivities.FullscreenVideo2Activity;
import com.example.myrecipeapptensorflow.VideoActivities.FullscreenVideo3Activity;
import com.example.myrecipeapptensorflow.VideoActivities.FullscreenVideo4Activity;
import com.example.myrecipeapptensorflow.VideoActivities.FullscreenVideo5Activity;
import com.example.myrecipeapptensorflow.VideoActivities.FullscreenVideoActivity;
import com.example.myrecipeapptensorflow.PastaRecipes.PastaRecipe8;
import com.example.myrecipeapptensorflow.R;
import com.example.myrecipeapptensorflow.SeafoodRecipes.SeafoodRecipe8;
import com.example.myrecipeapptensorflow.SidebarActivities.PrivacyPolicyActivity;
import com.example.myrecipeapptensorflow.SidebarActivities.SettingsActivity;
import com.example.myrecipeapptensorflow.SidebarActivities.TermsOfUseActivity;
import com.example.myrecipeapptensorflow.StartActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class RecipeTutorialActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    ImageView menu;
    LinearLayout about, settings, terms, policy, exit;

    VideoView videoView,videoView2,videoView3,videoView4,videoView5;
    ImageButton playPauseButton,fullscreenButton;
    SeekBar seekBar;
    Handler handler;
    boolean isPlaying;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_tutorial);


        // Find the CardView and set its OnClickListener
        CardView videoCardView = findViewById(R.id.video_tutorial_1);
        videoCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Inflate the video input modal layout file
                View modalView = getLayoutInflater().inflate(R.layout.video_1, null);

                // Find the VideoView and set the video path
                videoView = modalView.findViewById(R.id.video_view_1);
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.beef_kaldereta);

                // Add a MediaController to the VideoView
                MediaController mediaController = new MediaController(RecipeTutorialActivity.this);
                mediaController.setAnchorView(videoView);
                videoView.setMediaController(mediaController);

                // Find the Play/Pause button and set its OnClickListener
                playPauseButton = modalView.findViewById(R.id.play_pause_button);
                playPauseButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (isPlaying) {
                            // Pause the video and change the button icon to "play"
                            videoView.pause();
                            playPauseButton.setImageResource(R.drawable.play);
                            isPlaying = false;
                        } else {
                            // Start playing the video and change the button icon to "pause"
                            videoView.start();
                            playPauseButton.setImageResource(R.drawable.pause);
                            isPlaying = true;
                        }
                    }
                });

                // Find the Fullscreen button and set its OnClickListener
                fullscreenButton = modalView.findViewById(R.id.fullscreen_button);
                fullscreenButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Start a new activity with the video in fullscreen mode
                        Intent intent = new Intent(RecipeTutorialActivity.this, FullscreenVideoActivity.class);
                        intent.putExtra("videoPath", "android.resource://" + getPackageName() + "/" + R.raw.beef_kaldereta);
                        startActivity(intent);
                    }
                });

                // Create and show the dialog
                AlertDialog.Builder builder = new AlertDialog.Builder(RecipeTutorialActivity.this);
                builder.setView(modalView);
                builder.setPositiveButton("CLOSE", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Stop the video and reset the button icon to "play"
                        videoView.stopPlayback();
                        playPauseButton.setImageResource(R.drawable.play);
                        dialog.dismiss();
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();

            }
        });
        CardView videoCardView2 = findViewById(R.id.video_tutorial_2);
        videoCardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Inflate the video input modal layout file
                View modalView = getLayoutInflater().inflate(R.layout.video_2, null);

                // Find the VideoView and set the video path
                videoView2 = modalView.findViewById(R.id.video_view_2);
                videoView2.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.buffalo_wings);

                // Add a MediaController to the VideoView
                MediaController mediaController = new MediaController(RecipeTutorialActivity.this);
                mediaController.setAnchorView(videoView2);
                videoView2.setMediaController(mediaController);

                // Find the Play/Pause button and set its OnClickListener
                playPauseButton = modalView.findViewById(R.id.play_pause_button2);
                playPauseButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (isPlaying) {
                            // Pause the video and change the button icon to "play"
                            videoView2.pause();
                            playPauseButton.setImageResource(R.drawable.play);
                            isPlaying = false;
                        } else {
                            // Start playing the video and change the button icon to "pause"
                            videoView2.start();
                            playPauseButton.setImageResource(R.drawable.pause);
                            isPlaying = true;
                        }
                    }
                });

                // Find the Fullscreen button and set its OnClickListener
                fullscreenButton = modalView.findViewById(R.id.fullscreen_button);
                fullscreenButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Start a new activity with the video in fullscreen mode
                        Intent intent = new Intent(RecipeTutorialActivity.this, FullscreenVideo2Activity.class);
                        intent.putExtra("videoPath", "android.resource://" + getPackageName() + "/" + R.raw.beef_kaldereta);
                        startActivity(intent);
                    }
                });

                // Create and show the dialog
                AlertDialog.Builder builder = new AlertDialog.Builder(RecipeTutorialActivity.this);
                builder.setView(modalView);
                builder.setPositiveButton("CLOSE", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Stop the video and reset the button icon to "play"
                        videoView2.stopPlayback();
                        playPauseButton.setImageResource(R.drawable.play);
                        dialog.dismiss();
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();

            }
        });
        CardView videoCardView3 = findViewById(R.id.video_tutorial_3);
        videoCardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Inflate the video input modal layout file
                View modalView = getLayoutInflater().inflate(R.layout.video_3, null);

                // Find the VideoView and set the video path
                videoView3 = modalView.findViewById(R.id.video_view_3);
                videoView3.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.chicken_adobo);

                // Add a MediaController to the VideoView
                MediaController mediaController = new MediaController(RecipeTutorialActivity.this);
                mediaController.setAnchorView(videoView3);
                videoView3.setMediaController(mediaController);

                // Find the Play/Pause button and set its OnClickListener
                playPauseButton = modalView.findViewById(R.id.play_pause_button3);
                playPauseButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (isPlaying) {
                            // Pause the video and change the button icon to "play"
                            videoView3.pause();
                            playPauseButton.setImageResource(R.drawable.play);
                            isPlaying = false;
                        } else {
                            // Start playing the video and change the button icon to "pause"
                            videoView3.start();
                            playPauseButton.setImageResource(R.drawable.pause);
                            isPlaying = true;
                        }
                    }
                });

                // Find the Fullscreen button and set its OnClickListener
                fullscreenButton = modalView.findViewById(R.id.fullscreen_button);
                fullscreenButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Start a new activity with the video in fullscreen mode
                        Intent intent = new Intent(RecipeTutorialActivity.this, FullscreenVideo3Activity.class);
                        intent.putExtra("videoPath", "android.resource://" + getPackageName() + "/" + R.raw.chicken_adobo);
                        startActivity(intent);
                    }
                });

                // Create and show the dialog
                AlertDialog.Builder builder = new AlertDialog.Builder(RecipeTutorialActivity.this);
                builder.setView(modalView);
                builder.setPositiveButton("CLOSE", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Stop the video and reset the button icon to "play"
                        videoView3.stopPlayback();
                        playPauseButton.setImageResource(R.drawable.play);
                        dialog.dismiss();
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();

            }
        });
        CardView videoCardView4 = findViewById(R.id.video_tutorial_4);
        videoCardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Inflate the video input modal layout file
                View modalView = getLayoutInflater().inflate(R.layout.video_4, null);

                // Find the VideoView and set the video path
                videoView4 = modalView.findViewById(R.id.video_view_4);
                videoView4.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.chicken_tinola);

                // Add a MediaController to the VideoView
                MediaController mediaController = new MediaController(RecipeTutorialActivity.this);
                mediaController.setAnchorView(videoView4);
                videoView4.setMediaController(mediaController);

                // Find the Play/Pause button and set its OnClickListener
                playPauseButton = modalView.findViewById(R.id.play_pause_button4);
                playPauseButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (isPlaying) {
                            // Pause the video and change the button icon to "play"
                            videoView4.pause();
                            playPauseButton.setImageResource(R.drawable.play);
                            isPlaying = false;
                        } else {
                            // Start playing the video and change the button icon to "pause"
                            videoView4.start();
                            playPauseButton.setImageResource(R.drawable.pause);
                            isPlaying = true;
                        }
                    }
                });

                // Find the Fullscreen button and set its OnClickListener
                fullscreenButton = modalView.findViewById(R.id.fullscreen_button);
                fullscreenButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Start a new activity with the video in fullscreen mode
                        Intent intent = new Intent(RecipeTutorialActivity.this, FullscreenVideo4Activity.class);
                        intent.putExtra("videoPath", "android.resource://" + getPackageName() + "/" + R.raw.chicken_tinola);
                        startActivity(intent);
                    }
                });

                // Create and show the dialog
                AlertDialog.Builder builder = new AlertDialog.Builder(RecipeTutorialActivity.this);
                builder.setView(modalView);
                builder.setPositiveButton("CLOSE", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Stop the video and reset the button icon to "play"
                        videoView4.stopPlayback();
                        playPauseButton.setImageResource(R.drawable.play);
                        dialog.dismiss();
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();

            }
        });
        CardView videoCardView5 = findViewById(R.id.video_tutorial_5);
        videoCardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Inflate the video input modal layout file
                View modalView = getLayoutInflater().inflate(R.layout.video_5, null);

                // Find the VideoView and set the video path
                videoView5 = modalView.findViewById(R.id.video_view_5);
                videoView5.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.filipino_style_spaghetti);

                // Add a MediaController to the VideoView
                MediaController mediaController = new MediaController(RecipeTutorialActivity.this);
                mediaController.setAnchorView(videoView5);
                videoView5.setMediaController(mediaController);

                // Find the Play/Pause button and set its OnClickListener
                playPauseButton = modalView.findViewById(R.id.play_pause_button5);
                playPauseButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (isPlaying) {
                            // Pause the video and change the button icon to "play"
                            videoView5.pause();
                            playPauseButton.setImageResource(R.drawable.play);
                            isPlaying = false;
                        } else {
                            // Start playing the video and change the button icon to "pause"
                            videoView5.start();
                            playPauseButton.setImageResource(R.drawable.pause);
                            isPlaying = true;
                        }
                    }
                });

                // Find the Fullscreen button and set its OnClickListener
                fullscreenButton = modalView.findViewById(R.id.fullscreen_button);
                fullscreenButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Start a new activity with the video in fullscreen mode
                        Intent intent = new Intent(RecipeTutorialActivity.this, FullscreenVideo5Activity.class);
                        intent.putExtra("videoPath", "android.resource://" + getPackageName() + "/" + R.raw.filipino_style_spaghetti);
                        startActivity(intent);
                    }
                });

                // Create and show the dialog
                AlertDialog.Builder builder = new AlertDialog.Builder(RecipeTutorialActivity.this);
                builder.setView(modalView);
                builder.setPositiveButton("CLOSE", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Stop the video and reset the button icon to "play"
                        videoView5.stopPlayback();
                        playPauseButton.setImageResource(R.drawable.play);
                        dialog.dismiss();
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();

            }
        });
        EditText searchEditText = findViewById(R.id.searchView);
        searchEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    String searchText = searchEditText.getText().toString().toLowerCase();
                    Intent intent;
                    switch (searchText) {
                        case "beef": case "beef recipes":
                            intent = new Intent(RecipeTutorialActivity.this, BeefRecipesActivity.class);
                            Toast.makeText(RecipeTutorialActivity.this, "Beef Recipes", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "bulalo":
                            intent = new Intent(RecipeTutorialActivity.this, BeefRecipe1.class);
                            Toast.makeText(RecipeTutorialActivity.this, "Bulalo", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "beef curry":
                            intent = new Intent(RecipeTutorialActivity.this, BeefRecipe2.class);
                            Toast.makeText(RecipeTutorialActivity.this, "Beef Curry", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "beef afritada":
                            intent = new Intent(RecipeTutorialActivity.this, BeefRecipe3.class);
                            Toast.makeText(RecipeTutorialActivity.this, "Beef Afritada", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "beef kaldereta":
                            intent = new Intent(RecipeTutorialActivity.this, BeefRecipe4.class);
                            Toast.makeText(RecipeTutorialActivity.this, "Beef Kaldereta", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "beef mechado":
                            intent = new Intent(RecipeTutorialActivity.this, BeefRecipe5.class);
                            Toast.makeText(RecipeTutorialActivity.this, "Beef Mechado", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "beef pares":
                            intent = new Intent(RecipeTutorialActivity.this, BeefRecipe6.class);
                            Toast.makeText(RecipeTutorialActivity.this, "Beef Pares", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "beef tapa":
                            intent = new Intent(RecipeTutorialActivity.this, BeefRecipe7.class);
                            Toast.makeText(RecipeTutorialActivity.this, "Beef Tapa", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "chicken": case "chicken recipes":
                            intent = new Intent(RecipeTutorialActivity.this, ChickenRecipesActivity.class);
                            Toast.makeText(RecipeTutorialActivity.this, "Chicken Recipes", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "chicken arozcaldo": case "arozcaldo": case "chicken aroz caldo":
                            intent = new Intent(RecipeTutorialActivity.this, ChickenRecipe1.class);
                            Toast.makeText(RecipeTutorialActivity.this, "Chicken Aroz Caldo", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "chicken adobo": case "adobong manok":
                            intent = new Intent(RecipeTutorialActivity.this, ChickenRecipe2.class);
                            Toast.makeText(RecipeTutorialActivity.this, "Chicken Adobo", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "garlic fried chicken":
                            intent = new Intent(RecipeTutorialActivity.this, ChickenRecipe3.class);
                            Toast.makeText(RecipeTutorialActivity.this, "Garlic Fried Chicken", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "chicken afritada":
                            intent = new Intent(RecipeTutorialActivity.this, ChickenRecipe4.class);
                            Toast.makeText(RecipeTutorialActivity.this, "Chicken Afritada", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "chicken buffalo wings": case "buffalo wings":
                            intent = new Intent(RecipeTutorialActivity.this, ChickenRecipe5.class);
                            Toast.makeText(RecipeTutorialActivity.this, "Chicken Buffalo Wings", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "chicken sinigang":
                            intent = new Intent(RecipeTutorialActivity.this, ChickenRecipe6.class);
                            Toast.makeText(RecipeTutorialActivity.this, "Chicken Sinigang", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "chicken kaldereta":
                            intent = new Intent(RecipeTutorialActivity.this, ChickenRecipe7.class);
                            Toast.makeText(RecipeTutorialActivity.this, "Chicken Kaldereta", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "vegetable": case "vegetable recipes":
                            intent = new Intent(RecipeTutorialActivity.this, VegetablesRecipesActivity.class);
                            Toast.makeText(RecipeTutorialActivity.this, "Vegetable Recipes", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "minatamis na kamote": case "matamis na kamote":
                            intent = new Intent(RecipeTutorialActivity.this, BeefRecipe1.class);
                            Toast.makeText(RecipeTutorialActivity.this, "Minatamis na Kamote", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "adobong kangkong":
                            intent = new Intent(RecipeTutorialActivity.this, BeefRecipe2.class);
                            Toast.makeText(RecipeTutorialActivity.this, "Adobong Kangkong", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "ginisang ampalaya at hipon": case "ginisang ampalaya":
                            intent = new Intent(RecipeTutorialActivity.this, BeefRecipe3.class);
                            Toast.makeText(RecipeTutorialActivity.this, "Ginisang Ampalaya at Hipon", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "ginisang sayote":
                            intent = new Intent(RecipeTutorialActivity.this, BeefRecipe4.class);
                            Toast.makeText(RecipeTutorialActivity.this, "Ginisang Sayote", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "ginisang gulay":
                            intent = new Intent(RecipeTutorialActivity.this, BeefRecipe5.class);
                            Toast.makeText(RecipeTutorialActivity.this, "Ginisang Gulay", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "ginisang togue":
                            intent = new Intent(RecipeTutorialActivity.this, BeefRecipe6.class);
                            Toast.makeText(RecipeTutorialActivity.this, "Ginisang Togue", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "ensaladang pipino":
                            intent = new Intent(RecipeTutorialActivity.this, BeefRecipe7.class);
                            Toast.makeText(RecipeTutorialActivity.this, "Ensaladang Pipino", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "tortang talong":
                            intent = new Intent(RecipeTutorialActivity.this, BeefRecipe7.class);
                            Toast.makeText(RecipeTutorialActivity.this, "Tortang Talong", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "seafood": case "seafood recipes":
                            intent = new Intent(RecipeTutorialActivity.this, SeafoodRecipesActivity.class);
                            Toast.makeText(RecipeTutorialActivity.this, "Seafood Recipes", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "ginataang alimasag":
                            intent = new Intent(RecipeTutorialActivity.this, SeafoodRecipesActivity.class);
                            Toast.makeText(RecipeTutorialActivity.this, "Ginataang Alimasag", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "ginataang hipon":
                            intent = new Intent(RecipeTutorialActivity.this, SeafoodRecipesActivity.class);
                            Toast.makeText(RecipeTutorialActivity.this, "Ginataang Hipon", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "crispy breaded shrimp": case "breaded shrimp":
                            intent = new Intent(RecipeTutorialActivity.this, SeafoodRecipesActivity.class);
                            Toast.makeText(RecipeTutorialActivity.this, "Crispy Breaded Shrimp", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "ginisang pusit":
                            intent = new Intent(RecipeTutorialActivity.this, SeafoodRecipesActivity.class);
                            Toast.makeText(RecipeTutorialActivity.this, "Ginisang Pusit", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "sisig pusit":
                            intent = new Intent(RecipeTutorialActivity.this, SeafoodRecipesActivity.class);
                            Toast.makeText(RecipeTutorialActivity.this, "Sisig Pusit", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "spicy tahong":
                            intent = new Intent(RecipeTutorialActivity.this, SeafoodRecipesActivity.class);
                            Toast.makeText(RecipeTutorialActivity.this, "Spicy Tahong", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "sweet and sour fish":
                            intent = new Intent(RecipeTutorialActivity.this, SeafoodRecipesActivity.class);
                            Toast.makeText(RecipeTutorialActivity.this, "Sweet and Sour Fish", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "dessert": case "dessert recipes":
                            intent = new Intent(RecipeTutorialActivity.this, SeafoodRecipesActivity.class);
                            Toast.makeText(RecipeTutorialActivity.this, "Seafood Recipes", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "ginumis":
                            intent = new Intent(RecipeTutorialActivity.this, DessertRecipe1.class);
                            Toast.makeText(RecipeTutorialActivity.this, "Ginumis", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "mango jelly":
                            intent = new Intent(RecipeTutorialActivity.this, DessertRecipe2.class);
                            Toast.makeText(RecipeTutorialActivity.this, "Mango Jelly", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "leche plan":
                            intent = new Intent(RecipeTutorialActivity.this, DessertRecipe3.class);
                            Toast.makeText(RecipeTutorialActivity.this, "Leche Flan", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "chocolate flan cake": case "chocolate cake":
                            intent = new Intent(RecipeTutorialActivity.this, DessertRecipe4.class);
                            Toast.makeText(RecipeTutorialActivity.this, "Chocolate Flan Cake", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "mini egg pies": case "egg pies":
                            intent = new Intent(RecipeTutorialActivity.this, DessertRecipe5.class);
                            Toast.makeText(RecipeTutorialActivity.this, "Mini Egg Pies", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "yema cake":
                            intent = new Intent(RecipeTutorialActivity.this, DessertRecipe6.class);
                            Toast.makeText(RecipeTutorialActivity.this, "Yema Cake", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "pianono":
                            intent = new Intent(RecipeTutorialActivity.this, DessertRecipe7.class);
                            Toast.makeText(RecipeTutorialActivity.this, "Pianono", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "pasta": case "pasta recipes":
                            intent = new Intent(RecipeTutorialActivity.this, PastaRecipesActivity.class);
                            Toast.makeText(RecipeTutorialActivity.this, "Pasta Recipes", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "filipino-style spaghetti": case "filipino style spaghetti": case "filipino spaghetti": case "pinoy spaghetti":
                            intent = new Intent(RecipeTutorialActivity.this, DessertRecipe1.class);
                            Toast.makeText(RecipeTutorialActivity.this, "Filipino-style Spaghetti", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "filipino-style carbonara": case "filipino style carbonara": case "filipino carbonara": case "pinoy carbonara":
                            intent = new Intent(RecipeTutorialActivity.this, DessertRecipe2.class);
                            Toast.makeText(RecipeTutorialActivity.this, "Filipino-style Carbonara", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "filipino-style lasagna": case "filipino style lasagna": case "filipino lasagna": case "pinoy lasagna":
                            intent = new Intent(RecipeTutorialActivity.this, DessertRecipe3.class);
                            Toast.makeText(RecipeTutorialActivity.this, "Filipino-style Lasagna", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "baked macaroni":
                            intent = new Intent(RecipeTutorialActivity.this, DessertRecipe4.class);
                            Toast.makeText(RecipeTutorialActivity.this, "Baked Macaroni", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "filipino-style macaroni salad": case "filipino style macaroni salad": case "filipino macaroni salad": case "pinoy macaroni salad":
                            intent = new Intent(RecipeTutorialActivity.this, DessertRecipe5.class);
                            Toast.makeText(RecipeTutorialActivity.this, "Filipino-style Macaroni Salad", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "lemon garlic shrimp pasta": case "garlic shrimp pasta": case "shrimp pasta":
                            intent = new Intent(RecipeTutorialActivity.this, DessertRecipe6.class);
                            Toast.makeText(RecipeTutorialActivity.this, "Lemon Garlic Shrimp Pasta", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "longganisa pasta":
                            intent = new Intent(RecipeTutorialActivity.this, DessertRecipe7.class);
                            Toast.makeText(RecipeTutorialActivity.this, "Longganisa Pasta", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "tyula itum": case "tiyula itum":
                            intent = new Intent(RecipeTutorialActivity.this, BeefRecipe8.class);
                            Toast.makeText(RecipeTutorialActivity.this, "Tiyula Itum", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "chicken pyanggang": case "pyanggang":
                            intent = new Intent(RecipeTutorialActivity.this, ChickenRecipe8.class);
                            Toast.makeText(RecipeTutorialActivity.this, "Chicken Pyanggang", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "puto":
                            intent = new Intent(RecipeTutorialActivity.this, DessertRecipe8.class);
                            Toast.makeText(RecipeTutorialActivity.this, "Puto", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "pancit bihon": case "bihon": case "pancit": case "vegetarian pancit bihon":
                            intent = new Intent(RecipeTutorialActivity.this, PastaRecipe8.class);
                            Toast.makeText(RecipeTutorialActivity.this, "Vegetarian Pancit Bihon", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                        case "tilapia": case "sweet and sour tilapia":
                            intent = new Intent(RecipeTutorialActivity.this, SeafoodRecipe8.class);
                            Toast.makeText(RecipeTutorialActivity.this, "Sweet and Sour Tilapia", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        default:
                            Toast.makeText(RecipeTutorialActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                            return false;
                    }
                }
                return false;
            }
        });

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.video);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.home:
                    startActivity(new Intent(getApplicationContext(), HomeActivity.class));
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_in_left);
                    finish();
                    return true;
                case R.id.capture:
                    startActivity(new Intent(getApplicationContext(), MainFunctionsActivity.class));
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_in_left);
                    finish();
                    return true;
                case R.id.video:
                    return true;
            }
            return false;
        });

        drawerLayout = findViewById(R.id.drawerLayout);
        menu = findViewById(R.id.menu);
        about = findViewById(R.id.about);
        terms = findViewById(R.id.terms);
        policy = findViewById(R.id.policy);
        exit = findViewById(R.id.exit_button);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                redirectActivity(RecipeTutorialActivity.this, StartActivity.class);
            }
        });
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDrawer(drawerLayout);
            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                redirectActivity(RecipeTutorialActivity.this, com.example.myrecipeapptensorflow.SidebarActivities.AboutActivity.class);
            }
        });
        terms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                redirectActivity(RecipeTutorialActivity.this, TermsOfUseActivity.class);
            }
        });
        policy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                redirectActivity(RecipeTutorialActivity.this, PrivacyPolicyActivity.class);
            }
        });
    }

    public static void openDrawer(DrawerLayout drawerLayout) {
        drawerLayout.openDrawer(GravityCompat.START);
    }
    public static void closeDrawer(DrawerLayout drawerLayout){
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
    }
    public static void redirectActivity(Activity activity, Class secondActivity){
        Intent intent = new Intent(activity, secondActivity);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        activity.startActivity(intent);
        activity.finish();
    }
    @Override
    protected void onPause() {
        super.onPause();
        closeDrawer(drawerLayout);
    }
}