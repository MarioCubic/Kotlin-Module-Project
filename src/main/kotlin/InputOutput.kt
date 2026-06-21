import java.util.Scanner

open class InputOutput {

    val scanner: Scanner = Scanner(System.`in`)
    fun input(counter: Int): Int {
        while (true) {
            try {
                val input = Integer.parseInt(scanner.nextLine())
                if (input > counter || counter < 0) println("Введите верное число")
                else return input
            } catch (e: Exception) {
                println("Введите верное значение")
            }
        }

    }

    fun inText(): String {
        var text: String
        while (true) {
            println("0. Назад")
            println("Введите текст:")
            val text = scanner.nextLine()
            if (!text.isBlank()) {
                return text
            }
            println("Строка не может быть пустой, повторите ввод:")
        }
    }

    fun printMenu(head: String, list: MutableList<String>?): Int {
        println("0. $head")
        var counter = 1
        if (list != null) {
            for (item in list) {
                println("$counter. $item")
                counter++
            }
        }
        println("$counter. Выход")
        return counter
    }
    fun viewNote(note: String?) {
        do {
            println("0. Назад")
            println(note)
        } while (input(1) != 0)


    }
}