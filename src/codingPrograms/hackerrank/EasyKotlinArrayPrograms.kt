package codingPrograms.hackerrank

fun main() {

}

fun gradingStudents(grades: Array<Int>): Array<Int> {
    val array = Array<Int>(grades.size) { _ -> 0 }
    for(index in grades.indices){
        val grade = grades[index]
        if(grade <=37 ){
            array[index] = grade
        }
        else{
           val nextNum = ((grade/5)+1)*5
            if (nextNum - grade < 3){
                array[index] = nextNum
            }
            else{
                array[index] = grade
            }
        }

    }
return array
}