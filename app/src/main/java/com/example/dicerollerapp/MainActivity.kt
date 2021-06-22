package com.example.dicerollerapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

class Dice(private val numSide: Int) {

    // A roll() method to generate a random number between 1 and 6.
    fun roll(): Int {
        return (1..numSide).random()
    }
}