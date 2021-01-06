package com.muhammaduzaer.bottomnavigationbars.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ismaeldivita.chipnavigation.ChipNavigationBar
import com.muhammaduzaer.bottomnavigationbars.R
import kotlinx.android.synthetic.main.activity_example_one.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        textViewExampleOne.setOnClickListener {
            val intent = Intent(this, ExampleOneActivity::class.java)
            startActivity(intent)
        }

        textViewExampleTwo.setOnClickListener {
            val intent = Intent(this, MaterialThemeBottomNav::class.java)
            startActivity(intent)
        }

    }


}