package com.myself223.mynewsapp.ui.activity.main
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.myself223.mynewsapp.R
import com.myself223.mynewsapp.databinding.ActivityMainBinding
import com.myself223.mynewsapp.ui.isNetworkAvailable

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val navController: NavController by lazy {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment_container) as NavHostFragment
        navHostFragment.navController
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initBottomNav()

        if (!isNetworkAvailable(this)) {
            navController.navigate(R.id.noInternetFragment)
        }
    }

    private fun initBottomNav() {
        binding.bottomNav.apply {
            setupWithNavController(navController)
        }
    }
}
