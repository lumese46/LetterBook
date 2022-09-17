package com.example.learningletters

class LetterActivityPresenter(_view: LetterPageActivity): AppInterfaces.Presenter{
    private var view: LetterPageActivity = _view;
    private var dataModel: AppInterfaces.Model = LetterPageActivityModel()

    init {
        val bundle =  _view.intent.extras
        val currLetter = bundle!!.getInt("CURR_LETTER")
        if (currLetter != null) {
            dataModel.setIndex(currLetter)
        }
        println("Index:" + currLetter)
        _view.initView()
    }

    override fun getLetterImage():Int = dataModel.getLetterImage()

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


}