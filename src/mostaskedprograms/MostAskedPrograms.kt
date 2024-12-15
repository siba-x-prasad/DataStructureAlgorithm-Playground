package mostaskedprograms

fun main() {
    println("Longest Substring ${findLongestSubStringWithoutRepeatingCharacters("stackoverflow")}")
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
