package basescreens

import java.util.*

abstract class BaseScreen() {
    open var name: String = "No name"
    open var mutableMenuList: MutableList<String>? = mutableListOf()
    open var isUserChoose: Boolean = true


    open fun start() {

        isUserChoose = true

        while (isUserChoose) {
            refreshMenu()

            println("""
                _____
            """.trimIndent())
            showScreenName()

            printMenu(mutableMenuList)

            try {
                val number: Int = readConsole().toInt()

                if (number < 0 || number > (mutableMenuList?.size?.minus(1)!!)) {
                    println("$number - Такой цифры в меню нет, введите корректную цифру.")
                } else {

                    performingOperation(
                        number,
                        onCreate = {
                            startCreateScreen()
                        },
                        onStart = {
                            startCurrentScreen(number)
                        })
                }

            } catch (e: Exception) {
                printErrorMessage(e)
            }
        }
    }

    open fun refreshMenu() {
        mutableMenuList?.clear()
        mutableMenuList?.add("Выход")

    }

    open fun printMenu(list: List<String>?) {
        println("Меню:")
        if (!list.isNullOrEmpty()) {
            list.forEach { println("${list.indexOf(it)}. $it") }
        }
        println("")
    }

    open fun readConsole(): String {
        return Scanner(System.`in`).nextLine()
    }

    open fun performingOperation(number: Int, onCreate: () -> Unit, onStart: () -> Unit) {

        when (number) {
            0 -> {
                isUserChoose = false
            }

            1 -> {
                onCreate()
            }

            else -> {
                onStart()
            }
        }

    }

    open fun printErrorMessage(e: Exception) {
        println("${this.javaClass.name} Ошибка! ${e.message}")
    }

    open fun showScreenName() {
        println("Название экрана")
    }

    abstract  fun startCreateScreen()

    abstract fun startCurrentScreen(number: Int)

}