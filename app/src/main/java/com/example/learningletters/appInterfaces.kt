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
        fun getCurrLetter(): Int
        fun getLetterImage(): Int
        fun setCurrLetter(i: Int)
    }

    interface Presenter {
        fun getLetterImage(): Int
        fun firstImage()
        fun lastImage()
        fun nextImage()
        fun prevImage()


    }
}