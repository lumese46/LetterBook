package com.example.learningletters

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class LetterPageActivity : AppCompatActivity(),AppInterfaces.View {
    private  var presenter: LetterActivityPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_letterpage)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Letter"
        var thisView = this;
        // Check whether we're recreating a previously destroyed instance
        if (savedInstanceState != null) {
            with(savedInstanceState) {
                // Restore value of members from saved state
                println("Saved Index"+ this.get("CURR_INDEX"))
                presenter = LetterActivityPresenter(thisView);
                initView()
            }
        }

        // set presenter and pass cview
        presenter = LetterActivityPresenter(thisView);
        initView()
    }

    override fun initView() {

        setImageRes()
        // set button listeners
        val firstB = findViewById<Button>(R.id.FISRT)
        firstB.setOnClickListener{ presenter?.goToFirst() }

        val lastB = findViewById<Button>(R.id.LAST)
        lastB.setOnClickListener{ presenter?.goToLast() }

        val nextB = findViewById<Button>(R.id.NEXT)
        nextB.setOnClickListener { presenter?.goToNext() }

        val prevB = findViewById<Button>(R.id.PREV)
        prevB.setOnClickListener { presenter?.goToPrev() }



    }

    override fun updatePage() {
       // super.updatePage()
        setImageRes()
    }

    fun setImageRes(){
        var imageView = findViewById<ImageView>(R.id.imageView)
        var currImage: Int? = presenter?.getLetterImage();
        with(imageView) {
            if (currImage != null) {
                this?.setImageResource(currImage)
            }
        }
    }

    //     State Management
    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        println("Saving State")
        val bundle =  intent.extras
        val currIndex = bundle!!.getInt("CURR_INDEX")
        outState.putInt("CURR_INDEX", currIndex)

    }

}