import basescreens.BaseScreen

class CurrentNoteScreen() : BaseScreen() {

    var noteText: String = ""

    override fun startCurrentScreen(number: Int) {
    }

    override fun startCreateScreen() {
    }

    override fun showScreenName() {
        println("Экран заметки ${name}")
        println("Текст заметки: $noteText")
    }

}