import basescreens.BaseScreenCreate
import basescreens.BaseScreenCurrent

class CurrentArchiveScreen() : BaseScreenCurrent<CurrentNoteScreen>(),
     BaseScreenCreate.CreateItemListener<CurrentNoteScreen>
{

    override fun refreshMenu() {
        super.refreshMenu()
        mutableMenuList?.add("Создать заметку")
        mutableElementList?.forEach {
            mutableMenuList?.add(it.name)
        }
    }

    override fun startCreateScreen() {
        val createNoteScreen = CreateNoteScreen()
        createNoteScreen.setCreateItemListener(this)
        createNoteScreen.start()
    }


    override fun setCurrentItemScreen(currentScreen: CurrentNoteScreen) {
        mutableElementList?.add(currentScreen)

    }

    override fun showScreenName() {
        println("Экран архива ${name}")
    }

}