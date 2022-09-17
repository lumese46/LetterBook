package com.example.learningletters

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // this method changes the picture to the the first letter picture
    fun openLetterPage(v: View){
        val b = v as Button
        val buttonText = b.text.toString()

        intent = Intent(this,LETTERPAGE::class.java)
        intent.putExtra("CURR_LETTER" , buttonText)
        startActivity(intent)
    }
}