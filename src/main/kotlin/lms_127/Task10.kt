package lms_127

fun task10_1(assessments: String): Int {
    return assessments.length
}

fun task10_2(assessments: String): Char {
    return assessments [3]
}

fun task10_3(assessments: String): Char {
    return assessments [assessments.length / 2]
}

fun task10_4(assessments: String): String {
    return assessments.substring(0,3)
}
