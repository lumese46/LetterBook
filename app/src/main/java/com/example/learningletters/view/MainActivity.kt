package  com.example.learningletters

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity: AppCompatActivity(){

    var selectedButton: Button? = null;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "Overview"

    }

    fun openLetterPage(v: View) {

        // get letter no from id
        selectedButton = v as Button

        val letterNo:Int  = getCharForNumber(selectedButton!!.text.get(0))


        // send data to letter page
        intent = Intent(this, LetterPageActivity::class.java)
        intent.putExtra("CURR_INDEX" , letterNo)
        startActivity(intent)
    }




    private fun getCharForNumber(i: Char): Int {
        val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray()
        return  alphabet.indexOf(i)
    }
}