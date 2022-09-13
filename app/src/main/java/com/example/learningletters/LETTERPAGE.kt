package com.example.learningletters

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class LETTERPAGE : AppCompatActivity() {
    var currImage = R.drawable.slide01
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_letterpage)
        val bundle = intent.extras
        val currLetter = bundle!!.getString("CURR_LETTER")
        setInitImage(currLetter)

    }

    private fun setInitImage(data: String?) {
        when(data){
            "A"-> currImage =  R.drawable.slide01
            "B" -> currImage = R.drawable.slide02
            "C" -> currImage = R.drawable.slide03
            "D"  -> currImage = R.drawable.slide04
            "E" -> currImage = R.drawable.slide05
            "F" -> currImage = R.drawable.slide06
            "G" -> currImage = R.drawable.slide07
            "H" -> currImage = R.drawable.slide08
            "I" -> currImage = R.drawable.slide09
            "J" -> currImage = R.drawable.slide10
            "K" -> currImage = R.drawable.slide11
            "L" -> currImage = R.drawable.slide12
            "M" -> currImage = R.drawable.slide13
            "N" -> currImage = R.drawable.slide14
            "O" -> currImage = R.drawable.slide15
            "P" -> currImage = R.drawable.slide16
            "Q" -> currImage = R.drawable.slide17
            "R" -> currImage = R.drawable.slide18
            "S" -> currImage = R.drawable.slide19
            "T" -> currImage = R.drawable.slide20
            "U" -> currImage = R.drawable.slide21
            "V" -> currImage = R.drawable.slide22
            "W" -> currImage = R.drawable.slide23
            "X" -> currImage = R.drawable.slide24
            "Y" -> currImage = R.drawable.slide25
            "Z" -> currImage = R.drawable.slide26
        }
        // gets the image view
        setImage(currImage);
    }

    fun  setImage(currImage: Int){
        val imageView: ImageView = findViewById<ImageView>(R.id.imageView)
        imageView.setImageResource(currImage)
    }

    // this method changes the picture to the the first letter picture
    fun first_Button(v: View){

        // resets alphas to first pic int
        currImage = R.drawable.slide01;
        setImage(currImage)


    }
    // this method changes the picture to the the last letter picture
    fun last_Button(v: View){

        // resets alphas to last pic int
        currImage = R.drawable.slide26;
        setImage(currImage)


    }

    // this method changes the picture to the next picture
    fun next_Button(v: View){
        if(currImage ==  R.drawable.slide26){
            last_Button(v)
        }else {
            currImage++
        }



        if(currImage == R.drawable.slide26){
            currImage = R.drawable.slide26;

        }else if(currImage >= R.drawable.slide01 || currImage <= R.drawable.slide26 ){
            // changes the image
            setImage(currImage)
        }



    }
    // this method changes the picture to the prev
    fun prev_Button(v: View){
        if(currImage ==  R.drawable.slide01) {
            first_Button(v)
        }else{
            currImage--
        }


        if(currImage == R.drawable.slide01){
            currImage = R.drawable.slide01;
           setImage(currImage)
        }else if (currImage >= R.drawable.slide01 || currImage <= R.drawable.slide26 ){
            setImage(currImage)
        }






    }
}