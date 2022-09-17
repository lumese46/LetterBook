package com.example.learningletters

class LetterPageActivityModel: AppInterfaces.Model{
    private val images = intArrayOf(
        R.drawable.slide01, R.drawable.slide02, R.drawable.slide03,
        R.drawable.slide04, R.drawable.slide05, R.drawable.slide06, R.drawable.slide07,
        R.drawable.slide08, R.drawable.slide09, R.drawable.slide10, R.drawable.slide11,
        R.drawable.slide12, R.drawable.slide13, R.drawable.slide14, R.drawable.slide15,
        R.drawable.slide16, R.drawable.slide17, R.drawable.slide18, R.drawable.slide19,
        R.drawable.slide20, R.drawable.slide21, R.drawable.slide22, R.drawable.slide23,
        R.drawable.slide24, R.drawable.slide25, R.drawable.slide26
    )

    private var _currIndex = 0;
    override fun getLetterIndex():Int {
        return _currIndex;
    }

    override fun  getLetterImage():Int {
        return images[_currIndex]
    }

    override fun setIndex(i: Int) {
        _currIndex = i;
    }

    override  fun incrementIndex(): Boolean{
        val temp: Int = _currIndex +1;
        println("Next to" + temp)

        if (temp > images.size-1){
            // throw error
            return false
        } else {
            _currIndex = temp;
            return true
        }
    }

    override  fun decrementIndex(): Boolean{
        val temp: Int = _currIndex -1;

        if (temp < 0||temp > images.size-1){
            // throw error
            return false
        } else {
            _currIndex = temp;
            return true
        }
    }
}