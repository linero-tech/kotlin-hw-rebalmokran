package lms_129

fun task1(a: Int, b: Int) {

    var result = 0

    if (a >= b) {
        result
    } else
        for (number in a..b) {
            result += number
        }
    println(result)

}

fun main() {
    task1(a = 6, b = 5)
}