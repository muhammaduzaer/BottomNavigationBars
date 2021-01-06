package com.muhammaduzaer.bottomnavigationbars.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.ismaeldivita.chipnavigation.ChipNavigationBar
import com.muhammaduzaer.bottomnavigationbars.R
import com.muhammaduzaer.bottomnavigationbars.fragments.FirstFragment
import com.muhammaduzaer.bottomnavigationbars.fragments.HomeFragment
import com.muhammaduzaer.bottomnavigationbars.fragments.SecondFragment
import com.muhammaduzaer.bottomnavigationbars.fragments.ThirdFragment

class ExampleOneActivity : AppCompatActivity() {

    private lateinit var chipNavigationBar: ChipNavigationBar
    private var fragment: Fragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example_one)

        bottomNavBar()
    }


    private fun bottomNavBar() {
        chipNavigationBar = findViewById(R.id.chipNavigation)

        chipNavigationBar.setItemSelected(R.id.homeFragment, true)
        supportFragmentManager.beginTransaction().replace(R.id.fragmentNavigation, HomeFragment()).commit()

        chipNavigationBar.setOnItemSelectedListener(object :
            ChipNavigationBar.OnItemSelectedListener {
            override fun onItemSelected(i: Int) {
                when (i) {
                    R.id.homeFragment -> fragment = HomeFragment()
                    R.id.firstFragment -> fragment = FirstFragment()
                    R.id.secondFragment -> fragment = SecondFragment()
                    R.id.thirdFragment -> fragment = ThirdFragment()
                }
                if (fragment != null) {
                    supportFragmentManager.beginTransaction().replace(R.id.fragmentNavigation,
                        fragment!!
                    )
                        .commit()
                }
            }
        })

    }
}