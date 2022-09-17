package  com.example.learningletters

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity: AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

     fun openLetterPage(v: View) {
         // get letter no from id
        val b = v as Button
        val letterNo:String  = b.id.toString().subSequence(1, b.id.toString().lastIndex).toString()

         // send data to letter page
        intent = Intent(this,LetterPageActivity::class.java)
        intent.putExtra("CURR_LETTER" , letterNo.toInt()-1)
        startActivity(intent)
    }
}