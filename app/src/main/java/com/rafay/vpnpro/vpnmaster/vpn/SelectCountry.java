package com.rafay.vpnpro.vpnmaster.vpn;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.rafay.vpnpro.vpnmaster.vpn.databinding.ActivitySelectCountryBinding;

public class SelectCountry extends AppCompatActivity {

    ActivitySelectCountryBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       binding = ActivitySelectCountryBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        goToMain();

    }
    void goToMain(){
        binding.back.setOnClickListener(v -> {
            startActivity(new Intent(SelectCountry.this, MainActivity.class));
        });
    }
}