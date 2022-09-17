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
        _view.initView()
    }

    override fun getLetterImage():Int = dataModel.getLetterImage()

    override fun firstImage() {
        dataModel.setIndex(0)
        view.updatePage()
    }

    override fun lastImage() {
        dataModel.setIndex(25)
        view.updatePage()
    }

    override fun nextImage() {
        dataModel.incrementIndex()
        view.updatePage()
    }

    override fun prevImage() {
        dataModel.decrementIndex()
        view.updatePage()
    }




}