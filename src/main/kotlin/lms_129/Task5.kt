package lms_129

fun task5(sentence: String): Int {
        var result = 0
        for (char in sentence) {
            result++
        }
        return result
}
fun main(){
    val sentence = "I Love GBG"// 10
    println(task5(sentence))
}

