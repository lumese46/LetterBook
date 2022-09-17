package com.example.learningletters

class LetterActivityPresenter(_view: LetterPageActivity): AppInterfaces.Presenter{
    private var view: LetterPageActivity = _view;
    private var dataModel: AppInterfaces.Model = LetterPageActivityModel()

    init {
        val bundle =  _view.intent.extras
        val currLetter = bundle!!.getString("CURR_LETTER")
        if (currLetter != null) {
            dataModel.setCurrLetter(currLetter)
        }
        _view.initView()
    }

    override fun getLetterImage():Int = dataModel.getLetterImage()

    override fun firstImage() {
        val currLetter = "A"
        if (currLetter != null) {
            dataModel.setCurrLetter(currLetter)
        }
        view.updatePage()
    }

    override fun lastImage() {

        val currLetter = "Z"
        if (currLetter != null) {
            dataModel.setCurrLetter(currLetter)
        }
        view.updatePage()
    }

    override fun nextImage() {


    }

    override fun prevImage() {
        TODO("Not yet implemented")
    }





}