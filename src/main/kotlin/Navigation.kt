class Navigation : InputOutput() {

    fun mainMenu(): Int {

        val keys = archive.archives.keys.toMutableList()
        val counter = printMenu("Создать архив", keys)
        when (val input = input(counter)) {
            counter -> return 0
            0 -> makeArchive(archive)
            else -> intoArchive(archive.archives[keys[input - 1]])
        }

        return 1
    }

    fun makeArchive(archive: Archives) {
        val nameOfArchive: String = inText()
        if (nameOfArchive == "0") return
        archive.archives[nameOfArchive] = mutableListOf()
    }

    fun intoArchive(note: MutableList<String>?) {
        while (true) {
            val counter = printMenu("Создать новую заметку", note)


            when (val input = input(counter)) {
                counter -> return
                0 -> {
                    addNewNote(note)
                }

                else -> {
                    viewNote(note?.get(input - 1))
                }
            }


        }
    }

    fun addNewNote(notes: MutableList<String>?) {
        val newNote: String = inText()
        if (newNote != "0") {
            notes?.add(newNote)
        } else return
    }


}