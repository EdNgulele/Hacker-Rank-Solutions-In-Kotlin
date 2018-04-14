package Algorithms.Warmup

import java.util.*


/*
 * Complete the birthdayCakeCandles function below.
 */


fun main(args: Array<String>) {

    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = birthdayCakeCandles(n, ar)

    println(result)
}

fun birthdayCakeCandles(n: Int, ar: Array<Int>): Int {
    /*
     * Write your code here.
     */

    var tallestCandle = 0
    var height = 0
    var count = 0

    for (i in 0..n - 1) {

        height = ar[i]

        if (height > tallestCandle) {
            tallestCandle = height
            count = 1
        } else if (height == tallestCandle)
            count++

    }

    return count
}

