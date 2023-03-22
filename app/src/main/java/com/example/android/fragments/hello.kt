package com.example.android.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class hello : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)

        val bundle : Bundle?= intent.extras

        val index = bundle?.getInt("position")
        val rollnumber = bundle?.getString("hey")

        findViewById<TextView>(R.id.textView3).text = "$rollnumber,$index"
    }
}