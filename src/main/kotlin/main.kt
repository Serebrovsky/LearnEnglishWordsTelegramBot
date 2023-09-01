import java.io.File

/*Задание 2: Воспользуйся readLines(), чтобы достать строки из файла.
Распечатай их в цикле (каждая с новой строки соответственно), чтобы удостовериться, что все работает.
Для текущего этапа создай ветку и сделай в нее коммит. Ссылку на PR отправляй ниже.*/

fun main() {

    val wordsFile: File = File("words.txt")
    val dataList = wordsFile.readLines()
    val sizeDataList = dataList.size - 1

    for (i in 0..sizeDataList) {
        println(dataList[i])
    }
}
