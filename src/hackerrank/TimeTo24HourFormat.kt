package hackerrank

fun main() {
    val result = timeConversion("12:00:00AM")
    System.out.println(result)
}

fun timeConversion(s: String): String {
    var result = ""
    val hour : String = s.substring(0,2)
    val minSec : String = s.substring(2,8)
    val amPm = s.substring(8,s.length)
    var hourIn24Format = (hour.toInt()+12).toString()
    return  if(amPm == "PM"){
        if(hourIn24Format == "24"){
            hourIn24Format = "00"
        }
        hourIn24Format+minSec
    }
    else{
        if(hour ==  "12"){
            "00$minSec"
        }
        else
            s.substring(0,s.length - 2)
    }

}