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
        fun incrementIndex(): Boolean
        fun decrementIndex(): Boolean
    }

    interface Presenter {
        fun getLetterImage(): Int
        fun goToFirst()
        fun goToLast()
        fun goToNext()
        fun goToPrev()


    }
}