package com.example.clickcount

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

var clickCountBlue = 0
var clickCountGreen = 0
var clickCountRed = 0

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val clickCountDisplayView =  findViewById<TextView>(R.id.clickCountView)
        val clickMeButtonBlue =  findViewById<TextView>(R.id.clickButtonBlue)
        val clickMeButtonGreen =  findViewById<TextView>(R.id.clickButtonGreen)
        val clickMeButtonRed =  findViewById<TextView>(R.id.clickButtonRed)


        clickMeButtonBlue.setOnClickListener {
            clickCountBlue++
            clickCountDisplayView.text = "Blue button is clicked $clickCountBlue times"
        }
        clickMeButtonGreen.setOnClickListener {
            clickCountGreen++
            clickCountDisplayView.text = "Green button is clicked $clickCountGreen times"
        }
        clickMeButtonRed.setOnClickListener {
            clickCountRed++
            clickCountDisplayView.text = "Red button is clicked $clickCountRed times"
        }
    }
}