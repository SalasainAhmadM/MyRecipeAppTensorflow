package com.example.myrecipeapptensorflow;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
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
import com.example.myrecipeapptensorflow.BottomNavActivities.MainFunctionsActivity;
import com.example.myrecipeapptensorflow.BottomNavActivities.HomeActivity;
import com.example.myrecipeapptensorflow.BottomNavActivities.AboutPageActivity;
import com.example.myrecipeapptensorflow.BottomNavActivities.RecipeTutorialActivity;
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
import com.example.myrecipeapptensorflow.OtherRecipes.Adobo2Result;
import com.example.myrecipeapptensorflow.OtherRecipes.AdoboResult;
import com.example.myrecipeapptensorflow.OtherRecipes.AdoboResult3;
import com.example.myrecipeapptensorflow.OtherRecipes.BeefResult123456Activity;
import com.example.myrecipeapptensorflow.OtherRecipes.BeefResult13456Activity;
import com.example.myrecipeapptensorflow.OtherRecipes.BeefResult13456BActivity;
import com.example.myrecipeapptensorflow.OtherRecipes.BeefResult13456CActivity;
import com.example.myrecipeapptensorflow.OtherRecipes.BeefResult234567Activity;
import com.example.myrecipeapptensorflow.OtherRecipes.BeefResult23456Activity;
import com.example.myrecipeapptensorflow.OtherRecipes.BeefResult23456BActivity;
import com.example.myrecipeapptensorflow.OtherRecipes.BeefResult23456CActivity;
import com.example.myrecipeapptensorflow.OtherRecipes.BeefResult23456DActivity;
import com.example.myrecipeapptensorflow.OtherRecipes.BeefResult23456EActivity;
import com.example.myrecipeapptensorflow.OtherRecipes.BeefResult23456FActivity;
import com.example.myrecipeapptensorflow.OtherRecipes.BeefResult23456GActivity;
import com.example.myrecipeapptensorflow.OtherRecipes.BeefResult23456HActivity;
import com.example.myrecipeapptensorflow.OtherRecipes.BeefResult2345Activity;
import com.example.myrecipeapptensorflow.OtherRecipes.BeefResult2345BActivity;
import com.example.myrecipeapptensorflow.OtherRecipes.BeefResult34567Activity;
import com.example.myrecipeapptensorflow.OtherRecipes.BeefResult34567CActivity;
import com.example.myrecipeapptensorflow.OtherRecipes.BeefResult3456Activity;
import com.example.myrecipeapptensorflow.OtherRecipes.BeefResult3456BActivity;
import com.example.myrecipeapptensorflow.OtherRecipes.BeefResult3456CActivity;
import com.example.myrecipeapptensorflow.OtherRecipes.BeefResult345Activity;
import com.example.myrecipeapptensorflow.OtherRecipes.BeefResult345BActivity;
import com.example.myrecipeapptensorflow.OtherRecipes.BeefResult345CActivity;
import com.example.myrecipeapptensorflow.OtherRecipes.BeefResult345DActivity;
import com.example.myrecipeapptensorflow.OtherRecipes.BeefResult345EActivity;
import com.example.myrecipeapptensorflow.OtherRecipes.BeefResult345FActivity;
import com.example.myrecipeapptensorflow.OtherRecipes.BeefResult345GActivity;
import com.example.myrecipeapptensorflow.OtherRecipes.BeefResult345HActivity;
import com.example.myrecipeapptensorflow.OtherRecipes.BeefResult78Activity;
import com.example.myrecipeapptensorflow.OtherRecipes.BeefResult78BActivity;
import com.example.myrecipeapptensorflow.OtherRecipes.BeefResult78CActivity;
import com.example.myrecipeapptensorflow.OtherRecipes.BeefResut3456Activity;
import com.example.myrecipeapptensorflow.OtherRecipes.OtherResult;
import com.example.myrecipeapptensorflow.OtherRecipes.OtherResultMultipleActivity;
import com.example.myrecipeapptensorflow.OtherRecipes.OtherResultMultipleActivity2;
import com.example.myrecipeapptensorflow.OtherRecipes.OtherResultMultipleActivity3;
import com.example.myrecipeapptensorflow.OtherRecipes.OtherResultMultipleActivity4;
import com.example.myrecipeapptensorflow.OtherRecipes.PastaResult12;
import com.example.myrecipeapptensorflow.OtherRecipes.PastaResult12B;
import com.example.myrecipeapptensorflow.OtherRecipes.PastaResult12C;
import com.example.myrecipeapptensorflow.OtherRecipes.PastaResult12D;
import com.example.myrecipeapptensorflow.OtherRecipes.PastaResult45;
import com.example.myrecipeapptensorflow.OtherRecipes.ResultC4Beef345;
import com.example.myrecipeapptensorflow.OtherRecipes.ResultChicken124Activity;
import com.example.myrecipeapptensorflow.OtherRecipes.ResultChicken1256Activity;
import com.example.myrecipeapptensorflow.OtherRecipes.ResultChicken1267Activity;
import com.example.myrecipeapptensorflow.OtherRecipes.ResultChicken126Activity;
import com.example.myrecipeapptensorflow.OtherRecipes.ResultChicken126BActivity;
import com.example.myrecipeapptensorflow.OtherRecipes.ResultChicken12Activity;
import com.example.myrecipeapptensorflow.OtherRecipes.ResultChicken12BActivity;
import com.example.myrecipeapptensorflow.OtherRecipes.ResultChicken12CActivity;
import com.example.myrecipeapptensorflow.OtherRecipes.ResultChicken1345Activity;
import com.example.myrecipeapptensorflow.OtherRecipes.ResultChicken1356Activity;
import com.example.myrecipeapptensorflow.OtherRecipes.ResultChicken1356BActivity;
import com.example.myrecipeapptensorflow.OtherRecipes.ResultChicken14Activity;
import com.example.myrecipeapptensorflow.OtherRecipes.ResultChicken16Activity;
import com.example.myrecipeapptensorflow.OtherRecipes.ResultChicken16BActivity;
import com.example.myrecipeapptensorflow.OtherRecipes.ResultChicken16CActivity;
import com.example.myrecipeapptensorflow.OtherRecipes.ResultChicken18;
import com.example.myrecipeapptensorflow.OtherRecipes.ResultChicken18A;
import com.example.myrecipeapptensorflow.OtherRecipes.ResultChicken27Activity;
import com.example.myrecipeapptensorflow.OtherRecipes.ResultChicken27BActivity;
import com.example.myrecipeapptensorflow.OtherRecipes.ResultChicken46Activity;
import com.example.myrecipeapptensorflow.OtherRecipes.ResultChicken67Activity;
import com.example.myrecipeapptensorflow.OtherRecipes.SeafoodResult45A;
import com.example.myrecipeapptensorflow.OtherRecipes.SeafoodResult45B;
import com.example.myrecipeapptensorflow.OtherRecipes.SeafoodResult45C;
import com.example.myrecipeapptensorflow.OtherRecipes.SeafoodResult45D;
import com.example.myrecipeapptensorflow.OtherRecipes.SeafoodResult45E;
import com.example.myrecipeapptensorflow.OtherRecipes.SeafoodResult45F;
import com.example.myrecipeapptensorflow.OtherRecipes.SeafoodResult45G;
import com.example.myrecipeapptensorflow.OtherRecipes.SeafoodResult45H;
import com.example.myrecipeapptensorflow.OtherRecipes.SeafoodResult45I;
import com.example.myrecipeapptensorflow.OtherRecipes.SeafoodResult45J;
import com.example.myrecipeapptensorflow.OtherRecipes.SeafoodResult78;
import com.example.myrecipeapptensorflow.OtherRecipes.VegetableResult3456;
import com.example.myrecipeapptensorflow.OtherRecipes.VegetableResult3456B;
import com.example.myrecipeapptensorflow.OtherRecipes.VegetableShrimpResult3456C;
import com.example.myrecipeapptensorflow.OtherRecipes.VegetableShrimpResult3456D;
import com.example.myrecipeapptensorflow.OtherRecipes.VegetableShrimpResult3456E;
import com.example.myrecipeapptensorflow.PastaRecipes.PastaRecipe1;
import com.example.myrecipeapptensorflow.PastaRecipes.PastaRecipe4;
import com.example.myrecipeapptensorflow.PastaRecipes.PastaRecipe5;
import com.example.myrecipeapptensorflow.PastaRecipes.PastaRecipe6;
import com.example.myrecipeapptensorflow.PastaRecipes.PastaRecipe8;
import com.example.myrecipeapptensorflow.SeafoodRecipes.SeafoodRecipe1;
import com.example.myrecipeapptensorflow.SeafoodRecipes.SeafoodRecipe3;
import com.example.myrecipeapptensorflow.SeafoodRecipes.SeafoodRecipe4;
import com.example.myrecipeapptensorflow.SeafoodRecipes.SeafoodRecipe5;
import com.example.myrecipeapptensorflow.SeafoodRecipes.SeafoodRecipe7;
import com.example.myrecipeapptensorflow.SeafoodRecipes.SeafoodRecipe8;
import com.example.myrecipeapptensorflow.SidebarActivities.PrivacyPolicyActivity;
import com.example.myrecipeapptensorflow.SidebarActivities.SettingsActivity;
import com.example.myrecipeapptensorflow.SidebarActivities.TermsOfUseActivity;
import com.example.myrecipeapptensorflow.VegetablesRecipes.VegetableRecipe4;
import com.example.myrecipeapptensorflow.VegetablesRecipes.VegetableRecipe5;
import com.example.myrecipeapptensorflow.VegetablesRecipes.VegetableRecipe6;
import com.example.myrecipeapptensorflow.VegetablesRecipes.VegetableRecipe8;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class InputIngredientsActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    ImageView menu;
    LinearLayout about, settings, terms, policy, exit;
    private EditText ingredient1, ingredient2, ingredient3, ingredient4, ingredient5;
    private Button searchButton,instructionsButton;
    // Create a list to hold any invalid ingredients
    List<String> invalidIngredients = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_input_ingredients);


        EditText searchEditText = findViewById(R.id.searchView);

        searchEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    String searchText = searchEditText.getText().toString().toLowerCase();
                    Intent intent;
                    switch (searchText) {
                        case "beef": case "beef recipes":
                            intent = new Intent(InputIngredientsActivity.this, BeefRecipesActivity.class);
                            Toast.makeText(InputIngredientsActivity.this, "Beef Recipes", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "bulalo":
                            intent = new Intent(InputIngredientsActivity.this, BeefRecipe1.class);
                            Toast.makeText(InputIngredientsActivity.this, "Bulalo", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "beef curry":
                            intent = new Intent(InputIngredientsActivity.this, BeefRecipe2.class);
                            Toast.makeText(InputIngredientsActivity.this, "Beef Curry", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "beef afritada":
                            intent = new Intent(InputIngredientsActivity.this, BeefRecipe3.class);
                            Toast.makeText(InputIngredientsActivity.this, "Beef Afritada", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "beef kaldereta":
                            intent = new Intent(InputIngredientsActivity.this, BeefRecipe4.class);
                            Toast.makeText(InputIngredientsActivity.this, "Beef Kaldereta", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "beef mechado":
                            intent = new Intent(InputIngredientsActivity.this, BeefRecipe5.class);
                            Toast.makeText(InputIngredientsActivity.this, "Beef Mechado", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "beef pares":
                            intent = new Intent(InputIngredientsActivity.this, BeefRecipe6.class);
                            Toast.makeText(InputIngredientsActivity.this, "Beef Pares", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "beef tapa":
                            intent = new Intent(InputIngredientsActivity.this, BeefRecipe7.class);
                            Toast.makeText(InputIngredientsActivity.this, "Beef Tapa", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "chicken": case "chicken recipes":
                            intent = new Intent(InputIngredientsActivity.this, ChickenRecipesActivity.class);
                            Toast.makeText(InputIngredientsActivity.this, "Chicken Recipes", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "chicken arozcaldo": case "arozcaldo": case "chicken aroz caldo":
                            intent = new Intent(InputIngredientsActivity.this, ChickenRecipe1.class);
                            Toast.makeText(InputIngredientsActivity.this, "Chicken Aroz Caldo", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "chicken adobo": case "adobong manok":
                            intent = new Intent(InputIngredientsActivity.this, ChickenRecipe2.class);
                            Toast.makeText(InputIngredientsActivity.this, "Chicken Adobo", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "garlic fried chicken":
                            intent = new Intent(InputIngredientsActivity.this, ChickenRecipe3.class);
                            Toast.makeText(InputIngredientsActivity.this, "Garlic Fried Chicken", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "chicken afritada":
                            intent = new Intent(InputIngredientsActivity.this, ChickenRecipe4.class);
                            Toast.makeText(InputIngredientsActivity.this, "Chicken Afritada", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "chicken buffalo wings": case "buffalo wings":
                            intent = new Intent(InputIngredientsActivity.this, ChickenRecipe5.class);
                            Toast.makeText(InputIngredientsActivity.this, "Chicken Buffalo Wings", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "chicken sinigang":
                            intent = new Intent(InputIngredientsActivity.this, ChickenRecipe6.class);
                            Toast.makeText(InputIngredientsActivity.this, "Chicken Sinigang", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "chicken kaldereta":
                            intent = new Intent(InputIngredientsActivity.this, ChickenRecipe7.class);
                            Toast.makeText(InputIngredientsActivity.this, "Chicken Kaldereta", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "vegetable": case "vegetable recipes":
                            intent = new Intent(InputIngredientsActivity.this, VegetablesRecipesActivity.class);
                            Toast.makeText(InputIngredientsActivity.this, "Vegetable Recipes", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "minatamis na kamote": case "matamis na kamote":
                            intent = new Intent(InputIngredientsActivity.this, BeefRecipe1.class);
                            Toast.makeText(InputIngredientsActivity.this, "Minatamis na Kamote", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "adobong kangkong":
                            intent = new Intent(InputIngredientsActivity.this, BeefRecipe2.class);
                            Toast.makeText(InputIngredientsActivity.this, "Adobong Kangkong", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "ginisang ampalaya at hipon": case "ginisang ampalaya":
                            intent = new Intent(InputIngredientsActivity.this, BeefRecipe3.class);
                            Toast.makeText(InputIngredientsActivity.this, "Ginisang Ampalaya at Hipon", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "ginisang sayote":
                            intent = new Intent(InputIngredientsActivity.this, BeefRecipe4.class);
                            Toast.makeText(InputIngredientsActivity.this, "Ginisang Sayote", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "ginisang gulay":
                            intent = new Intent(InputIngredientsActivity.this, BeefRecipe5.class);
                            Toast.makeText(InputIngredientsActivity.this, "Ginisang Gulay", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "ginisang togue":
                            intent = new Intent(InputIngredientsActivity.this, BeefRecipe6.class);
                            Toast.makeText(InputIngredientsActivity.this, "Ginisang Togue", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "ensaladang pipino":
                            intent = new Intent(InputIngredientsActivity.this, BeefRecipe7.class);
                            Toast.makeText(InputIngredientsActivity.this, "Ensaladang Pipino", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "tortang talong":
                            intent = new Intent(InputIngredientsActivity.this, BeefRecipe7.class);
                            Toast.makeText(InputIngredientsActivity.this, "Tortang Talong", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "seafood": case "seafood recipes":
                            intent = new Intent(InputIngredientsActivity.this, SeafoodRecipesActivity.class);
                            Toast.makeText(InputIngredientsActivity.this, "Seafood Recipes", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "ginataang alimasag":
                            intent = new Intent(InputIngredientsActivity.this, SeafoodRecipesActivity.class);
                            Toast.makeText(InputIngredientsActivity.this, "Ginataang Alimasag", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "ginataang hipon":
                            intent = new Intent(InputIngredientsActivity.this, SeafoodRecipesActivity.class);
                            Toast.makeText(InputIngredientsActivity.this, "Ginataang Hipon", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "crispy breaded shrimp": case "breaded shrimp":
                            intent = new Intent(InputIngredientsActivity.this, SeafoodRecipesActivity.class);
                            Toast.makeText(InputIngredientsActivity.this, "Crispy Breaded Shrimp", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "ginisang pusit":
                            intent = new Intent(InputIngredientsActivity.this, SeafoodRecipesActivity.class);
                            Toast.makeText(InputIngredientsActivity.this, "Ginisang Pusit", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "sisig pusit":
                            intent = new Intent(InputIngredientsActivity.this, SeafoodRecipesActivity.class);
                            Toast.makeText(InputIngredientsActivity.this, "Sisig Pusit", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "spicy tahong":
                            intent = new Intent(InputIngredientsActivity.this, SeafoodRecipesActivity.class);
                            Toast.makeText(InputIngredientsActivity.this, "Spicy Tahong", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "sweet and sour fish":
                            intent = new Intent(InputIngredientsActivity.this, SeafoodRecipesActivity.class);
                            Toast.makeText(InputIngredientsActivity.this, "Sweet and Sour Fish", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "dessert": case "dessert recipes":
                            intent = new Intent(InputIngredientsActivity.this, SeafoodRecipesActivity.class);
                            Toast.makeText(InputIngredientsActivity.this, "Seafood Recipes", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "ginumis":
                            intent = new Intent(InputIngredientsActivity.this, DessertRecipe1.class);
                            Toast.makeText(InputIngredientsActivity.this, "Ginumis", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "mango jelly":
                            intent = new Intent(InputIngredientsActivity.this, DessertRecipe2.class);
                            Toast.makeText(InputIngredientsActivity.this, "Mango Jelly", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "leche plan":
                            intent = new Intent(InputIngredientsActivity.this, DessertRecipe3.class);
                            Toast.makeText(InputIngredientsActivity.this, "Leche Flan", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "chocolate flan cake": case "chocolate cake":
                            intent = new Intent(InputIngredientsActivity.this, DessertRecipe4.class);
                            Toast.makeText(InputIngredientsActivity.this, "Chocolate Flan Cake", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "mini egg pies": case "egg pies":
                            intent = new Intent(InputIngredientsActivity.this, DessertRecipe5.class);
                            Toast.makeText(InputIngredientsActivity.this, "Mini Egg Pies", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "yema cake":
                            intent = new Intent(InputIngredientsActivity.this, DessertRecipe6.class);
                            Toast.makeText(InputIngredientsActivity.this, "Yema Cake", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "pianono":
                            intent = new Intent(InputIngredientsActivity.this, DessertRecipe7.class);
                            Toast.makeText(InputIngredientsActivity.this, "Pianono", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "pasta": case "pasta recipes":
                            intent = new Intent(InputIngredientsActivity.this, PastaRecipesActivity.class);
                            Toast.makeText(InputIngredientsActivity.this, "Pasta Recipes", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "filipino-style spaghetti": case "filipino style spaghetti": case "filipino spaghetti": case "pinoy spaghetti":
                            intent = new Intent(InputIngredientsActivity.this, DessertRecipe1.class);
                            Toast.makeText(InputIngredientsActivity.this, "Filipino-style Spaghetti", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "filipino-style carbonara": case "filipino style carbonara": case "filipino carbonara": case "pinoy carbonara":
                            intent = new Intent(InputIngredientsActivity.this, DessertRecipe2.class);
                            Toast.makeText(InputIngredientsActivity.this, "Filipino-style Carbonara", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "filipino-style lasagna": case "filipino style lasagna": case "filipino lasagna": case "pinoy lasagna":
                            intent = new Intent(InputIngredientsActivity.this, DessertRecipe3.class);
                            Toast.makeText(InputIngredientsActivity.this, "Filipino-style Lasagna", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "baked macaroni":
                            intent = new Intent(InputIngredientsActivity.this, DessertRecipe4.class);
                            Toast.makeText(InputIngredientsActivity.this, "Baked Macaroni", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "filipino-style macaroni salad": case "filipino style macaroni salad": case "filipino macaroni salad": case "pinoy macaroni salad":
                            intent = new Intent(InputIngredientsActivity.this, DessertRecipe5.class);
                            Toast.makeText(InputIngredientsActivity.this, "Filipino-style Macaroni Salad", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "lemon garlic shrimp pasta": case "garlic shrimp pasta": case "shrimp pasta":
                            intent = new Intent(InputIngredientsActivity.this, DessertRecipe6.class);
                            Toast.makeText(InputIngredientsActivity.this, "Lemon Garlic Shrimp Pasta", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "longganisa pasta":
                            intent = new Intent(InputIngredientsActivity.this, DessertRecipe7.class);
                            Toast.makeText(InputIngredientsActivity.this, "Longganisa Pasta", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "tyula itum": case "tiyula itum":
                            intent = new Intent(InputIngredientsActivity.this, BeefRecipe8.class);
                            Toast.makeText(InputIngredientsActivity.this, "Tiyula Itum", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "chicken pyanggang": case "pyanggang":
                            intent = new Intent(InputIngredientsActivity.this, ChickenRecipe8.class);
                            Toast.makeText(InputIngredientsActivity.this, "Chicken Pyanggang", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "puto":
                            intent = new Intent(InputIngredientsActivity.this, DessertRecipe8.class);
                            Toast.makeText(InputIngredientsActivity.this, "Puto", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        case "pancit bihon": case "bihon": case "pancit": case "vegetarian pancit bihon":
                            intent = new Intent(InputIngredientsActivity.this, PastaRecipe8.class);
                            Toast.makeText(InputIngredientsActivity.this, "Vegetarian Pancit Bihon", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                        case "tilapia": case "sweet and sour tilapia":
                            intent = new Intent(InputIngredientsActivity.this, SeafoodRecipe8.class);
                            Toast.makeText(InputIngredientsActivity.this, "Sweet and Sour Tilapia", Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                            return true;
                        default:
                            Toast.makeText(InputIngredientsActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                            return false;
                    }
                }
                return false;
            }
        });

        ImageButton instructionsButton = findViewById(R.id.instructions_button);
        instructionsButton.setImageResource(R.drawable.information_icon);
        instructionsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show the instructions modal here
                View modalView = getLayoutInflater().inflate(R.layout.instructions_input_modal, null);

                // Show the modal using a Dialog
                AlertDialog.Builder builder = new AlertDialog.Builder(InputIngredientsActivity.this);
                builder.setView(modalView);
                builder.setPositiveButton("CLOSE", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });

                // Set the background color of the CLOSE button
                AlertDialog dialog = builder.create();
                dialog.setOnShowListener(new DialogInterface.OnShowListener() {
                    @Override
                    public void onShow(DialogInterface dialogInterface) {
                        Button closeButton = ((AlertDialog) dialog).getButton(DialogInterface.BUTTON_POSITIVE);
                        closeButton.setBackgroundColor(ContextCompat.getColor(InputIngredientsActivity.this, R.color.white));
                    }
                });

                dialog.show();
            }
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
                    startActivity(new Intent(getApplicationContext(), MainFunctionsActivity.class));
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_in_left);
                    finish();
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
                redirectActivity(InputIngredientsActivity.this, StartActivity.class);
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
                redirectActivity(InputIngredientsActivity.this, com.example.myrecipeapptensorflow.SidebarActivities.AboutActivity.class);
            }
        });
        terms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                redirectActivity(InputIngredientsActivity.this, TermsOfUseActivity.class);
            }
        });
        policy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                redirectActivity(InputIngredientsActivity.this, PrivacyPolicyActivity.class);
            }
        });

        // Initialize the UI elements
        ingredient1 = findViewById(R.id.ingredient1);
        ingredient2 = findViewById(R.id.ingredient2);
        ingredient3 = findViewById(R.id.ingredient3);
        ingredient4 = findViewById(R.id.ingredient4);
        ingredient5 = findViewById(R.id.ingredient5);
        searchButton = findViewById(R.id.searchButton);

        // Set a click listener for the search button
        searchButton.setOnClickListener(v -> {
            // Get the user input for ingredients
            String[] ingredients = {
                    ingredient1.getText().toString(),
                    ingredient2.getText().toString(),
                    ingredient3.getText().toString(),
                    ingredient4.getText().toString(),
                    ingredient5.getText().toString()
            };

            // Check if there are enough ingredients
            if (countIngredients(ingredients) < 1) {
                Toast.makeText(InputIngredientsActivity.this, "No Ingredients Inputted", Toast.LENGTH_SHORT).show();
            } else if (countIngredients(ingredients) < 2) {
                Toast.makeText(InputIngredientsActivity.this, "Input 2 more Ingredients", Toast.LENGTH_SHORT).show();
            } else if (countIngredients(ingredients) < 3) {
                Toast.makeText(InputIngredientsActivity.this, "Input 1 more Ingredient", Toast.LENGTH_SHORT).show();
            } else {
                // Search for the matching recipe
                searchRecipes(ingredients);
            }
        });
    }

    private int countIngredients(String[] ingredients) {
        int count = 0;

        // Count the non-empty ingredients
        for (String ingredient : ingredients) {
            if (!ingredient.isEmpty()) {
                count++;
            }
        }

        return count;
    }

    private void searchRecipes(String[] ingredients) {
        boolean hasEgg = false;
        boolean hasOil = false;
        boolean hasEggplant = false;
        boolean hasChicken = false;
        boolean hasOnion = false;
        boolean hasSoySauce = false;
        boolean hasGinger = false;
        boolean hasGarlic = false;
        boolean hasVinegar = false;
        boolean hasRice = false;
        boolean hasSalt = false;
        boolean hasPepper = false;
        boolean hasPaprika = false;
        boolean hasTomato = false;
        boolean hasWater = false;
        boolean hasBeef = false;
        boolean hasFish = false;
        boolean hasMacaroni = false;
        boolean hasSpaghetti = false;
        boolean hasCarrot = false;
        boolean hasCrab = false;
        boolean hasShrimp = false;
        boolean hasSquid = false;
        boolean hasSugar = false;
        boolean hasBellPepper = false;
        boolean hasPotato = false;

        // Check for each ingredient in the user input
        for (String ingredient : ingredients) {
            if (ingredient.equalsIgnoreCase("egg")) {
                hasEgg = true;
            } else if (ingredient.equalsIgnoreCase("oil")) {
                hasOil = true;
            } else if (ingredient.equalsIgnoreCase("eggplant")) {
                hasEggplant = true;
            } else if (ingredient.equalsIgnoreCase("chicken")) {
                hasChicken = true;
            } else if (ingredient.equalsIgnoreCase("onion")) {
                hasOnion = true;
            } else if (ingredient.equalsIgnoreCase("soy sauce")) {
                hasSoySauce = true;
            } else if (ingredient.equalsIgnoreCase("ginger")) {
                hasGinger = true;
            } else if (ingredient.equalsIgnoreCase("garlic")) {
                hasGarlic = true;
            } else if (ingredient.equalsIgnoreCase("vinegar")) {
                hasVinegar = true;
            } else if (ingredient.equalsIgnoreCase("rice")) {
                hasRice = true;
            } else if (ingredient.equalsIgnoreCase("salt")) {
                hasSalt = true;
            } else if (ingredient.equalsIgnoreCase("pepper")) {
                hasPepper = true;
            } else if (ingredient.equalsIgnoreCase("paprika")) {
                hasPaprika = true;
            } else if (ingredient.equalsIgnoreCase("tomato")) {
                hasTomato = true;
            } else if (ingredient.equalsIgnoreCase("water")) {
                hasWater = true;
            } else if (ingredient.equalsIgnoreCase("beef")) {
                hasBeef = true;
            } else if (ingredient.equalsIgnoreCase("fish")) {
                hasFish = true;
            } else if (ingredient.equalsIgnoreCase("macaroni")) {
                hasMacaroni = true;
            } else if (ingredient.equalsIgnoreCase("spaghetti")) {
                hasSpaghetti = true;
            } else if (ingredient.equalsIgnoreCase("carrot")) {
                hasCarrot = true;
            } else if (ingredient.equalsIgnoreCase("crab")) {
                hasCrab = true;
            } else if (ingredient.equalsIgnoreCase("shrimp")) {
                hasShrimp = true;
            } else if (ingredient.equalsIgnoreCase("squid")) {
                hasSquid = true;
            } else if (ingredient.equalsIgnoreCase("sugar")) {
                hasSugar = true;
            } else if (ingredient.equalsIgnoreCase("bell pepper")) {
                hasBellPepper = true;
            } else if (ingredient.equalsIgnoreCase("potato")) {
                hasPotato = true;
            }
        }
        // Redirect to the appropriate recipe page based on the ingredients
        // Reads 5 Inputs
        if (hasBeef && hasOnion && hasGarlic && hasWater && hasGinger) {
            startActivity(new Intent(this, BeefRecipe2.class));
        } else if (hasChicken && hasPaprika && hasOil && hasSalt && hasGarlic) {
            startActivity(new Intent(this, ChickenRecipe5.class));
        } else if (hasChicken && hasOil && hasOnion && hasSalt && hasGarlic) {
            startActivity(new Intent(this, ResultChicken16CActivity.class));
        } else if (hasChicken && hasOil && hasOnion && hasSoySauce && hasGarlic) {
            startActivity(new Intent(this, ChickenRecipe2.class));
        } else if (hasChicken && hasOil && hasOnion && hasVinegar && hasGarlic) {
            startActivity(new Intent(this, ChickenRecipe2.class));
        } else if (hasChicken && hasOil && hasOnion && hasTomato && hasGarlic) {
            startActivity(new Intent(this, ChickenRecipe6.class));
        } else if (hasChicken && hasOil && hasOnion && hasSalt && hasPepper) {
            startActivity(new Intent(this, ChickenRecipe1.class));
        } else if (hasChicken && hasOil && hasOnion && hasSalt && hasSoySauce) {
            startActivity(new Intent(this, ChickenRecipe2.class));
        } else if (hasChicken && hasOil && hasOnion && hasSalt && hasVinegar) {
            startActivity(new Intent(this, ChickenRecipe2.class));
        } else if (hasChicken && hasOil && hasOnion && hasSalt && hasTomato) {
            startActivity(new Intent(this, ChickenRecipe6.class));
        } else if (hasChicken && hasOil && hasOnion && hasPepper && hasSoySauce) {
            startActivity(new Intent(this, ChickenRecipe2.class));
        } else if (hasChicken && hasOil && hasOnion && hasPepper && hasVinegar) {
            startActivity(new Intent(this, ChickenRecipe2.class));
        } else if (hasChicken && hasOil && hasOnion && hasSoySauce && hasVinegar) {
            startActivity(new Intent(this, ChickenRecipe2.class));
        } else if (hasBeef && hasOnion && hasGarlic && hasWater && hasCarrot) {
            startActivity(new Intent(this, BeefRecipe2.class));
        } else if (hasBeef && hasOnion && hasGarlic && hasOil && hasGinger) {
            startActivity(new Intent(this, BeefRecipe2.class));
        } else if (hasBeef && hasOnion && hasGarlic && hasCarrot && hasGinger) {
            startActivity(new Intent(this, BeefRecipe2.class));
        } else if (hasBeef && hasOnion && hasGarlic && hasSalt && hasWater) {
            startActivity(new Intent(this, BeefResult3456BActivity.class));
        } else if (hasBeef && hasOnion && hasGarlic && hasSalt && hasOil) {
            startActivity(new Intent(this, BeefResult3456CActivity.class));
        } else if (hasBeef && hasOnion && hasGarlic && hasWater && hasOil) {
            startActivity(new Intent(this, BeefResult23456HActivity.class));
        } else if (hasBeef && hasOnion && hasGarlic && hasOil && hasCarrot) {
            startActivity(new Intent(this, BeefResult2345BActivity.class));
        } else if (hasBeef && hasPepper && hasGarlic && hasOil && hasSalt) {
            startActivity(new Intent(this, BeefRecipe8.class));
        } else if (hasShrimp && hasOil && hasOnion && hasGarlic && hasSalt) {
            startActivity(new Intent(this, VegetableShrimpResult3456E.class));
        } else if (hasShrimp && hasOil && hasGarlic && hasPepper && hasEgg) {
            startActivity(new Intent(this, SeafoodRecipe3.class));
        } else if (hasShrimp && hasOil && hasGarlic && hasSalt && hasEgg) {
            startActivity(new Intent(this, SeafoodRecipe3.class));
        } else if (hasShrimp && hasOil && hasOnion && hasGarlic && hasTomato) {
            startActivity(new Intent(this, VegetableRecipe4.class));
        } else if (hasShrimp && hasOil && hasOnion && hasGarlic && hasEggplant) {
            startActivity(new Intent(this, VegetableRecipe5.class));
        } else if (hasShrimp && hasOil && hasOnion && hasGarlic && hasCarrot) {
            startActivity(new Intent(this, VegetableRecipe6.class));
        } else if (hasCrab && hasOil && hasOnion && hasGarlic && hasPepper) {
            startActivity(new Intent(this, SeafoodRecipe1.class));
        } else if (hasCrab && hasOil && hasOnion && hasSalt && hasPepper) {
            startActivity(new Intent(this, SeafoodRecipe1.class));
        } else if (hasCrab && hasOil && hasGarlic && hasSalt && hasPepper) {
            startActivity(new Intent(this, SeafoodRecipe1.class));
        } else if (hasSquid &&  hasOnion && hasGarlic && hasSalt && hasOil) {
            startActivity(new Intent(this, SeafoodResult45J.class));
        } else if (hasFish && hasOil && hasOnion && hasEgg  && hasSoySauce) {
            startActivity(new Intent(this, SeafoodRecipe7.class));
        } else if (hasFish && hasOil && hasOnion && hasEgg  && hasSugar) {
            startActivity(new Intent(this, SeafoodRecipe7.class));
        } else if (hasFish && hasOil && hasOnion && hasEgg  && hasVinegar) {
            startActivity(new Intent(this, SeafoodRecipe7.class));
        } else if (hasFish && hasOil && hasOnion && hasSoySauce  && hasSugar) {
            startActivity(new Intent(this, SeafoodRecipe7.class));
        } else if (hasFish && hasOil && hasOnion && hasSoySauce  && hasVinegar) {
            startActivity(new Intent(this, SeafoodRecipe7.class));
        } else if (hasFish && hasOil && hasOnion && hasSugar  && hasVinegar) {
            startActivity(new Intent(this, SeafoodRecipe7.class));
        } else if (hasFish && hasOnion && hasGarlic && hasSalt  && hasCarrot) {
            startActivity(new Intent(this, SeafoodRecipe8.class));
        } else if (hasFish && hasOnion && hasGarlic && hasSalt  && hasVinegar) {
            startActivity(new Intent(this, SeafoodRecipe8.class));
        } else if (hasMacaroni && hasGarlic && hasOnion && hasSugar && hasSalt) {
            startActivity(new Intent(this, PastaRecipe4.class));
        } else if (hasMacaroni && hasEgg && hasOnion && hasCarrot && hasSalt) {
            startActivity(new Intent(this, PastaRecipe5.class));
        } else if (hasBellPepper && hasPotato && hasGarlic && hasOnion && hasTomato) {
            startActivity(new Intent(this, ChickenResult47.class));
        } else if (hasBellPepper && hasPotato && hasGarlic && hasOnion && hasTomato) {
            startActivity(new Intent(this, BeefResult2345.class));
        }
        //Reads 4 Inputs
          else if (hasChicken && hasPaprika && hasOil && hasGarlic && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ChickenRecipe5.class));
        } else if (hasChicken && hasOil && hasOnion && hasSoySauce&& ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ChickenRecipe2.class));
        } else if (hasChicken && hasOil && hasOnion && hasVinegar&& ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ChickenRecipe2.class));
        } else if (hasChicken && hasOil && hasOnion && hasTomato&& ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ChickenRecipe6.class));
        } else if (hasChicken && hasOil && hasGarlic && hasPepper&& ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ChickenRecipe1.class));
        } else if (hasChicken && hasOil && hasGarlic && hasSoySauce&& ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ChickenRecipe2.class));
        } else if (hasChicken && hasOil && hasGarlic && hasVinegar&& ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ChickenRecipe2.class));
        } else if (hasChicken && hasOil && hasSalt && hasCarrot&& ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ChickenRecipe4.class));
        } else if (hasChicken && hasOil && hasSalt && hasTomato&& ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ChickenRecipe6.class));
        } else if (hasChicken && hasOil && hasPepper && hasCarrot&& ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ChickenRecipe4.class));
        } else if (hasChicken && hasOil && hasPepper && hasSoySauce&& ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ChickenRecipe2.class));
        } else if (hasChicken && hasOil && hasPepper && hasVinegar&& ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ChickenRecipe2.class));
        } else if (hasChicken && hasOil && hasPepper && hasTomato&& ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ChickenRecipe4.class));
        } else if (hasChicken && hasOil && hasSoySauce && hasVinegar&& ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ChickenRecipe2.class));
        } else if (hasChicken && hasOnion && hasPepper && hasGinger&& ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ChickenRecipe1.class));
        } else if (hasChicken && hasOnion && hasOil && hasGarlic&& ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ResultChicken126BActivity.class));
        } else if (hasChicken && hasOnion && hasOil && hasSalt&& ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ResultChicken16BActivity.class));
        } else if (hasChicken && hasOnion && hasOil && hasPepper&& ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ResultChicken12CActivity.class));
        } else if (hasChicken && hasGarlic && hasOil && hasSalt&& ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ResultChicken1356BActivity.class));
        } else if (hasBeef && hasGarlic && hasOil && hasSalt&& ingredients[4].isEmpty()) {
            startActivity(new Intent(this, BeefRecipe8.class));
        } else if (hasBeef && hasGarlic && hasPepper && hasSalt&& ingredients[4].isEmpty()) {
            startActivity(new Intent(this, BeefRecipe8.class));
        } else if (hasBeef && hasGarlic && hasPepper && hasOil&& ingredients[4].isEmpty()) {
            startActivity(new Intent(this, BeefRecipe8.class));
        } else if (hasBeef && hasOnion && hasGarlic && hasGinger && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, BeefRecipe2.class));
        } else if (hasBeef && hasOnion && hasGarlic && hasSalt && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, BeefResut3456Activity.class));
        } else if (hasBeef && hasOnion && hasWater && hasGinger && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, BeefRecipe2.class));
        } else if (hasBeef && hasOnion && hasOil && hasGinger && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, BeefRecipe2.class));
        } else if (hasBeef && hasOnion && hasCarrot && hasGinger && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, BeefRecipe2.class));
        } else if (hasBeef && hasOnion && hasGarlic && hasWater && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, BeefResult23456EActivity.class));
        } else if (hasBeef && hasOnion && hasGarlic && hasOil && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, BeefResult23456FActivity.class));
        } else if (hasBeef && hasOnion && hasGarlic && hasCarrot && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, BeefResult345EActivity.class));
        } else if (hasBeef && hasOnion && hasSalt && hasWater && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, BeefResult13456CActivity.class));
        } else if (hasBeef && hasOnion && hasSalt && hasOil && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, BeefResult3456Activity.class));
        } else if (hasBeef && hasOnion && hasSalt && hasCarrot && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, BeefResult345FActivity.class));
        } else if (hasBeef && hasOnion && hasWater && hasOil && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, BeefResult23456GActivity.class));
        } else if (hasBeef && hasOnion && hasWater && hasCarrot && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, BeefResult345GActivity.class));
        } else if (hasBeef && hasOnion && hasOil && hasCarrot && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, BeefResult345HActivity.class));
        } else if (hasShrimp && hasOil && hasOnion && hasGarlic && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, VegetableShrimpResult3456C.class));
        } else if (hasShrimp && hasOil && hasOnion && hasSalt && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, VegetableShrimpResult3456D.class));
        } else if (hasShrimp && hasOil && hasOnion && hasCarrot && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, VegetableRecipe6.class));
        } else if (hasCrab && hasOil && hasOnion && hasGarlic && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodRecipe1.class));
        } else if (hasCrab && hasOil && hasOnion && hasPepper && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodRecipe1.class));
        } else if (hasCrab && hasOil && hasOnion && hasSalt && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodRecipe1.class));
        } else if (hasCrab && hasOil && hasGarlic && hasPepper  && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodRecipe1.class));
        } else if (hasCrab && hasOil && hasGarlic && hasSalt  && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodRecipe1.class));
        } else if (hasCrab && hasOil && hasPepper && hasSalt  && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodRecipe1.class));
        } else if (hasShrimp && hasOil && hasGarlic && hasEgg && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodRecipe3.class));
        } else if (hasShrimp && hasOil && hasGarlic && hasSalt && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, PastaRecipe6.class));
        } else if (hasShrimp && hasOil && hasPepper && hasEgg && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodRecipe3.class));
        } else if (hasShrimp && hasSalt && hasPepper && hasEgg && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodRecipe3.class));
        } else if (hasShrimp && hasSalt && hasGarlic && hasEgg && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodRecipe3.class));
        } else if (hasSquid && hasOil && hasOnion && hasGarlic && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodResult45G.class));
        } else if (hasSquid &&  hasOil && hasGarlic && hasSalt && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodResult45H.class));
        } else if (hasSquid &&  hasOnion && hasGarlic && hasSalt && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodResult45I.class));
        } else if (hasFish && hasOil && hasOnion && hasEgg  && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodRecipe7.class));
        } else if (hasFish && hasOil && hasOnion && hasSoySauce  && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodRecipe7.class));
        } else if (hasFish && hasOil && hasOnion && hasSugar  && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodRecipe7.class));
        } else if (hasFish && hasOil && hasOnion && hasVinegar  && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodRecipe7.class));
        } else if (hasFish && hasOil && hasEgg && hasSoySauce  && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodRecipe7.class));
        } else if (hasFish && hasOil && hasEgg && hasSugar  && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodRecipe7.class));
        } else if (hasFish && hasOil && hasEgg && hasVinegar  && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodRecipe7.class));
        } else if (hasFish && hasOil && hasSoySauce && hasSugar  && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodRecipe7.class));
        } else if (hasFish && hasOil && hasSoySauce && hasVinegar  && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodRecipe7.class));
        } else if (hasFish && hasOil && hasSugar && hasVinegar  && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodRecipe7.class));
        } else if (hasFish && hasOnion && hasGarlic && hasSalt  && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodRecipe8.class));
        } else if (hasFish && hasOnion && hasGarlic && hasCarrot  && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodRecipe8.class));
        } else if (hasFish && hasOnion && hasGarlic && hasVinegar  && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodRecipe8.class));
        } else if (hasFish && hasOnion && hasSalt && hasCarrot  && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodRecipe8.class));
        } else if (hasFish && hasOnion && hasSalt && hasVinegar  && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodRecipe8.class));
        } else if (hasFish && hasOnion && hasCarrot && hasVinegar  && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodRecipe8.class));
        } else if (hasSpaghetti && hasOnion && hasGarlic && hasSalt && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, PastaResult12D.class));
        } else if (hasSpaghetti && hasOil && hasOnion && hasGarlic && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, PastaRecipe1.class));
        } else if (hasSpaghetti && hasOil && hasOnion && hasSugar && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, PastaRecipe1.class));
        } else if (hasSpaghetti && hasOil && hasOnion && hasSalt && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, PastaRecipe1.class));
        } else if (hasSpaghetti && hasOil && hasGarlic && hasSugar && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, PastaRecipe1.class));
        } else if (hasSpaghetti && hasOil && hasGarlic && hasSalt && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, PastaRecipe1.class));
        } else if (hasSpaghetti && hasOil && hasSugar && hasSalt && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, PastaRecipe1.class));
        } else if (hasSpaghetti && hasOnion && hasGarlic && hasSugar && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, PastaRecipe1.class));
        } else if (hasSpaghetti && hasOnion && hasGarlic && hasSalt && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, PastaRecipe1.class));
        } else if (hasMacaroni && hasGarlic && hasOnion && hasSugar && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, PastaRecipe4.class));
        } else if (hasMacaroni && hasGarlic && hasOnion && hasSalt && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, PastaRecipe4.class));
        } else if (hasMacaroni && hasGarlic && hasSugar && hasSalt && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, PastaRecipe4.class));
        } else if (hasMacaroni && hasOnion && hasEgg && hasCarrot && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, PastaRecipe5.class));
        } else if (hasMacaroni && hasOnion && hasEgg && hasSalt && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, PastaRecipe5.class));
        } else if (hasMacaroni && hasEgg && hasCarrot && hasSalt && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, PastaRecipe5.class));
        } else if (hasOnion && hasGarlic && hasTomato && hasCarrot && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ResultC4Beef345.class));
        } else if (hasBellPepper && hasPotato && hasGarlic && hasOnion && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, Chicken47BeefResult2345.class));
        }
        // Reads 3 Inputs
          else if (hasEgg && hasOil && hasEggplant && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, VegetableRecipe8.class));
        } else if (hasEgg && hasSalt && hasEggplant && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, VegetableRecipe8.class));
        } else if (hasSalt && hasOil && hasEggplant && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, VegetableRecipe8.class));
        } else if (hasOnion && hasCarrot && hasGinger && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, BeefRecipe2.class));
        } else if (hasGarlic && hasCarrot && hasGinger && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, BeefRecipe2.class));
        } else if (hasOnion && hasGarlic && hasEggplant && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, VegetableRecipe5.class));
        } else if (hasGarlic && hasTomato && hasEggplant && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, VegetableRecipe5.class));
        } else if (hasOnion && hasTomato && hasEggplant && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, VegetableRecipe5.class));
        } else if (hasChicken && hasOil && hasCarrot&& ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ChickenRecipe4.class));
        } else if (hasChicken && hasOil && hasSoySauce&& ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ChickenRecipe2.class));
        } else if (hasChicken && hasOil && hasVinegar&& ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ChickenRecipe2.class));
        } else if (hasChicken && hasOnion && hasSoySauce&& ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ChickenRecipe2.class));
        } else if (hasChicken && hasGarlic && hasCarrot&& ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ChickenRecipe4.class));
        } else if (hasChicken && hasGarlic && hasSoySauce&& ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ChickenRecipe2.class));
        } else if (hasChicken && hasGarlic && hasTomato&& ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ChickenRecipe7.class));
        } else if (hasChicken && hasSalt && hasCarrot&& ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ChickenRecipe4.class));
        } else if (hasChicken && hasSalt && hasSoySauce&& ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ChickenRecipe2.class));
        } else if (hasChicken && hasSalt && hasVinegar&& ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ChickenRecipe2.class));
        } else if (hasChicken && hasPepper && hasCarrot&& ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ChickenRecipe4.class));
        } else if (hasChicken && hasPepper && hasSoySauce&& ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ChickenRecipe2.class));
        } else if (hasChicken && hasPepper && hasVinegar&& ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ChickenRecipe2.class));
        } else if (hasChicken && hasSoySauce && hasVinegar&& ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ChickenRecipe2.class));
        } else if (hasChicken && hasTomato && hasVinegar&& ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ChickenRecipe7.class));
        } else if (hasChicken && hasOil && hasOnion&& ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ResultChicken126Activity.class));
        } else if (hasChicken && hasOil && hasGarlic&& ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ResultChicken1256Activity.class));
        } else if (hasChicken && hasOil && hasSalt&& ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ResultChicken1345Activity.class));
        } else if (hasChicken && hasOil && hasPepper&& ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ResultChicken124Activity.class));
        } else if (hasChicken && hasOil && hasTomato&& ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ResultChicken46Activity.class));
        } else if (hasChicken && hasOnion && hasGarlic&& ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ResultChicken1267Activity.class));
        } else if (hasChicken && hasOnion && hasSalt&& ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ResultChicken16Activity.class));
        } else if (hasChicken && hasOnion && hasVinegar&& ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ResultChicken27Activity.class));
        } else if (hasChicken && hasOnion && hasTomato&& ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ResultChicken67Activity.class));
        } else if (hasChicken && hasGarlic && hasSalt&& ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ResultChicken1356Activity.class));
        } else if (hasChicken && hasGarlic && hasPepper&& ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ResultChicken12Activity.class));
        } else if (hasChicken && hasOnion && hasPepper&& ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ResultChicken12BActivity.class));
        } else if (hasChicken && hasSalt && hasPepper&& ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ResultChicken14Activity.class));
        } else if (hasChicken && hasGarlic && hasVinegar&& ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ResultChicken27BActivity.class));
        } else if (hasOil && hasChicken && hasGinger&& ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ResultChicken18A.class));
        } else if (hasRice && hasChicken && hasPepper&& ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ChickenRecipe1.class));
        } else if (hasRice && hasChicken && hasGinger&& ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ChickenRecipe1.class));
        } else if (hasRice && hasChicken && hasOnion&& ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ChickenRecipe1.class));
        } else if (hasRice && hasChicken && hasGarlic&& ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ChickenRecipe1.class));
        } else if (hasChicken && hasPaprika && hasOil&& ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ChickenRecipe5.class));
        } else if (hasChicken && hasPaprika && hasGarlic&& ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ChickenRecipe5.class));
        } else if (hasChicken && hasPaprika && hasSalt&& ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ChickenRecipe5.class));
        } else if (hasBeef && hasOnion && hasGinger && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, BeefRecipe2.class));
        } else if (hasBeef && hasGarlic && hasGinger && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, BeefRecipe2.class));
        } else if (hasBeef && hasGarlic && hasPepper && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, BeefResult78BActivity.class));
        } else if (hasBeef && hasGarlic && hasSoySauce && ingredients[3].isEmpty() && ingredients[4].isEmpty() ) {
            startActivity(new Intent(this, BeefRecipe7.class));
        } else if (hasBeef && hasSalt && hasPepper && ingredients[3].isEmpty() && ingredients[4].isEmpty() ) {
            startActivity(new Intent(this, BeefResult78CActivity.class));
        } else if (hasBeef && hasSalt && hasSoySauce && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, BeefRecipe7.class));
        } else if (hasBeef && hasWater && hasGinger && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, BeefRecipe2.class));
        } else if (hasBeef && hasOil && hasGinger && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, BeefRecipe2.class));
        } else if (hasBeef && hasOil && hasPepper && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, BeefResult78Activity.class));
        } else if (hasBeef && hasOil && hasSoySauce && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, BeefRecipe7.class));
        } else if (hasBeef && hasGinger && hasCarrot && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, BeefRecipe2.class));
        } else if (hasBeef && hasPepper && hasSoySauce && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, BeefRecipe7.class));
        } else if (hasBeef && hasOnion && hasGarlic && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, BeefResult23456Activity.class));
        } else if (hasBeef && hasOnion && hasSalt && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, BeefResult13456Activity.class));
        } else if (hasBeef && hasOnion && hasWater && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, BeefResult123456Activity.class));
        } else if (hasBeef && hasOnion && hasOil && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, BeefResult23456BActivity.class));
        } else if (hasBeef && hasOnion && hasCarrot && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, BeefResult2345Activity.class));
        } else if (hasBeef && hasGarlic && hasSalt && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, BeefResult34567Activity.class));
        } else if (hasBeef && hasGarlic && hasWater && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, BeefResult23456CActivity.class));
        } else if (hasBeef && hasGarlic && hasOil && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, BeefResult234567Activity.class));
        } else if (hasBeef && hasGarlic && hasCarrot && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, BeefResult345Activity.class));
        } else if (hasBeef && hasSalt && hasWater && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, BeefResult13456BActivity.class));
        } else if (hasBeef && hasSalt && hasOil && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, BeefResult34567CActivity.class));
        } else if (hasBeef && hasSalt && hasCarrot && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, BeefResult345CActivity.class));
        } else if (hasBeef && hasWater && hasOil && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, BeefResult23456DActivity.class));
        } else if (hasBeef && hasWater && hasCarrot && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, BeefResult345BActivity.class));
        } else if (hasBeef && hasOil && hasCarrot && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, BeefResult345DActivity.class));
        } else if (hasOil && hasOnion && hasShrimp && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, VegetableResult3456.class));
        } else if (hasOil && hasGarlic && hasShrimp && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, VegetableResult3456B.class));
        } else if (hasSalt && hasGarlic && hasShrimp && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, PastaRecipe6.class));
        } else if (hasEgg && hasWater && hasSugar && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, VegetableRecipe8.class));
        } else if (hasEgg && hasRice && hasSugar && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, VegetableRecipe8.class));
        } else if (hasEgg && hasRice && hasWater && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, VegetableRecipe8.class));
        } else if (hasCrab && hasOil && hasOnion && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodRecipe1.class));
        } else if (hasCrab && hasOil && hasGarlic && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodRecipe1.class));
        } else if (hasCrab && hasOil && hasPepper && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodRecipe1.class));
        } else if (hasCrab && hasOil && hasSalt && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodRecipe1.class));
        } else if (hasCrab && hasOnion && hasGarlic && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodRecipe1.class));
        } else if (hasCrab && hasOnion && hasPepper && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodRecipe1.class));
        } else if (hasCrab && hasOnion && hasSalt && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodRecipe1.class));
        } else if (hasCrab && hasGarlic && hasPepper && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodRecipe1.class));
        } else if (hasCrab && hasGarlic && hasSalt && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodRecipe1.class));
        } else if (hasCrab && hasPepper && hasSalt && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodRecipe1.class));
        } else if (hasShrimp && hasSalt && hasEgg && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodRecipe3.class));
        } else if (hasShrimp && hasGarlic && hasEgg && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodRecipe3.class));
        } else if (hasShrimp && hasPepper && hasEgg && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodRecipe3.class));
        } else if (hasShrimp && hasOil && hasEgg && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodRecipe3.class));
        } else if (hasSquid && hasOil && hasOnion && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodResult45A.class));
        } else if (hasSquid && hasOil && hasGarlic && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodResult45B.class));
        } else if (hasSquid && hasOil && hasSalt && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodResult45C.class));
        } else if (hasSquid && hasOnion && hasGarlic && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodResult45D.class));
        } else if (hasSquid && hasOnion && hasSalt && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodResult45E.class));
        } else if (hasSquid && hasGarlic && hasSalt && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodResult45F.class));
        } else if (hasSquid && hasVinegar && hasTomato && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodRecipe4.class));
        } else if (hasSquid && hasSugar && hasGinger && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodRecipe5.class));
        } else if (hasFish && hasOil && hasOnion && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodResult78.class));
        } else if (hasFish && hasOil && hasEgg && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodRecipe7.class));
        } else if (hasFish && hasOil && hasSoySauce && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodRecipe7.class));
        } else if (hasFish && hasOil && hasSugar && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodRecipe7.class));
        } else if (hasFish && hasOil && hasVinegar && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodRecipe7.class));
        } else if (hasFish && hasEgg && hasSoySauce && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodRecipe7.class));
        } else if (hasFish && hasEgg && hasSugar && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodRecipe7.class));
        } else if (hasFish && hasEgg && hasVinegar && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodRecipe7.class));
        } else if (hasFish && hasSoySauce && hasSugar && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodRecipe7.class));
        } else if (hasFish && hasSoySauce && hasVinegar && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodRecipe7.class));
        } else if (hasFish && hasSugar && hasVinegar && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, SeafoodRecipe7.class));
        } else if (hasSpaghetti && hasOnion && hasGarlic && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, PastaResult12.class));
        } else if (hasSpaghetti && hasOnion && hasSalt && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, PastaResult12B.class));
        } else if (hasSpaghetti && hasSalt && hasGarlic && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, PastaResult12C.class));
        } else if (hasSpaghetti && hasOil && hasOnion && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, PastaRecipe1.class));
        } else if (hasSpaghetti && hasOil && hasGarlic && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, PastaRecipe1.class));
        } else if (hasSpaghetti && hasOil && hasSugar && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, PastaRecipe1.class));
        } else if (hasSpaghetti && hasOil && hasSalt && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, PastaRecipe1.class));
        } else if (hasSpaghetti && hasOnion && hasSugar && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, PastaRecipe1.class));
        } else if (hasSpaghetti && hasGarlic && hasSugar && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, PastaRecipe1.class));
        } else if (hasSpaghetti && hasSalt && hasSugar && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, PastaRecipe1.class));
        } else if (hasMacaroni && hasOnion && hasSalt && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, PastaResult45.class));
        } else if (hasMacaroni && hasGarlic && hasOnion && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, PastaRecipe4.class));
        } else if (hasMacaroni && hasGarlic && hasSugar && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, PastaRecipe4.class));
        } else if (hasMacaroni && hasGarlic && hasSalt && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, PastaRecipe4.class));
        } else if (hasMacaroni && hasOnion && hasSugar && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, PastaRecipe4.class));
        } else if (hasMacaroni && hasSugar && hasSalt && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, PastaRecipe4.class));
        } else if (hasMacaroni && hasOnion && hasEgg && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, PastaRecipe5.class));
        } else if (hasMacaroni && hasOnion && hasCarrot && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, PastaRecipe5.class));
        } else if (hasMacaroni && hasEgg && hasCarrot && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, PastaRecipe5.class));
        } else if (hasMacaroni && hasEgg && hasSalt && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, PastaRecipe5.class));
        } else if (hasMacaroni && hasSalt && hasCarrot && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, PastaRecipe5.class));
        } else if (hasChicken && hasEgg && hasOil && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ChickenRecipe3.class));
        } // without meat
        else if (hasOnion && hasGarlic && hasGinger&& ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, OtherResultMultipleActivity2.class));
        } else if (hasOnion && hasGarlic && hasTomato&& ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, OtherResultMultipleActivity3.class));
        } else if (hasOnion && hasGarlic && hasCarrot&& ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, OtherResultMultipleActivity4.class));
        } else if (hasBellPepper && hasPotato && hasGarlic && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ChickenBeefResultA.class));
        } else if (hasBellPepper && hasPotato && hasOnion && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ChickenBeefResultB.class));
        } else if (hasPotato && hasGarlic && hasOnion && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ChickenBeefResultC.class));
        } else if (hasBellPepper && hasGarlic && hasOnion && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ChickenBeefResultD.class));
        }
        else if (hasOil && hasOnion && hasGinger&& ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, ResultChicken18.class));
        } else if (hasOil && hasOnion && hasSoySauce && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, Adobo2Result.class));
        } else if (hasOil && hasOnion && hasSoySauce && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, AdoboResult.class));
        } else if (hasOil && hasOnion && hasVinegar && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, AdoboResult3.class));
        } else if (hasOil && hasOnion && hasVinegar && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, OtherResult.class));
        } else if (hasOil && hasOnion && hasGarlic && ingredients[3].isEmpty() && ingredients[4].isEmpty()) {
            startActivity(new Intent(this, OtherResultMultipleActivity.class));
        } else {
            // If no recipe options match, check for invalid ingredients
            List<String> invalidIngredients = new ArrayList<>();
            for (String ingredient : ingredients) {
                if (!ingredient.isEmpty() &&
                        !ingredient.equalsIgnoreCase("egg") &&
                        !ingredient.equalsIgnoreCase("oil") &&
                        !ingredient.equalsIgnoreCase("eggplant") &&
                        !ingredient.equalsIgnoreCase("chicken") &&
                        !ingredient.equalsIgnoreCase("onion") &&
                        !ingredient.equalsIgnoreCase("soy sauce") &&
                        !ingredient.equalsIgnoreCase("ginger") &&
                        !ingredient.equalsIgnoreCase("garlic") &&
                        !ingredient.equalsIgnoreCase("vinegar") &&
                        !ingredient.equalsIgnoreCase("rice") &&
                        !ingredient.equalsIgnoreCase("salt") &&
                        !ingredient.equalsIgnoreCase("pepper") &&
                        !ingredient.equalsIgnoreCase("paprika") &&
                        !ingredient.equalsIgnoreCase("tomato") &&
                        !ingredient.equalsIgnoreCase("water") &&
                        !ingredient.equalsIgnoreCase("beef") &&
                        !ingredient.equalsIgnoreCase("fish") &&
                        !ingredient.equalsIgnoreCase("macaroni") &&
                        !ingredient.equalsIgnoreCase("crab") &&
                        !ingredient.equalsIgnoreCase("shrimp") &&
                        !ingredient.equalsIgnoreCase("carrot") &&
                        !ingredient.equalsIgnoreCase("squid") &&
                        !ingredient.equalsIgnoreCase("sugar")) {
                    invalidIngredients.add(ingredient);
                }
            }
            if (!invalidIngredients.isEmpty()) {
                String message = "Invalid ingredient/s:";
                for (String invalidIngredient : invalidIngredients) {
                    message += " " + invalidIngredient + ",";
                }
                message = message.substring(0, message.length() - 1);
                Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
                return;
            } else {
                // If no recipe matches the ingredients, display an error message
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(InputIngredientsActivity.this, "No matching recipe found", Toast.LENGTH_SHORT).show();
                    }
                }, 2000);
            }
        }
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
