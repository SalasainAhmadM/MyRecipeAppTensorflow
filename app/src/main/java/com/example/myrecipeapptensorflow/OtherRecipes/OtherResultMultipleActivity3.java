package com.example.myrecipeapptensorflow.OtherRecipes;

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

import com.example.myrecipeapptensorflow.BeefRecipes.BeefRecipe3;
import com.example.myrecipeapptensorflow.BeefRecipes.BeefRecipe4;
import com.example.myrecipeapptensorflow.ChickenRecipes.ChickenRecipe6;
import com.example.myrecipeapptensorflow.ChickenRecipes.ChickenRecipe7;
import com.example.myrecipeapptensorflow.R;
import com.example.myrecipeapptensorflow.SeafoodRecipes.SeafoodRecipe4;
import com.example.myrecipeapptensorflow.SidebarActivities.AboutActivity;
import com.example.myrecipeapptensorflow.SidebarActivities.PrivacyPolicyActivity;
import com.example.myrecipeapptensorflow.SidebarActivities.SettingsActivity;
import com.example.myrecipeapptensorflow.SidebarActivities.TermsOfUseActivity;
import com.example.myrecipeapptensorflow.StartActivity;
import com.example.myrecipeapptensorflow.VegetablesRecipes.VegetableRecipe3;
import com.example.myrecipeapptensorflow.VegetablesRecipes.VegetableRecipe4;
import com.example.myrecipeapptensorflow.VegetablesRecipes.VegetableRecipe5;

public class OtherResultMultipleActivity3 extends AppCompatActivity {
    CardView inputRecipe1,inputRecipe2,inputRecipe3,inputRecipe4,inputRecipe5,inputRecipe6,inputRecipe7,inputRecipe8;
    DrawerLayout drawerLayout;
    ImageView menu;
    LinearLayout about, settings, terms, policy, exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_result_multiple3);
        inputRecipe1 = findViewById(R.id.inputRecipe1);
        inputRecipe2 = findViewById(R.id.inputRecipe2);
        inputRecipe3 = findViewById(R.id.inputRecipe3);
        inputRecipe4 = findViewById(R.id.inputRecipe4);
        inputRecipe5 = findViewById(R.id.inputRecipe5);
        inputRecipe6 = findViewById(R.id.inputRecipe6);
        inputRecipe7 = findViewById(R.id.inputRecipe7);
        inputRecipe8 = findViewById(R.id.inputRecipe8);
        inputRecipe1.setOnClickListener(view -> {
            Intent intent = new Intent(OtherResultMultipleActivity3.this, ChickenRecipe6.class);
            startActivity(intent);
        });
        inputRecipe2.setOnClickListener(view -> {
            Intent intent = new Intent(OtherResultMultipleActivity3.this, ChickenRecipe7.class);
            startActivity(intent);
        });
        inputRecipe3.setOnClickListener(view -> {
            Intent intent = new Intent(OtherResultMultipleActivity3.this, BeefRecipe3.class);
            startActivity(intent);
        });
        inputRecipe4.setOnClickListener(view -> {
            Intent intent = new Intent(OtherResultMultipleActivity3.this, BeefRecipe4.class);
            startActivity(intent);
        });
        inputRecipe5.setOnClickListener(view -> {
            Intent intent = new Intent(OtherResultMultipleActivity3.this, VegetableRecipe3.class);
            startActivity(intent);
        });
        inputRecipe6.setOnClickListener(view -> {
            Intent intent = new Intent(OtherResultMultipleActivity3.this, VegetableRecipe4.class);
            startActivity(intent);
        });
        inputRecipe7.setOnClickListener(view -> {
            Intent intent = new Intent(OtherResultMultipleActivity3.this, VegetableRecipe5.class);
            startActivity(intent);
        });
        inputRecipe8.setOnClickListener(view -> {
            Intent intent = new Intent(OtherResultMultipleActivity3.this, SeafoodRecipe4.class);
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
                redirectActivity(OtherResultMultipleActivity3.this, StartActivity.class);
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
                redirectActivity(OtherResultMultipleActivity3.this, AboutActivity.class);
            }
        });
        terms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                redirectActivity(OtherResultMultipleActivity3.this, TermsOfUseActivity.class);
            }
        });
        policy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                redirectActivity(OtherResultMultipleActivity3.this, PrivacyPolicyActivity.class);
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