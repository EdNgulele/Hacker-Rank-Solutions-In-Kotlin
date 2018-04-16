package Algorithms.Implementation.Kotlin

import java.util.*

fun gradingStudents(grades: Array<Int>): Array<Int> {

    val roundedGrades: Array<Int> = arrayOf(grades.size)


    for (i in grades.indices) {

        if ((grades[i] + 1) % 5 == 0 && grades[i] >= 38) {
            roundedGrades[i] = grades[i] + 1
        } else if ((grades[i] + 2) % 5 == 0 && grades[i] >= 38) {
            roundedGrades[i] = grades[i] + 2
        } else {
            roundedGrades[i] = grades[i]
        }

    }


    return roundedGrades
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val grades = Array<Int>(n, { 0 })
    for (gradesItr in 0 until n) {
        val gradesItem = scan.nextLine().trim().toInt()
        grades[gradesItr] = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}