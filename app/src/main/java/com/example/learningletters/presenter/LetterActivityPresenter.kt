package com.example.learningletters

class LetterActivityPresenter(_view: LetterPageActivity): AppInterfaces.Presenter{
    private var view: LetterPageActivity = _view;
    private var dataModel: AppInterfaces.Model = LetterPageActivityModel()

    init {
        val bundle =  _view.intent.extras
        val currLetter = bundle!!.getInt("CURR_LETTER")
        if (currLetter != null) {
            dataModel.setCurrLetter(currLetter)
        }
        _view.initView()
    }

    override fun getLetterImage():Int = dataModel.getLetterImage()

    override fun firstImage() {
        val currLetter = 0
        setLetter(currLetter)
        view.updatePage()
    }

    override fun lastImage() {

        val currLetter = 25
        setLetter(currLetter)
        view.updatePage()
    }

    override fun nextImage() {
        val currLetter: Int = dataModel.getCurrLetter()+1
        if(currLetter > 25){
            // reached last letter
        } else {
            setLetter(currLetter)
        }
        view.updatePage()
    }

    override fun prevImage() {
        val currLetter: Int = dataModel.getCurrLetter()-1
        if(currLetter < 0){
            // reached last letter
        } else {
            setLetter(currLetter)
        }
        view.updatePage()
    }


    fun setLetter(letter:Int){
        if (letter != null) {
            dataModel.setCurrLetter(letter)
        }
    }





}