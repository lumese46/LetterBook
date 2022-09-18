package com.example.learningletters

import android.content.Intent
import androidx.core.content.ContextCompat.startActivity

class LetterActivityPresenter(_view: LetterPageActivity): AppInterfaces.Presenter{
    private var view: LetterPageActivity = _view;
    private var dataModel: AppInterfaces.Model = LetterPageActivityModel()

    init {
        val bundle =  view.intent.extras
        val currLetter = bundle!!.getInt("CURR_LETTER")
        dataModel.setIndex(currLetter)


        view.initView()
       // view.updatePage()
    }

    override fun getLetterImage():Int {
        println("Index fetched" + dataModel.getLetterIndex())
        return    dataModel.getLetterImage()

    }

    override fun goToFirst() {
        dataModel.setIndex(0)
        view.updatePage()
    }

    override fun goToLast() {
        dataModel.setIndex(25)
        view.updatePage()
    }

    override fun goToNext() {
        if(dataModel.incrementIndex()) {
            view.updatePage()
        }
    }

    override fun goToPrev() {
        if(dataModel.decrementIndex()) {
            view.updatePage()
        }
    }

    override  fun goToOverview(){
       view.openOverviewPage()
    }


}