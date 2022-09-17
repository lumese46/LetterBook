package com.example.learningletters

import android.view.View

interface AppInterfaces {
    interface View {
        fun initView() //initialize view

        fun updatePage() {
            TODO("Not yet implemented")
        }
    }

    interface Model {
        fun getLetterIndex(): Int
        fun getLetterImage(): Int
        fun setIndex(i: Int)
        fun incrementIndex()
        fun decrementIndex()
    }

    interface Presenter {
        fun getLetterImage(): Int
        fun firstImage()
        fun lastImage()
        fun nextImage()
        fun prevImage()


    }
}