package lms_129

fun task10(password: String): Boolean {
    val regex1 = Regex("[a-z]")
    val regex2 = Regex("[A-Z]")
    val regex3 = Regex("[0-9]")
    val regex4 = Regex("[$#@]")

    val result = password.length in 6..10 &&
            regex1.containsMatchIn(password)&&
            regex2.containsMatchIn(password)&&
            regex3.containsMatchIn(password)&&
            regex4.containsMatchIn(password)
    return result
    }

fun main(){
    println(task10(password = "asdf"))
    println(task10(password = "dwnianosf"))
    println(task10(password = "asdkasf"))
    println(task10(password = "1#aDas"))
}