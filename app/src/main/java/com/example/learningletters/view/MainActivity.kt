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
        val b = v as Button

        val buttonText = b.text.toString()
        intent = Intent(this,LetterPageActivity::class.java)
        intent.putExtra("CURR_LETTER" , buttonText)
        startActivity(intent)
    }
}