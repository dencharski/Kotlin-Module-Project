import basescreens.BaseScreenCreate
import basescreens.BaseScreenCurrent

class ArchivesScreen :
    BaseScreenCurrent<CurrentArchiveScreen>(),
    BaseScreenCreate.CreateItemListener<CurrentArchiveScreen> {


    override fun refreshMenu() {
        super.refreshMenu()
        mutableMenuList?.add("Создать архив")
        mutableElementList?.forEach {
            mutableMenuList?.add(it.name)
        }
    }


    override fun setCurrentItemScreen(currentScreen: CurrentArchiveScreen) {
        mutableElementList?.add(currentScreen)
    }

    override fun startCreateScreen() {
        val createArchiveScreen = CreateArchiveScreen()
        createArchiveScreen.setCreateItemListener(this)
        createArchiveScreen.start()
    }


    override fun showScreenName() {
        println("Экран архивов")
    }

}