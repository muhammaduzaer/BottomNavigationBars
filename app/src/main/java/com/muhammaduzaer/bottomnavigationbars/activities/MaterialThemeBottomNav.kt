package com.muhammaduzaer.bottomnavigationbars.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.muhammaduzaer.bottomnavigationbars.R

class MaterialThemeBottomNav : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_material_theme_bottom_nav)


        val bottomNavMenu = findViewById<BottomNavigationView>(R.id.bottomNavMenu)
        val navController = findNavController(R.id.fragmentNavigationTwo)

        bottomNavMenu.setupWithNavController(navController)
    }
}