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

    private fun fibonacciRecursive(n: Int): Int {
        if (n == 0) return 0
        if (n == 1 || n == 2) return 1
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2)
    }

    fun fibonacciToN(n: Int): MutableList<Int> {
        var result: MutableList<Int> = mutableListOf<Int>()
        for (i in 1..n) {
            result.add(fibonacciRecursive(i))
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

    fun calculateMortgage(capital: Float, interval: Int, rate: Float): String {
        var result: String = ""


        return result
    }

    fun changeAutomat(cost: Float, money: Float): List<Int> {
        var result:  MutableList<Int> = mutableListOf<Int>()
        var diff: Float = money - cost
        diff = (Math.round(diff.toDouble() * 1000.0) / 1000.0).toFloat() * 100
        val moneyValues: IntArray = intArrayOf(50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1)
        var i: Int = 0
        while (diff > 0) {
            if (diff >= moneyValues[i]) {
                result.add(moneyValues[i])
                diff -= moneyValues[i]
            }
            else {
                i++
            }
        }

        return result
    }

    fun decimalToBinary(n: Int): List<Int> {
        var remainder: MutableList<Int> = mutableListOf<Int>()
        var quotient = n
        while (quotient > 0) {
            remainder.add(quotient % 2)
            quotient /= 2
        }

        var resultList = remainder as List<Int>
        return resultList.asReversed()
    }

    fun binaryToDecimal(n: Long): Int {
        var result: Int = 0

        var nAsString = n.toString().reversed()
        for (i in 0 until nAsString.length) {
            result += (nAsString[i].toString().toInt() * 2.0.pow(i)).toInt()
        }
        return result
    }

    fun calculator(operation: String, firstValue: Float, secondValue: Float = 0f): Float {
        var result = when(operation) {
            "+" -> firstValue + secondValue
            "-" -> firstValue - secondValue
            "*" -> firstValue * secondValue
            "/" -> if(secondValue != 0f) firstValue / secondValue else 0f
            else -> 0f
        }

        return result
    }

}