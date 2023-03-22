package com.example.android.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.android.fragments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        replaceFragment(Home())
        binding.bottomNavigationView3.setOnItemSelectedListener {

            when(it.itemId){
                R.id.Home -> replaceFragment(Home())
                R.id.person -> replaceFragment(person())
                R.id.alarm -> replaceFragment(Recyclerview())

                else->{

                }
            }
            true
        }


    }
    private fun replaceFragment(fragment: Fragment){

        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout,fragment)
        fragmentTransaction.commit()
    }
}