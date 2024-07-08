package com.example.myrecipeapptensorflow;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.myrecipeapptensorflow.ChickenRecipes.ChickenRecipe1;
import com.example.myrecipeapptensorflow.ChickenRecipes.ChickenRecipe2;
import com.example.myrecipeapptensorflow.ChickenRecipes.ChickenRecipe4;
import com.example.myrecipeapptensorflow.ChickenRecipes.ChickenRecipe7;
import com.example.myrecipeapptensorflow.OtherRecipes.ResultChicken12Activity;
import com.example.myrecipeapptensorflow.SidebarActivities.AboutActivity;
import com.example.myrecipeapptensorflow.SidebarActivities.PrivacyPolicyActivity;
import com.example.myrecipeapptensorflow.SidebarActivities.TermsOfUseActivity;

public class ChickenResult47 extends AppCompatActivity {
    CardView inputRecipe1,inputRecipe2;
    DrawerLayout drawerLayout;
    ImageView menu;
    LinearLayout about, settings, terms, policy, exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chicken_result47);
        inputRecipe1 = findViewById(R.id.inputRecipe1);
        inputRecipe2 = findViewById(R.id.inputRecipe2);
        inputRecipe1.setOnClickListener(view -> {
            Intent intent = new Intent(ChickenResult47.this, ChickenRecipe4.class);
            startActivity(intent);
        });
        inputRecipe2.setOnClickListener(view -> {
            Intent intent = new Intent(ChickenResult47.this, ChickenRecipe7.class);
            startActivity(intent);
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
                redirectActivity(ChickenResult47.this, StartActivity.class);
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
                redirectActivity(ChickenResult47.this, AboutActivity.class);
            }
        });
        terms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                redirectActivity(ChickenResult47.this, TermsOfUseActivity.class);
            }
        });
        policy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                redirectActivity(ChickenResult47.this, PrivacyPolicyActivity.class);
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