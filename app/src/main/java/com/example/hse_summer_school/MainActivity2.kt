package com.example.hse_summer_school

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }
    fun close1(view : View) {
        val myclose = Intent(this, MainActivity::class.java)
        startActivity(myclose)
    }
}