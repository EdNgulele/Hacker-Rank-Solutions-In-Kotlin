package Algorithms.Warmup

import java.util.*

fun main(args: Array<String>) {


    val input = Scanner(System.`in`)
    print("Size: ")
    val size = input.nextInt()

    sumArray(size)
}

fun sumArray(size: Int) {

    val input = Scanner(System.`in`)
    val numbers = IntArray(size)

    for (item in numbers) {

        println("${item}. Number: ")
        val ii = input.nextInt()
        numbers.set(item, ii)

    }

    for (item in numbers)
        print(item)
}

