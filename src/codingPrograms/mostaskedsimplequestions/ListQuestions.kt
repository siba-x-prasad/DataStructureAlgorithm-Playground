package codingPrograms.mostaskedsimplequestions

fun main() {
    removeDuplicateItemsInList(listOf(1,2,3,4,3,5,4))
}

private fun flattenListOfListOfIntegers(list: List<List<Int>>): List<Int> {
    val outputList = mutableListOf<Int>()
    list.forEach {
        outputList.addAll(it)
    }
    return outputList
}

private fun removeDuplicateItemsInList(list: List<Int>) {
    val set = mutableSetOf<Int>()
    list.forEach {
        set.add(it)
    }
    println("set is $set")
}