import basescreens.BaseScreenCreate

class CreateNoteScreen() : BaseScreenCreate<CurrentNoteScreen>() {

    override fun refreshMenu() {
        super.refreshMenu()
        mutableMenuList?.add("Создать заметку и задать ей имя")
    }


    override fun startCreateScreen() {

        println("Введите название заметки:")
        val name = readConsole()

        println("Введите текст заметки:")
        val noteText = readConsole()

        val currentNoteScreen = CurrentNoteScreen()
        currentNoteScreen.name = name
        currentNoteScreen.noteText = noteText
        println("Заметка $name создана")
        createListener?.setCurrentItemScreen(currentNoteScreen)
    }

    override fun startCurrentScreen(number: Int) {

    }

    override fun showScreenName() {
        println("Экран создания заметки")
    }


}