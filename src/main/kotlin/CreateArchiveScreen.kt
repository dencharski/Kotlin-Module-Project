import basescreens.BaseScreenCreate

class CreateArchiveScreen() : BaseScreenCreate<CurrentArchiveScreen>() {


    override fun refreshMenu() {
        super.refreshMenu()
        mutableMenuList?.add("Создать архив и задать ему имя")
    }

    override fun startCreateScreen() {

        println("Введите название архива:")

        val name = readConsole()
        val screen = CurrentArchiveScreen()
        screen.name = name
        println("Архив $name создан")
        createListener?.setCurrentItemScreen(screen)
    }

    override fun startCurrentScreen(number: Int) {
    }

    override fun showScreenName() {
        println("Экран создания архива")
    }

}