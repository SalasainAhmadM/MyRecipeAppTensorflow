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
import com.example.myrecipeapptensorflow.databinding.ActivitySeafoodRecipesBinding;

import java.util.ArrayList;

public class SeafoodRecipesActivity extends AppCompatActivity {

    ActivitySeafoodRecipesBinding binding;
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
        binding = ActivitySeafoodRecipesBinding.inflate(getLayoutInflater());
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
                            intent = new Intent(SeafoodRecipesActivity.this, BeefRecipesActivity.class);
                            Toast.makeText(SeafoodRecipesActivity.this, "Beef Recipes", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "bulalo":
                            intent = new Intent(SeafoodRecipesActivity.this, BeefRecipe1.class);
                            Toast.makeText(SeafoodRecipesActivity.this, "Bulalo", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "beef curry":
                            intent = new Intent(SeafoodRecipesActivity.this, BeefRecipe2.class);
                            Toast.makeText(SeafoodRecipesActivity.this, "Beef Curry", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "beef afritada":
                            intent = new Intent(SeafoodRecipesActivity.this, BeefRecipe3.class);
                            Toast.makeText(SeafoodRecipesActivity.this, "Beef Afritada", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "beef kaldereta":
                            intent = new Intent(SeafoodRecipesActivity.this, BeefRecipe4.class);
                            Toast.makeText(SeafoodRecipesActivity.this, "Beef Kaldereta", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "beef mechado":
                            intent = new Intent(SeafoodRecipesActivity.this, BeefRecipe5.class);
                            Toast.makeText(SeafoodRecipesActivity.this, "Beef Mechado", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "beef pares":
                            intent = new Intent(SeafoodRecipesActivity.this, BeefRecipe6.class);
                            Toast.makeText(SeafoodRecipesActivity.this, "Beef Pares", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "beef tapa":
                            intent = new Intent(SeafoodRecipesActivity.this, BeefRecipe7.class);
                            Toast.makeText(SeafoodRecipesActivity.this, "Beef Tapa", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "chicken": case "chicken recipes":
                            intent = new Intent(SeafoodRecipesActivity.this, ChickenRecipesActivity.class);
                            Toast.makeText(SeafoodRecipesActivity.this, "Chicken Recipes", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "chicken arozcaldo": case "arozcaldo": case "chicken aroz caldo":
                            intent = new Intent(SeafoodRecipesActivity.this, ChickenRecipe1.class);
                            Toast.makeText(SeafoodRecipesActivity.this, "Chicken Aroz Caldo", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "chicken adobo": case "adobong manok":
                            intent = new Intent(SeafoodRecipesActivity.this, ChickenRecipe2.class);
                            Toast.makeText(SeafoodRecipesActivity.this, "Chicken Adobo", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "garlic fried chicken":
                            intent = new Intent(SeafoodRecipesActivity.this, ChickenRecipe3.class);
                            Toast.makeText(SeafoodRecipesActivity.this, "Garlic Fried Chicken", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "chicken afritada":
                            intent = new Intent(SeafoodRecipesActivity.this, ChickenRecipe4.class);
                            Toast.makeText(SeafoodRecipesActivity.this, "Chicken Afritada", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "chicken buffalo wings": case "buffalo wings":
                            intent = new Intent(SeafoodRecipesActivity.this, ChickenRecipe5.class);
                            Toast.makeText(SeafoodRecipesActivity.this, "Chicken Buffalo Wings", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "chicken sinigang":
                            intent = new Intent(SeafoodRecipesActivity.this, ChickenRecipe6.class);
                            Toast.makeText(SeafoodRecipesActivity.this, "Chicken Sinigang", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "chicken kaldereta":
                            intent = new Intent(SeafoodRecipesActivity.this, ChickenRecipe7.class);
                            Toast.makeText(SeafoodRecipesActivity.this, "Chicken Kaldereta", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "vegetable": case "vegetable recipes":
                            intent = new Intent(SeafoodRecipesActivity.this, VegetablesRecipesActivity.class);
                            Toast.makeText(SeafoodRecipesActivity.this, "Vegetable Recipes", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "minatamis na kamote": case "matamis na kamote":
                            intent = new Intent(SeafoodRecipesActivity.this, BeefRecipe1.class);
                            Toast.makeText(SeafoodRecipesActivity.this, "Minatamis na Kamote", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "adobong kangkong":
                            intent = new Intent(SeafoodRecipesActivity.this, BeefRecipe2.class);
                            Toast.makeText(SeafoodRecipesActivity.this, "Adobong Kangkong", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "ginisang ampalaya at hipon": case "ginisang ampalaya":
                            intent = new Intent(SeafoodRecipesActivity.this, BeefRecipe3.class);
                            Toast.makeText(SeafoodRecipesActivity.this, "Ginisang Ampalaya at Hipon", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "ginisang sayote":
                            intent = new Intent(SeafoodRecipesActivity.this, BeefRecipe4.class);
                            Toast.makeText(SeafoodRecipesActivity.this, "Ginisang Sayote", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "ginisang gulay":
                            intent = new Intent(SeafoodRecipesActivity.this, BeefRecipe5.class);
                            Toast.makeText(SeafoodRecipesActivity.this, "Ginisang Gulay", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "ginisang togue":
                            intent = new Intent(SeafoodRecipesActivity.this, BeefRecipe6.class);
                            Toast.makeText(SeafoodRecipesActivity.this, "Ginisang Togue", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "ensaladang pipino":
                            intent = new Intent(SeafoodRecipesActivity.this, BeefRecipe7.class);
                            Toast.makeText(SeafoodRecipesActivity.this, "Ensaladang Pipino", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "tortang talong":
                            intent = new Intent(SeafoodRecipesActivity.this, BeefRecipe7.class);
                            Toast.makeText(SeafoodRecipesActivity.this, "Tortang Talong", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "seafood": case "seafood recipes":
                            intent = new Intent(SeafoodRecipesActivity.this, SeafoodRecipesActivity.class);
                            Toast.makeText(SeafoodRecipesActivity.this, "Seafood Recipes", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "ginataang alimasag":
                            intent = new Intent(SeafoodRecipesActivity.this, SeafoodRecipesActivity.class);
                            Toast.makeText(SeafoodRecipesActivity.this, "Ginataang Alimasag", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "ginataang hipon":
                            intent = new Intent(SeafoodRecipesActivity.this, SeafoodRecipesActivity.class);
                            Toast.makeText(SeafoodRecipesActivity.this, "Ginataang Hipon", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "crispy breaded shrimp": case "breaded shrimp":
                            intent = new Intent(SeafoodRecipesActivity.this, SeafoodRecipesActivity.class);
                            Toast.makeText(SeafoodRecipesActivity.this, "Crispy Breaded Shrimp", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "ginisang pusit":
                            intent = new Intent(SeafoodRecipesActivity.this, SeafoodRecipesActivity.class);
                            Toast.makeText(SeafoodRecipesActivity.this, "Ginisang Pusit", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "sisig pusit":
                            intent = new Intent(SeafoodRecipesActivity.this, SeafoodRecipesActivity.class);
                            Toast.makeText(SeafoodRecipesActivity.this, "Sisig Pusit", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "spicy tahong":
                            intent = new Intent(SeafoodRecipesActivity.this, SeafoodRecipesActivity.class);
                            Toast.makeText(SeafoodRecipesActivity.this, "Spicy Tahong", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "sweet and sour fish":
                            intent = new Intent(SeafoodRecipesActivity.this, SeafoodRecipesActivity.class);
                            Toast.makeText(SeafoodRecipesActivity.this, "Sweet and Sour Fish", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "dessert": case "dessert recipes":
                            intent = new Intent(SeafoodRecipesActivity.this, SeafoodRecipesActivity.class);
                            Toast.makeText(SeafoodRecipesActivity.this, "Seafood Recipes", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "ginumis":
                            intent = new Intent(SeafoodRecipesActivity.this, DessertRecipe1.class);
                            Toast.makeText(SeafoodRecipesActivity.this, "Ginumis", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "mango jelly":
                            intent = new Intent(SeafoodRecipesActivity.this, DessertRecipe2.class);
                            Toast.makeText(SeafoodRecipesActivity.this, "Mango Jelly", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "leche plan":
                            intent = new Intent(SeafoodRecipesActivity.this, DessertRecipe3.class);
                            Toast.makeText(SeafoodRecipesActivity.this, "Leche Flan", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "chocolate flan cake": case "chocolate cake":
                            intent = new Intent(SeafoodRecipesActivity.this, DessertRecipe4.class);
                            Toast.makeText(SeafoodRecipesActivity.this, "Chocolate Flan Cake", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "mini egg pies": case "egg pies":
                            intent = new Intent(SeafoodRecipesActivity.this, DessertRecipe5.class);
                            Toast.makeText(SeafoodRecipesActivity.this, "Mini Egg Pies", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "yema cake":
                            intent = new Intent(SeafoodRecipesActivity.this, DessertRecipe6.class);
                            Toast.makeText(SeafoodRecipesActivity.this, "Yema Cake", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "pianono":
                            intent = new Intent(SeafoodRecipesActivity.this, DessertRecipe7.class);
                            Toast.makeText(SeafoodRecipesActivity.this, "Pianono", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "pasta": case "pasta recipes":
                            intent = new Intent(SeafoodRecipesActivity.this, PastaRecipesActivity.class);
                            Toast.makeText(SeafoodRecipesActivity.this, "Pasta Recipes", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "filipino-style spaghetti": case "filipino style spaghetti": case "filipino spaghetti": case "pinoy spaghetti":
                            intent = new Intent(SeafoodRecipesActivity.this, DessertRecipe1.class);
                            Toast.makeText(SeafoodRecipesActivity.this, "Filipino-style Spaghetti", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "filipino-style carbonara": case "filipino style carbonara": case "filipino carbonara": case "pinoy carbonara":
                            intent = new Intent(SeafoodRecipesActivity.this, DessertRecipe2.class);
                            Toast.makeText(SeafoodRecipesActivity.this, "Filipino-style Carbonara", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "filipino-style lasagna": case "filipino style lasagna": case "filipino lasagna": case "pinoy lasagna":
                            intent = new Intent(SeafoodRecipesActivity.this, DessertRecipe3.class);
                            Toast.makeText(SeafoodRecipesActivity.this, "Filipino-style Lasagna", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "baked macaroni":
                            intent = new Intent(SeafoodRecipesActivity.this, DessertRecipe4.class);
                            Toast.makeText(SeafoodRecipesActivity.this, "Baked Macaroni", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "filipino-style macaroni salad": case "filipino style macaroni salad": case "filipino macaroni salad": case "pinoy macaroni salad":
                            intent = new Intent(SeafoodRecipesActivity.this, DessertRecipe5.class);
                            Toast.makeText(SeafoodRecipesActivity.this, "Filipino-style Macaroni Salad", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "lemon garlic shrimp pasta": case "garlic shrimp pasta": case "shrimp pasta":
                            intent = new Intent(SeafoodRecipesActivity.this, DessertRecipe6.class);
                            Toast.makeText(SeafoodRecipesActivity.this, "Lemon Garlic Shrimp Pasta", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "longganisa pasta":
                            intent = new Intent(SeafoodRecipesActivity.this, DessertRecipe7.class);
                            Toast.makeText(SeafoodRecipesActivity.this, "Longganisa Pasta", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "tyula itum": case "tiyula itum":
                            intent = new Intent(SeafoodRecipesActivity.this, BeefRecipe8.class);
                            Toast.makeText(SeafoodRecipesActivity.this, "Tiyula Itum", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "chicken pyanggang": case "pyanggang":
                            intent = new Intent(SeafoodRecipesActivity.this, ChickenRecipe8.class);
                            Toast.makeText(SeafoodRecipesActivity.this, "Chicken Pyanggang", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "puto":
                            intent = new Intent(SeafoodRecipesActivity.this, DessertRecipe8.class);
                            Toast.makeText(SeafoodRecipesActivity.this, "Puto", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "pancit bihon": case "bihon": case "pancit": case "vegetarian pancit bihon":
                            intent = new Intent(SeafoodRecipesActivity.this, PastaRecipe8.class);
                            Toast.makeText(SeafoodRecipesActivity.this, "Vegetarian Pancit Bihon", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                        case "tilapia": case "sweet and sour tilapia":
                            intent = new Intent(SeafoodRecipesActivity.this, SeafoodRecipe8.class);
                            Toast.makeText(SeafoodRecipesActivity.this, "Sweet and Sour Tilapia", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        default:
                            Toast.makeText(SeafoodRecipesActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                            return false;
                    }
                }
                return false;
            }
        });

        int[] imageList = {R.drawable.ginataangalimasag, R.drawable.ginataanghipon, R.drawable.crispybreadedshrimp, R.drawable.ginisangpusit, R.drawable.sisigpusit, R.drawable.spicytahong, R.drawable.sweetandsourfish, R.drawable.tilapiasweetnsour};
        int[] ingredientList = {R.string.ginataanAliIngredients, R.string.ginataangHiponIngredients,R.string.breadedShrimpIngredients,R.string.ginisingPusitIngredients,R.string.sisigPusitIngredients, R.string.spicyTahongIngredients, R.string.sweetAndSourFishIngredients, R.string.TilapiasweetAndSourIngredients};
        int[] descList = {R.string.ginataanAliDesc, R.string.ginataangHiponDesc, R.string.breadedShrimpDesc,R.string.ginisingPusitDesc,R.string.sisigPusitDesc, R.string.spicyTahongDesc, R.string.sweetAndSourFishDesc, R.string.TilapiasweetAndSourDesc};
        String[] nameList = {"Ginataang Alimasag", "Ginataang Hipon", "Crispy Breaded Shrimp", "Ginisang Pusit", "Sisig Pusit","Spicy Tahong", "Sweet and Sour Fish","Sweet and Sour Tilapia"};
        String[] timeList = {"1 hour 5 minutes", "40 minutes", "20 minutes","20 minutes", "10 minutes", "30 minutes", "1 hour 5 minutes", "40 minutes"};
        for (int i = 0; i < imageList.length; i++){
            listData = new ListData(nameList[i], timeList[i], ingredientList[i], descList[i], imageList[i]);
            dataArrayList.add(listData);
        }
        listAdapter = new com.example.myrecipeapptensorflow.ListViewRecipes.ListAdapter(SeafoodRecipesActivity.this, dataArrayList);
        binding.listview.setAdapter(listAdapter);
        binding.listview.setClickable(true);
        binding.listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(SeafoodRecipesActivity.this, ChickenDetailsActivity.class);
                intent.putExtra("name", nameList[i]);
                intent.putExtra("time", timeList[i]);
                intent.putExtra("ingredients", ingredientList[i]);
                intent.putExtra("desc", descList[i]);
                intent.putExtra("image", imageList[i]);
                startActivity(intent);
            }
        });drawerLayout = findViewById(R.id.drawerLayout);
        menu = findViewById(R.id.menu);
        about = findViewById(R.id.about);
        terms = findViewById(R.id.terms);
        policy = findViewById(R.id.policy);
        exit = findViewById(R.id.exit_button);

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                redirectActivity(SeafoodRecipesActivity.this, StartActivity.class);
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
                redirectActivity(SeafoodRecipesActivity.this, TermsOfUseActivity.class);
            }
        });
        policy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                redirectActivity(SeafoodRecipesActivity.this, PrivacyPolicyActivity.class);
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