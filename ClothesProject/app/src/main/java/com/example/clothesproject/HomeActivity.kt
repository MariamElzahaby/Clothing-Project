package com.example.clothesproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.clothesproject.CollectionRecycleView.productClickInterface
import com.example.clothesproject.DummyData.Data
import com.example.clothesproject.Fragments.CollectionFragment
import com.example.clothesproject.Fragments.DetailsFragment

class HomeActivity : AppCompatActivity() {
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        navController = navHostFragment.navController

    }


}