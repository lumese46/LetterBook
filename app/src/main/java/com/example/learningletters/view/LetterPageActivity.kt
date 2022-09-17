package com.example.learningletters

import android.os.Bundle
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
       

        // set presenter and pass cview
        presenter = LetterActivityPresenter(this);
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


}