package Algorithms.Warmup

import java.util.*

internal fun timeConversion(s: String): String {

    val time = s.split(":".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()

    var hour = Integer.parseInt(time[0])
    val minute = time[1]
    val seconds = time[2].substring(0, 2)

    var convertedTime = " "

    val format = s[s.length - 2]

    if (format == 'A' && hour == 12) {
        hour -= 12
        convertedTime = "0$hour:$minute:$seconds"
    } else if (format == 'A' && hour < 10) {
        convertedTime = "0$hour:$minute:$seconds"
    } else if (format == 'A') {
        convertedTime = "$hour:$minute:$seconds"
    }

    if (format == 'P' && hour == 12) {
        convertedTime = "$hour:$minute:$seconds"
    } else if (format == 'P') {
        hour += 12
        convertedTime = "$hour:$minute:$seconds"
    }

    return convertedTime
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = timeConversion(s)

    println(result)
}
