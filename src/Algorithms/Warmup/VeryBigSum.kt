package Algorithms.Warmup

import java.util.Scanner


fun main(args: Array<String>) {

    val input = Scanner(System.`in`)
    val n: Int = Integer.parseInt(input.nextLine())
    val arr: Array<String> = input.nextLine().split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()

    var sum: Long = 0

    for (i in 0..n - 1) {

        sum += java.lang.Long.parseLong(arr[i])

    }

    print(sum)
    input.close()
}



