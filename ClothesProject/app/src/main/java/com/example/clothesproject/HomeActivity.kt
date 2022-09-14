package com.example.clothesproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        navController = navHostFragment.navController

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavView)
        setupWithNavController(bottomNavigationView,navController)

        /*val bottomNavigationView= findViewById<BottomNavigationView>(R.id.bottomNavView)

        val navController2 = findNavController(R.id.fragmentContainerView)
        val appBarConfiguration = AppBarConfiguration(setOf(R.id.collectionFragment2,R.id.profileFragment2,R.id.cartFragment2))
        setupActionBarWithNavController(navController2, appBarConfiguration)
        bottomNavigationView.setupWithNavController(navController2)*/

    }


}