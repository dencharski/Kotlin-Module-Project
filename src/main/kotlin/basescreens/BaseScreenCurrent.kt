package basescreens

open class BaseScreenCurrent<T : BaseScreen>() : BaseScreen() {

    open var mutableElementList: MutableList<T>? = mutableListOf()

    open override fun start() {
        super.start()
    }


    override fun startCurrentScreen(number:Int){
        (mutableElementList?.get(number - 2)?.start())
    }
}