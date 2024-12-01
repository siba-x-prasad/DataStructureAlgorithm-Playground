package codingPrograms.mostaskedsimplequestions

fun main() {
    reverseAString()
    checkPalindrome("aba")
    countVowelsInString("Siba")
    countEachOccurrencesOfEachCharacterInString("sibaprasad")
    findFirstNonRepeatedCharFromString("sisba")
    println("Is t string Silent, listen ${checkIfTwoStringsAreAnagram("silent", "liSten")}")
    println("Missing Char is ${findMissingCharacterInString("abcdefghijklmnopqrstuvwxy")}")
}

/**
 * reverse a string
 */
private fun reverseAString() {
    val name = "Siba"
    val reversedName = StringBuffer()
    for (char in name.lastIndex downTo 0) {
        reversedName.append(char)
    }
    println(reversedName)
}

private fun checkPalindrome(input: String) {
    val isPalindrome = input == input.reversed()
    println("$input is palindrome = $isPalindrome")
}

private fun countVowelsInString(input: String) {
    val count = input.count {
        it in "aeiou"
    }
    var count1 = 0
    input.forEach {
       if ("aeiouAEIOU".contains(it, false)) count1++
    }

    println("Total Number of Vowels in $input is $count")
    println("Anoher way Total Number of Vowels in $input is $count1")
}

private fun findFirstNonRepeatedCharactersInString(input: String) {
    var nonRepeatableChar: Char = ' '
    input.forEach { char ->
       if (char != nonRepeatableChar) {

       } else {

       }
    }
}

private fun countEachOccurrencesOfEachCharacterInString(input: String) {
    val mutableMap = mutableMapOf<Char, Int>()
    input.forEach { char ->
        var count = mutableMap[char] ?: 0
        mutableMap[char] = count+1
    }
    mutableMap.forEach { key, value ->
        println("$key is $value number of times in string $input")
    }
}

private fun findFirstNonRepeatedCharFromString(input: String) {
    val freqIntArray = IntArray(26)
    input.forEach { char ->
        freqIntArray[char -'a']++
    }

    input.forEachIndexed { index, c ->
        if (freqIntArray[c - 'a'] == 1) {
            println("First Character is $c")
        }
    }
}

private fun checkIfTwoStringsAreAnagram(input1: String, input2: String): Boolean {
    var sum = 0
    input1.forEachIndexed { index, c ->
        sum += c - input2[input2.length - 1 - index]
    }
    return sum == 0
}

private fun findMissingCharacterInString(input: String): Char? {
    val fullAlphabet = "abcdefghijklmnopqrstuvwxyz"
    fullAlphabet.forEach {
        if (!input.contains(it, false)) return it
    }
    return null
}