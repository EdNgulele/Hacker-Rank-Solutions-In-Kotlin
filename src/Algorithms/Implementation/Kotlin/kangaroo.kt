package Algorithms.Implementation.Kotlin

import java.util.*

fun main(args: Array<String>) {

    val input = Scanner(System.`in`)
    val x1 = input.nextInt()
    val v1 = input.nextInt()
    val x2 = input.nextInt()
    val v2 = input.nextInt()
    val result = kangaroo(x1, v1, x2, v2)
    println(result)
}

fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {


    var result = "Nothing yet "

    if (v2 >= v1) {
        result = "NO"
    } else if ((x1 - x2) % (v2 - v1) == 0) {
        result = "YES"
    } else {
        result = "NO"
    }

    return result
}