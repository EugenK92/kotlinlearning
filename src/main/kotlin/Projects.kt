package com.eugene.kotlin

import kotlin.math.* 

class Projects {

    /**
    * n max 15
    */
    fun findPiToNDigit(n: Int): Double {
        var p: Double = 0.0
        for (i in 0..(n + 2)) {
            p +=  (1.0 / 16.0.pow(i) ) * (  (4.0 / (8.0 * i + 1) ) - (2.0 / (8.0 * i + 4) ) - (1.0 / (8.0 * i + 5) ) - (1.0 / (8.0 * i + 6) ) )
        }
        var pi: String = p.toString().substring(0, n + 2)
        return pi.toDouble()
    }

    fun facOf(n: Int): Int {
        var result: Int = 1
        for (i in 2..n) {
            result *= i
        }
        return result
    }

    fun findEToNDigit(n: Int): Double {
        var e: Double = 1.0
        for (i in 1..20) {
            e += 1.0 / facOf(i).toDouble()
        }

        return e.toString().substring(0, n + 2).toDouble();
    }

    fun fibonacciResursive(n: Int): Int {
        if (n == 0) return 0
        if (n == 1 || n == 2) return 1
        return fibonacciResursive(n - 1) + fibonacciResursive(n - 2)
    }

    fun fibonacciToN(n: Int): MutableList<Int> {
        var result: MutableList<Int> = mutableListOf<Int>()
        for (i in 1..n) {
            result.add(fibonacciResursive(i))
        }
        println(result)
        return result
    }

}