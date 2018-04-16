package Algorithms.Warmup.Kotlin

import java.util.Scanner

fun main(args: Array<String>) {

    val input = Scanner(System.`in`)

    print("a0: ")
    val a0: Int = input.nextInt()
    print("a1: ")
    val a1: Int = input.nextInt()
    print("a2: ")
    val a2: Int = input.nextInt()
    print("b0: ")
    val b0: Int = input.nextInt()
    print("b1: ")
    val b1: Int = input.nextInt()
    print("b21: ")
    val b2: Int = input.nextInt()

    compareTheTriplets(a0, a1, a2, b0, b1, b2)

}

fun compareTheTriplets(a0: Int, a1: Int, a2: Int, b0: Int, b1: Int, b2: Int) {

    val alice = (if (a0 > b0) 1 else 0) + (if (a1 > b1) 1 else 0) + if (a2 > b2) 1 else 0
    val bob = (if (a0 > b0) 1 else 0) + (if (a1 > b1) 1 else 0) + if (a2 > b2) 1 else 0

    print("$alice $bob")

}