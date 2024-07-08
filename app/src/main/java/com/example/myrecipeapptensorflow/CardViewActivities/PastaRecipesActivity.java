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
import com.example.myrecipeapptensorflow.databinding.ActivityPastaRecipesBinding;

import java.util.ArrayList;

public class PastaRecipesActivity extends AppCompatActivity {

    ActivityPastaRecipesBinding binding;
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
        binding = ActivityPastaRecipesBinding.inflate(getLayoutInflater());
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
                            intent = new Intent(PastaRecipesActivity.this, BeefRecipesActivity.class);
                            Toast.makeText(PastaRecipesActivity.this, "Beef Recipes", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "bulalo":
                            intent = new Intent(PastaRecipesActivity.this, BeefRecipe1.class);
                            Toast.makeText(PastaRecipesActivity.this, "Bulalo", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "beef curry":
                            intent = new Intent(PastaRecipesActivity.this, BeefRecipe2.class);
                            Toast.makeText(PastaRecipesActivity.this, "Beef Curry", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "beef afritada":
                            intent = new Intent(PastaRecipesActivity.this, BeefRecipe3.class);
                            Toast.makeText(PastaRecipesActivity.this, "Beef Afritada", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "beef kaldereta":
                            intent = new Intent(PastaRecipesActivity.this, BeefRecipe4.class);
                            Toast.makeText(PastaRecipesActivity.this, "Beef Kaldereta", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "beef mechado":
                            intent = new Intent(PastaRecipesActivity.this, BeefRecipe5.class);
                            Toast.makeText(PastaRecipesActivity.this, "Beef Mechado", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "beef pares":
                            intent = new Intent(PastaRecipesActivity.this, BeefRecipe6.class);
                            Toast.makeText(PastaRecipesActivity.this, "Beef Pares", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "beef tapa":
                            intent = new Intent(PastaRecipesActivity.this, BeefRecipe7.class);
                            Toast.makeText(PastaRecipesActivity.this, "Beef Tapa", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "chicken": case "chicken recipes":
                            intent = new Intent(PastaRecipesActivity.this, ChickenRecipesActivity.class);
                            Toast.makeText(PastaRecipesActivity.this, "Chicken Recipes", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "chicken arozcaldo": case "arozcaldo": case "chicken aroz caldo":
                            intent = new Intent(PastaRecipesActivity.this, ChickenRecipe1.class);
                            Toast.makeText(PastaRecipesActivity.this, "Chicken Aroz Caldo", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "chicken adobo": case "adobong manok":
                            intent = new Intent(PastaRecipesActivity.this, ChickenRecipe2.class);
                            Toast.makeText(PastaRecipesActivity.this, "Chicken Adobo", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "garlic fried chicken":
                            intent = new Intent(PastaRecipesActivity.this, ChickenRecipe3.class);
                            Toast.makeText(PastaRecipesActivity.this, "Garlic Fried Chicken", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "chicken afritada":
                            intent = new Intent(PastaRecipesActivity.this, ChickenRecipe4.class);
                            Toast.makeText(PastaRecipesActivity.this, "Chicken Afritada", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "chicken buffalo wings": case "buffalo wings":
                            intent = new Intent(PastaRecipesActivity.this, ChickenRecipe5.class);
                            Toast.makeText(PastaRecipesActivity.this, "Chicken Buffalo Wings", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "chicken sinigang":
                            intent = new Intent(PastaRecipesActivity.this, ChickenRecipe6.class);
                            Toast.makeText(PastaRecipesActivity.this, "Chicken Sinigang", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "chicken kaldereta":
                            intent = new Intent(PastaRecipesActivity.this, ChickenRecipe7.class);
                            Toast.makeText(PastaRecipesActivity.this, "Chicken Kaldereta", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "vegetable": case "vegetable recipes":
                            intent = new Intent(PastaRecipesActivity.this, VegetablesRecipesActivity.class);
                            Toast.makeText(PastaRecipesActivity.this, "Vegetable Recipes", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "minatamis na kamote": case "matamis na kamote":
                            intent = new Intent(PastaRecipesActivity.this, BeefRecipe1.class);
                            Toast.makeText(PastaRecipesActivity.this, "Minatamis na Kamote", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "adobong kangkong":
                            intent = new Intent(PastaRecipesActivity.this, BeefRecipe2.class);
                            Toast.makeText(PastaRecipesActivity.this, "Adobong Kangkong", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "ginisang ampalaya at hipon": case "ginisang ampalaya":
                            intent = new Intent(PastaRecipesActivity.this, BeefRecipe3.class);
                            Toast.makeText(PastaRecipesActivity.this, "Ginisang Ampalaya at Hipon", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "ginisang sayote":
                            intent = new Intent(PastaRecipesActivity.this, BeefRecipe4.class);
                            Toast.makeText(PastaRecipesActivity.this, "Ginisang Sayote", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "ginisang gulay":
                            intent = new Intent(PastaRecipesActivity.this, BeefRecipe5.class);
                            Toast.makeText(PastaRecipesActivity.this, "Ginisang Gulay", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "ginisang togue":
                            intent = new Intent(PastaRecipesActivity.this, BeefRecipe6.class);
                            Toast.makeText(PastaRecipesActivity.this, "Ginisang Togue", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "ensaladang pipino":
                            intent = new Intent(PastaRecipesActivity.this, BeefRecipe7.class);
                            Toast.makeText(PastaRecipesActivity.this, "Ensaladang Pipino", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "tortang talong":
                            intent = new Intent(PastaRecipesActivity.this, BeefRecipe7.class);
                            Toast.makeText(PastaRecipesActivity.this, "Tortang Talong", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "seafood": case "seafood recipes":
                            intent = new Intent(PastaRecipesActivity.this, SeafoodRecipesActivity.class);
                            Toast.makeText(PastaRecipesActivity.this, "Seafood Recipes", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "ginataang alimasag":
                            intent = new Intent(PastaRecipesActivity.this, SeafoodRecipesActivity.class);
                            Toast.makeText(PastaRecipesActivity.this, "Ginataang Alimasag", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "ginataang hipon":
                            intent = new Intent(PastaRecipesActivity.this, SeafoodRecipesActivity.class);
                            Toast.makeText(PastaRecipesActivity.this, "Ginataang Hipon", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "crispy breaded shrimp": case "breaded shrimp":
                            intent = new Intent(PastaRecipesActivity.this, SeafoodRecipesActivity.class);
                            Toast.makeText(PastaRecipesActivity.this, "Crispy Breaded Shrimp", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "ginisang pusit":
                            intent = new Intent(PastaRecipesActivity.this, SeafoodRecipesActivity.class);
                            Toast.makeText(PastaRecipesActivity.this, "Ginisang Pusit", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "sisig pusit":
                            intent = new Intent(PastaRecipesActivity.this, SeafoodRecipesActivity.class);
                            Toast.makeText(PastaRecipesActivity.this, "Sisig Pusit", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "spicy tahong":
                            intent = new Intent(PastaRecipesActivity.this, SeafoodRecipesActivity.class);
                            Toast.makeText(PastaRecipesActivity.this, "Spicy Tahong", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "sweet and sour fish":
                            intent = new Intent(PastaRecipesActivity.this, SeafoodRecipesActivity.class);
                            Toast.makeText(PastaRecipesActivity.this, "Sweet and Sour Fish", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "dessert": case "dessert recipes":
                            intent = new Intent(PastaRecipesActivity.this, SeafoodRecipesActivity.class);
                            Toast.makeText(PastaRecipesActivity.this, "Seafood Recipes", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "ginumis":
                            intent = new Intent(PastaRecipesActivity.this, DessertRecipe1.class);
                            Toast.makeText(PastaRecipesActivity.this, "Ginumis", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "mango jelly":
                            intent = new Intent(PastaRecipesActivity.this, DessertRecipe2.class);
                            Toast.makeText(PastaRecipesActivity.this, "Mango Jelly", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "leche plan":
                            intent = new Intent(PastaRecipesActivity.this, DessertRecipe3.class);
                            Toast.makeText(PastaRecipesActivity.this, "Leche Flan", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "chocolate flan cake": case "chocolate cake":
                            intent = new Intent(PastaRecipesActivity.this, DessertRecipe4.class);
                            Toast.makeText(PastaRecipesActivity.this, "Chocolate Flan Cake", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "mini egg pies": case "egg pies":
                            intent = new Intent(PastaRecipesActivity.this, DessertRecipe5.class);
                            Toast.makeText(PastaRecipesActivity.this, "Mini Egg Pies", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "yema cake":
                            intent = new Intent(PastaRecipesActivity.this, DessertRecipe6.class);
                            Toast.makeText(PastaRecipesActivity.this, "Yema Cake", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "pianono":
                            intent = new Intent(PastaRecipesActivity.this, DessertRecipe7.class);
                            Toast.makeText(PastaRecipesActivity.this, "Pianono", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "pasta": case "pasta recipes":
                            intent = new Intent(PastaRecipesActivity.this, PastaRecipesActivity.class);
                            Toast.makeText(PastaRecipesActivity.this, "Pasta Recipes", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "filipino-style spaghetti": case "filipino style spaghetti": case "filipino spaghetti": case "pinoy spaghetti":
                            intent = new Intent(PastaRecipesActivity.this, DessertRecipe1.class);
                            Toast.makeText(PastaRecipesActivity.this, "Filipino-style Spaghetti", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "filipino-style carbonara": case "filipino style carbonara": case "filipino carbonara": case "pinoy carbonara":
                            intent = new Intent(PastaRecipesActivity.this, DessertRecipe2.class);
                            Toast.makeText(PastaRecipesActivity.this, "Filipino-style Carbonara", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "filipino-style lasagna": case "filipino style lasagna": case "filipino lasagna": case "pinoy lasagna":
                            intent = new Intent(PastaRecipesActivity.this, DessertRecipe3.class);
                            Toast.makeText(PastaRecipesActivity.this, "Filipino-style Lasagna", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "baked macaroni":
                            intent = new Intent(PastaRecipesActivity.this, DessertRecipe4.class);
                            Toast.makeText(PastaRecipesActivity.this, "Baked Macaroni", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "filipino-style macaroni salad": case "filipino style macaroni salad": case "filipino macaroni salad": case "pinoy macaroni salad":
                            intent = new Intent(PastaRecipesActivity.this, DessertRecipe5.class);
                            Toast.makeText(PastaRecipesActivity.this, "Filipino-style Macaroni Salad", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "lemon garlic shrimp pasta": case "garlic shrimp pasta": case "shrimp pasta":
                            intent = new Intent(PastaRecipesActivity.this, DessertRecipe6.class);
                            Toast.makeText(PastaRecipesActivity.this, "Lemon Garlic Shrimp Pasta", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "longganisa pasta":
                            intent = new Intent(PastaRecipesActivity.this, DessertRecipe7.class);
                            Toast.makeText(PastaRecipesActivity.this, "Longganisa Pasta", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "tyula itum": case "tiyula itum":
                            intent = new Intent(PastaRecipesActivity.this, BeefRecipe8.class);
                            Toast.makeText(PastaRecipesActivity.this, "Tiyula Itum", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "chicken pyanggang": case "pyanggang":
                            intent = new Intent(PastaRecipesActivity.this, ChickenRecipe8.class);
                            Toast.makeText(PastaRecipesActivity.this, "Chicken Pyanggang", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "puto":
                            intent = new Intent(PastaRecipesActivity.this, DessertRecipe8.class);
                            Toast.makeText(PastaRecipesActivity.this, "Puto", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "pancit bihon": case "bihon": case "pancit": case "vegetarian pancit bihon":
                            intent = new Intent(PastaRecipesActivity.this, PastaRecipe8.class);
                            Toast.makeText(PastaRecipesActivity.this, "Vegetarian Pancit Bihon", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                        case "tilapia": case "sweet and sour tilapia":
                            intent = new Intent(PastaRecipesActivity.this, SeafoodRecipe8.class);
                            Toast.makeText(PastaRecipesActivity.this, "Sweet and Sour Tilapia", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        default:
                            Toast.makeText(PastaRecipesActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                            return false;
                    }
                }
                return false;
            }
        });

        int[] imageList = {R.drawable.filipinostylespaghetti, R.drawable.filipinostylecarbonara, R.drawable.filipinostylelasagna, R.drawable.bakedmacaroni, R.drawable.filipinostylemacaronisalad, R.drawable.lemongarlicshrimppasta, R.drawable.longganisapasta, R.drawable.pancitbihon};
        int[] ingredientList = {R.string.pinoyStyleSpaghettiIngredients, R.string.pinoyStyleCarbonaraIngredients,R.string.pinoyStyleLasagnaIngredients,R.string.bakedMacaroniIngredients,R.string.pinoyStyleMacaroniSaladIngredients, R.string.garlicShrimpPastaIngredients, R.string.longganisaPastaIngredients, R.string.pancitbihonIngredients};
        int[] descList = {R.string.pinoyStyleSpaghettiDesc, R.string.pinoyStyleCarbonaraDesc, R.string.pinoyStyleLasagnaDesc,R.string.bakedMacaroniDesc,R.string.pinoyStyleMacaroniSaladDesc, R.string.garlicShrimpPastaDesc, R.string.longganisaPastaDesc, R.string.pancitbihonDesc};
        String[] nameList = {"Filipino-style Spaghetti", "Filipino-style Carbonara", "Filipino-style Lasagna", "Baked Macaroni", "Filipino-style Macaroni Salad","Lemon Garlic Shrimp Pasta", "Longganisa Pasta", "Vegetarian Pancit Bihon"};
        String[] timeList = {"1 hour 15 minutes", "40 minutes", "2 hours","2 hours 20 minutes", "50 minutes", "20 minutes", "20 minutes", "30 minutes"};
        for (int i = 0; i < imageList.length; i++){
            listData = new ListData(nameList[i], timeList[i], ingredientList[i], descList[i], imageList[i]);
            dataArrayList.add(listData);
        }
        listAdapter = new com.example.myrecipeapptensorflow.ListViewRecipes.ListAdapter(PastaRecipesActivity.this, dataArrayList);
        binding.listview.setAdapter(listAdapter);
        binding.listview.setClickable(true);
        binding.listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(PastaRecipesActivity.this, ChickenDetailsActivity.class);
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
                redirectActivity(PastaRecipesActivity.this, StartActivity.class);
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
                redirectActivity(PastaRecipesActivity.this, TermsOfUseActivity.class);
            }
        });
        policy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                redirectActivity(PastaRecipesActivity.this, PrivacyPolicyActivity.class);
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