package com.example.myrecipeapptensorflow.CardViewActivities;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
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
import com.example.myrecipeapptensorflow.ListViewRecipes.ChickenDetailsActivity;
import com.example.myrecipeapptensorflow.ListViewRecipes.ListData;
import com.example.myrecipeapptensorflow.PastaRecipes.PastaRecipe8;
import com.example.myrecipeapptensorflow.R;
import com.example.myrecipeapptensorflow.SeafoodRecipes.SeafoodRecipe8;
import com.example.myrecipeapptensorflow.SidebarActivities.PrivacyPolicyActivity;
import com.example.myrecipeapptensorflow.SidebarActivities.SettingsActivity;
import com.example.myrecipeapptensorflow.SidebarActivities.TermsOfUseActivity;
import com.example.myrecipeapptensorflow.StartActivity;
import com.example.myrecipeapptensorflow.databinding.ActivityDessertRecipesBinding;

import java.util.ArrayList;

public class DessertRecipesActivity extends AppCompatActivity {

    ActivityDessertRecipesBinding binding;
    ListAdapter listAdapter;
    ArrayList<ListData> dataArrayList = new ArrayList<>();
    ListData listData;
    DrawerLayout drawerLayout;
    ImageView menu;
    LinearLayout about, settings, terms, policy, exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        binding = ActivityDessertRecipesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        EditText searchEditText = findViewById(R.id.searchView);
        searchEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    String searchText = searchEditText.getText().toString().toLowerCase();
                    Intent intent;
                    switch (searchText) {
                        case "beef": case "beef recipes":
                            intent = new Intent(DessertRecipesActivity.this, BeefRecipesActivity.class);
                            Toast.makeText(DessertRecipesActivity.this, "Beef Recipes", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "bulalo":
                            intent = new Intent(DessertRecipesActivity.this, BeefRecipe1.class);
                            Toast.makeText(DessertRecipesActivity.this, "Bulalo", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "beef curry":
                            intent = new Intent(DessertRecipesActivity.this, BeefRecipe2.class);
                            Toast.makeText(DessertRecipesActivity.this, "Beef Curry", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "beef afritada":
                            intent = new Intent(DessertRecipesActivity.this, BeefRecipe3.class);
                            Toast.makeText(DessertRecipesActivity.this, "Beef Afritada", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "beef kaldereta":
                            intent = new Intent(DessertRecipesActivity.this, BeefRecipe4.class);
                            Toast.makeText(DessertRecipesActivity.this, "Beef Kaldereta", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "beef mechado":
                            intent = new Intent(DessertRecipesActivity.this, BeefRecipe5.class);
                            Toast.makeText(DessertRecipesActivity.this, "Beef Mechado", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "beef pares":
                            intent = new Intent(DessertRecipesActivity.this, BeefRecipe6.class);
                            Toast.makeText(DessertRecipesActivity.this, "Beef Pares", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "beef tapa":
                            intent = new Intent(DessertRecipesActivity.this, BeefRecipe7.class);
                            Toast.makeText(DessertRecipesActivity.this, "Beef Tapa", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "chicken": case "chicken recipes":
                            intent = new Intent(DessertRecipesActivity.this, ChickenRecipesActivity.class);
                            Toast.makeText(DessertRecipesActivity.this, "Chicken Recipes", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "chicken arozcaldo": case "arozcaldo": case "chicken aroz caldo":
                            intent = new Intent(DessertRecipesActivity.this, ChickenRecipe1.class);
                            Toast.makeText(DessertRecipesActivity.this, "Chicken Aroz Caldo", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "chicken adobo": case "adobong manok":
                            intent = new Intent(DessertRecipesActivity.this, ChickenRecipe2.class);
                            Toast.makeText(DessertRecipesActivity.this, "Chicken Adobo", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "garlic fried chicken":
                            intent = new Intent(DessertRecipesActivity.this, ChickenRecipe3.class);
                            Toast.makeText(DessertRecipesActivity.this, "Garlic Fried Chicken", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "chicken afritada":
                            intent = new Intent(DessertRecipesActivity.this, ChickenRecipe4.class);
                            Toast.makeText(DessertRecipesActivity.this, "Chicken Afritada", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "chicken buffalo wings": case "buffalo wings":
                            intent = new Intent(DessertRecipesActivity.this, ChickenRecipe5.class);
                            Toast.makeText(DessertRecipesActivity.this, "Chicken Buffalo Wings", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "chicken sinigang":
                            intent = new Intent(DessertRecipesActivity.this, ChickenRecipe6.class);
                            Toast.makeText(DessertRecipesActivity.this, "Chicken Sinigang", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "chicken kaldereta":
                            intent = new Intent(DessertRecipesActivity.this, ChickenRecipe7.class);
                            Toast.makeText(DessertRecipesActivity.this, "Chicken Kaldereta", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "vegetable": case "vegetable recipes":
                            intent = new Intent(DessertRecipesActivity.this, VegetablesRecipesActivity.class);
                            Toast.makeText(DessertRecipesActivity.this, "Vegetable Recipes", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "minatamis na kamote": case "matamis na kamote":
                            intent = new Intent(DessertRecipesActivity.this, BeefRecipe1.class);
                            Toast.makeText(DessertRecipesActivity.this, "Minatamis na Kamote", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "adobong kangkong":
                            intent = new Intent(DessertRecipesActivity.this, BeefRecipe2.class);
                            Toast.makeText(DessertRecipesActivity.this, "Adobong Kangkong", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "ginisang ampalaya at hipon": case "ginisang ampalaya":
                            intent = new Intent(DessertRecipesActivity.this, BeefRecipe3.class);
                            Toast.makeText(DessertRecipesActivity.this, "Ginisang Ampalaya at Hipon", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "ginisang sayote":
                            intent = new Intent(DessertRecipesActivity.this, BeefRecipe4.class);
                            Toast.makeText(DessertRecipesActivity.this, "Ginisang Sayote", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "ginisang gulay":
                            intent = new Intent(DessertRecipesActivity.this, BeefRecipe5.class);
                            Toast.makeText(DessertRecipesActivity.this, "Ginisang Gulay", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "ginisang togue":
                            intent = new Intent(DessertRecipesActivity.this, BeefRecipe6.class);
                            Toast.makeText(DessertRecipesActivity.this, "Ginisang Togue", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "ensaladang pipino":
                            intent = new Intent(DessertRecipesActivity.this, BeefRecipe7.class);
                            Toast.makeText(DessertRecipesActivity.this, "Ensaladang Pipino", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "tortang talong":
                            intent = new Intent(DessertRecipesActivity.this, BeefRecipe7.class);
                            Toast.makeText(DessertRecipesActivity.this, "Tortang Talong", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "seafood": case "seafood recipes":
                            intent = new Intent(DessertRecipesActivity.this, SeafoodRecipesActivity.class);
                            Toast.makeText(DessertRecipesActivity.this, "Seafood Recipes", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "ginataang alimasag":
                            intent = new Intent(DessertRecipesActivity.this, SeafoodRecipesActivity.class);
                            Toast.makeText(DessertRecipesActivity.this, "Ginataang Alimasag", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "ginataang hipon":
                            intent = new Intent(DessertRecipesActivity.this, SeafoodRecipesActivity.class);
                            Toast.makeText(DessertRecipesActivity.this, "Ginataang Hipon", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "crispy breaded shrimp": case "breaded shrimp":
                            intent = new Intent(DessertRecipesActivity.this, SeafoodRecipesActivity.class);
                            Toast.makeText(DessertRecipesActivity.this, "Crispy Breaded Shrimp", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "ginisang pusit":
                            intent = new Intent(DessertRecipesActivity.this, SeafoodRecipesActivity.class);
                            Toast.makeText(DessertRecipesActivity.this, "Ginisang Pusit", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "sisig pusit":
                            intent = new Intent(DessertRecipesActivity.this, SeafoodRecipesActivity.class);
                            Toast.makeText(DessertRecipesActivity.this, "Sisig Pusit", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "spicy tahong":
                            intent = new Intent(DessertRecipesActivity.this, SeafoodRecipesActivity.class);
                            Toast.makeText(DessertRecipesActivity.this, "Spicy Tahong", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "sweet and sour fish":
                            intent = new Intent(DessertRecipesActivity.this, SeafoodRecipesActivity.class);
                            Toast.makeText(DessertRecipesActivity.this, "Sweet and Sour Fish", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "dessert": case "dessert recipes":
                            intent = new Intent(DessertRecipesActivity.this, SeafoodRecipesActivity.class);
                            Toast.makeText(DessertRecipesActivity.this, "Seafood Recipes", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "ginumis":
                            intent = new Intent(DessertRecipesActivity.this, DessertRecipe1.class);
                            Toast.makeText(DessertRecipesActivity.this, "Ginumis", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "mango jelly":
                            intent = new Intent(DessertRecipesActivity.this, DessertRecipe2.class);
                            Toast.makeText(DessertRecipesActivity.this, "Mango Jelly", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "leche plan":
                            intent = new Intent(DessertRecipesActivity.this, DessertRecipe3.class);
                            Toast.makeText(DessertRecipesActivity.this, "Leche Flan", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "chocolate flan cake": case "chocolate cake":
                            intent = new Intent(DessertRecipesActivity.this, DessertRecipe4.class);
                            Toast.makeText(DessertRecipesActivity.this, "Chocolate Flan Cake", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "mini egg pies": case "egg pies":
                            intent = new Intent(DessertRecipesActivity.this, DessertRecipe5.class);
                            Toast.makeText(DessertRecipesActivity.this, "Mini Egg Pies", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "yema cake":
                            intent = new Intent(DessertRecipesActivity.this, DessertRecipe6.class);
                            Toast.makeText(DessertRecipesActivity.this, "Yema Cake", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "pianono":
                            intent = new Intent(DessertRecipesActivity.this, DessertRecipe7.class);
                            Toast.makeText(DessertRecipesActivity.this, "Pianono", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "pasta": case "pasta recipes":
                            intent = new Intent(DessertRecipesActivity.this, PastaRecipesActivity.class);
                            Toast.makeText(DessertRecipesActivity.this, "Pasta Recipes", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "filipino-style spaghetti": case "filipino style spaghetti": case "filipino spaghetti": case "pinoy spaghetti":
                            intent = new Intent(DessertRecipesActivity.this, DessertRecipe1.class);
                            Toast.makeText(DessertRecipesActivity.this, "Filipino-style Spaghetti", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "filipino-style carbonara": case "filipino style carbonara": case "filipino carbonara": case "pinoy carbonara":
                            intent = new Intent(DessertRecipesActivity.this, DessertRecipe2.class);
                            Toast.makeText(DessertRecipesActivity.this, "Filipino-style Carbonara", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "filipino-style lasagna": case "filipino style lasagna": case "filipino lasagna": case "pinoy lasagna":
                            intent = new Intent(DessertRecipesActivity.this, DessertRecipe3.class);
                            Toast.makeText(DessertRecipesActivity.this, "Filipino-style Lasagna", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "baked macaroni":
                            intent = new Intent(DessertRecipesActivity.this, DessertRecipe4.class);
                            Toast.makeText(DessertRecipesActivity.this, "Baked Macaroni", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "filipino-style macaroni salad": case "filipino style macaroni salad": case "filipino macaroni salad": case "pinoy macaroni salad":
                            intent = new Intent(DessertRecipesActivity.this, DessertRecipe5.class);
                            Toast.makeText(DessertRecipesActivity.this, "Filipino-style Macaroni Salad", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "lemon garlic shrimp pasta": case "garlic shrimp pasta": case "shrimp pasta":
                            intent = new Intent(DessertRecipesActivity.this, DessertRecipe6.class);
                            Toast.makeText(DessertRecipesActivity.this, "Lemon Garlic Shrimp Pasta", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "longganisa pasta":
                            intent = new Intent(DessertRecipesActivity.this, DessertRecipe7.class);
                            Toast.makeText(DessertRecipesActivity.this, "Longganisa Pasta", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "tyula itum": case "tiyula itum":
                            intent = new Intent(DessertRecipesActivity.this, BeefRecipe8.class);
                            Toast.makeText(DessertRecipesActivity.this, "Tiyula Itum", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "chicken pyanggang": case "pyanggang":
                            intent = new Intent(DessertRecipesActivity.this, ChickenRecipe8.class);
                            Toast.makeText(DessertRecipesActivity.this, "Chicken Pyanggang", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "puto":
                            intent = new Intent(DessertRecipesActivity.this, DessertRecipe8.class);
                            Toast.makeText(DessertRecipesActivity.this, "Puto", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "pancit bihon": case "bihon": case "pancit": case "vegetarian pancit bihon":
                            intent = new Intent(DessertRecipesActivity.this, PastaRecipe8.class);
                            Toast.makeText(DessertRecipesActivity.this, "Vegetarian Pancit Bihon", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                        case "tilapia": case "sweet and sour tilapia":
                            intent = new Intent(DessertRecipesActivity.this, SeafoodRecipe8.class);
                            Toast.makeText(DessertRecipesActivity.this, "Sweet and Sour Tilapia", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        default:
                            Toast.makeText(DessertRecipesActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                            return false;
                    }
                }
                return false;
            }
        });

        int[] imageList = {R.drawable.ginumis, R.drawable.mangojelly, R.drawable.lecheplan, R.drawable.chocolateflancake, R.drawable.minieggpies, R.drawable.yemacake, R.drawable.pianono, R.drawable.puto};
        int[] ingredientList = {R.string.ginumisIngredients, R.string.mangoJellyIngredients,R.string.lechePlanIngredients,R.string.chocoflancakeIngredients,R.string.minieggpiesIngredients, R.string.yemaCakeIngredients, R.string.pianonoIngredients, R.string.putoIngredients};
        int[] descList = {R.string.ginumisDesc, R.string.mangoJellyDesc, R.string.lechePlanDesc,R.string.chocoflancakeDesc,R.string.minieggpiesDesc, R.string.yemaCakeDesc, R.string.pianonoDesc, R.string.putoDesc};
        String[] nameList = {"Ginumis", "Mango Jelly", "Leche Flan", "Chocolate Flan Cake", "Mini Egg Pies","Yema Cake", "Pianono", "Puto"};
        String[] timeList = {"1 hour 20 minutes", "16 minutes", "1 hour 15 minutes","1 hour 25 minutes", "35 minutes", "50 minutes", "30 minutes", "35 minutes"};
        for (int i = 0; i < imageList.length; i++){
            listData = new ListData(nameList[i], timeList[i], ingredientList[i], descList[i], imageList[i]);
            dataArrayList.add(listData);
        }
        listAdapter = new com.example.myrecipeapptensorflow.ListViewRecipes.ListAdapter(DessertRecipesActivity.this, dataArrayList);
        binding.listview.setAdapter(listAdapter);
        binding.listview.setClickable(true);
        binding.listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(DessertRecipesActivity.this, ChickenDetailsActivity.class);
                intent.putExtra("name", nameList[i]);
                intent.putExtra("time", timeList[i]);
                intent.putExtra("ingredients", ingredientList[i]);
                intent.putExtra("desc", descList[i]);
                intent.putExtra("image", imageList[i]);
                startActivity(intent);
            }
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
                redirectActivity(DessertRecipesActivity.this, StartActivity.class);
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
                recreate();
            }
        });
        terms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                redirectActivity(DessertRecipesActivity.this, TermsOfUseActivity.class);
            }
        });
        policy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                redirectActivity(DessertRecipesActivity.this, PrivacyPolicyActivity.class);
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