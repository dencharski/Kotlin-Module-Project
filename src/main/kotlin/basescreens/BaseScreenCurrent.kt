package basescreens

abstract class BaseScreenCurrent<T : BaseScreen>() : BaseScreen() {

     var mutableElementList: MutableList<T>? = mutableListOf()

    override fun startCurrentScreen(number:Int){
        (mutableElementList?.get(number - 2)?.start())
    }
}