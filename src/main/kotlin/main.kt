import java.io.File

/*Задание 2: Воспользуйся readLines(), чтобы достать строки из файла.
Распечатай их в цикле (каждая с новой строки соответственно), чтобы удостовериться, что все работает.

Для текущего этапа создай ветку и сделай в нее коммит. Ссылку на PR отправляй ниже.*/

fun main() {

    val wordsFile: File = File("words.txt")
    val dataList = wordsFile.readLines()

    for (i in 0..2) {
        println(dataList[i])
    }
}
