package com.rafay.vpnpro.vpnmaster.vpn;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.rafay.vpnpro.vpnmaster.vpn.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

   LinearLayout countrySelector;
    ActionBarDrawerToggle actionBarDrawerToggle;
    DrawerLayout drawerLayout;
    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_navigation_content);

        init();
        goToSelectCountry();
        setUpToolbar("Home");
        actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
    }
    void goToSelectCountry(){
        countrySelector.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, SelectCountry.class));
        });
    }
    void setUpToolbar(String title){
        toolbar.setTitle(title);
        setSupportActionBar(toolbar);
    }
    void init(){
        drawerLayout = findViewById(R.id.drawerlayout);
        toolbar = findViewById(R.id.toolbar);
        countrySelector = findViewById(R.id.countrySelector);
    }
   }