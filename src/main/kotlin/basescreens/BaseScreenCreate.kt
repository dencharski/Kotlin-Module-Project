package basescreens

abstract class BaseScreenCreate<T : BaseScreen> : BaseScreen() {

     protected var createListener: CreateItemListener<T>? = null

    interface CreateItemListener<T> {
        fun setCurrentItemScreen(currentScreen: T)
    }

     fun setCreateItemListener(createListener: CreateItemListener<T>){
        this.createListener=createListener
    }
}