package com.example.myrecipeapptensorflow.BottomNavActivities;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

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
import com.example.myrecipeapptensorflow.CameraCaptureActivity;
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
import com.example.myrecipeapptensorflow.InputIngredientsActivity;
import com.example.myrecipeapptensorflow.PastaRecipes.PastaRecipe8;
import com.example.myrecipeapptensorflow.R;
import com.example.myrecipeapptensorflow.SeafoodRecipes.SeafoodRecipe8;
import com.example.myrecipeapptensorflow.SidebarActivities.PrivacyPolicyActivity;
import com.example.myrecipeapptensorflow.SidebarActivities.SettingsActivity;
import com.example.myrecipeapptensorflow.SidebarActivities.TermsOfUseActivity;
import com.example.myrecipeapptensorflow.StartActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainFunctionsActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    ImageView menu;
    LinearLayout about, settings, terms, policy, exit;
    CardView inputIngredients,captureIngredients;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_capture);

        inputIngredients = findViewById(R.id.inputRecipes);
        captureIngredients = findViewById(R.id.captureRecipes);
        inputIngredients.setOnClickListener(view -> {
            Intent intent = new Intent(MainFunctionsActivity.this, InputIngredientsActivity.class);
            Toast.makeText(this, "Input Your Ingredients", Toast.LENGTH_SHORT).show();
            startActivity(intent);
        });
        captureIngredients.setOnClickListener(view -> {
            Intent intent = new Intent(MainFunctionsActivity.this, CameraCaptureActivity.class);
            Toast.makeText(this, "Capture Your Ingredients", Toast.LENGTH_SHORT).show();
            startActivity(intent);
        });


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.capture);

        bottomNavigationView.setOnItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.home:
                    startActivity(new Intent(getApplicationContext(), HomeActivity.class));
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_in_left);
                    finish();
                    return true;
                case R.id.capture:
                    return true;
                case R.id.video:
                    startActivity(new Intent(getApplicationContext(), RecipeTutorialActivity.class));
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_in_left);
                    finish();
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
                redirectActivity(MainFunctionsActivity.this, StartActivity.class);
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
                redirectActivity(MainFunctionsActivity.this, com.example.myrecipeapptensorflow.SidebarActivities.AboutActivity.class);
            }
        });
        terms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                redirectActivity(MainFunctionsActivity.this, TermsOfUseActivity.class);
            }
        });
        policy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                redirectActivity(MainFunctionsActivity.this, PrivacyPolicyActivity.class);
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
                            intent = new Intent(MainFunctionsActivity.this, BeefRecipesActivity.class);
                            Toast.makeText(MainFunctionsActivity.this, "Beef Recipes", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "bulalo":
                            intent = new Intent(MainFunctionsActivity.this, BeefRecipe1.class);
                            Toast.makeText(MainFunctionsActivity.this, "Bulalo", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "beef curry":
                            intent = new Intent(MainFunctionsActivity.this, BeefRecipe2.class);
                            Toast.makeText(MainFunctionsActivity.this, "Beef Curry", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "beef afritada":
                            intent = new Intent(MainFunctionsActivity.this, BeefRecipe3.class);
                            Toast.makeText(MainFunctionsActivity.this, "Beef Afritada", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "beef kaldereta":
                            intent = new Intent(MainFunctionsActivity.this, BeefRecipe4.class);
                            Toast.makeText(MainFunctionsActivity.this, "Beef Kaldereta", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "beef mechado":
                            intent = new Intent(MainFunctionsActivity.this, BeefRecipe5.class);
                            Toast.makeText(MainFunctionsActivity.this, "Beef Mechado", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "beef pares":
                            intent = new Intent(MainFunctionsActivity.this, BeefRecipe6.class);
                            Toast.makeText(MainFunctionsActivity.this, "Beef Pares", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "beef tapa":
                            intent = new Intent(MainFunctionsActivity.this, BeefRecipe7.class);
                            Toast.makeText(MainFunctionsActivity.this, "Beef Tapa", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "chicken": case "chicken recipes":
                            intent = new Intent(MainFunctionsActivity.this, ChickenRecipesActivity.class);
                            Toast.makeText(MainFunctionsActivity.this, "Chicken Recipes", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "chicken arozcaldo": case "arozcaldo": case "chicken aroz caldo":
                            intent = new Intent(MainFunctionsActivity.this, ChickenRecipe1.class);
                            Toast.makeText(MainFunctionsActivity.this, "Chicken Aroz Caldo", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "chicken adobo": case "adobong manok":
                            intent = new Intent(MainFunctionsActivity.this, ChickenRecipe2.class);
                            Toast.makeText(MainFunctionsActivity.this, "Chicken Adobo", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "garlic fried chicken":
                            intent = new Intent(MainFunctionsActivity.this, ChickenRecipe3.class);
                            Toast.makeText(MainFunctionsActivity.this, "Garlic Fried Chicken", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "chicken afritada":
                            intent = new Intent(MainFunctionsActivity.this, ChickenRecipe4.class);
                            Toast.makeText(MainFunctionsActivity.this, "Chicken Afritada", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "chicken buffalo wings": case "buffalo wings":
                            intent = new Intent(MainFunctionsActivity.this, ChickenRecipe5.class);
                            Toast.makeText(MainFunctionsActivity.this, "Chicken Buffalo Wings", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "chicken sinigang":
                            intent = new Intent(MainFunctionsActivity.this, ChickenRecipe6.class);
                            Toast.makeText(MainFunctionsActivity.this, "Chicken Sinigang", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "chicken kaldereta":
                            intent = new Intent(MainFunctionsActivity.this, ChickenRecipe7.class);
                            Toast.makeText(MainFunctionsActivity.this, "Chicken Kaldereta", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "vegetable": case "vegetable recipes":
                            intent = new Intent(MainFunctionsActivity.this, VegetablesRecipesActivity.class);
                            Toast.makeText(MainFunctionsActivity.this, "Vegetable Recipes", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "minatamis na kamote": case "matamis na kamote":
                            intent = new Intent(MainFunctionsActivity.this, BeefRecipe1.class);
                            Toast.makeText(MainFunctionsActivity.this, "Minatamis na Kamote", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "adobong kangkong":
                            intent = new Intent(MainFunctionsActivity.this, BeefRecipe2.class);
                            Toast.makeText(MainFunctionsActivity.this, "Adobong Kangkong", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "ginisang ampalaya at hipon": case "ginisang ampalaya":
                            intent = new Intent(MainFunctionsActivity.this, BeefRecipe3.class);
                            Toast.makeText(MainFunctionsActivity.this, "Ginisang Ampalaya at Hipon", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "ginisang sayote":
                            intent = new Intent(MainFunctionsActivity.this, BeefRecipe4.class);
                            Toast.makeText(MainFunctionsActivity.this, "Ginisang Sayote", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "ginisang gulay":
                            intent = new Intent(MainFunctionsActivity.this, BeefRecipe5.class);
                            Toast.makeText(MainFunctionsActivity.this, "Ginisang Gulay", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "ginisang togue":
                            intent = new Intent(MainFunctionsActivity.this, BeefRecipe6.class);
                            Toast.makeText(MainFunctionsActivity.this, "Ginisang Togue", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "ensaladang pipino":
                            intent = new Intent(MainFunctionsActivity.this, BeefRecipe7.class);
                            Toast.makeText(MainFunctionsActivity.this, "Ensaladang Pipino", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "tortang talong":
                            intent = new Intent(MainFunctionsActivity.this, BeefRecipe7.class);
                            Toast.makeText(MainFunctionsActivity.this, "Tortang Talong", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "seafood": case "seafood recipes":
                            intent = new Intent(MainFunctionsActivity.this, SeafoodRecipesActivity.class);
                            Toast.makeText(MainFunctionsActivity.this, "Seafood Recipes", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "ginataang alimasag":
                            intent = new Intent(MainFunctionsActivity.this, SeafoodRecipesActivity.class);
                            Toast.makeText(MainFunctionsActivity.this, "Ginataang Alimasag", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "ginataang hipon":
                            intent = new Intent(MainFunctionsActivity.this, SeafoodRecipesActivity.class);
                            Toast.makeText(MainFunctionsActivity.this, "Ginataang Hipon", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "crispy breaded shrimp": case "breaded shrimp":
                            intent = new Intent(MainFunctionsActivity.this, SeafoodRecipesActivity.class);
                            Toast.makeText(MainFunctionsActivity.this, "Crispy Breaded Shrimp", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "ginisang pusit":
                            intent = new Intent(MainFunctionsActivity.this, SeafoodRecipesActivity.class);
                            Toast.makeText(MainFunctionsActivity.this, "Ginisang Pusit", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "sisig pusit":
                            intent = new Intent(MainFunctionsActivity.this, SeafoodRecipesActivity.class);
                            Toast.makeText(MainFunctionsActivity.this, "Sisig Pusit", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "spicy tahong":
                            intent = new Intent(MainFunctionsActivity.this, SeafoodRecipesActivity.class);
                            Toast.makeText(MainFunctionsActivity.this, "Spicy Tahong", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "sweet and sour fish":
                            intent = new Intent(MainFunctionsActivity.this, SeafoodRecipesActivity.class);
                            Toast.makeText(MainFunctionsActivity.this, "Sweet and Sour Fish", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "dessert": case "dessert recipes":
                            intent = new Intent(MainFunctionsActivity.this, SeafoodRecipesActivity.class);
                            Toast.makeText(MainFunctionsActivity.this, "Seafood Recipes", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "ginumis":
                            intent = new Intent(MainFunctionsActivity.this, DessertRecipe1.class);
                            Toast.makeText(MainFunctionsActivity.this, "Ginumis", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "mango jelly":
                            intent = new Intent(MainFunctionsActivity.this, DessertRecipe2.class);
                            Toast.makeText(MainFunctionsActivity.this, "Mango Jelly", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "leche plan":
                            intent = new Intent(MainFunctionsActivity.this, DessertRecipe3.class);
                            Toast.makeText(MainFunctionsActivity.this, "Leche Flan", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "chocolate flan cake": case "chocolate cake":
                            intent = new Intent(MainFunctionsActivity.this, DessertRecipe4.class);
                            Toast.makeText(MainFunctionsActivity.this, "Chocolate Flan Cake", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "mini egg pies": case "egg pies":
                            intent = new Intent(MainFunctionsActivity.this, DessertRecipe5.class);
                            Toast.makeText(MainFunctionsActivity.this, "Mini Egg Pies", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "yema cake":
                            intent = new Intent(MainFunctionsActivity.this, DessertRecipe6.class);
                            Toast.makeText(MainFunctionsActivity.this, "Yema Cake", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "pianono":
                            intent = new Intent(MainFunctionsActivity.this, DessertRecipe7.class);
                            Toast.makeText(MainFunctionsActivity.this, "Pianono", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "pasta": case "pasta recipes":
                            intent = new Intent(MainFunctionsActivity.this, PastaRecipesActivity.class);
                            Toast.makeText(MainFunctionsActivity.this, "Pasta Recipes", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "filipino-style spaghetti": case "filipino style spaghetti": case "filipino spaghetti": case "pinoy spaghetti":
                            intent = new Intent(MainFunctionsActivity.this, DessertRecipe1.class);
                            Toast.makeText(MainFunctionsActivity.this, "Filipino-style Spaghetti", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "filipino-style carbonara": case "filipino style carbonara": case "filipino carbonara": case "pinoy carbonara":
                            intent = new Intent(MainFunctionsActivity.this, DessertRecipe2.class);
                            Toast.makeText(MainFunctionsActivity.this, "Filipino-style Carbonara", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "filipino-style lasagna": case "filipino style lasagna": case "filipino lasagna": case "pinoy lasagna":
                            intent = new Intent(MainFunctionsActivity.this, DessertRecipe3.class);
                            Toast.makeText(MainFunctionsActivity.this, "Filipino-style Lasagna", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "baked macaroni":
                            intent = new Intent(MainFunctionsActivity.this, DessertRecipe4.class);
                            Toast.makeText(MainFunctionsActivity.this, "Baked Macaroni", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "filipino-style macaroni salad": case "filipino style macaroni salad": case "filipino macaroni salad": case "pinoy macaroni salad":
                            intent = new Intent(MainFunctionsActivity.this, DessertRecipe5.class);
                            Toast.makeText(MainFunctionsActivity.this, "Filipino-style Macaroni Salad", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "lemon garlic shrimp pasta": case "garlic shrimp pasta": case "shrimp pasta":
                            intent = new Intent(MainFunctionsActivity.this, DessertRecipe6.class);
                            Toast.makeText(MainFunctionsActivity.this, "Lemon Garlic Shrimp Pasta", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "longganisa pasta":
                            intent = new Intent(MainFunctionsActivity.this, DessertRecipe7.class);
                            Toast.makeText(MainFunctionsActivity.this, "Longganisa Pasta", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "chicken pyanggang": case "pyanggang":
                            intent = new Intent(MainFunctionsActivity.this, ChickenRecipe8.class);
                            Toast.makeText(MainFunctionsActivity.this, "Chicken Pyanggang", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "puto":
                            intent = new Intent(MainFunctionsActivity.this, DessertRecipe8.class);
                            Toast.makeText(MainFunctionsActivity.this, "Puto", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "pancit bihon": case "bihon": case "pancit": case "vegetarian pancit bihon":
                            intent = new Intent(MainFunctionsActivity.this, PastaRecipe8.class);
                            Toast.makeText(MainFunctionsActivity.this, "Vegetarian Pancit Bihon", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                        case "tilapia": case "sweet and sour tilapia":
                            intent = new Intent(MainFunctionsActivity.this, SeafoodRecipe8.class);
                            Toast.makeText(MainFunctionsActivity.this, "Sweet and Sour Tilapia", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        default:
                            Toast.makeText(MainFunctionsActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                            return false;
                    }
                }
                return false;
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