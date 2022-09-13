package com.example.learningletters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class LETTERPAGE_E : AppCompatActivity() {
    var alphas = R.drawable.slide01
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_letterpage_e)
    }

    // this method changes the picture to the the first letter picture
    fun first_Button(v: View){
        // gets the image view
        val Iv: ImageView = findViewById<ImageView>(R.id.imageView)
        // resets alphas to first pic int
        alphas = R.drawable.slide01;
        Iv.setImageResource(alphas)

    }
    // this method changes the picture to the the last letter picture
    fun last_Button(v: View){
        // gets the image view
        val Iv: ImageView = findViewById<ImageView>(R.id.imageView)
        // resets alphas to last pic int
        alphas = R.drawable.slide26;
        Iv.setImageResource(alphas)

    }

    // this method changes the picture to the next picture
    fun next_Button(v: View){
        if(alphas ==  R.drawable.slide26){
            last_Button(v)
        }else {
            alphas++
        }

        // gets the image view
        val Iv: ImageView = findViewById<ImageView>(R.id.imageView)
        if(alphas == R.drawable.slide26){
            alphas = R.drawable.slide26;

        }else if(alphas >= R.drawable.slide01 || alphas <= R.drawable.slide26 ){
            // changes the image
            Iv.setImageResource(alphas)
        }



    }
    // this method changes the picture to the prev
    fun prev_Button(v: View){
        if(alphas ==  R.drawable.slide01) {
            first_Button(v)
        }else{
            alphas--
        }

        // gets the image view
        val Iv: ImageView = findViewById<ImageView>(R.id.imageView)
        if(alphas == R.drawable.slide01){
            alphas = R.drawable.slide01;
        }else if (alphas >= R.drawable.slide01 || alphas <= R.drawable.slide26 ){
            // changes the image
            Iv.setImageResource(alphas)
        }






    }
}