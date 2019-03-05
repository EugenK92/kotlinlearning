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
        return result
    }

    fun isPrime(n: Int): Boolean {
        if (n == 1) return false;
        if (n == 2) return true;
        var end: Float = sqrt(n.toFloat());
        for (i in 2..end.toInt()) {
            if (n % i == 0) return false
        } 
        return true
    }

    fun primeFactorizeN(n: Int): MutableList<Int> {
        var result: MutableList<Int> = mutableListOf<Int>()
        var calc = n;
        if (isPrime(n)) {
            result.add(n)
        }
        else {
            var i: Int = 2
            while (i < n) {
                if (isPrime(i)) {
                    if (calc % i == 0) {
                        result.add(i)
                        calc /= i
                    }
                    else {
                        i++
                    }
                }
                else {
                    i++
                }
            }
        }

        return result;
    }

    fun getNPrimeNumbers(n: Int): MutableList<Int> {
        var result: MutableList<Int> = mutableListOf<Int>()
        var index = 2;
        while (result.size < n) {
            if (isPrime(index)) {
                result.add(index)
            }
            index++
        }

        return result
    }

    fun costOfTile(width: Int, heigth: Int, costPerTile: Float): Float {
        var result: Float = 0f
        result = width * heigth * costPerTile
        return result
    }

}