package basescreens

open class BaseScreenCreate<T : BaseScreen> : BaseScreen() {

     protected open var createListener: CreateItemListener<T>? = null

    interface CreateItemListener<T> {
        fun setCurrentItemScreen(currentScreen: T)
    }

    open fun setCreateItemListener(createListener: CreateItemListener<T>){
        this.createListener=createListener
    }
}