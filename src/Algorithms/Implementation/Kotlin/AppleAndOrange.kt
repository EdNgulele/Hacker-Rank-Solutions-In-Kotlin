package Algorithms.Implementation.Kotlin

import java.util.*

/*
 * Complete the countApplesAndOranges function below.
 */
fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>): Unit {


    var landing: Int
    var bobPoints = 0
    var larryPoints = 0

    for (i in apples.indices) {
        landing = a + apples[i]
        if (landing in s..t)
            bobPoints++
    }

    for (i in oranges.indices) {
        landing = b + oranges[i]
        if (landing in s..t)
            larryPoints++
    }

    print(bobPoints)
    print(larryPoints)

}


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val st = scan.nextLine().split(" ")

    val s = st[0].trim().toInt()

    val t = st[1].trim().toInt()

    val ab = scan.nextLine().split(" ")

    val a = ab[0].trim().toInt()

    val b = ab[1].trim().toInt()

    val mn = scan.nextLine().split(" ")

    val m = mn[0].trim().toInt()

    val n = mn[1].trim().toInt()

    val apple = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val orange = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    countApplesAndOranges(s, t, a, b, apple, orange)
}