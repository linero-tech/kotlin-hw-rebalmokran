package lms_129

fun task1(a: Int, b: Int): Int {

    var result = 0

    if (a >= b) {
        return 0
    } else{
        for (i in a..b) {
            result += i
        }
    }
    return result

}

fun main() {
    println(task1(a = 6, b = 5))
}