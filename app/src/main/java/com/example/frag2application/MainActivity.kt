package com.example.frag2application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.frag2application.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var navCon: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHost =  supportFragmentManager.findFragmentById(R.id.frag1) as NavHostFragment
        navCon = navHost.navController
        setupActionBarWithNavController(navCon)
    }

    override fun onSupportNavigateUp(): Boolean {
        //return super.onSupportNavigateUp()
        return navCon.navigateUp() || super.onSupportNavigateUp()
    }
}