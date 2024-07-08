package com.example.myrecipeapptensorflow.ListViewRecipes;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myrecipeapptensorflow.R;
import com.example.myrecipeapptensorflow.databinding.ActivitySeafoodRecipesDetailsBinding;

public class SeafoodDetailsActivity extends AppCompatActivity {
    ActivitySeafoodRecipesDetailsBinding binding;
    private Button likeButton;
    private int likeCount;
    private SharedPreferences preferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        binding = ActivitySeafoodRecipesDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent intent = this.getIntent();

        if (intent != null){
            String name = intent.getStringExtra("name");
            String time = intent.getStringExtra("time");
            int ingredients = intent.getIntExtra("ingredients", R.string.ginataanAliIngredients);
            int desc = intent.getIntExtra("desc", R.string.ginataanAliDesc);
            int image = intent.getIntExtra("image", R.drawable.ginataangalimasag);
            binding.detailName.setText(name);
            binding.detailTime.setText(time);
            binding.detailDesc.setText(desc);
            binding.detailIngredients.setText(ingredients);
            binding.detailImage.setImageResource(image);
        }

    }
}