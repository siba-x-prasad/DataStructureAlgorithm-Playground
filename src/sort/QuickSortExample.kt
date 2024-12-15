package sort

fun main() {
    val array = readLine()!!.split(" ").map { it.toInt() }.toIntArray() // 1) Read the input and split into array
    quickSort(array, 0, array.size-1)
    for(i in array) println(i)
}

fun quickSort(array: IntArray, left: Int, right: Int) {
    val index = partition (array, left, right)
    if(left < index-1) { // 2) Sorting left half
        quickSort(array, left, index-1)
    }
    if(index < right) { // 3) Sorting right half
        quickSort(array,index, right)
    }
}

fun partition(array: IntArray, l: Int, r: Int): Int { // 5 4 6 7 8 3 2 1 10 9,  0, 10
    var left = l
    var right = r
    val pivot = array[(left + right)/2] // 4) Pivot Point
    while (left <= right) {
        while (array[left] < pivot) left++ // 5) Find the elements on left that should be on right

        while (array[right] > pivot) right-- // 6) Find the elements on right that should be on left

        // 7) Swap elements, and move left and right indices
        if (left <= right) {
            swapArray(array, left,right)
            left++
            right--
        }
    }
    return left.also {
        println("Number is $it")
    }
}

fun swapArray(a: IntArray, b: Int, c: Int) {
    val temp = a[b]
    a[b] = a[c]
    a[c] = temp
}