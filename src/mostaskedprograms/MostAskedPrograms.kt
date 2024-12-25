package mostaskedprograms

import kotlin.math.pow

fun main() {
    println("Longest Substring ${findLongestSubStringWithoutRepeatingCharacters("stackoverflow")}")
    println("Duplicate element in {1,2 3,2,4,5,4,5,6,2} ${findAllDuplicatesInAnArray(intArrayOf(1,2,3,2,4,5,4,5,6,2))}")
    println("Reverse Vowels In String Hello World ${reverseVowelsOfAString("Hello World")}")
    println("Reverse Integer 123 ${reverseInteger(123)}")
}

private fun findLongestSubStringWithoutRepeatingCharacters(input: String): String {
    val hashSet = HashSet<Char>()
    var longestSubstring = ""
    var longestSubstringTillNow = ""
    input.forEach { char ->
        if (hashSet.contains(char)) {
            longestSubstringTillNow = ""
            hashSet.clear()
        }
        longestSubstringTillNow += char
        hashSet.add(char)
        if (longestSubstringTillNow.length > longestSubstring.length) {
            longestSubstring = longestSubstringTillNow
        }
    }
    return longestSubstring
}

private fun findAllDuplicatesInAnArray(array: IntArray): MutableList<Int> {
    val map = mutableMapOf<Int, Int>()
    val list = mutableListOf<Int>()
    array.forEach {
        if (map.containsKey(it)) {
            list.add(it)
        } else {
            map.put(it, 1)
        }
    }
    return list
}

private fun reverseVowelsOfAString(str: String) : String {
    var i = 0
    var j = str.length - 1
    var charArray = str.toCharArray()
    while (i < j) {
        if (!isVowel(charArray[i])) {
            i++
            continue
        }

        if (!isVowel(charArray[j])) {
            j--
            continue
        }
        var swapI = charArray[i]
        var swapJ = charArray[j]
        charArray[i] = swapJ
        charArray[j] = swapI

        i++
        j--
    }
    return charArray.concatToString()
}

private fun isVowel( c: Char): Boolean {
    return (c == 'a' || c == 'A' || c == 'e'
            || c == 'E' || c == 'i' || c == 'I'
            || c == 'o' || c == 'O' || c == 'u'
            || c == 'U');
}

private fun reverseInteger(num: Int): Int {
    var sum = 0
    var number = num
    while (number > 0) {
        sum = sum * 10 + (number%10)
        number = number/10
    }
    return sum
}

