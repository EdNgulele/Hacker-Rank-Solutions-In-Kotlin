package Algorithms.Warmup

import java.util.Scanner

fun main(args: Array<String>) {

    val input = Scanner(System.`in`)
    print("Size: ")
    val size = input.nextInt()

    sumArray(size)
}

fun sumArray(size: Int) {

    val input = Scanner(System.`in`)
    val numbers = IntArray(size)
    var item : Int ?
    var sum = 0

    for (i in 1..size) {
        println("$i. Number: ")
        item = input.nextInt()
        numbers.set(i-1, item)
    }

    for (item in numbers) {
        sum+=item
    }
    print(sum)
}

