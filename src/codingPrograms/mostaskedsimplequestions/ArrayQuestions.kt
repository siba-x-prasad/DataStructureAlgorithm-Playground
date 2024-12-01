package codingPrograms.mostaskedsimplequestions

fun main() {
    println("get all elements that appears once in array ${findElementThatAppearsOnceInArray( intArrayOf(1,2,3,1,4,2,3))}")
    println("Fibonacci series upto 5 ${generateFibonacciSeriesUptoN(5)}")
    findSecondLargestNumber(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 7, 6))
    println("3Rd Larest number in Array ${getKthLargestNumberInArray(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 7, 6), 3)}")
    println("Missing Number in Array ${findMissingNumberInContineousArray(intArrayOf(1, 2, 3, 4, 5, 7, 8, 9))}")
}

private fun findSecondLargestNumber(array: IntArray) {
    var firstBiggestNumber = 0
    var secondBiggestNumber = 0
    array.forEach {
        if (it > firstBiggestNumber) {
            secondBiggestNumber = firstBiggestNumber
            firstBiggestNumber = it
        }
    }
    println(secondBiggestNumber)
}

fun findMaxNumberInAnArray(inputArray: IntArray) {
    var maxNumber: Int = 0
    inputArray.forEach {
        if (it > maxNumber) {
            maxNumber = it
        }
    }
    println("Max number is ")
}

private fun findElementThatAppearsOnceInArray(array: IntArray): Set<Int> {
    val uniqueElementMap = mutableMapOf<Int, Int>()
    array.forEach { element ->
        var count = uniqueElementMap[element] ?: 0
        count++
        uniqueElementMap[element] = count
    }
    val array = uniqueElementMap.filter { it.value == 1 }.keys
    return array
}

private fun generateFibonacciSeriesUptoN(num: Int): MutableList<Int> {
    val fibonacciList = mutableListOf<Int>(0,1)
    for (i in 2..num) {
        fibonacciList.add(fibonacciList[i-1] + fibonacciList[i-2])
    }
    return fibonacciList
}

private fun checkIfOneArrayIsASubsetOfAnother(arr1: IntArray, arr2: IntArray) {

}

private fun getKthLargestNumberInArray(array: IntArray, highestNumber: Int): Int {
    if (highestNumber < array.size) {
        val shortedArray = array.sortedArrayDescending()
        return shortedArray[highestNumber]
    }
    else
        return 0
}

private fun findMissingNumberInContineousArray(array: IntArray): Int {
    for (i in 1..array.size-1) {
        val nextTitem = array[i-1]+1
        if (nextTitem != array[i]) {
            return nextTitem
        }
    }
    return 0
}